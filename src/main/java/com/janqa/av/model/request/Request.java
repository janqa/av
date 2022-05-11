package com.janqa.av.model.request;

public class Request {
    private int page;

    public Request(int page) {
        this.page = page;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }
}
