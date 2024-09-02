package com.api.model;

import java.math.BigDecimal;
import java.util.Objects;

public class PromotionsDTO {
    private int id;
    private String name;
    private String description;
    private BigDecimal price;
    private BigDecimal originalPrice;
    private boolean Recommended;
    private int minimumPhotoCount;

    public PromotionsDTO(int id, String name, String description, BigDecimal price, BigDecimal originalPrice, boolean recommended, int minimumPhotoCount) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.originalPrice = originalPrice;
        Recommended = recommended;
        this.minimumPhotoCount = minimumPhotoCount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(BigDecimal originalPrice) {
        this.originalPrice = originalPrice;
    }

    public boolean isRecommended() {
        return Recommended;
    }

    public void setRecommended(boolean recommended) {
        Recommended = recommended;
    }

    public int getMinimumPhotoCount() {
        return minimumPhotoCount;
    }

    public void setMinimumPhotoCount(int minimumPhotoCount) {
        this.minimumPhotoCount = minimumPhotoCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PromotionsDTO that = (PromotionsDTO) o;
        return id == that.id && Recommended == that.Recommended && minimumPhotoCount == that.minimumPhotoCount && Objects.equals(name, that.name) && Objects.equals(description, that.description) && Objects.equals(price, that.price) && Objects.equals(originalPrice, that.originalPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, price, originalPrice, Recommended, minimumPhotoCount);
    }

    @Override
    public String toString() {
        return "Promotions{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", originalPrice=" + originalPrice +
                ", Recommended=" + Recommended +
                ", minimumPhotoCount=" + minimumPhotoCount +
                '}';
    }
}
