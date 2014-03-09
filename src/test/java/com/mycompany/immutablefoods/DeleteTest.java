/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.immutablefoods;

import com.mycompany.immutablefoods.model.DeleteItem;
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
public class DeleteTest {
    
    public DeleteTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
   @Test
     public void DeleteItemCreation() {
     DeleteItem deleteitem= new DeleteItem.Builder().itemno("dl00g2")
                                                    .name("Youghurt")
                                                    .type("Dairy Food").build();
     Assert.assertEquals(deleteitem.getItemno(), deleteitem.getItemno());
     Assert.assertEquals(deleteitem.getName(), deleteitem.getName());
     Assert.assertEquals(deleteitem.getType(), deleteitem.getType());
 }
    @Test
    public void DeleteItemUpdate(){
    DeleteItem deleteitem= new DeleteItem.Builder().itemno("dl00g2")
                                                    .name("Youghurt")
                                                    .type("Dairy Food").build();
    deleteitem= new DeleteItem.Builder().itemno("bl00g2").name("Pap and Vors")
                                                         .type("Main Meals").build();
    Assert.assertEquals(deleteitem.getItemno(), deleteitem.getItemno());
    Assert.assertEquals(deleteitem.getName(), deleteitem.getName());
    Assert.assertEquals(deleteitem.getType(), deleteitem.getType());
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