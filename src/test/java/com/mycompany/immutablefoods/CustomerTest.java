/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.immutablefoods;

import com.mycompany.immutablefoods.model.Customer;
import com.mycompany.immutablefoods.model.PlaceOrders;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Sibakhulu
 */
public class CustomerTest {
   // PlaceOrders order= new PlaceOrders.Builder().ordernum("ord234");
    public CustomerTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
   public void Customercreation(){
    Customer customer = new Customer.Builder().customerId("cust890").Name("Zandile N").build();
    
    Assert.assertEquals(customer.getCustno(),customer.getCustno());
    Assert.assertEquals(customer.getCustomername(), customer.getCustomername());
 }
    
    @Test
    public void CustomerUpdate(){
    Customer customer = new Customer.Builder().customerId("cust890").Name("Zandile N").build();
    
    customer= new Customer.Builder().customerId("cust687").Name("Martin N").build();
    
    Assert.assertEquals(customer.getCustno(), customer.getCustno());
    Assert.assertEquals(customer.getCustomername(),customer.getCustomername());
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}