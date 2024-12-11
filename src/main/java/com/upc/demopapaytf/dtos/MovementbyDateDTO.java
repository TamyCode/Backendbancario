package com.upc.demopapaytf.dtos;

import java.time.LocalDate;

public class MovementbyDateDTO {

    private LocalDate dateMovement;
    private int quantityMovement;



    public LocalDate getDateMovement() {
        return dateMovement;
    }

    public void setDateMovement(LocalDate dateMovement) {
        this.dateMovement = dateMovement;
    }

    public int getQuantityMovement() {
        return quantityMovement;
    }

    public void setQuantityMovement(int quantityMovement) {
        this.quantityMovement = quantityMovement;
    }
}
