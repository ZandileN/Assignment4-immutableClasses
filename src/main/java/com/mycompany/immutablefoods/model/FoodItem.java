/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.immutablefoods.model;

/**
 *
 * @author Sibakhulu
 */
public final class FoodItem {
    
    private String id;
    private String name;
    private double price;
    
    private FoodItem(){
    }
    public FoodItem(Builder build){
     id=build.id;
     name=build.name;
     price= build.price;
    }
    public static class Builder{
    private String id;
    private String name;
    private double price;
    //private int qaunt;
    
    public Builder id(String idItem){
         id=idItem;
        return this;
    }
    public Builder name(String nam){
      name=nam;
      return this;
    }
    public Builder price(double p){
      price=p;
      return this;
    }
       public FoodItem build(){
    return  new FoodItem(this);
    }
 }
    
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
 

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 31 * hash + (this.id != null ? this.id.hashCode() : 0);
        hash = 31 * hash + (this.name != null ? this.name.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final FoodItem other = (FoodItem) obj;
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }
        return true;
    }
    
    
    
    
    }

   

