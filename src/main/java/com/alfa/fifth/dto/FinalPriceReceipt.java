package com.alfa.fifth.dto;

import java.util.ArrayList;
import java.util.List;

public class FinalPriceReceipt {

    private double discount;

    private List<FinalPricePosition> positions;

    private double total;

    public FinalPriceReceipt() {
        positions = new ArrayList<>();
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public List<FinalPricePosition> getPositions() {
        return positions;
    }

    public void setPositions(List<FinalPricePosition> positions) {
        this.positions = positions;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
