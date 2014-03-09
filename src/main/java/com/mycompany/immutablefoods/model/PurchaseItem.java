/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.immutablefoods.model;

/**
 *
 * @author Sibakhulu
 */
public final class PurchaseItem {
 private String purchaseId;
 private String Itemname;
 private String type;
 
 private PurchaseItem(){}
 
 public PurchaseItem(Builder build){
 purchaseId=build.purchaseId;
 Itemname=build.Itemname;
 type=build.type;
}
 
 public static class Builder{
 private String purchaseId;
 private String Itemname;
 private String type;
 
 public Builder purchaseid(String pid){
     purchaseId=pid;
     return this;
 }
 public Builder itemname(String iname){
     Itemname=iname;
     return this;
 }
 public Builder type(String t){
    type= t;
    return this;
 }
 public PurchaseItem build(){
     
 return new PurchaseItem();
 }
 }
    public String getPurchaseId() {
        return purchaseId;
    }

    public String getItemname() {
        return Itemname;
    }

    public String getType() {
        return type;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + (this.purchaseId != null ? this.purchaseId.hashCode() : 0);
        hash = 19 * hash + (this.Itemname != null ? this.Itemname.hashCode() : 0);
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
        final PurchaseItem other = (PurchaseItem) obj;
        if ((this.purchaseId == null) ? (other.purchaseId != null) : !this.purchaseId.equals(other.purchaseId)) {
            return false;
        }
        if ((this.Itemname == null) ? (other.Itemname != null) : !this.Itemname.equals(other.Itemname)) {
            return false;
        }
        return true;
    }

 
    
}
