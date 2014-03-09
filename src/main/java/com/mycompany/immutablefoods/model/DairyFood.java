/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.immutablefoods.model;

/**
 *
 * @author Sibakhulu
 */
public final class DairyFood {
    private String dairyId;
    private String name;
     private double price;
    private int qaunt;
    
    private DairyFood(){}
    
    public DairyFood (Builder build){
        
        dairyId=build.dairyId;
        name=build.name;
        price=build.price;
        qaunt=build.qaunt;
            
    }
    
    public static class Builder {
    private String dairyId;
    private String name;
    private double price;
    private int qaunt;
    
    public Builder dairyId(String id){
    dairyId=id;
    return this;
 }
     
    public Builder name(String val){
    name=val;
    return this;
 }
     
    public Builder price(double pr){
    price=pr;
    return this;
 }
     
    public Builder qaunt(int q){
    qaunt=q;
    return this;
 }
    
  public DairyFood build(){
  return new DairyFood(this);
  } 
 }

    public String getDairyId() {
        return dairyId;
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
        int hash = 5;
        hash = 71 * hash + (this.dairyId != null ? this.dairyId.hashCode() : 0);
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
        final DairyFood other = (DairyFood) obj;
        if ((this.dairyId == null) ? (other.dairyId != null) : !this.dairyId.equals(other.dairyId)) {
            return false;
        }
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }
        return true;
    }
    
    
}
