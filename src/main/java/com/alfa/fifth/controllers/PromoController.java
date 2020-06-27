package com.alfa.fifth.controllers;

import com.alfa.fifth.dto.PromoMatrix;
import com.alfa.fifth.services.DataService;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

@RestController
public class PromoController {

    private final DataService dataService;

    public PromoController(DataService dataService) {
        this.dataService = dataService;
    }

    @PostMapping("/promo")
    public  void promo(@RequestBody(required=false) PromoMatrix request, HttpServletResponse response,
                       @CookieValue(value = "id", required = false) String cookId) {
        int id;
        if (request == null) {
            request = new PromoMatrix();
        }
        if (cookId == null) {
            id = dataService.pushMatrix(request);
        } else {
            id = dataService.pushMatrix(Integer.parseInt(cookId), request);
        }
        response.addCookie(new Cookie("id", Integer.toString(id)));
    }
}
