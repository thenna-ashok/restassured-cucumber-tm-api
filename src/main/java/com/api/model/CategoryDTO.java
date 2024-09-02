package com.api.model;

import java.util.List;
import java.util.Objects;

public class CategoryDTO {
    private long categoryId;
    private String name;
    private String path;
    private boolean canListAuctions;
    private boolean canListClassifieds;
    private boolean canRelist;
    private String legalNotice;
    private int defaultDuration;
    private List<Integer> allowedDurations;
    private FeesDTO feesDTO;
    private int freePhotoCount;
    private int maximumPhotoCount;
    private boolean isFreeToRelist;
    private PromotionsDTO promotionsDTO;
    private List<String> embeddedContentOptions;
    private int maximumTitleLength;
    private int areaOfBusiness;
    private int defaultRelistDuration;
    private boolean canUseCounterOffers;

    public CategoryDTO(long categoryId, String name, String path, boolean canListAuctions, boolean canListClassifieds, boolean canRelist, String legalNotice, int defaultDuration, List<Integer> allowedDurations, FeesDTO feesDTO, int freePhotoCount, int maximumPhotoCount, boolean isFreeToRelist, PromotionsDTO promotionsDTO, List<String> embeddedContentOptions, int maximumTitleLength, int areaOfBusiness, int defaultRelistDuration, boolean canUseCounterOffers) {
        this.categoryId = categoryId;
        this.name = name;
        this.path = path;
        this.canListAuctions = canListAuctions;
        this.canListClassifieds = canListClassifieds;
        this.canRelist = canRelist;
        this.legalNotice = legalNotice;
        this.defaultDuration = defaultDuration;
        this.allowedDurations = allowedDurations;
        this.feesDTO = feesDTO;
        this.freePhotoCount = freePhotoCount;
        this.maximumPhotoCount = maximumPhotoCount;
        this.isFreeToRelist = isFreeToRelist;
        this.promotionsDTO = promotionsDTO;
        this.embeddedContentOptions = embeddedContentOptions;
        this.maximumTitleLength = maximumTitleLength;
        this.areaOfBusiness = areaOfBusiness;
        this.defaultRelistDuration = defaultRelistDuration;
        this.canUseCounterOffers = canUseCounterOffers;
    }

