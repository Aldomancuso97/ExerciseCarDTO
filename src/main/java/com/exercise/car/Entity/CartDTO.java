package com.exercise.car.Entity;

public class CartDTO {

   private String id;
   private String modelName;
   private double price;

    public CartDTO() {
    }

    public CartDTO(String id, String modelName, double price) {
        this.id = id;
        this.modelName = modelName;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "CartDTO{" +
                "id='" + id + '\'' +
                ", modelName='" + modelName + '\'' +
                ", price=" + price +
                '}';
    }
}
