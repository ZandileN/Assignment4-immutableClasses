/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.immutablefoods.model;

/**
 *
 * @author Sibakhulu
 */
public final class PlaceOrders {
 
    private int ordernum;
    private String name;
    private int qaunt;
    //FoodItem item;
    
    private PlaceOrders(){}
    public PlaceOrders (Builder build){
    ordernum=build.ordernum;
    name=build.name;
    qaunt=build.qaunt;    
    }
    public static class Builder{
        private int ordernum;
        private String name;
        private int qaunt;
        //private FoodItem item;
        public Builder ordernum(int order_no){
         ordernum= order_no;
         return this;
        }
        public Builder name(String nam){
          name= nam;
          return this;
        }
        
        public Builder qaunt(int qaun){
            qaunt=qaun;
            return this;   
        }
        public PlaceOrders build(){
        return new PlaceOrders();
        }
    }
  public int getOrdernum() {
        return ordernum;
    }

    public String getName() {
        return name;
    }

    public int getQaunt() {
        return qaunt;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + this.ordernum;
        hash = 89 * hash + (this.name != null ? this.name.hashCode() : 0);
        hash = 89 * hash + this.qaunt;
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
        final PlaceOrders other = (PlaceOrders) obj;
        if (this.ordernum != other.ordernum) {
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
