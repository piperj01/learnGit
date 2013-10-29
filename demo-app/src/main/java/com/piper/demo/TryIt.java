package com.piper.demo;

import com.piper.demo.stringDuplicates.StringDupObject;
import com.piper.demo.stringDuplicates.StringDupPrimitive;
// import org.apache.log4j.Logger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
      
class TryIt {
        // static Logger log = Logger.getLogger(TryIt.class.getName());
        final static Logger log = LoggerFactory.getLogger(TryIt.class.getName());

	public static void main(String[] args) {
		int iterations = 1;

		long total_execution_time_ob = 0;
		System.out.println("Testing objects");
		log.info("Testing objects to logger");
		for (int x = 0; x < iterations; x++) {
			long start_time_ob = System.nanoTime();
			StringDupObject stringDupObject = new StringDupObject( "asdad");
			System.out.println("The original string is: " + stringDupObject.getValue());
			log.info("The original string is: {}", stringDupObject.getValue());
			System.out.println(stringDupObject.getDuplicateCounts());
			long end_time_ob = System.nanoTime();
			long execution_time_ob = end_time_ob - start_time_ob;
			total_execution_time_ob = total_execution_time_ob + execution_time_ob;
		}
		System.out.println("Testing object time total is:      " + total_execution_time_ob);
		log.info("Testing object time total is: {}", total_execution_time_ob);
		
		
		long total_execution_time_p = 0;
		System.out.println("Testing primitives");
		for (int x = 0; x < iterations; x++) {
			long start_time_p = System.nanoTime();
			StringDupPrimitive stringDupPrimitive = new StringDupPrimitive( "asdad");
		        System.out.println("The original string is: " + stringDupPrimitive.getValue());
			log.info("The original string is: {}", stringDupPrimitive.getValue());
			System.out.println(stringDupPrimitive.getDuplicateCounts());
			long end_time_p = System.nanoTime();
			long execution_time_p = end_time_p - start_time_p;
			total_execution_time_p = total_execution_time_p + execution_time_p;
		}
		System.out.println("Testing primitives time total is:  " + total_execution_time_p);
		log.info("Testing primitives time total is: {}", total_execution_time_p);
	}
}
