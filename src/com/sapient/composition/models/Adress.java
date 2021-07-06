package com.sapient.composition.models;

public class Adress {

    private String AdressLine;
    private String city;
    private String country;

    public String getAdressLine() {
        return AdressLine;
    }

    public void setAdressLine(String adressLine) {
        AdressLine = adressLine;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public Adress() {

    }

    public Adress(String adressLine, String city, String country) {
        AdressLine = adressLine;
        this.city = city;
        this.country = country;
    }

    public void printAdresses(){
        System.out.println("AdressLine1 ::::"+AdressLine);
        System.out.println("City:::::::::"+city);
        System.out.println("Country ::::::"+country);
    }


    public void printAdress() {
    }
}
