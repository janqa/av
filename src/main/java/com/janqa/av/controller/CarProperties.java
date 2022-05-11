package com.janqa.av.controller;

import java.util.Objects;

public class CarProperties {
    private String brand;
    private String model;
    private String generation;

    @Override public String toString() {
        return "CarProperties{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", generation='" + generation + '\'' +
                '}';
    }

    @Override public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof CarProperties))
            return false;
        CarProperties that = (CarProperties) o;
        return brand.equals(that.brand) && model.equals(that.model) && Objects.equals(generation, that.generation);
    }

    @Override public int hashCode() {
        return Objects.hash(brand, model, generation);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getGeneration() {
        return generation;
    }

    public void setGeneration(String generation) {
        this.generation = generation;
    }
}
