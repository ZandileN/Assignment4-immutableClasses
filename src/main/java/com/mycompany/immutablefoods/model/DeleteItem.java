/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.immutablefoods.model;

/**
 *
 * @author Sibakhulu
 */
public final class DeleteItem {
    private String itemno;
    private String name;
    private String type;
    
    private DeleteItem(){}
    
    public DeleteItem(Builder build){
     itemno=build.itemno;
      name=build.name;
     type=build.type;
    }
    
    public static class Builder{
    private String itemno;
    private String name;
    private String type;
    
    public Builder itemno(String itm){
    itemno=itm;
    return this;
    }
    public Builder name(String nam){
    name=nam;
    return this;
    }
    public Builder type(String t){
        type=t;
        return this;
    }
    public DeleteItem build(){
      return new DeleteItem();
    }
 }

    public String getItemno() {
        return itemno;
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
        hash = 53 * hash + (this.itemno != null ? this.itemno.hashCode() : 0);
        hash = 53 * hash + (this.name != null ? this.name.hashCode() : 0);
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
        final DeleteItem other = (DeleteItem) obj;
        if ((this.itemno == null) ? (other.itemno != null) : !this.itemno.equals(other.itemno)) {
            return false;
        }
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }
        return true;
    }
    
    
    
}
