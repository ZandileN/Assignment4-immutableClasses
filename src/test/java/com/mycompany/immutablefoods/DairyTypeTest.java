/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.immutablefoods;

import com.mycompany.immutablefoods.model.DairyType;
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
public class DairyTypeTest {
    
    public DairyTypeTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void DairyTypeCreation() {
     DairyType dairytype= new DairyType.Builder().id("dt385").name("Milk").build();
     
     Assert.assertEquals(dairytype.getDtypeid(),dairytype.getDtypeid());
     Assert.assertEquals(dairytype.getNametype(), dairytype.getNametype());
     }
      @Test
     public void DairyTypeUpdate() {
      DairyType dairytype= new DairyType.Builder().id("dt385").name("Milk").build();
       dairytype= new DairyType.Builder().id("ch385").name("Cheese").build();
      
     Assert.assertEquals(dairytype.getDtypeid(),dairytype.getDtypeid());
     Assert.assertEquals(dairytype.getNametype(), dairytype.getNametype());
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