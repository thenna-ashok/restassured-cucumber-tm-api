package com.api.model;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Bundle",
    "EndDate",
    "Feature",
    "Gallery",
    "Listing",
    "Reserve",
    "Subtitle",
    "TenDays",
    "ListingFeeTiers",
    "SecondCategory"
})

public class Fees {

    @JsonProperty("Bundle")
    private double bundle;
    @JsonProperty("EndDate")
    private double endDate;
    @JsonProperty("Feature")
    private double feature;
    @JsonProperty("Gallery")
    private double gallery;
    @JsonProperty("Listing")
    private double listing;
    @JsonProperty("Reserve")
    private double reserve;
    @JsonProperty("Subtitle")
    private double subtitle;
    @JsonProperty("TenDays")
    private double tenDays;
    @JsonProperty("ListingFeeTiers")
    private List<ListingFeeTier> listingFeeTiers;
    @JsonProperty("SecondCategory")
    private double secondCategory;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Fees() {
    }

    /**
     * 
     * @param feature
     * @param secondCategory
     * @param endDate
     * @param listingFeeTiers
     * @param subtitle
     * @param reserve
     * @param listing
     * @param bundle
     * @param gallery
     * @param tenDays
     */
    public Fees(double bundle, double endDate, double feature, double gallery, double listing, double reserve, double subtitle, double tenDays, List<ListingFeeTier> listingFeeTiers, double secondCategory) {
        super();
        this.bundle = bundle;
        this.endDate = endDate;
        this.feature = feature;
        this.gallery = gallery;
        this.listing = listing;
        this.reserve = reserve;
        this.subtitle = subtitle;
        this.tenDays = tenDays;
        this.listingFeeTiers = listingFeeTiers;
        this.secondCategory = secondCategory;
    }

    @JsonProperty("Bundle")
    public double getBundle() {
        return bundle;
    }

    @JsonProperty("Bundle")
    public void setBundle(double bundle) {
        this.bundle = bundle;
    }

    @JsonProperty("EndDate")
    public double getEndDate() {
        return endDate;
    }

    @JsonProperty("EndDate")
    public void setEndDate(double endDate) {
        this.endDate = endDate;
    }

    @JsonProperty("Feature")
    public double getFeature() {
        return feature;
    }

    @JsonProperty("Feature")
    public void setFeature(double feature) {
        this.feature = feature;
    }

    @JsonProperty("Gallery")
    public double getGallery() {
        return gallery;
    }

    @JsonProperty("Gallery")
    public void setGallery(double gallery) {
        this.gallery = gallery;
    }

    @JsonProperty("Listing")
    public double getListing() {
        return listing;
    }

    @JsonProperty("Listing")
    public void setListing(double listing) {
        this.listing = listing;
    }

    @JsonProperty("Reserve")
    public double getReserve() {
        return reserve;
    }

    @JsonProperty("Reserve")
    public void setReserve(double reserve) {
        this.reserve = reserve;
    }

    @JsonProperty("Subtitle")
    public double getSubtitle() {
        return subtitle;
    }

    @JsonProperty("Subtitle")
    public void setSubtitle(double subtitle) {
        this.subtitle = subtitle;
    }

    @JsonProperty("TenDays")
    public double getTenDays() {
        return tenDays;
    }

    @JsonProperty("TenDays")
    public void setTenDays(double tenDays) {
        this.tenDays = tenDays;
    }

    @JsonProperty("ListingFeeTiers")
    public List<ListingFeeTier> getListingFeeTiers() {
        return listingFeeTiers;
    }

    @JsonProperty("ListingFeeTiers")
    public void setListingFeeTiers(List<ListingFeeTier> listingFeeTiers) {
        this.listingFeeTiers = listingFeeTiers;
    }

    @JsonProperty("SecondCategory")
    public double getSecondCategory() {
        return secondCategory;
    }

