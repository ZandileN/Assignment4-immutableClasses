/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.immutablefoods.model;

/**
 *
 * @author Sibakhulu
 */
public final class Cashier {
    private String cashid;
    private String fname;
    private String lname;
    
    private Cashier(){
    }
    public Cashier(Builder build){
    cashid=build.cashid;
    fname=build.fname;
    lname=build.lname;
    }
    public static class Builder{
        private String cashid;
        private String fname;
        private String lname;
        
        public Builder cashid(String cid){
         cashid=cid;
         return this;
        }
        public Builder fname(String fnam){
         fname=fnam;
         return this;
        }
        public Builder lname(String lnam){
         lname=lnam;
         return this;
        }
        public Cashier build(){
        return new Cashier ();
        } 
    }

    public String getCashid() {
        return cashid;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + (this.cashid != null ? this.cashid.hashCode() : 0);
        hash = 71 * hash + (this.fname != null ? this.fname.hashCode() : 0);
        hash = 71 * hash + (this.lname != null ? this.lname.hashCode() : 0);
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
        final Cashier other = (Cashier) obj;
        if ((this.cashid == null) ? (other.cashid != null) : !this.cashid.equals(other.cashid)) {
            return false;
        }
        if ((this.fname == null) ? (other.fname != null) : !this.fname.equals(other.fname)) {
            return false;
        }
        if ((this.lname == null) ? (other.lname != null) : !this.lname.equals(other.lname)) {
            return false;
        }
        return true;
    }
    
}
