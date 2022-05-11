package com.janqa.av.model.response;

public class Photo {
    private int id;
    private boolean main;
    private String mimeType;
    private PhotoParams big;
    private PhotoParams medium;
    private PhotoParams small;
    private PhotoParams extrasmall;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isMain() {
        return main;
    }

    public void setMain(boolean main) {
        this.main = main;
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public PhotoParams getBig() {
        return big;
    }

    public void setBig(PhotoParams big) {
        this.big = big;
    }

    public PhotoParams getMedium() {
        return medium;
    }

    public void setMedium(PhotoParams medium) {
        this.medium = medium;
    }

    public PhotoParams getSmall() {
        return small;
    }

    public void setSmall(PhotoParams small) {
        this.small = small;
    }

    public PhotoParams getExtrasmall() {
        return extrasmall;
    }

    public void setExtrasmall(PhotoParams extrasmall) {
        this.extrasmall = extrasmall;
    }
}
