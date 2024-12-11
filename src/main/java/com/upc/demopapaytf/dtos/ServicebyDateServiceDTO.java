package com.upc.demopapaytf.dtos;

import java.time.LocalDate;

public class ServicebyDateServiceDTO {

    private LocalDate dateService;
    private int QuantityDateService;

    public LocalDate getDateService() {
        return dateService;
    }

    public void setDateService(LocalDate dateService) {
        this.dateService = dateService;
    }

    public int getQuantityDateService() {
        return QuantityDateService;
    }

    public void setQuantityDateService(int quantityDateService) {
        QuantityDateService = quantityDateService;
    }
}
