package com.api.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Id",
    "Name",
    "Description",
    "Price",
    "MinimumPhotoCount",
    "OriginalPrice",
    "Recommended"
})

public class Promotion {

    @JsonProperty("Id")
    private int id;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Description")
    private String description;
    @JsonProperty("Price")
    private double price;
    @JsonProperty("MinimumPhotoCount")
    private int minimumPhotoCount;
    @JsonProperty("OriginalPrice")
    private double originalPrice;
    @JsonProperty("Recommended")
    private boolean recommended;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Promotion() {
    }

    /**
     * 
     * @param originalPrice
     * @param price
     * @param name
     * @param description
     * @param id
     * @param minimumPhotoCount
     * @param recommended
     */
    public Promotion(int id, String name, String description, double price, int minimumPhotoCount, double originalPrice, boolean recommended) {
        super();
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.minimumPhotoCount = minimumPhotoCount;
        this.originalPrice = originalPrice;
        this.recommended = recommended;
    }

    @JsonProperty("Id")
    public int getId() {
        return id;
    }

    @JsonProperty("Id")
    public void setId(int id) {
        this.id = id;
    }

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("Description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("Description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("Price")
    public double getPrice() {
        return price;
    }

    @JsonProperty("Price")
    public void setPrice(double price) {
        this.price = price;
    }

    @JsonProperty("MinimumPhotoCount")
    public int getMinimumPhotoCount() {
        return minimumPhotoCount;
    }

    @JsonProperty("MinimumPhotoCount")
    public void setMinimumPhotoCount(int minimumPhotoCount) {
        this.minimumPhotoCount = minimumPhotoCount;
    }

    @JsonProperty("OriginalPrice")
    public double getOriginalPrice() {
        return originalPrice;
    }

    @JsonProperty("OriginalPrice")
    public void setOriginalPrice(double originalPrice) {
        this.originalPrice = originalPrice;
    }

    @JsonProperty("Recommended")
    public boolean isRecommended() {
        return recommended;
    }

    @JsonProperty("Recommended")
    public void setRecommended(boolean recommended) {
        this.recommended = recommended;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Promotion.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(this.id);
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("price");
        sb.append('=');
        sb.append(this.price);
        sb.append(',');
        sb.append("minimumPhotoCount");
        sb.append('=');
        sb.append(this.minimumPhotoCount);
        sb.append(',');
        sb.append("originalPrice");
        sb.append('=');
        sb.append(this.originalPrice);
        sb.append(',');
        sb.append("recommended");
        sb.append('=');
        sb.append(this.recommended);
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
        result = ((result* 31)+((int)(Double.doubleToLongBits(this.originalPrice)^(Double.doubleToLongBits(this.originalPrice)>>> 32))));
        result = ((result* 31)+((int)(Double.doubleToLongBits(this.price)^(Double.doubleToLongBits(this.price)>>> 32))));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+ this.id);
        result = ((result* 31)+ this.minimumPhotoCount);
        result = ((result* 31)+(this.recommended? 1 : 0));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Promotion) == false) {
            return false;
        }
        Promotion rhs = ((Promotion) other);
        return ((((((((Double.doubleToLongBits(this.originalPrice) == Double.doubleToLongBits(rhs.originalPrice))&&(Double.doubleToLongBits(this.price) == Double.doubleToLongBits(rhs.price)))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&(this.id == rhs.id)))&&(this.minimumPhotoCount == rhs.minimumPhotoCount))&&(this.recommended == rhs.recommended));
    }

}
