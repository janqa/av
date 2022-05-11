package com.janqa.av.model.response;

public class Property {
    private Object value;
    private int id;
    private String name;
    private String fallbackType;

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFallbackType() {
        return fallbackType;
    }

    public void setFallbackType(String fallbackType) {
        this.fallbackType = fallbackType;
    }
}
