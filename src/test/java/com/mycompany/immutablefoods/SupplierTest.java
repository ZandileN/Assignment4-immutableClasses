/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.immutablefoods;

import com.mycompany.immutablefoods.model.Supplier;
import junit.framework.Assert;
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
public class SupplierTest {
    
    public SupplierTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
   @Test
   public void SupplierCreation() {
       Supplier supplier = new Supplier.Builder().suppId("Sup0909").suppname("Coca cola").build();
       
       Assert.assertEquals(supplier.getSuppId(), "Sup0909");
       Assert.assertEquals(supplier.getSuppName(), "Coca cola");
   }
   @Test
   public void SupplierUpdate(){
      Supplier supplier = new Supplier.Builder().suppId("sup0909").suppname("Coca cola").build();
       supplier= new Supplier.Builder().suppId("sup1010").suppname("Pepsi").build();
       
       Assert.assertEquals(supplier.getSuppId(), "sup1010");
       Assert.assertEquals(supplier.getSuppName(), "Pepsi");
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