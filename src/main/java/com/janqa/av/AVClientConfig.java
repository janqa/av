package com.janqa.av;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("av.client")
public class AVClientConfig{
    private String path;
    private int delayMillisec;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int getDelayMillisec() {
        return delayMillisec;
    }

    public void setDelayMillisec(int delayMillisec) {
        this.delayMillisec = delayMillisec;
    }
}
