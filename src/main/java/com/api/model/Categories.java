package com.api.model;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "CategoryId",
    "Name",
    "Path",
    "CanListAuctions",
    "CanListClassifieds",
    "CanRelist",
    "LegalNotice",
    "DefaultDuration",
    "AllowedDurations",
    "Fees",
    "FreePhotoCount",
    "MaximumPhotoCount",
    "IsFreeToRelist",
    "Promotions",
    "EmbeddedContentOptions",
    "MaximumTitleLength",
    "AreaOfBusiness",
    "DefaultRelistDuration",
    "CanUseCounterOffers"
})
public class Categories {

    @JsonProperty("CategoryId")
    private int categoryId;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Path")
    private String path;
    @JsonProperty("CanListAuctions")
    private boolean canListAuctions;
    @JsonProperty("CanListClassifieds")
    private boolean canListClassifieds;
    @JsonProperty("CanRelist")
    private boolean canRelist;
    @JsonProperty("LegalNotice")
    private String legalNotice;
    @JsonProperty("DefaultDuration")
    private int defaultDuration;
    @JsonProperty("AllowedDurations")
    private List<Integer> allowedDurations;
    @JsonProperty("Fees")
    private Fees fees;
    @JsonProperty("FreePhotoCount")
    private int freePhotoCount;
    @JsonProperty("MaximumPhotoCount")
    private int maximumPhotoCount;
    @JsonProperty("IsFreeToRelist")
    private boolean isFreeToRelist;
    @JsonProperty("Promotions")
    private List<Promotion> promotions;
    @JsonProperty("EmbeddedContentOptions")
    private List<Object> embeddedContentOptions;
    @JsonProperty("MaximumTitleLength")
    private int maximumTitleLength;
    @JsonProperty("AreaOfBusiness")
    private int areaOfBusiness;
    @JsonProperty("DefaultRelistDuration")
    private int defaultRelistDuration;
    @JsonProperty("CanUseCounterOffers")
    private boolean canUseCounterOffers;
    @JsonIgnore
    private final Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Categories() {
    }

    /**
     * 
     * @param fees
     * @param canRelist
     * @param freePhotoCount
     * @param defaultDuration
     * @param areaOfBusiness
     * @param canListClassifieds
     * @param legalNotice
     * @param embeddedContentOptions
     * @param path
     * @param promotions
     * @param defaultRelistDuration
     * @param maximumPhotoCount
     * @param canUseCounterOffers
     * @param name
     * @param canListAuctions
     * @param allowedDurations
     * @param categoryId
     * @param isFreeToRelist
     * @param maximumTitleLength
     */
    public Categories(int categoryId, String name, String path, boolean canListAuctions, boolean canListClassifieds, boolean canRelist, String legalNotice, int defaultDuration, List<Integer> allowedDurations, Fees fees, int freePhotoCount, int maximumPhotoCount, boolean isFreeToRelist, List<Promotion> promotions, List<Object> embeddedContentOptions, int maximumTitleLength, int areaOfBusiness, int defaultRelistDuration, boolean canUseCounterOffers) {
        super();
        this.categoryId = categoryId;
        this.name = name;
        this.path = path;
        this.canListAuctions = canListAuctions;
        this.canListClassifieds = canListClassifieds;
        this.canRelist = canRelist;
        this.legalNotice = legalNotice;
        this.defaultDuration = defaultDuration;
        this.allowedDurations = allowedDurations;
        this.fees = fees;
        this.freePhotoCount = freePhotoCount;
        this.maximumPhotoCount = maximumPhotoCount;
        this.isFreeToRelist = isFreeToRelist;
        this.promotions = promotions;
        this.embeddedContentOptions = embeddedContentOptions;
        this.maximumTitleLength = maximumTitleLength;
        this.areaOfBusiness = areaOfBusiness;
        this.defaultRelistDuration = defaultRelistDuration;
        this.canUseCounterOffers = canUseCounterOffers;
    }

    @JsonProperty("CategoryId")
    public int getCategoryId() {
        return categoryId;
    }

    @JsonProperty("CategoryId")
    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("Path")
    public String getPath() {
        return path;
    }

    @JsonProperty("Path")
    public void setPath(String path) {
        this.path = path;
    }

    @JsonProperty("CanListAuctions")
    public boolean isCanListAuctions() {
        return canListAuctions;
    }

    @JsonProperty("CanListAuctions")
    public void setCanListAuctions(boolean canListAuctions) {
        this.canListAuctions = canListAuctions;
    }

    @JsonProperty("CanListClassifieds")
    public boolean isCanListClassifieds() {
        return canListClassifieds;
    }

