package com.upc.demopapaytf.dtos;

import com.upc.demopapaytf.entities.Services;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class VoucherDTO {
    private int idVoucher;
    private LocalDate dateVoucher;
    private LocalDateTime hourVoucher;
    private int destinationAccountVoucher;
    private float amountVoucher;
    private int numberOperationVoucher;
    private Services serviceB;

    public int getIdVoucher() {
        return idVoucher;
    }

    public void setIdVoucher(int idVoucher) {
        this.idVoucher = idVoucher;
    }

    public LocalDate getDateVoucher() {
        return dateVoucher;
    }

    public void setDateVoucher(LocalDate dateVoucher) {
        this.dateVoucher = dateVoucher;
    }

    public LocalDateTime getHourVoucher() {
        return hourVoucher;
    }

    public void setHourVoucher(LocalDateTime hourVoucher) {
        this.hourVoucher = hourVoucher;
    }

    public int getDestinationAccountVoucher() {
        return destinationAccountVoucher;
    }

    public void setDestinationAccountVoucher(int destinationAccountVoucher) {
        this.destinationAccountVoucher = destinationAccountVoucher;
    }

    public float getAmountVoucher() {
        return amountVoucher;
    }

    public void setAmountVoucher(float amountVoucher) {
        this.amountVoucher = amountVoucher;
    }

    public int getNumberOperationVoucher() {
        return numberOperationVoucher;
    }

    public void setNumberOperationVoucher(int numberOperationVoucher) {
        this.numberOperationVoucher = numberOperationVoucher;
    }


    public Services getServiceB() {
        return serviceB;
    }

    public void setServiceB(Services serviceB) {
        this.serviceB = serviceB;
    }
}
