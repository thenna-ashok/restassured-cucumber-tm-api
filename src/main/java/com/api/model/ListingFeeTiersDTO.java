package com.api.model;

import java.math.BigDecimal;
import java.util.Objects;

public class ListingFeeTiersDTO {
    private BigDecimal minimumTierPrice;
    private BigDecimal fixedFee;

    public ListingFeeTiersDTO(BigDecimal minimumTierPrice, BigDecimal fixedFee) {
        this.minimumTierPrice = minimumTierPrice;
        this.fixedFee = fixedFee;
    }

    public BigDecimal getMinimumTierPrice() {
        return minimumTierPrice;
    }

    public void setMinimumTierPrice(BigDecimal minimumTierPrice) {
        this.minimumTierPrice = minimumTierPrice;
    }

    public BigDecimal getFixedFee() {
        return fixedFee;
    }

    public void setFixedFee(BigDecimal fixedFee) {
        this.fixedFee = fixedFee;
    }

    @Override
    public String toString() {
        return "ListingFeeTiers{" +
                "minimumTierPrice=" + minimumTierPrice +
                ", fixedFee=" + fixedFee +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListingFeeTiersDTO that = (ListingFeeTiersDTO) o;
        return Objects.equals(minimumTierPrice, that.minimumTierPrice) && Objects.equals(fixedFee, that.fixedFee);
    }

    @Override
    public int hashCode() {
        return Objects.hash(minimumTierPrice, fixedFee);
    }
}
