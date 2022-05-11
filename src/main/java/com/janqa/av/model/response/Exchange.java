package com.janqa.av.model.response;

public class Exchange {
    private String type;
    private String label;
    private String exchangeAllowed;
    private String comment;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getExchangeAllowed() {
        return exchangeAllowed;
    }

    public void setExchangeAllowed(String exchangeAllowed) {
        this.exchangeAllowed = exchangeAllowed;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
