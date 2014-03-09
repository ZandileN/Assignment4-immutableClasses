/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.immutablefoods.model;

/**
 *
 * @author Sibakhulu
 */
public final class Starters {
    private String starterid;
    private String name;
    private double price;
    private int qaunt;
    
    private Starters(){}
    
    public Starters (Builder build){
        
        starterid=build.starterid;
        name=build.name;
        price=build.price;
        qaunt=build.qaunt;
            
    }
    
    public static class Builder {
    private String starterid;
    private String name;
    private double price;
    private int qaunt;
    
    public Builder Starterid(String id){
         starterid=id;
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
    public Builder qauntity(int value){
     qaunt= value;
     return this;
    }
    public Starters build(){
    
        return new Starters(this);
    }
}

    public String getStarterid() {
        return starterid;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQaunt() {
        return qaunt;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + (this.starterid != null ? this.starterid.hashCode() : 0);
        hash = 83 * hash + (this.name != null ? this.name.hashCode() : 0);
        hash = 83 * hash + this.qaunt;
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
        final Starters other = (Starters) obj;
        if ((this.starterid == null) ? (other.starterid != null) : !this.starterid.equals(other.starterid)) {
            return false;
        }
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }
        if (this.qaunt != other.qaunt) {
            return false;
        }
        return true;
    }
    
    
    
}
