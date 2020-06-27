package com.alfa.fifth.controllers;

import com.alfa.fifth.dto.FinalPriceReceipt;
import com.alfa.fifth.dto.PromoMatrix;
import com.alfa.fifth.dto.ShoppingCart;
import com.alfa.fifth.services.DataService;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
public class ReceiptController {

    private final DataService dataService;

    public ReceiptController(DataService dataService) {
        this.dataService = dataService;
    }

    @PostMapping("/receipt")
    public FinalPriceReceipt calculate(@RequestBody(required=false) ShoppingCart request, HttpServletResponse response,
                                       @CookieValue(value = "id", required = false) String cookId) {
        PromoMatrix promoMatrix;
        if (cookId == null) {
            promoMatrix = new PromoMatrix();
        } else {
            promoMatrix = dataService.getMatrix(Integer.parseInt(cookId));
            if (promoMatrix == null) {
                promoMatrix = new PromoMatrix();
            }
        }
        FinalPriceReceipt finalPriceReceipt = new FinalPriceReceipt();
        return finalPriceReceipt;
    }
}
