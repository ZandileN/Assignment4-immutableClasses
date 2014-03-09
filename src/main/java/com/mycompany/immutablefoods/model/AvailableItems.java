/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.immutablefoods.model;

/**
 *
 * @author Sibakhulu
 */
public final class AvailableItems {
    private String availItemno;
    private String name;
    private String type;
  private AvailableItems(){}
  public static class Builder{
  private String availItemno;
  private String name;
  private String type;
  
  public Builder availItemno(String itemno){
   availItemno= itemno;
   return this;
  }
  public Builder name(String nm){
   name= nm;
   return this;
  }
  public Builder type(String typ){
   type= typ;
   return this;
  }
  public AvailableItems build(){
  return new AvailableItems();
  }
}
    public String getAvailItemno() {
        return availItemno;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + (this.availItemno != null ? this.availItemno.hashCode() : 0);
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
        final AvailableItems other = (AvailableItems) obj;
        if ((this.availItemno == null) ? (other.availItemno != null) : !this.availItemno.equals(other.availItemno)) {
            return false;
        }
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }
        return true;
    }
  
    

}

