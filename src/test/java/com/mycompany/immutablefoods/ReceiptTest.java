/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.immutablefoods;

import static org.testng.Assert.*;
import com.mycompany.immutablefoods.model.Receipt;
import com.mycompany.immutablefoods.model.Cashier;
import com.mycompany.immutablefoods.model.FoodItem;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Sibakhulu
 */
public class ReceiptTest {
    Cashier name= new Cashier.Builder().fname("Buyiswa").build();
    FoodItem item= new FoodItem.Builder().name("Cross buns").build();
    public ReceiptTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void ReceiptCreation(){
     
         Receipt receipt= new Receipt.Builder().receiptid("Rcpt011").name(name).item(item).build();
         
         Assert.assertEquals(receipt.getReceiptid(), "Rcpt011");
         Assert.assertEquals(receipt.getName(), name);
         Assert.assertEquals(receipt.getItem(), item);
     }
     @Test
     public void ReceiptUpdate(){
     Receipt receipt= new Receipt.Builder().receiptid("Rcpt011").name(name).item(item).build();
     receipt= new Receipt.Builder().receiptid("Rcp022").name(name).item(item).build();
     
     Assert.assertEquals(receipt.getReceiptid(), "Rcp022");
     Assert.assertEquals(receipt.getName(), name);
     Assert.assertEquals(receipt.getItem(), item);
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