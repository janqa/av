package com.janqa.av.model.response;

public class Seo {
    private PageInfo canonicalPage;
    private PageInfo currentPage;

    public PageInfo getCanonicalPage() {
        return canonicalPage;
    }

    public void setCanonicalPage(PageInfo canonicalPage) {
        this.canonicalPage = canonicalPage;
    }

    public PageInfo getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(PageInfo currentPage) {
        this.currentPage = currentPage;
    }
}
