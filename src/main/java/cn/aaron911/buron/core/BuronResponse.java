package cn.aaron911.buron.core;

import cn.aaron911.buron.util.IpUtil;

import javax.servlet.http.HttpServletRequest;

public class BuronResponse {

    private int code;
    private String msg;

    private long expire;
    private int limitCount;

    private RequestInfo requestInfo;

    public RequestInfo getRequestInfo() {
        return requestInfo;
    }

    public BuronResponse setAccessInfo(HttpServletRequest request) {
        if (this.requestInfo == null) {
            this.requestInfo = new RequestInfo();
        }

        this.requestInfo.setIp(IpUtil.getIp(request))
                .setRequestUrl(request.getRequestURL().toString())
                .setUa(request.getHeader("User-Agent"));
        return this;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public BuronResponse setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public long getExpire() {
        return expire;
    }

    BuronResponse setExpire(long expire) {
        this.expire = expire;
        return this;
    }

    public int getLimitCount() {
        return limitCount;
    }

    BuronResponse setLimitCount(int limitCount) {
        this.limitCount = limitCount;
        return this;
    }

    BuronResponse isSuccess() {
        this.code = 0;
        return this;
    }

    BuronResponse isError() {
        this.code = 1;
        return this;
    }


    private class RequestInfo {
        private String ip;
        private String ua;
        private String requestUrl;

        public String getIp() {
            return ip;
        }

        RequestInfo setIp(String ip) {
            this.ip = ip;
            return this;
        }

        public String getUa() {
            return ua;
        }

        RequestInfo setUa(String ua) {
            this.ua = ua;
            return this;
        }

        public String getRequestUrl() {
            return requestUrl;
        }

        RequestInfo setRequestUrl(String requestUrl) {
            this.requestUrl = requestUrl;
            return this;
        }
    }
}
