/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.immutablefoods.model;

/**
 *
 * @author Sibakhulu
 */
public final class MainMeal {
    private String Mealid;
    private String name;
    private double price;
    private int qaunt;
    
    private MainMeal(){
        
    }
   public MainMeal(Builder build){
    Mealid= build.Mealid;
    name= build.name;
    price= build.price;
    qaunt= build.qaunt;
    }
    public static class Builder{
    private String Mealid;
    private String name;
    private double price;
    private int qaunt;
    
    public Builder Mealid(String mid){
         Mealid=mid;
        return this;
    }
    public Builder Name(String nam){
      name=nam;
      return this;
    }
    public Builder price(double pr){
      price=pr;
      return this;
    }
    public MainMeal build(){
    
        return new MainMeal(this);
    }
    
    }
    public String getMealid() {
        return Mealid;
    }

    public String getName() {
        return name;
    }

    public double getPrice(){
        return price;
    }
    public int  getqaunt(){
    
        return qaunt;
    }
   
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + (this.Mealid != null ? this.Mealid.hashCode() : 0);
        hash = 71 * hash + (this.name != null ? this.name.hashCode() : 0);
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
        final MainMeal other = (MainMeal) obj;
        if ((this.Mealid == null) ? (other.Mealid != null) : !this.Mealid.equals(other.Mealid)) {
            return false;
        }
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }
        return true;
    }
    
    
    
    }
   
