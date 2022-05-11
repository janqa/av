package com.janqa.av.model.response;

import java.time.Instant;
import java.util.ArrayList;

public class Advert {
    //@Id
    private long id;
    private int originalDaysOnSale;
    private String status;
    private PublicStatus privateStatus;
    private Price price;
    private int organizationId;
    private String organizationTitle;
    private String sellerName;
    private boolean questionAllowed;
    private String locationName;
    private String shortLocationName;
    private ArrayList<Photo> photos;
    private String advertType;
    private ArrayList<Property> properties;
    private String privateUrl;
    private int year;
    private Metadata metadata;
    private String description;
    private Exchange exchange;
    private int version;
    private Instant publishedAt;
    private Instant refreshedAt;
    private boolean top;
    private boolean highlight;
    private Instant topExpiredAt;
    private Instant highlightExpiredAt;
    private String videoUrl;
    private String videoUrlId;
    private Instant renewedAt;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getOriginalDaysOnSale() {
        return originalDaysOnSale;
    }

    public void setOriginalDaysOnSale(int originalDaysOnSale) {
        this.originalDaysOnSale = originalDaysOnSale;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public PublicStatus getPrivateStatus() {
        return privateStatus;
    }

    public void setPrivateStatus(PublicStatus privateStatus) {
        this.privateStatus = privateStatus;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public int getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(int organizationId) {
        this.organizationId = organizationId;
    }

    public String getOrganizationTitle() {
        return organizationTitle;
    }

    public void setOrganizationTitle(String organizationTitle) {
        this.organizationTitle = organizationTitle;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public boolean isQuestionAllowed() {
        return questionAllowed;
    }

    public void setQuestionAllowed(boolean questionAllowed) {
        this.questionAllowed = questionAllowed;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getShortLocationName() {
        return shortLocationName;
    }

    public void setShortLocationName(String shortLocationName) {
        this.shortLocationName = shortLocationName;
    }

    public ArrayList<Photo> getPhotos() {
        return photos;
    }

    public void setPhotos(ArrayList<Photo> photos) {
        this.photos = photos;
    }

    public String getAdvertType() {
        return advertType;
    }

    public void setAdvertType(String advertType) {
        this.advertType = advertType;
    }

    public ArrayList<Property> getProperties() {
        return properties;
    }

    public void setProperties(ArrayList<Property> properties) {
        this.properties = properties;
    }

    public String getPrivateUrl() {
        return privateUrl;
    }

    public void setPrivateUrl(String privateUrl) {
        this.privateUrl = privateUrl;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Exchange getExchange() {
        return exchange;
    }

    public void setExchange(Exchange exchange) {
        this.exchange = exchange;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public Instant getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(Instant publishedAt) {
        this.publishedAt = publishedAt;
    }

    public Instant getRefreshedAt() {
        return refreshedAt;
    }

    public void setRefreshedAt(Instant refreshedAt) {
        this.refreshedAt = refreshedAt;
    }

    public boolean isTop() {
        return top;
    }

    public void setTop(boolean top) {
        this.top = top;
    }

    public boolean isHighlight() {
        return highlight;
    }

    public void setHighlight(boolean highlight) {
        this.highlight = highlight;
    }

    public Instant getTopExpiredAt() {
        return topExpiredAt;
    }

    public void setTopExpiredAt(Instant topExpiredAt) {
        this.topExpiredAt = topExpiredAt;
    }

    public Instant getHighlightExpiredAt() {
        return highlightExpiredAt;
    }

    public void setHighlightExpiredAt(Instant highlightExpiredAt) {
        this.highlightExpiredAt = highlightExpiredAt;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getVideoUrlId() {
        return videoUrlId;
    }

    public void setVideoUrlId(String videoUrlId) {
        this.videoUrlId = videoUrlId;
    }

    public Instant getRenewedAt() {
        return renewedAt;
    }

    public void setRenewedAt(Instant renewedAt) {
        this.renewedAt = renewedAt;
    }

    @Override public String toString() {
        return "Advert{" +
                "id=" + id +
                ", originalDaysOnSale=" + originalDaysOnSale +
                ", status='" + status + '\'' +
                ", privateStatus=" + privateStatus +
                ", price=" + price +
                ", organizationId=" + organizationId +
                ", organizationTitle='" + organizationTitle + '\'' +
                ", sellerName='" + sellerName + '\'' +
                ", questionAllowed=" + questionAllowed +
                ", locationName='" + locationName + '\'' +
                ", shortLocationName='" + shortLocationName + '\'' +
                ", photos=" + photos +
                ", advertType='" + advertType + '\'' +
                ", properties=" + properties +
                ", privateUrl='" + privateUrl + '\'' +
                ", year=" + year +
                ", metadata=" + metadata +
                ", description='" + description + '\'' +
                ", exchange=" + exchange +
                ", version=" + version +
                ", publishedAt=" + publishedAt +
                ", refreshedAt=" + refreshedAt +
                ", top=" + top +
                ", highlight=" + highlight +
                ", topExpiredAt=" + topExpiredAt +
                ", highlightExpiredAt=" + highlightExpiredAt +
                ", videoUrl='" + videoUrl + '\'' +
                ", videoUrlId='" + videoUrlId + '\'' +
                ", renewedAt=" + renewedAt +
                '}';
    }
}
