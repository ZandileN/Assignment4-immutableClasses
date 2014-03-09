/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.immutablefoods;

import com.mycompany.immutablefoods.model.Help;
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
public class HelpTest {
    
    public HelpTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void helpCreation() {
    Help help= new Help.Builder().helpid("h111").question("How long does one wait for their order").build();
    
    Assert.assertEquals(help.getHelpid(), help.getHelpid());
    Assert.assertEquals(help.getQuestion(), help.getQuestion());
}
  @Test
  public void helpUpdate(){
  Help help= new Help.Builder().helpid("h111").question("How long does one wait for their order").build();
  help= new Help.Builder().helpid("h101").question("Any items on sale").build();
 
  Assert.assertEquals(help.getHelpid(), help.getHelpid());
  Assert.assertEquals(help.getQuestion(), help.getQuestion());
  
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