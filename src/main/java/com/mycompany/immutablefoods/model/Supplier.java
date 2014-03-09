/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.immutablefoods.model;

/**
 *
 * @author Sibakhulu
 */
public final class Supplier {
    private String suppId;
    private String suppName;
   
    private Supplier(){}
    
    public Supplier(Builder build){
    suppId=build.suppId;
    suppName=build.suppname;
    }
    public static class Builder{
    private String suppId;
    private String suppname;
    
    public Builder suppId(String id){
        suppId=id;
        return this;
    }
    public Builder suppname(String name){
       suppname=name;
       return this;
    }
    public Supplier build(){
    return new Supplier(this);
    }
  }

    public String getSuppId() {
        return suppId;
    }

    public String getSuppName() {
        return suppName;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + (this.suppId != null ? this.suppId.hashCode() : 0);
        hash = 67 * hash + (this.suppName != null ? this.suppName.hashCode() : 0);
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
        final Supplier other = (Supplier) obj;
        if ((this.suppId == null) ? (other.suppId != null) : !this.suppId.equals(other.suppId)) {
            return false;
        }
        if ((this.suppName == null) ? (other.suppName != null) : !this.suppName.equals(other.suppName)) {
            return false;
        }
        return true;
    }
    
    
}