    @JsonProperty("CanListClassifieds")
    public void setCanListClassifieds(boolean canListClassifieds) {
        this.canListClassifieds = canListClassifieds;
    }

    @JsonProperty("CanRelist")
    public boolean isCanRelist() {
        return canRelist;
    }

    @JsonProperty("CanRelist")
    public void setCanRelist(boolean canRelist) {
        this.canRelist = canRelist;
    }

    @JsonProperty("LegalNotice")
    public String getLegalNotice() {
        return legalNotice;
    }

    @JsonProperty("LegalNotice")
    public void setLegalNotice(String legalNotice) {
        this.legalNotice = legalNotice;
    }

    @JsonProperty("DefaultDuration")
    public int getDefaultDuration() {
        return defaultDuration;
    }

    @JsonProperty("DefaultDuration")
    public void setDefaultDuration(int defaultDuration) {
        this.defaultDuration = defaultDuration;
    }

    @JsonProperty("AllowedDurations")
    public List<Integer> getAllowedDurations() {
        return allowedDurations;
    }

    @JsonProperty("AllowedDurations")
    public void setAllowedDurations(List<Integer> allowedDurations) {
        this.allowedDurations = allowedDurations;
    }

    @JsonProperty("Fees")
    public Fees getFees() {
        return fees;
    }

    @JsonProperty("Fees")
    public void setFees(Fees fees) {
        this.fees = fees;
    }

    @JsonProperty("FreePhotoCount")
    public int getFreePhotoCount() {
        return freePhotoCount;
    }

    @JsonProperty("FreePhotoCount")
    public void setFreePhotoCount(int freePhotoCount) {
        this.freePhotoCount = freePhotoCount;
    }

    @JsonProperty("MaximumPhotoCount")
    public int getMaximumPhotoCount() {
        return maximumPhotoCount;
    }

    @JsonProperty("MaximumPhotoCount")
    public void setMaximumPhotoCount(int maximumPhotoCount) {
        this.maximumPhotoCount = maximumPhotoCount;
    }

    @JsonProperty("IsFreeToRelist")
    public boolean isIsFreeToRelist() {
        return isFreeToRelist;
    }

    @JsonProperty("IsFreeToRelist")
    public void setIsFreeToRelist(boolean isFreeToRelist) {
        this.isFreeToRelist = isFreeToRelist;
    }

    @JsonProperty("Promotions")
    public List<Promotion> getPromotions() {
        return promotions;
    }

    @JsonProperty("Promotions")
    public void setPromotions(List<Promotion> promotions) {
        this.promotions = promotions;
    }

    @JsonProperty("EmbeddedContentOptions")
    public List<Object> getEmbeddedContentOptions() {
        return embeddedContentOptions;
    }

    @JsonProperty("EmbeddedContentOptions")
    public void setEmbeddedContentOptions(List<Object> embeddedContentOptions) {
        this.embeddedContentOptions = embeddedContentOptions;
    }

    @JsonProperty("MaximumTitleLength")
    public int getMaximumTitleLength() {
        return maximumTitleLength;
    }

    @JsonProperty("MaximumTitleLength")
    public void setMaximumTitleLength(int maximumTitleLength) {
        this.maximumTitleLength = maximumTitleLength;
    }

    @JsonProperty("AreaOfBusiness")
    public int getAreaOfBusiness() {
        return areaOfBusiness;
    }

    @JsonProperty("AreaOfBusiness")
    public void setAreaOfBusiness(int areaOfBusiness) {
        this.areaOfBusiness = areaOfBusiness;
    }

    @JsonProperty("DefaultRelistDuration")
    public int getDefaultRelistDuration() {
        return defaultRelistDuration;
    }

    @JsonProperty("DefaultRelistDuration")
    public void setDefaultRelistDuration(int defaultRelistDuration) {
        this.defaultRelistDuration = defaultRelistDuration;
    }

    @JsonProperty("CanUseCounterOffers")
    public boolean isCanUseCounterOffers() {
        return canUseCounterOffers;
    }

