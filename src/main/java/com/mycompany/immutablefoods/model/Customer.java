/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.immutablefoods.model;

/**
 *
 * @author Sibakhulu
 */
public final class Customer {
    private String custno;
    private String customername;
    private PlaceOrders custordernum;
    
    private Customer(){
        
    }
   public Customer(Builder build){
    custno= build.custnumber;
    customername= build.name;
    custordernum= build.custOrder;
    
    }
    public static class Builder{
    private String custnumber;
    private String name;
    private PlaceOrders custOrder;
   
    
    public Builder customerId(String cust_no){
         custnumber=cust_no;
        return this;
    }
    public Builder Name(String nam){
      name=nam;
      return this;
    }
    public Builder custOrder(PlaceOrders pr){
      custOrder=pr;
      return this;
    }
    public Customer build(){
    return new Customer();
    }
}

    public String getCustno() {
        return custno;
    }

    public String getCustomername() {
        return customername;
    }

    public PlaceOrders getCustordernum() {
        return custordernum;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + (this.custno != null ? this.custno.hashCode() : 0);
        hash = 59 * hash + (this.customername != null ? this.customername.hashCode() : 0);
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
        final Customer other = (Customer) obj;
        if ((this.custno == null) ? (other.custno != null) : !this.custno.equals(other.custno)) {
            return false;
        }
        if ((this.customername == null) ? (other.customername != null) : !this.customername.equals(other.customername)) {
            return false;
        }
        return true;
    }
  
}