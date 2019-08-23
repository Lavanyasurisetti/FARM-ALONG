package com.example.user.biscuit;

/**
 * Created by user on 01-01-2019.
 */

public class Crop {

    String id;
    String farmer;
    String crop;
    String quantity;
    String costofcrop;
    String mobile;
    String address;


    public Crop() {

    }

    public Crop(String id, String farmer, String crop, String quantity, String costofcrop, String mobile, String address) {

        this.id = id;
        this.farmer = farmer;
        this.crop = crop;
        this.quantity = quantity;
        this.costofcrop = costofcrop;
        this.mobile = mobile;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public String getFarmer() {
        return farmer;
    }

    public String getCrop() {
        return crop;
    }

    public String getQuantity() {
        return quantity;
    }

    public String getCostofcrop() {
        return costofcrop;
    }

    public String getMobile() {
        return mobile;
    }

    public String getAddress() {
        return address;
    }
}
