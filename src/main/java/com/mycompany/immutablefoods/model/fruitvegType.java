/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.immutablefoods.model;

/**
 *
 * @author Sibakhulu
 */
public final class fruitvegType {
  private String idtyp;
  private String type;
  
  private fruitvegType(){}
 
  public fruitvegType(Builder build){
  idtyp=build.idtype;
  type=build.tye;
  }
  public static class Builder{
  private String idtype;
  private String tye;
  
  public Builder idtype(String itype){
      idtype=itype;
       return this;
 }
  public Builder tye(String t){
    tye=t;
    return this;
}
public fruitvegType build(){
    return new fruitvegType();
}
}
    public String getIdtype() {
        return idtyp;
    }

    public String getType() {
        return type;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + (this.idtyp != null ? this.idtyp.hashCode() : 0);
        hash = 61 * hash + (this.type != null ? this.type.hashCode() : 0);
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
        final fruitvegType other = (fruitvegType) obj;
        if ((this.idtyp == null) ? (other.idtyp != null) : !this.idtyp.equals(other.idtyp)) {
            return false;
        }
        if ((this.type == null) ? (other.type != null) : !this.type.equals(other.type)) {
            return false;
        }
        return true;
  }  
}
