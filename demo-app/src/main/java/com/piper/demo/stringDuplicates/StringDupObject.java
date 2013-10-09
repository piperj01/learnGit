package com.piper.demo.stringDuplicates;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
// import org.apache.log4j.Logger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
      
public class StringDupObject {
//        static Logger log = Logger.getLogger(StringDupObject.class.getName());
        final static Logger log = LoggerFactory.getLogger(StringDupObject.class.getName());
	String value;

	public StringDupObject(String value) {
		this.value = value;
	}

	public String getDuplicateCounts() {
                log.info("StringDupObjects.getDuplicateCounts: Start");
		StringBuilder resultString = new StringBuilder("");
		if (value != null && value.length() > 0) {
			ArrayList<Character> myArray = new ArrayList<Character> ();
			for (char c : value.toCharArray()) {
				myArray.add(c);
			}
			ArrayList<Character> resultsArray = new ArrayList<Character>();
			Collections.sort(myArray);
			char previousChar = myArray.get(0);
			int charCount = 0;
//			resultsArray.add(previousChar);
			for (char myChar : myArray) {
				if (previousChar == myChar) {
					charCount++;
				} else {
					resultsArray.add(previousChar);
					if (charCount > 1) {
//						resultsArray.add( Character.forDigit(charCount, 10));
						String charCountStr = String.valueOf(charCount);
						for ( char y : charCountStr.toCharArray()) {
							resultsArray.add(y);
						}
					}
					previousChar = myChar;
					charCount = 1;
				}
			}
			resultsArray.add(previousChar);
			if (charCount > 1) {
//				resultsArray.add( Character.forDigit(charCount, 10));
				String charCountStr = String.valueOf(charCount);
				for ( char y : charCountStr.toCharArray()) {
					resultsArray.add(y);
				}
			}
			for (char myChar : resultsArray) {
				resultString.append(myChar);
			}			
                        log.info("StringDupObjects.getDuplicateCounts: Finish");
			return resultString.toString();
		} else {
                        log.info("StringDupObjects.getDuplicateCounts: Finish");
			return resultString.toString();
		}
	}

	public String getValue() {
		return value;
	}

}
