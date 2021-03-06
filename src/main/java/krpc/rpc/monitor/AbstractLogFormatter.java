package krpc.rpc.monitor;

import krpc.common.Plugin;
import krpc.rpc.core.ReflectionUtils;
import krpc.rpc.web.DefaultWebReq;
import krpc.rpc.web.DefaultWebRes;
import krpc.rpc.web.WebConstants;
import krpc.rpc.web.WebMessage;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

abstract class AbstractLogFormatter implements LogFormatter {

    String maskFields;
    int maxRepeatedSizeToLog = 1;
    boolean printDefault = true;
    int maxFieldSizeToLog = 500;

    HashSet<String> maskFieldsSet = new HashSet<String>();

    void configInner(String paramsStr) {
        Map<String, String> params = Plugin.defaultSplitParams(paramsStr);
        maskFields = params.get("maskFields");
        if (!isEmpty(maskFields)) {

            String[] ss = maskFields.split(",");

            for (String s : ss) {
                if (s.trim().length() > 0)
                    maskFieldsSet.add(s.trim());
            }
        }

        String s = params.get("maxRepeatedSizeToLog");
        if (!isEmpty(s))
            maxRepeatedSizeToLog = Integer.parseInt(s);

        s = params.get("maxFieldSizeToLog");
        if (!isEmpty(s))
            maxFieldSizeToLog = Integer.parseInt(s);

        s = params.get("printDefault");
        if (!isEmpty(s))
            printDefault = Boolean.parseBoolean(s);
    }

    boolean isEmpty(String s) {
        return s == null || s.isEmpty();
    }

    public static Map<String, Object> getLogData(WebMessage body, int maxRepeatedSizeToLog) {
        HashMap<String, Object> allLog = new HashMap<String, Object>();

        if (body instanceof DefaultWebReq) {
            DefaultWebReq req = (DefaultWebReq) body;
            allLog.putAll(req.getParameters());
            adjustMap(allLog, maxRepeatedSizeToLog);
            allLog.put("httpHost", req.getHost());
            allLog.put("httpMethod", req.getMethodString());
            allLog.put("httpPath", req.getPath());
            String sessionId = req.getCookie(WebConstants.DefaultSessionIdCookieName);
            if (sessionId != null)
                allLog.put(WebConstants.SessionIdName, sessionId);
        } else if (body instanceof DefaultWebRes) {
            DefaultWebRes res = (DefaultWebRes) body;
            allLog.putAll(res.getResults());
            adjustMap(allLog, maxRepeatedSizeToLog);
            allLog.put("httpCode", res.getHttpCode());
            String sessionId = res.getCookie(WebConstants.DefaultSessionIdCookieName);
            if (sessionId != null)
                allLog.put(WebConstants.SessionIdName, sessionId);
            allLog.remove(ReflectionUtils.retCodeFieldInMap);
        }
        return allLog;
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    static void adjustMap(Map<String, Object> allLog, int maxRepeatedSizeToLog) {
        for (Map.Entry<String, Object> entry : allLog.entrySet()) {

            //String key = entry.getKey();
            Object v = entry.getValue();

            if (v instanceof Map) {
                adjustMap((Map) v, maxRepeatedSizeToLog);
                continue;
            }

            if (v instanceof List) {
                List l = (List) v;
                for (Object no : l) {
                    if (no instanceof Map) {
                        adjustMap((Map) no, maxRepeatedSizeToLog);
                    }
                }
            }
        }
    }

}