    @JsonProperty("SecondCategory")
    public void setSecondCategory(double secondCategory) {
        this.secondCategory = secondCategory;
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
        sb.append(Fees.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("bundle");
        sb.append('=');
        sb.append(this.bundle);
        sb.append(',');
        sb.append("endDate");
        sb.append('=');
        sb.append(this.endDate);
        sb.append(',');
        sb.append("feature");
        sb.append('=');
        sb.append(this.feature);
        sb.append(',');
        sb.append("gallery");
        sb.append('=');
        sb.append(this.gallery);
        sb.append(',');
        sb.append("listing");
        sb.append('=');
        sb.append(this.listing);
        sb.append(',');
        sb.append("reserve");
        sb.append('=');
        sb.append(this.reserve);
        sb.append(',');
        sb.append("subtitle");
        sb.append('=');
        sb.append(this.subtitle);
        sb.append(',');
        sb.append("tenDays");
        sb.append('=');
        sb.append(this.tenDays);
        sb.append(',');
        sb.append("listingFeeTiers");
        sb.append('=');
        sb.append(((this.listingFeeTiers == null)?"<null>":this.listingFeeTiers));
        sb.append(',');
        sb.append("secondCategory");
        sb.append('=');
        sb.append(this.secondCategory);
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
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
        result = ((result* 31)+((int)(Double.doubleToLongBits(this.feature)^(Double.doubleToLongBits(this.feature)>>> 32))));
        result = ((result* 31)+((int)(Double.doubleToLongBits(this.secondCategory)^(Double.doubleToLongBits(this.secondCategory)>>> 32))));
        result = ((result* 31)+((int)(Double.doubleToLongBits(this.endDate)^(Double.doubleToLongBits(this.endDate)>>> 32))));
        result = ((result* 31)+((this.listingFeeTiers == null)? 0 :this.listingFeeTiers.hashCode()));
        result = ((result* 31)+((int)(Double.doubleToLongBits(this.subtitle)^(Double.doubleToLongBits(this.subtitle)>>> 32))));
        result = ((result* 31)+((int)(Double.doubleToLongBits(this.reserve)^(Double.doubleToLongBits(this.reserve)>>> 32))));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((int)(Double.doubleToLongBits(this.listing)^(Double.doubleToLongBits(this.listing)>>> 32))));
        result = ((result* 31)+((int)(Double.doubleToLongBits(this.bundle)^(Double.doubleToLongBits(this.bundle)>>> 32))));
        result = ((result* 31)+((int)(Double.doubleToLongBits(this.gallery)^(Double.doubleToLongBits(this.gallery)>>> 32))));
        result = ((result* 31)+((int)(Double.doubleToLongBits(this.tenDays)^(Double.doubleToLongBits(this.tenDays)>>> 32))));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Fees) == false) {
            return false;
        }
        Fees rhs = ((Fees) other);
        return (((((((((((Double.doubleToLongBits(this.feature) == Double.doubleToLongBits(rhs.feature))&&(Double.doubleToLongBits(this.secondCategory) == Double.doubleToLongBits(rhs.secondCategory)))&&(Double.doubleToLongBits(this.endDate) == Double.doubleToLongBits(rhs.endDate)))&&((this.listingFeeTiers == rhs.listingFeeTiers)||((this.listingFeeTiers!= null)&&this.listingFeeTiers.equals(rhs.listingFeeTiers))))&&(Double.doubleToLongBits(this.subtitle) == Double.doubleToLongBits(rhs.subtitle)))&&(Double.doubleToLongBits(this.reserve) == Double.doubleToLongBits(rhs.reserve)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&(Double.doubleToLongBits(this.listing) == Double.doubleToLongBits(rhs.listing)))&&(Double.doubleToLongBits(this.bundle) == Double.doubleToLongBits(rhs.bundle)))&&(Double.doubleToLongBits(this.gallery) == Double.doubleToLongBits(rhs.gallery)))&&(Double.doubleToLongBits(this.tenDays) == Double.doubleToLongBits(rhs.tenDays)));
    }

}