    public long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(long categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public boolean isCanListAuctions() {
        return canListAuctions;
    }

    public void setCanListAuctions(boolean canListAuctions) {
        this.canListAuctions = canListAuctions;
    }

    public boolean isCanListClassifieds() {
        return canListClassifieds;
    }

    public void setCanListClassifieds(boolean canListClassifieds) {
        this.canListClassifieds = canListClassifieds;
    }

    public boolean isCanRelist() {
        return canRelist;
    }

    public void setCanRelist(boolean canRelist) {
        this.canRelist = canRelist;
    }

    public String getLegalNotice() {
        return legalNotice;
    }

    public void setLegalNotice(String legalNotice) {
        this.legalNotice = legalNotice;
    }

    public int getDefaultDuration() {
        return defaultDuration;
    }

    public void setDefaultDuration(int defaultDuration) {
        this.defaultDuration = defaultDuration;
    }

    public List<Integer> getAllowedDurations() {
        return allowedDurations;
    }

    public void setAllowedDurations(List<Integer> allowedDurations) {
        this.allowedDurations = allowedDurations;
    }

    public FeesDTO getFees() {
        return feesDTO;
    }

    public void setFees(FeesDTO feesDTO) {
        this.feesDTO = feesDTO;
    }

    public int getFreePhotoCount() {
        return freePhotoCount;
    }

    public void setFreePhotoCount(int freePhotoCount) {
        this.freePhotoCount = freePhotoCount;
    }

    public int getMaximumPhotoCount() {
        return maximumPhotoCount;
    }

    public void setMaximumPhotoCount(int maximumPhotoCount) {
        this.maximumPhotoCount = maximumPhotoCount;
    }

    public boolean isFreeToRelist() {
        return isFreeToRelist;
    }

    public void setFreeToRelist(boolean freeToRelist) {
        isFreeToRelist = freeToRelist;
    }

    public PromotionsDTO getPromotions() {
        return promotionsDTO;
    }

    public void setPromotions(PromotionsDTO promotionsDTO) {
        this.promotionsDTO = promotionsDTO;
    }

    public List<String> getEmbeddedContentOptions() {
        return embeddedContentOptions;
    }

    public void setEmbeddedContentOptions(List<String> embeddedContentOptions) {
        this.embeddedContentOptions = embeddedContentOptions;
    }

    public int getMaximumTitleLength() {
        return maximumTitleLength;
    }

    public void setMaximumTitleLength(int maximumTitleLength) {
        this.maximumTitleLength = maximumTitleLength;
    }

    public int getAreaOfBusiness() {
        return areaOfBusiness;
    }

    public void setAreaOfBusiness(int areaOfBusiness) {
        this.areaOfBusiness = areaOfBusiness;
    }

    public int getDefaultRelistDuration() {
        return defaultRelistDuration;
    }

    public void setDefaultRelistDuration(int defaultRelistDuration) {
        this.defaultRelistDuration = defaultRelistDuration;
    }

    public boolean isCanUseCounterOffers() {
        return canUseCounterOffers;
    }

    public void setCanUseCounterOffers(boolean canUseCounterOffers) {
        this.canUseCounterOffers = canUseCounterOffers;
    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryId=" + categoryId +
                ", name='" + name + '\'' +
                ", path='" + path + '\'' +
                ", canListAuctions=" + canListAuctions +
                ", canListClassifieds=" + canListClassifieds +
                ", canRelist=" + canRelist +
                ", legalNotice='" + legalNotice + '\'' +
                ", defaultDuration=" + defaultDuration +
                ", allowedDurations=" + allowedDurations +
                ", fees=" + feesDTO +
                ", freePhotoCount=" + freePhotoCount +
                ", maximumPhotoCount=" + maximumPhotoCount +
                ", isFreeToRelist=" + isFreeToRelist +
                ", promotions=" + promotionsDTO +
                ", embeddedContentOptions=" + embeddedContentOptions +
                ", maximumTitleLength=" + maximumTitleLength +
                ", areaOfBusiness=" + areaOfBusiness +
                ", defaultRelistDuration=" + defaultRelistDuration +
                ", canUseCounterOffers=" + canUseCounterOffers +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CategoryDTO categoryDTO = (CategoryDTO) o;
        return categoryId == categoryDTO.categoryId && canListAuctions == categoryDTO.canListAuctions && canListClassifieds == categoryDTO.canListClassifieds && canRelist == categoryDTO.canRelist && defaultDuration == categoryDTO.defaultDuration && freePhotoCount == categoryDTO.freePhotoCount && maximumPhotoCount == categoryDTO.maximumPhotoCount && isFreeToRelist == categoryDTO.isFreeToRelist && maximumTitleLength == categoryDTO.maximumTitleLength && areaOfBusiness == categoryDTO.areaOfBusiness && defaultRelistDuration == categoryDTO.defaultRelistDuration && canUseCounterOffers == categoryDTO.canUseCounterOffers && Objects.equals(name, categoryDTO.name) && Objects.equals(path, categoryDTO.path) && Objects.equals(legalNotice, categoryDTO.legalNotice) && Objects.equals(allowedDurations, categoryDTO.allowedDurations) && Objects.equals(feesDTO, categoryDTO.feesDTO) && Objects.equals(promotionsDTO, categoryDTO.promotionsDTO) && Objects.equals(embeddedContentOptions, categoryDTO.embeddedContentOptions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(categoryId, name, path, canListAuctions, canListClassifieds, canRelist, legalNotice, defaultDuration, allowedDurations, feesDTO, freePhotoCount, maximumPhotoCount, isFreeToRelist, promotionsDTO, embeddedContentOptions, maximumTitleLength, areaOfBusiness, defaultRelistDuration, canUseCounterOffers);
    }
}
