package com.api.model;

import java.math.BigDecimal;
import java.util.Objects;

public class FeesDTO {
    private BigDecimal bundle;
    private BigDecimal endDate;
    private BigDecimal feature;
    private BigDecimal gallery;
    private BigDecimal listing;
    private BigDecimal reserve;
    private BigDecimal subTitle;
    private BigDecimal tenDays;
    private ListingFeeTiersDTO listingFeeTiersDTO;
    private BigDecimal secondCategory;

    public FeesDTO(BigDecimal bundle, BigDecimal endDate, BigDecimal feature, BigDecimal gallery, BigDecimal listing, BigDecimal reserve, BigDecimal subTitle, BigDecimal tenDays, ListingFeeTiersDTO listingFeeTiersDTO, BigDecimal secondCategory) {
        this.bundle = bundle;
        this.endDate = endDate;
        this.feature = feature;
        this.gallery = gallery;
        this.listing = listing;
        this.reserve = reserve;
        this.subTitle = subTitle;
        this.tenDays = tenDays;
        this.listingFeeTiersDTO = listingFeeTiersDTO;
        this.secondCategory = secondCategory;
    }

    public BigDecimal getBundle() {
        return bundle;
    }

    public void setBundle(BigDecimal bundle) {
        this.bundle = bundle;
    }

    public BigDecimal getEndDate() {
        return endDate;
    }

    public void setEndDate(BigDecimal endDate) {
        this.endDate = endDate;
    }

    public BigDecimal getFeature() {
        return feature;
    }

    public void setFeature(BigDecimal feature) {
        this.feature = feature;
    }

    public BigDecimal getGallery() {
        return gallery;
    }

    public void setGallery(BigDecimal gallery) {
        this.gallery = gallery;
    }

    public BigDecimal getListing() {
        return listing;
    }

    public void setListing(BigDecimal listing) {
        this.listing = listing;
    }

    public BigDecimal getReserve() {
        return reserve;
    }

    public void setReserve(BigDecimal reserve) {
        this.reserve = reserve;
    }

    public BigDecimal getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(BigDecimal subTitle) {
        this.subTitle = subTitle;
    }

    public BigDecimal getTenDays() {
        return tenDays;
    }

    public void setTenDays(BigDecimal tenDays) {
        this.tenDays = tenDays;
    }

    public ListingFeeTiersDTO getListingFeeTiers() {
        return listingFeeTiersDTO;
    }

    public void setListingFeeTiers(ListingFeeTiersDTO listingFeeTiersDTO) {
        this.listingFeeTiersDTO = listingFeeTiersDTO;
    }

    public BigDecimal getSecondCategory() {
        return secondCategory;
    }

    public void setSecondCategory(BigDecimal secondCategory) {
        this.secondCategory = secondCategory;
    }

    @Override
    public String toString() {
        return "Fees{" +
                "bundle=" + bundle +
                ", endDate=" + endDate +
                ", feature=" + feature +
                ", gallery=" + gallery +
                ", listing=" + listing +
                ", reserve=" + reserve +
                ", subTitle=" + subTitle +
                ", tenDays=" + tenDays +
                ", listingFeeTiers=" + listingFeeTiersDTO +
                ", secondCategory=" + secondCategory +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FeesDTO feesDTO = (FeesDTO) o;
        return Objects.equals(bundle, feesDTO.bundle) && Objects.equals(endDate, feesDTO.endDate) && Objects.equals(feature, feesDTO.feature) && Objects.equals(gallery, feesDTO.gallery) && Objects.equals(listing, feesDTO.listing) && Objects.equals(reserve, feesDTO.reserve) && Objects.equals(subTitle, feesDTO.subTitle) && Objects.equals(tenDays, feesDTO.tenDays) && Objects.equals(listingFeeTiersDTO, feesDTO.listingFeeTiersDTO) && Objects.equals(secondCategory, feesDTO.secondCategory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bundle, endDate, feature, gallery, listing, reserve, subTitle, tenDays, listingFeeTiersDTO, secondCategory);
    }
}
