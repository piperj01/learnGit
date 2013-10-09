package com.piper.demo.stringDuplicates;

import java.util.Arrays;
// import org.apache.log4j.Logger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StringDupPrimitive {
        // static Logger log = Logger.getLogger(StringDupPrimitive.class.getName());
	final static Logger log = LoggerFactory.getLogger(StringDupPrimitive.class.getName());

	// do I really want this to be a class variable? why or why not?
	// if its a class variable then all the objects of this class will have it
	// why would that be important? Why not just let all the objects of this
	// class
	// use local variable passed as parameters?
	// I guess if there was other things we could do with this object that
	// utilized this information
	// then we wouldnt need to pass it in and the value could 'live' here and
	// not elsewhere

	// on the ther hand the benefit of not using class variables is that I could
	// make the method
	// static and then not require the calling routing to instantiate an object
	// at all.

	// if it is a class variable should this be initialized with a value? why or
	// why not and if so should it be of null or ""
	String value;

	StringDupPrimitive() {
		// default constructor
		// why do I want or not want to definem my own default construtor?
		// should I make it private, public or protected or none of those and
		// why?
	}

	public StringDupPrimitive(String value) {
		// should I make this non default constructor explicitly call the
		// default constructor?
		// why or why not?
		this.value = value;
	}

	public String getDuplicateCounts() {
                log.info("StringDupPrimitives.getDuplicateCounts: Start");
		if (value != null && value.length() > 0) {
			char[] myArray = value.toCharArray();
			char[] resultsArray = new char[myArray.length];
			Arrays.sort(myArray);
			char previousChar = myArray[0];
			int charCount = 0;
			int x = 0;
//			resultsArray[0] = previousChar;
			for (char myChar : myArray) {
				if (previousChar == myChar) {
					charCount++;
				} else {
					resultsArray[x++] = previousChar;
					if (charCount > 1) {
						String charCountStr = String.valueOf(charCount);
//						resultsArray[x++] = Character.forDigit(charCount, 10);
						for ( char y : charCountStr.toCharArray()) {
							resultsArray[x++] = y;
						}
					}
					previousChar = myChar;
					charCount = 1;
				}
			}
			resultsArray[x++] = previousChar;
			if (charCount > 1) {
				String charCountStr = String.valueOf(charCount);
//				resultsArray[x++] = Character.forDigit(charCount, 10);
				for ( char y : charCountStr.toCharArray()) {
					resultsArray[x++] = y;
				}
			}
                        log.info("StringDupPrimitives.getDuplicateCounts: Finish");
			return String.copyValueOf(resultsArray);
		} else {
                        log.info("StringDupPrimitives.getDuplicateCounts: Finish");
			return "";
		}
	}

	public String getValue() {
		return value;
	}

}
