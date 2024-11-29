package testscript;

import org.testng.annotations.Test;

public class NewTest {
  @Test (priority = 1 )         //AN ANNOTATION : EVERY METHOD NEEDS @TEST annotation to run
                  //we can run methods individually by just clicking the Run option of the corresponding method
	
  public void adisplay() {
  
  System.out.println("HELLO WORLD");
  }
  @Test 
  public void bdisplay() {
	  
	  System.out.println("HELLO WORLD. It is new method");   }
  
  
  @Test
  public void cdisplay() {
	  
	  System.out.println("HELLO WORLD. It is another method");   }
}
//methods run in alphabetic order 
//we can set  priorities/ORDER to run A METHOD USING PRIORITIES : P()CNTL+SPACE-- PRIORITY
//INDEX.HTML RIGHT CLICK