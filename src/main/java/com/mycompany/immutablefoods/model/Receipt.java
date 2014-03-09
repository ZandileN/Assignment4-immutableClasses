/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.immutablefoods.model;

/**
 *
 * @author Sibakhulu
 */
public final class Receipt {
    private String receiptid;
    private Customer details;
    private Cashier name;
    private FoodItem item;
    
    private Receipt(){}
    
     public Receipt(Builder build){
    receiptid= build.receiptid;
    name= build.name;
    item= build.item;
    details= build.details;
    }
    
    //public Receipt (Builder build){}
    
    public static class Builder {
    private String receiptid;
    private Customer details;
    private Cashier name;
    private FoodItem item;
    
    public Builder receiptid(String id){
    receiptid=id;
    return this;
    } 
    public Builder details(Customer name){
    details=name;
    return this;
    } 
    public Builder name(Cashier value){
    name=value;
    return this;
    }
    public Builder item(FoodItem value){
      item=value;
      return this;
    }
    public Receipt build(){
    return new Receipt(this);
    }
}

    public String getReceiptid() {
        return receiptid;
    }

    public Customer getDetails() {
        return details;
    }

    public Cashier getName() {
        return name;
    }

    public FoodItem getItem() {
        return item;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + (this.receiptid != null ? this.receiptid.hashCode() : 0);
        hash = 41 * hash + (this.details != null ? this.details.hashCode() : 0);
        hash = 41 * hash + (this.name != null ? this.name.hashCode() : 0);
        hash = 41 * hash + (this.item != null ? this.item.hashCode() : 0);
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
        final Receipt other = (Receipt) obj;
        if ((this.receiptid == null) ? (other.receiptid != null) : !this.receiptid.equals(other.receiptid)) {
            return false;
        }
        if (this.details != other.details && (this.details == null || !this.details.equals(other.details))) {
            return false;
        }
        if (this.name != other.name && (this.name == null || !this.name.equals(other.name))) {
            return false;
        }
        if (this.item != other.item && (this.item == null || !this.item.equals(other.item))) {
            return false;
        }
        return true;
    }
 
    
    
    
}
