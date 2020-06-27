package com.alfa.fifth.dto;

public class ItemCountRule {
    private int bonusQuantity;

    private String itemId;

    private int shopId;

    private int triggerQuantity;

    public int getBonusQuantity() {
        return bonusQuantity;
    }

    public void setBonusQuantity(int bonusQuantity) {
        this.bonusQuantity = bonusQuantity;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public int getShopId() {
        return shopId;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }

    public int getTriggerQuantity() {
        return triggerQuantity;
    }

    public void setTriggerQuantity(int triggerQuantity) {
        this.triggerQuantity = triggerQuantity;
    }
}
