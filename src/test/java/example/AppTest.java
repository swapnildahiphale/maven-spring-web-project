package example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
 

public class AppTest 
	extends TestCase
{
      public void testSlow() {
        System.out.println("slow");
      }

      public void testSlower() {
        System.out.println("slower");
      }

      public void testFast() {
        System.out.println("fast");
      }
    }
