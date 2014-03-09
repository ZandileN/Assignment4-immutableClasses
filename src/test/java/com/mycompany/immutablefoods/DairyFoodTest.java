/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.immutablefoods;

import com.mycompany.immutablefoods.model.DairyFood;
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
public class DairyFoodTest {
    
    public DairyFoodTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void DairyFoodCreation() {
     DairyFood starter= new DairyFood.Builder().dairyId("St1234")
                                             .name("Vanilla Ice creams")
                                              .qaunt(7).build();
     
     Assert.assertEquals(starter.getDairyId(), "St1234");
     Assert.assertEquals(starter.getName(), "Vanilla Ice creams");
     Assert.assertEquals(starter.getQaunt(), 7);
     }
     @Test
     public void DairyFoodUpdate(){
      DairyFood starter= new DairyFood.Builder().dairyId("St1234")
                                             .name("Vanilla Ice creams")
                                              .qaunt(7).build();
     starter= new DairyFood.Builder().dairyId("crmas121").name("Creamey Mash").qaunt(2).build();
     Assert.assertEquals(starter.getDairyId(), "crmas121");
     Assert.assertEquals(starter.getName(), "Creamey Mash");
     Assert.assertEquals(starter.getQaunt(), 2);
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