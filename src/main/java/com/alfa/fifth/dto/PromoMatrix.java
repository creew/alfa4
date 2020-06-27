package com.alfa.fifth.dto;

import java.util.ArrayList;
import java.util.List;

public class PromoMatrix {
    List<ItemCountRule> itemCountRules;

    List<ItemGroupRule> itemGroupRules;

    List<LoyaltyCardRule> loyaltyCardRules;

    public PromoMatrix() {
        itemCountRules = new ArrayList<>();
        itemGroupRules = new ArrayList<>();
        loyaltyCardRules = new ArrayList<>();
    }

    public List<ItemCountRule> getItemCountRules() {
        return itemCountRules;
    }

    public void setItemCountRules(List<ItemCountRule> itemCountRules) {
        this.itemCountRules = itemCountRules;
    }

    public List<ItemGroupRule> getItemGroupRules() {
        return itemGroupRules;
    }

    public void setItemGroupRules(List<ItemGroupRule> itemGroupRules) {
        this.itemGroupRules = itemGroupRules;
    }

    public List<LoyaltyCardRule> getLoyaltyCardRules() {
        return loyaltyCardRules;
    }

    public void setLoyaltyCardRules(List<LoyaltyCardRule> loyaltyCardRules) {
        this.loyaltyCardRules = loyaltyCardRules;
    }
}
