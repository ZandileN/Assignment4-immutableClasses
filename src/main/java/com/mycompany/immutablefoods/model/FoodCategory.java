/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.immutablefoods.model;

/**
 *
 * @author Sibakhulu
 */
public final  class FoodCategory {
    private String catid;
    private String name;
    private String type;
    
     private FoodCategory(){
    }
    public  FoodCategory(Builder build){
     catid=build.id;
     name=build.name;
     type= build.t;
    }
    public static class Builder{
    private String id;
    private String name;
    private String t;
  
    
    public Builder id(String idcatergory){
         id=idcatergory;
        return this;
    }
    public Builder name(String nam){
      name=nam;
      return this;
    }
    public Builder type(String p){
      t=p;
      return this;
    }
       public FoodCategory build(){
    return  new FoodCategory(this);
    }
 }

    public String getCatid() {
        return catid;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 19 * hash + (this.catid != null ? this.catid.hashCode() : 0);
        hash = 19 * hash + (this.name != null ? this.name.hashCode() : 0);
        hash = 19 * hash + (this.type != null ? this.type.hashCode() : 0);
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
        final FoodCategory other = (FoodCategory) obj;
        if ((this.catid == null) ? (other.catid != null) : !this.catid.equals(other.catid)) {
            return false;
        }
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }
        if ((this.type == null) ? (other.type != null) : !this.type.equals(other.type)) {
            return false;
        }
        return true;
    }
    
    
}
