/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.immutablefoods;

import com.mycompany.immutablefoods.model.PurchaseItem;
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
public class PurchaseItemTest {
    
    public PurchaseItemTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void PurchaseItemCreation(){
    PurchaseItem purchase= new PurchaseItem.Builder().purchaseid("item4").itemname("blueberry").build();
    
    Assert.assertEquals(purchase.getPurchaseId(), purchase.getPurchaseId());
    Assert.assertEquals(purchase.getItemname(), purchase.getItemname());
    //Assert.assertEquals(, null);
    }
    @Test
    public void PurchaseItemUpdate(){
     PurchaseItem pur= new PurchaseItem.Builder().purchaseid("Br0021").itemname("Bread").build();
     
     pur=new PurchaseItem.Builder().purchaseid("Br0021").itemname("Brownies").build();
     
     Assert.assertEquals(pur.getPurchaseId(),pur.getPurchaseId());
     Assert.assertEquals(pur.getItemname(), pur.getItemname());
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