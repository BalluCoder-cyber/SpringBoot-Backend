package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("payment-properties")
public class PaymentProperties {
    private String type;
    private int retryCount;
    private boolean enable;
    private int timeout;



    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setRetryCount(int retryCount) {
        this.retryCount = retryCount;
    }

    public int getRetryCount() {
        return retryCount;
    }

    public boolean isEnable() {
        return enable;
    }

    public int getTimeout() {
        return timeout;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }
}
