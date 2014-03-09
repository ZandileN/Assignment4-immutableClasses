/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.immutablefoods.model;

/**
 *
 * @author Sibakhulu
 */
public final class FoodStore {
    private String storeid;
    private String name;
    private String address;
    private String telephone;
    private Supplier supplier;
    
    private FoodStore(){}
    
  public FoodStore(Builder build){
     storeid=build.storeid;
     name=build.name;
     supplier= build.supplier;
    }
  public static class Builder{
  private String storeid;
  private String name;
  private Supplier supplier;
  
  public Builder storeid(String id){
   storeid=id;
   return this;
  }
   public Builder name(String fname){
   name=fname;
   return this;
  }
   public Builder supplier(Supplier storesupp){
   supplier=storesupp;
   return this;
  }
  public FoodStore build(){
  return new FoodStore();
  }
}

    public String getStoreid() {
        return storeid;
    }

    public String getName() {
        return name;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (this.storeid != null ? this.storeid.hashCode() : 0);
        hash = 97 * hash + (this.name != null ? this.name.hashCode() : 0);
        hash = 97 * hash + (this.supplier != null ? this.supplier.hashCode() : 0);
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
        final FoodStore other = (FoodStore) obj;
        if ((this.storeid == null) ? (other.storeid != null) : !this.storeid.equals(other.storeid)) {
            return false;
        }
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }
        if (this.supplier != other.supplier && (this.supplier == null || !this.supplier.equals(other.supplier))) {
            return false;
        }
        return true;
    }

  
}
