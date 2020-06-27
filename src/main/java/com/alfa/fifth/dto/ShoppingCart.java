package com.alfa.fifth.dto;

import java.util.List;

public class ShoppingCart {

    private boolean loyaltyCard;

    private List<ItemPosition> positions;

    private int shopId;

    public boolean isLoyaltyCard() {
        return loyaltyCard;
    }

    public void setLoyaltyCard(boolean loyaltyCard) {
        this.loyaltyCard = loyaltyCard;
    }

    public List<ItemPosition> getPositions() {
        return positions;
    }

    public void setPositions(List<ItemPosition> positions) {
        this.positions = positions;
    }

    public int getShopId() {
        return shopId;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }
}
