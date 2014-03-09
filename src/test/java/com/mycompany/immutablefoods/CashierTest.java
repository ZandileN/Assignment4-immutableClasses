/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.immutablefoods;

import com.mycompany.immutablefoods.model.Cashier;
import junit.framework.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Sibakhulu
 */
public class CashierTest {
    
    public CashierTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
     public void CashierCreation() {
     Cashier cashier= new Cashier.Builder().cashid("csh123").fname("Buyiswa")
                                                            .lname("Mgcina").build();
     
     Assert.assertEquals(cashier.getCashid(), cashier.getCashid());
     Assert.assertEquals(cashier.getFname(), cashier.getFname());
     Assert.assertEquals(cashier.getLname(), cashier.getLname()); 
    }
   @Test
    public void CashierUpdate(){
     Cashier cashier= new Cashier.Builder().cashid("csh157").fname("Dannie")
                                                            .lname("Jacobs").build();
     
     cashier= new Cashier.Builder().cashid("csh157").fname("Rochelle").lname("Maverick").build();
     
     Assert.assertEquals(cashier.getCashid(),cashier.getCashid());
     Assert.assertEquals(cashier.getFname(), cashier.getFname());
     Assert.assertEquals(cashier.getLname(), cashier.getLname());
    
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