    @JsonProperty("CanUseCounterOffers")
    public void setCanUseCounterOffers(boolean canUseCounterOffers) {
        this.canUseCounterOffers = canUseCounterOffers;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Categories.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("categoryId");
        sb.append('=');
        sb.append(this.categoryId);
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("path");
        sb.append('=');
        sb.append(((this.path == null)?"<null>":this.path));
        sb.append(',');
        sb.append("canListAuctions");
        sb.append('=');
        sb.append(this.canListAuctions);
        sb.append(',');
        sb.append("canListClassifieds");
        sb.append('=');
        sb.append(this.canListClassifieds);
        sb.append(',');
        sb.append("canRelist");
        sb.append('=');
        sb.append(this.canRelist);
        sb.append(',');
        sb.append("legalNotice");
        sb.append('=');
        sb.append(((this.legalNotice == null)?"<null>":this.legalNotice));
        sb.append(',');
        sb.append("defaultDuration");
        sb.append('=');
        sb.append(this.defaultDuration);
        sb.append(',');
        sb.append("allowedDurations");
        sb.append('=');
        sb.append(((this.allowedDurations == null)?"<null>":this.allowedDurations));
        sb.append(',');
        sb.append("fees");
        sb.append('=');
        sb.append(((this.fees == null)?"<null>":this.fees));
        sb.append(',');
        sb.append("freePhotoCount");
        sb.append('=');
        sb.append(this.freePhotoCount);
        sb.append(',');
        sb.append("maximumPhotoCount");
        sb.append('=');
        sb.append(this.maximumPhotoCount);
        sb.append(',');
        sb.append("isFreeToRelist");
        sb.append('=');
        sb.append(this.isFreeToRelist);
        sb.append(',');
        sb.append("promotions");
        sb.append('=');
        sb.append(((this.promotions == null)?"<null>":this.promotions));
        sb.append(',');
        sb.append("embeddedContentOptions");
        sb.append('=');
        sb.append(((this.embeddedContentOptions == null)?"<null>":this.embeddedContentOptions));
        sb.append(',');
        sb.append("maximumTitleLength");
        sb.append('=');
        sb.append(this.maximumTitleLength);
        sb.append(',');
        sb.append("areaOfBusiness");
        sb.append('=');
        sb.append(this.areaOfBusiness);
        sb.append(',');
        sb.append("defaultRelistDuration");
        sb.append('=');
        sb.append(this.defaultRelistDuration);
        sb.append(',');
        sb.append("canUseCounterOffers");
        sb.append('=');
        sb.append(this.canUseCounterOffers);
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(this.additionalProperties);
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.fees == null)? 0 :this.fees.hashCode()));
        result = ((result* 31)+(this.canRelist? 1 : 0));
        result = ((result* 31)+ this.freePhotoCount);
        result = ((result* 31)+ this.defaultDuration);
        result = ((result* 31)+ this.areaOfBusiness);
        result = ((result* 31)+(this.canListClassifieds? 1 : 0));
        result = ((result* 31)+((this.legalNotice == null)? 0 :this.legalNotice.hashCode()));
        result = ((result* 31)+((this.embeddedContentOptions == null)? 0 :this.embeddedContentOptions.hashCode()));
        result = ((result* 31)+((this.path == null)? 0 :this.path.hashCode()));
        result = ((result* 31)+((this.promotions == null)? 0 :this.promotions.hashCode()));
        result = ((result* 31)+ this.defaultRelistDuration);
        result = ((result* 31)+ this.maximumPhotoCount);
        result = ((result* 31)+(this.canUseCounterOffers? 1 : 0));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+(this.canListAuctions? 1 : 0));
        result = ((result* 31)+((this.allowedDurations == null)? 0 :this.allowedDurations.hashCode()));
        result = result* 31 + this.additionalProperties.hashCode();
        result = ((result* 31)+ this.categoryId);
        result = ((result* 31)+(this.isFreeToRelist? 1 : 0));
        result = ((result* 31)+ this.maximumTitleLength);
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Categories rhs)) {
            return false;
        }
        return ((((((((((((((((((((Objects.equals(this.fees, rhs.fees))&&(this.canRelist == rhs.canRelist))&&(this.freePhotoCount == rhs.freePhotoCount))&&(this.defaultDuration == rhs.defaultDuration))&&(this.areaOfBusiness == rhs.areaOfBusiness))&&(this.canListClassifieds == rhs.canListClassifieds))&&(Objects.equals(this.legalNotice, rhs.legalNotice)))&&(Objects.equals(this.embeddedContentOptions, rhs.embeddedContentOptions)))&&(Objects.equals(this.path, rhs.path)))&&(Objects.equals(this.promotions, rhs.promotions)))&&(this.defaultRelistDuration == rhs.defaultRelistDuration))&&(this.maximumPhotoCount == rhs.maximumPhotoCount))&&(this.canUseCounterOffers == rhs.canUseCounterOffers))&&(Objects.equals(this.name, rhs.name)))&&(this.canListAuctions == rhs.canListAuctions))&&(Objects.equals(this.allowedDurations, rhs.allowedDurations)))&&(Objects.equals(this.additionalProperties, rhs.additionalProperties)))&&(this.categoryId == rhs.categoryId))&&(this.isFreeToRelist == rhs.isFreeToRelist))&&(this.maximumTitleLength == rhs.maximumTitleLength));
    }

}
