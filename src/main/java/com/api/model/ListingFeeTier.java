package com.api.model;

import java.util.LinkedHashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "MinimumTierPrice",
    "FixedFee"
})
public class ListingFeeTier {

    @JsonProperty("MinimumTierPrice")
    private int minimumTierPrice;
    @JsonProperty("FixedFee")
    private double fixedFee;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ListingFeeTier() {
    }

    /**
     * 
     * @param minimumTierPrice
     * @param fixedFee
     */
    public ListingFeeTier(int minimumTierPrice, double fixedFee) {
        super();
        this.minimumTierPrice = minimumTierPrice;
        this.fixedFee = fixedFee;
    }

    @JsonProperty("MinimumTierPrice")
    public int getMinimumTierPrice() {
        return minimumTierPrice;
    }

    @JsonProperty("MinimumTierPrice")
    public void setMinimumTierPrice(int minimumTierPrice) {
        this.minimumTierPrice = minimumTierPrice;
    }

    @JsonProperty("FixedFee")
    public double getFixedFee() {
        return fixedFee;
    }

    @JsonProperty("FixedFee")
    public void setFixedFee(double fixedFee) {
        this.fixedFee = fixedFee;
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
        sb.append(ListingFeeTier.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("minimumTierPrice");
        sb.append('=');
        sb.append(this.minimumTierPrice);
        sb.append(',');
        sb.append("fixedFee");
        sb.append('=');
        sb.append(this.fixedFee);
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
        result = ((result* 31)+((int)(Double.doubleToLongBits(this.fixedFee)^(Double.doubleToLongBits(this.fixedFee)>>> 32))));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+ this.minimumTierPrice);
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ListingFeeTier) == false) {
            return false;
        }
        ListingFeeTier rhs = ((ListingFeeTier) other);
        return (((Double.doubleToLongBits(this.fixedFee) == Double.doubleToLongBits(rhs.fixedFee))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&(this.minimumTierPrice == rhs.minimumTierPrice));
    }

}
