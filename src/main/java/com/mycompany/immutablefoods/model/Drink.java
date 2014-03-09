/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.immutablefoods.model;

/**
 *
 * @author Sibakhulu
 */
public final class Drink {
    private String drinkid;
    private String name;
    private String type;
    private double price;
    
    private Drink(){}
    public Drink (Builder build){
      drinkid=build.drinkid;
      name=build.name;
      price=build.price;
 }
    public static class Builder{
    private String drinkid;
    private String name;
    private String type;
    private double price;
    
    public Builder drinkid(String id){
        drinkid=id;
        return this;
    }
    public Builder name(String nm){
      name=nm;
      return this;
    }
    public Builder price (double p){
      price=p;
      return this;
    }
    public Drink build(){
    return new Drink(this);
    }
}

    public String getDrinkid() {
        return drinkid;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 19 * hash + (this.drinkid != null ? this.drinkid.hashCode() : 0);
        hash = 19 * hash + (this.name != null ? this.name.hashCode() : 0);
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
        final Drink other = (Drink) obj;
        if ((this.drinkid == null) ? (other.drinkid != null) : !this.drinkid.equals(other.drinkid)) {
            return false;
        }
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }
        return true;
    }
    
    
}
