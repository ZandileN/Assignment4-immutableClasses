/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.immutablefoods.model;

/**
 *
 * @author Sibakhulu
 */
public final class DairyType {
    private String dtypeid;
    private String nametype;
    
    private DairyType(){}
    public DairyType(Builder build){
     dtypeid=build.dtypeid;
     nametype=build.nametype;
    }
  
    public static class Builder {
    private String dtypeid;
    private String nametype;
    
    public Builder id(String value){
         dtypeid=value;
        return this;
    }
    public Builder name(String value){
      nametype=value;
      return this;
    }
    public DairyType build(){
    return new DairyType();
    }
}

    public String getDtypeid() {
        return dtypeid;
    }

    public String getNametype() {
        return nametype;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + (this.dtypeid != null ? this.dtypeid.hashCode() : 0);
        hash = 37 * hash + (this.nametype != null ? this.nametype.hashCode() : 0);
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
        final DairyType other = (DairyType) obj;
        if ((this.dtypeid == null) ? (other.dtypeid != null) : !this.dtypeid.equals(other.dtypeid)) {
            return false;
        }
        if ((this.nametype == null) ? (other.nametype != null) : !this.nametype.equals(other.nametype)) {
            return false;
        }
        return true;
    }
    
    
}
