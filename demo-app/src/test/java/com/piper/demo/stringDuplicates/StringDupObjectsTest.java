package com.piper.demo.stringDuplicates;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

// import com.piper.demo.stringDuplicates.StringDupObject;
// import com.piper.demo.stringDuplicates.StringDupPrimitive;

/**
 * Unit test for simple App.
 */
public class StringDupObjectsTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public StringDupObjectsTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( StringDupObjectsTest.class );
    }


    /**
     * Rigourous Test :-)
     */
    public void testGetDuplicateCountsSmall()
    {
//              assertTrue( false );
                int iterations = 1;
                long total_execution_time_ob = 0;
//                System.out.println("Testing objects");
                for (int x = 0; x < iterations; x++) {
                        long start_time_ob = System.nanoTime();
                        StringDupObject stringDupObject = new StringDupObject( "asdad");
                        String dupedString = stringDupObject.getDuplicateCounts();
                //        System.out.println("The original string is: " + stringDupObject.getValue());
                //        System.out.println("The duped string is: " + dupedString);
                        assertTrue( dupedString.equals("a2d2s") );
                        // assertTrue( true );
                        long end_time_ob = System.nanoTime();
                        long execution_time_ob = end_time_ob - start_time_ob;
                        total_execution_time_ob = total_execution_time_ob + execution_time_ob;
                }
//              System.out.println("Testing object time total is:      " + total_execution_time_ob);
    }
    /**
     * Rigourous Test :-)
     */
    public void testGetDuplicateCountsSingle()
    {
//              assertTrue( false );
                int iterations = 1;
                long total_execution_time_ob = 0;
 //               System.out.println("Testing objects");
                for (int x = 0; x < iterations; x++) {
                        long start_time_ob = System.nanoTime();
                        StringDupObject stringDupObject = new StringDupObject( "a");
                        String dupedString = stringDupObject.getDuplicateCounts();
                  //      System.out.println("The original string is: " + stringDupObject.getValue());
                  //      System.out.println("The duped string is: " + dupedString);
                        assertTrue( dupedString.equals("a") );
                        // assertTrue( true );
                        long end_time_ob = System.nanoTime();
                        long execution_time_ob = end_time_ob - start_time_ob;
                        total_execution_time_ob = total_execution_time_ob + execution_time_ob;
                }
//              System.out.println("Testing object time total is:      " + total_execution_time_ob);
    }
    /**
     * Rigourous Test :-)
     */
    public void testGetDuplicateCountsEmpty()
    {
//              assertTrue( false );
                int iterations = 1;
                long total_execution_time_ob = 0;
  //              System.out.println("Testing objects");
                for (int x = 0; x < iterations; x++) {
                        long start_time_ob = System.nanoTime();
                        StringDupObject stringDupObject = new StringDupObject( "");
                        String dupedString = stringDupObject.getDuplicateCounts();
                //        System.out.println("The original string is: " + stringDupObject.getValue());
                //        System.out.println("The duped string is: " + dupedString);
                        assertTrue( dupedString.equals("") );
                        // assertTrue( true );
                        long end_time_ob = System.nanoTime();
                        long execution_time_ob = end_time_ob - start_time_ob;
                        total_execution_time_ob = total_execution_time_ob + execution_time_ob;
                }
//              System.out.println("Testing object time total is:      " + total_execution_time_ob);
    }
}
