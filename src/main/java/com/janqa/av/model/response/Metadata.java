package com.janqa.av.model.response;

import java.util.ArrayList;

public class Metadata {
    private VinInfo vinInfo;
    private Condition condition;
    private ArrayList<SimilarModel> similarModels;
    private int brandId;
    private String brandSlug;
    private int modelId;
    private String modelSlug;
    private int generationId;

    public VinInfo getVinInfo() {
        return vinInfo;
    }

    public void setVinInfo(VinInfo vinInfo) {
        this.vinInfo = vinInfo;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public ArrayList<SimilarModel> getSimilarModels() {
        return similarModels;
    }

    public void setSimilarModels(ArrayList<SimilarModel> similarModels) {
        this.similarModels = similarModels;
    }

    public int getBrandId() {
        return brandId;
    }

    public void setBrandId(int brandId) {
        this.brandId = brandId;
    }

    public String getBrandSlug() {
        return brandSlug;
    }

    public void setBrandSlug(String brandSlug) {
        this.brandSlug = brandSlug;
    }

    public int getModelId() {
        return modelId;
    }

    public void setModelId(int modelId) {
        this.modelId = modelId;
    }

    public String getModelSlug() {
        return modelSlug;
    }

    public void setModelSlug(String modelSlug) {
        this.modelSlug = modelSlug;
    }

    public int getGenerationId() {
        return generationId;
    }

    public void setGenerationId(int generationId) {
        this.generationId = generationId;
    }
}
