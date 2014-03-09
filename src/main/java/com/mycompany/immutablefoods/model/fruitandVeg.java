/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.immutablefoods.model;

import java.util.List;


/**
 *
 * @author Sibakhulu
 */
public final class fruitandVeg{
    
   private String id;
   private String name;
   private double price;
   private int quant;
   List <fruitvegType> type;
   
   private fruitandVeg(){}
     private fruitandVeg(Builder build){
         id=build.fvegId;
         name=build.name;
         price=build.price;
         quant=build.quant;
         type=build.type;
}
   public static class Builder{
       private String fvegId;
       private String name;
       private int quant;
       private double price;
       List <fruitvegType> type;
    public Builder fvegid(String id){
        fvegId=id;
        return this;
   }
    public Builder name(String nam){
        name= nam;
        return this;
    }
    public Builder price(double p){
      price=p;
      return this;
    }
    public Builder Type(List<fruitvegType> t){
       type=t;
       return this;
       }
    public fruitandVeg build(){
       return new fruitandVeg(this);
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
public int getQuant() {
        return quant;
}
public List<fruitvegType> getType() {
        return type;
}

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + (this.id != null ? this.id.hashCode() : 0);
        hash = 59 * hash + (this.name != null ? this.name.hashCode() : 0);
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
        final fruitandVeg other = (fruitandVeg) obj;
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }
        return true;
    }
   
   
   public double amount(){
   double amnt=0.0;
   amnt= price*quant;
   return amnt;}
   
   public void determinetype(){} 
    
}
