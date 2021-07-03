package com.javalearn;

public class address {
    private int codeAddress;
    private String streetName;
    private String city;
    private String province;
    private String country;
    private String zipCode;

    public address() {
    }

    public address(int codeAddress, String streetName, String city, String province, String country, String zipCode) {
        this.codeAddress = codeAddress;
        this.streetName = streetName;
        this.city = city;
        this.province = province;
        this.country = country;
        this.zipCode = zipCode;
    }

    public int getCodeAddress() {
        return codeAddress;
    }

    public void setCodeAddress(int codeAddress) {
        this.codeAddress = codeAddress;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}
