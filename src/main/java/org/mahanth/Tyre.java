package org.mahanth;

public class Tyre {

    private String brand;
    private String model;
    public Tyre(String brand,  String model) {
        this.brand = brand;
        this.model = model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setModel(String model) {
        this.model = model;
    }


    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Tyre{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
