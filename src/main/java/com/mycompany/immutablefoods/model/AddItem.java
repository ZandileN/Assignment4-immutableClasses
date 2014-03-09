/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.immutablefoods.model;

/**
 *
 * @author Sibakhulu
 */
public final class AddItem {
    private String itemId;
    private String name;
    private String itemType;
    
    private AddItem(){
    }
    
    public static class Builder{
    private String item;
    private String nam;
    private String itype;
    
    public Builder itemid(String itm){
      item=itm;
      return this;
    }
    public Builder name(String nm){
      nam=nm;
        return this;
    }
   public AddItem build(){
        return new AddItem();
}    
 }
    public String getItemId() {
        return itemId;
    }
    public String getName() {
        return name;
    }
    public String getItemType() {
        return itemType;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + (this.itemId != null ? this.itemId.hashCode() : 0);
        hash = 73 * hash + (this.name != null ? this.name.hashCode() : 0);
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
        final AddItem other = (AddItem) obj;
        if ((this.itemId == null) ? (other.itemId != null) : !this.itemId.equals(other.itemId)) {
            return false;
        }
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }
        return true;
    }
    
    
}
