package com.janqa.av.model.response;

import java.util.ArrayList;

public class Response {
    private int count;
    private int pageCount;
    private int page;
    private ArrayList<Advert> adverts;
    private CurrentSorting currentSorting;
    private int advertsPerPage;
    private String initialValue;
    private Extended extended;
    private Seo seo;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public ArrayList<Advert> getAdverts() {
        return adverts;
    }

    public void setAdverts(ArrayList<Advert> adverts) {
        this.adverts = adverts;
    }

    public CurrentSorting getCurrentSorting() {
        return currentSorting;
    }

    public void setCurrentSorting(CurrentSorting currentSorting) {
        this.currentSorting = currentSorting;
    }

    public int getAdvertsPerPage() {
        return advertsPerPage;
    }

    public void setAdvertsPerPage(int advertsPerPage) {
        this.advertsPerPage = advertsPerPage;
    }

    public String getInitialValue() {
        return initialValue;
    }

    public void setInitialValue(String initialValue) {
        this.initialValue = initialValue;
    }

    public Extended getExtended() {
        return extended;
    }

    public void setExtended(Extended extended) {
        this.extended = extended;
    }

    public Seo getSeo() {
        return seo;
    }

    public void setSeo(Seo seo) {
        this.seo = seo;
    }

    @Override public String toString() {
        return "Response{" +
                "count=" + count +
                ", pageCount=" + pageCount +
                ", page=" + page +
                ", adverts=" + adverts +
                ", currentSorting=" + currentSorting +
                ", advertsPerPage=" + advertsPerPage +
                ", initialValue='" + initialValue + '\'' +
                ", extended=" + extended +
                ", seo=" + seo +
                '}';
    }
}

