/*
 * Created on Feb 23, 2005
 * Created by Bryan Saunders
 */
package bs.net.sysin;

import java.util.InputMismatchException;
import java.util.Scanner;


/**
 * User input validation class used to read in user input from <code>System.in</code> and then validate that the data is within the sepcified parameters. 
 * Class methods only return validated data.
 * @author Bryan Saunders
 * @version 1.0 (Feb 13, 2005)
 */
@SuppressWarnings("unchecked")
public class GenericKeyboard {
	private GenericKeyboard(){	}
	
	/**
	 * <code>TYPE_INTEGER</code> is a type identifier flag
	 */
	public static final byte TYPE_INTEGER = 1;
	
	/**
	 * <code>TYPE_DOUBLE</code> is a type identifier flag
	 */
	public static final byte TYPE_DOUBLE = 2;
	
	/**
	 * <code>TYPE_FLOAT</code> is a type identifier flag
	 */
	public static final byte TYPE_FLOAT = 3;
	
	/**
	 * <code>TYPE_SHORT</code> is a type identifier flag
	 */
	public static final byte TYPE_SHORT = 4;
	
	/**
	 * <code>TYPE_LONG</code> is a type identifier flag
	 */
	public static final byte TYPE_LONG = 5;
	
	/**
	 * <code>TYPE_BYTE</code> is a type identifier flag
	 */
	public static final byte TYPE_BYTE = 6;
	
	/**
	 * Gets and returns a valid <code>int</code> from <code>System.in</code>
	 * @return valid <code>int</code>
	 */
	public static int getInteger(){
		int input = 0;
		Scanner keyIn;
		boolean notValid = true;
		while(notValid){
			keyIn = new Scanner(System.in);
			try{
				input = keyIn.nextInt();
				notValid = false;
			}catch(InputMismatchException e){
				System.err.print("Input Error - Non-Integer\n");
				System.err.print("Enter Again:\n");
			}
		}
		return input;
	}
	/**
	 * Gets and returns a valid <code>double</code> from <code>System.in</code>
	 * @return valid <code>double</code>
	 */
	public static double getDouble(){
		double input = 0;
		Scanner keyIn;
		boolean notValid = true;
		while(notValid){
			keyIn = new Scanner(System.in);
			try{
				input = keyIn.nextDouble();
				notValid = false;
			}catch(InputMismatchException e){
				System.err.print("Input Error - Non-Double\n");
				System.err.print("Enter Again:\n");
			}
		}
		return input;
	}
	/**
	 * Gets and returns a valid <code>float</code> from <code>System.in</code>
	 * @return valid <code>float</code>
	 */
	public static float getFloat(){
		float input = 0;
		Scanner keyIn;
		boolean notValid = true;
		while(notValid){
			keyIn = new Scanner(System.in);
			try{
				input = keyIn.nextFloat();
				notValid = false;
			}catch(InputMismatchException e){
				System.err.print("Input Error - Non-Float\n");
				System.err.print("Enter Again:\n");
			}
		}
		return input;
	}
	/**
	 * Gets and returns a valid <code>long</code> from <code>System.in</code>
	 * @return valid <code>long</code>
	 */
	public static long getLong(){
		long input = 0;
		Scanner keyIn;
		boolean notValid = true;
		while(notValid){
			keyIn = new Scanner(System.in);
			try{
				input = keyIn.nextLong();
				notValid = false;
			}catch(InputMismatchException e){
				System.err.print("Input Error - Non-Long\n");
				System.err.print("Enter Again:\n");
			}
		}
		return input;
	}
	/**
	 * Gets and returns a valid <code>short</code> from <code>System.in</code>
	 * @return valid <code>short</code>
	 */
	public static short getShort(){
		short input = 0;
		Scanner keyIn;
		boolean notValid = true;
		while(notValid){
			keyIn = new Scanner(System.in);
			try{
				input = keyIn.nextShort();
				notValid = false;
			}catch(InputMismatchException e){
				System.err.print("Input Error - Non-Short\n");
				System.err.print("Enter Again:\n");
			}
		}
		return input;
	}
	/**
	 * Gets and returns a valid <code>byte</code> from <code>System.in</code>
	 * @return valid <code>byte</code>
	 */
	public static byte getByte(){
		byte input = 0;
		Scanner keyIn;
		boolean notValid = true;
		while(notValid){
			keyIn = new Scanner(System.in);
			try{
				input = keyIn.nextByte();
				notValid = false;
			}catch(InputMismatchException e){
				System.err.print("Input Error - Non-Byte\n");
				System.err.print("Enter Again:\n");
			}
		}
		return input;
	}
	/**
	 * Gets and returns a valid <code>char</code> from <code>System.in</code>
	 * @return valid <code>char</code>
	 */
	public static char getChar(){
		char input = 0;
		Scanner keyIn;
		boolean notValid = true;
		while(notValid){
			keyIn = new Scanner(System.in);
			try{
				input = keyIn.nextLine().charAt(0);
				notValid = false;
			}catch(InputMismatchException e){
				System.err.print("Input Error - Non-Character\n");
				System.err.print("Enter Again:\n");
			}
		}
		return input;
	}
	/**
	 * Gets and returns a valid <code>String</code> from <code>System.in</code>
	 * @return valid <code>String</code>
	 */
	public static String getString(){
		String input = "";
		Scanner keyIn;
		boolean notValid = true;
		while(notValid){
			keyIn = new Scanner(System.in);
			try{
				input = keyIn.nextLine();
				notValid = false;
			}catch(Exception e){
				System.err.print("Input Error - Non-String\n");
				System.err.print("Enter Again:\n");
			}
		}
		return input;
	}
	/**
	 * Gets and returns a valid <code>String</code> with a length less than or equal to the specified maximum <code>length</code>
	 * @param length maximum length of returned <code>String</code>
	 * @return valid <code>String</code> with a maximum length of <code>length</code>
	 */
	public static String getStringMaxLength(int length){
		String input = "";
		boolean notValid = true;
		while(notValid){
			input = getString();
			if(isStringLessThanLength(input,length)){
				notValid = false;
			}else{
				System.err.print("Input Error - String Too Long (Max "+length+" Chars)\n");
				System.err.print("Enter Again:\n");
			}
		}
		return input;
	}
	/**
	 * Validates wether or not a <code>String</code> is less than a certain length of characters
	 * @param input <code>String</code> value to check against <code>length</code>
	 * @param length the maximum length of <code>input</input>
	 * @return true if <code>input</code> is less then or equal to <code>length</code>
	 */
	public static boolean isStringLessThanLength(String input, int length){
		return (input.length() <= length);
	}
	/**
	 * Determines the Relation of str1 to str2 (<, =, or >)
	 * @param str1 First string to Compare
	 * @param str2 Second String to Compare
	 * @return -1 if str1 < str2, 0 if str = str2, 1 if str1 > str2
	 */
	public static int getRelationship(String str1, String str2){
		if(str1.compareToIgnoreCase(str2) < 0){
			return -1;
		}else if(str1.compareToIgnoreCase(str2) > 0){
			return 1;
		}else{
			return 0;
		}
	}
	/**
	 * Validates wether or not a <code>String</code> is longer than a certain length of characters
	 * @param input <code>String</code> value to check against <code>length</code>
	 * @param length the minimum length of <code>input</input>
	 * @return true if <code>input</code> is greater then or equal to <code>length</code>
	 */
	public static boolean isStringGreaterThanLength(String input, int length){
		return (input.length() >= length);
	}
	/**
	 * Gets and returns a valid <code>String</code> with a length greater than or equal to the specified minimum <code>length</code>
	 * @param length minimum length of returned <code>String</code>
	 * @return valid <code>String</code> with a maximum length of <code>length</code>
	 */
	public static String getStringMinLength(int length){
		String input = "";
		boolean notValid = true;
		while(notValid){
			input = getString();
			if(isStringGreaterThanLength(input,length)){
				notValid = false;
			}else{
				System.err.print("Input Error - String Too Short (Min "+length+" Chars)\n");
				System.err.print("Enter Again:\n");
			}
		}
		return input;
	}
	/**
	 * Gets and returns a valid <code>String</code> with length <code>x</code> where <code>x</code> is within the specified range.
	 * @param min minimum length of returned <code>String</code>
	 * @param max maximum length of returned <code>String</code>
	 * @return valid <code>String</code> with a length within the range of <code>min</code> - <code>max</code>
	 */
	public static String getStringInRange(int min, int max){
		String input = "";
		boolean notValid = true;
		while(notValid){
			input = getString();
			if(isStringLessThanLength(input,max)){
				if(isStringGreaterThanLength(input,min)){
					notValid = false;
				}else{
					System.err.print("Input Error - String Too Short (Min "+min+" Chars)\n");
					System.err.print("Enter Again:\n");
				}
			}else{
				System.err.print("Input Error - String Too Long (Max "+max+" Chars)\n");
				System.err.print("Enter Again:\n");
			}
		}
		return input;
	}
	/**
	 * Validates wether or not <code>input</code> is within the specified range.
	 * @param str <code>String</code> to check
	 * @param min minimum value of range
	 * @param max maximum value of range
	 * @return true if <code>input</code> is within the range of <code>min</code> to <code>max</code>
	 */
	public static boolean isStringInRange(String str,int min, int max){
		return isStringGreaterThanLength(str,max) && isStringLessThanLength(str,max);
	}
	/**
	 * Converts the character <code>input</code> to it's ASCII value.
	 * @param input <code>char</code> to be converted to ASCII
	 * @return
	 */
	public static int getASCIIforChar(char input){
		return input;
	}
	/**
	 * Determines wether or not <code>input</code> is a lower case letter
	 * @param input <code>char</code> to test
	 * @return true if <code>input</code> is a lower case letter
	 */
	public static boolean isLowerCaseLetter(char input){
		int m = getASCIIforChar(input);
		int l = 97;
		int h = 122;
		return (l <= m && m <= h);
	}
	/**
	 * Determines wether or not <code>input</code> is an upper case letter
	 * @param input <code>char</code> to test
	 * @return true if <code>input</code> is an upper case letter
	 */
	public static boolean isUpperCaseLetter(char input){
		int m = getASCIIforChar(input);
		int l = 65;
		int h = 90;
		return (l <= m && m <= h);
	}
	/**
	 * Validates wether or not <code>input</code> is within the specified range.
	 * @param input value to check
	 * @param min minimum value of range
	 * @param max maximum value of range
	 * @return true if <code>input</code> is within the range of <code>min</code> to <code>max</code>
	 */
	public static <E extends Number> boolean isValueInRange(E input,E min,E max){
		return (input.doubleValue() >= min.doubleValue() && input.doubleValue() <= max.doubleValue());
	}
	/**
	 * Validates wether or not <code>input</code> is within the specified number of digits.
	 * @param min minimum number of digits
	 * @param max maximum number of digits
	 * @return true if the digit length of <code>input</code> is within the range of <code>min</code> to <code>max</code>
	 */
	public static <E extends Number> boolean isLengthInRange(E input,int min,int max){
		return (input.toString().length() >= min && input.toString().length() <= max);
	}
	/**
	 * Determines wether or not <code>input</code> is a letter
	 * @param input <code>char</code> to test
	 * @return true if <code>input</code> is a letter
	 */
	public static boolean isLetter(char input){
		return (isUpperCaseLetter(input) || isLowerCaseLetter(input));
	}
	/**
	 * Determines wether or not <code>input</code> is an even integer
	 * @param input <code>int</code> to test
	 * @return true if <code>input</code> is an even integer
	 */
	public static boolean isEven(Integer input){
		return ((input % 2 == 0)? true: false);
	}
	/**
	 * Determines wether or not <code>input</code> is an even integer
	 * @param input <code>int</code> to test
	 * @return true if <code>input</code> is an even integer
	 */
	public static <E extends Number> boolean isRational(E input){
		return ((getDecimal(input.doubleValue()) == 0)? true: false);
	}
	/**
	 * Returns the fraction portion of the Double <code>val</code>
	 * @param val <code>Double</code> to truncate
	 * @return Integer representing fraction portion of <code>val</code>
	 */
	public static Integer getDecimal(Double val){
		String x = val.toString();
		x = x.substring(x.indexOf(".")+1);
		return Integer.parseInt(x);
	}
	/**
	 * Returns a number of the type specified by <code>typeIdentifier</code>
	 * @param typeIdentifier flag identifiying the type of value to return
	 * @return Number of the type specified by <code>typeIdentifier</code>
	 */
	
	public static <E extends Number> E getNumber(byte typeIdentifier) throws InvalidTypeIdentifierException{
		switch(typeIdentifier){
			case TYPE_INTEGER: return (E)(Integer)getInteger();
			case TYPE_SHORT: return (E)(Short)getShort();
			case TYPE_LONG: return (E)(Long)getLong();
			case TYPE_DOUBLE: return (E)(Double)getDouble();
			case TYPE_FLOAT: return (E)(Float)getFloat();
			case TYPE_BYTE: return (E)(Byte)getByte();
			default: throw new InvalidTypeIdentifierException();
		}
	}
	/**
	 * Gets and returns a valid number whose length(number of digits) is within the range of <code>min</code> - <code>max</code>
	 * @param min minimum length of returned value
	 * @param max maximum length of returned value
	 * @param typeIdentifier flag identifiying the type of value to return
	 * @return valid number with a length(number of digits) within the range of <code>min</code> - <code>max</code>
	 */
	public static <E extends Number> E getNumberLengthInRange(int min,int max,byte typeIdentifier) throws InvalidTypeIdentifierException{
		boolean notValid = true;
		switch(typeIdentifier){
			case TYPE_INTEGER: 
				notValid = true;
				while(notValid){
					Integer x = getNumber(typeIdentifier);
					if(isLengthInRange(x,min,max)){
						return (E)x;
					}else{
						System.err.print("Input Error - Length Not in Range("+min+" - "+max+")\n");
						System.err.print("Enter Again:\n");
					}
				}
				break;
			case TYPE_SHORT:
				notValid = true;
				while(notValid){
					Short x = getNumber(typeIdentifier);
					if(isLengthInRange(x,min,max)){
						return (E)x;
					}else{
						System.err.print("Input Error - Length Not in Range("+min+" - "+max+")\n");
						System.err.print("Enter Again:\n");
					}
				}
				break;
			case TYPE_LONG:
				notValid = true;
				while(notValid){
					Long x = getNumber(typeIdentifier);
					if(isLengthInRange(x,min,max)){
						return (E)x;
					}else{
						System.err.print("Input Error - Length Not in Range("+min+" - "+max+")\n");
						System.err.print("Enter Again:\n");
					}
				}
				break;
			case TYPE_DOUBLE:
				notValid = true;
				while(notValid){
					Double x = getNumber(typeIdentifier);
					if(isLengthInRange(x,min,max)){
						return (E)x;
					}else{
						System.err.print("Input Error - Length Not in Range("+min+" - "+max+")\n");
						System.err.print("Enter Again:\n");
					}
				}
				break;
			case TYPE_FLOAT:
				notValid = true;
				while(notValid){
					Float x = getNumber(typeIdentifier);
					if(isLengthInRange(x,min,max)){
						return (E)x;
					}else{
						System.err.print("Input Error - Length Not in Range("+min+" - "+max+")\n");
						System.err.print("Enter Again:\n");
					}
				}
				break;
			case TYPE_BYTE:
				notValid = true;
				while(notValid){
					Byte x = getNumber(typeIdentifier);
					if(isLengthInRange(x,min,max)){
						return (E)x;
					}else{
						System.err.print("Input Error - Length Not in Range("+min+" - "+max+")\n");
						System.err.print("Enter Again:\n");
					}
				}
				break;
			default: throw new InvalidTypeIdentifierException();
		}
		 throw new InvalidTypeIdentifierException();
	}
	/**
	 * Gets and returns a valid number with a value within the range of <code>min</code> - <code>max</code>
	 * @param min minimum value of returned value
	 * @param max maximum value of returned value
	 * @param typeIdentifier flag identifiying the type of value to return
	 * @return valid number with a value within the range of <code>min</code> - <code>max</code>
	 */
	public static <E extends Number> E getNumberValueInRange(E min,E max,byte typeIdentifier) throws InvalidTypeIdentifierException{
		boolean notValid = true;
		switch(typeIdentifier){
			case TYPE_INTEGER: 
				notValid = true;
				while(notValid){
					Integer x = getNumber(typeIdentifier);
					if(isValueInRange(x,min,max)){
						return (E)x;
					}else{
						System.err.print("Input Error - Value Not in Range("+min+" - "+max+")\n");
						System.err.print("Enter Again:\n");
					}
				}
				break;
			case TYPE_SHORT:
				notValid = true;
				while(notValid){
					Short x = getNumber(typeIdentifier);
					if(isValueInRange(x,min,max)){
						return (E)x;
					}else{
						System.err.print("Input Error - Value Not in Range("+min+" - "+max+")\n");
						System.err.print("Enter Again:\n");
					}
				}
				break;
			case TYPE_LONG:
				notValid = true;
				while(notValid){
					Long x = getNumber(typeIdentifier);
					if(isValueInRange(x,min,max)){
						return (E)x;
					}else{
						System.err.print("Input Error - Value Not in Range("+min+" - "+max+")\n");
						System.err.print("Enter Again:\n");
					}
				}
				break;
			case TYPE_DOUBLE:
				notValid = true;
				while(notValid){
					Double x = getNumber(typeIdentifier);
					if(isValueInRange(x,min,max)){
						return (E)x;
					}else{
						System.err.print("Input Error - Value Not in Range("+min+" - "+max+")\n");
						System.err.print("Enter Again:\n");
					}
				}
				break;
			case TYPE_FLOAT:
				notValid = true;
				while(notValid){
					Float x = getNumber(typeIdentifier);
					if(isValueInRange(x,min,max)){
						return (E)x;
					}else{
						System.err.print("Input Error - Value Not in Range("+min+" - "+max+")\n");
						System.err.print("Enter Again:\n");
					}
				}
				break;
			case TYPE_BYTE:
				notValid = true;
				while(notValid){
					Byte x = getNumber(typeIdentifier);
					if(isValueInRange(x,min,max)){
						return (E)x;
					}else{
						System.err.print("Input Error - Value Not in Range("+min+" - "+max+")\n");
						System.err.print("Enter Again:\n");
					}
				}
				break;
			default: throw new InvalidTypeIdentifierException();
		}
		 throw new InvalidTypeIdentifierException();
	}
	/**
	 * Gets and returns a valid <code>int</code> within the specified range.
	 * @param min minimum value of returned <code>int</code>
	 * @param max maximum value of returned <code>int</code>
	 * @return valid <code>int</code> with a value within the range of <code>min</code> to <code>max</code>
	 */
	public static int getIntegerValueInRange(int min, int max){
		int input = 0;
		boolean notValid = true;
		while(notValid){
			input = getInteger();
			if(isValueInRange(new Integer(input),new Integer(min),new Integer(max))){
				notValid = false;
			}else{
				System.err.print("Input Error - Value Not in Range ("+min+" to "+max+")\n");
				System.err.print("Enter Again:\n");
			}
		}
		return input;
	}
	/**
	 * Gets and returns a valid <code>double</code> within the specified range.
	 * @param min minimum value of returned <code>double</code>
	 * @param max maximum value of returned <code>double</code>
	 * @return valid <code>double</code> with a value within the range of <code>min</code> to <code>max</code>
	 */
	public static double getDoubleValueInRange(double min, double max){
		double input = 0;
		boolean notValid = true;
		while(notValid){
			input = getDouble();
			if(isValueInRange(new Double(input),new Double(min),new Double(max))){
				notValid = false;
			}else{
				System.err.print("Input Error - Value Not in Range ("+min+" to "+max+")\n");
				System.err.print("Enter Again:\n");
			}
		}
		return input;
	}
	/**
	 * Gets and returns a valid <code>int</code> with a length less than or equal to the specified maximum <code>length</code>
	 * @param length maximum length of returned <code>int</code>
	 * @return valid <code>int</code> with a maximum length of <code>length</code>
	 */
	public static int getIntegerMaxLength(int length){
		int input = 0;
		boolean notValid = true;
		while(notValid){
			input = getInteger();
			if(String.valueOf(input).length() <= length){
				notValid = false;
			}else{
				System.err.print("Input Error - Integer Too Long (Max "+length+" Digits)\n");
				System.err.print("Enter Again:\n");
			}
		}
		return input;
	}
	/**
	 * Gets and returns a valid <code>double</code> with a length less than or equal to the specified maximum <code>length</code>
	 * @param length maximum length of returned <code>double</code>
	 * @return valid <code>double</code> with a maximum length of <code>length</code>
	 */
	public static double getDoubleMaxLength(int length){
		double input = 0;
		boolean notValid = true;
		while(notValid){
			input = getDouble();
			if(String.valueOf(input).length() <= length){
				notValid = false;
			}else{
				System.err.print("Input Error - Double Too Long (Max "+length+" Digits)\n");
				System.err.print("Enter Again:\n");
			}
		}
		return input;
	}
	/**
	 * Gets and returns a valid <code>int</code> with a length greater than or equal to the specified minimum <code>length</code>
	 * @param length minimum length of returned <code>int</code>
	 * @return valid <code>int</code> with a minimum length of <code>length</code>
	 */
	public static int getIntegerMinLength(int length){
		int input = 0;
		boolean notValid = true;
		while(notValid){
			input = getInteger();
			if(String.valueOf(input).length() >= length){
				notValid = false;
			}else{
				System.err.print("Input Error - Integer Too Short (Min "+length+" Digits)\n");
				System.err.print("Enter Again:\n");
			}
		}
		return input;
	}
	/**
	 * Gets and returns a valid <code>double</code> with a length greater than or equal to the specified minimum <code>length</code>
	 * @param length minimum length of returned <code>double</code>
	 * @return valid <code>double</code> with a minimum length of <code>length</code>
	 */
	public static double getDoubleMinLength(int length){
		double input = 0;
		boolean notValid = true;
		while(notValid){
			input = getDouble();
			if(String.valueOf(input).length() >= length){
				notValid = false;
			}else{
				System.err.print("Input Error - Double Too Short (Min "+length+" Digits)\n");
				System.err.print("Enter Again:\n");
			}
		}
		return input;
	}
	/**
	 * Gets and returns a valid <code>int</code> with a value less than or equal to the specified <code>max</code>
	 * @param max maximum value of returned <code>int</code>
	 * @return valid <code>int</code> with a maximum value of <code>max</code>
	 */
	public static int getIntegerMaxValue(int max){
		int input = 0;
		boolean notValid = true;
		while(notValid){
			input = getInteger();
			if(input <= max){
				notValid = false;
			}else{
				System.err.print("Input Error - Integer Value to Large (Max: "+max+"\n");
				System.err.print("Enter Again:\n");
			}
		}
		return input;
	}
	
	/**
	 * Gets and returns a valid <code>double</code> with a value less than or equal to the specified <code>max</code>
	 * @param max maximum value of returned <code>double</code>
	 * @return valid <code>double</code> with a maximum value of <code>max</code>
	 */
	public static double getDoubleMaxValue(double max){
		double input = 0;
		boolean notValid = true;
		while(notValid){
			input = getInteger();
			if(input <= max){
				notValid = false;
			}else{
				System.err.print("Input Error - Double Value to Large (Max: "+max+"\n");
				System.err.print("Enter Again:\n");
			}
		}
		return input;
	}
	/**
	 * Gets and returns a valid <code>int</code> with a value greater than or equal to the specified <code>min</code>
	 * @param min minimum value of returned <code>int</code>
	 * @return valid <code>int</code> with a minimum value of <code>min</code>
	 */
	public static int getIntegerMinValue(int max){
		int input = 0;
		boolean notValid = true;
		while(notValid){
			input = getInteger();
			if(input >= max){
				notValid = false;
			}else{
				System.err.print("Input Error - Integer Value to Small (Min: "+max+"\n");
				System.err.print("Enter Again:\n");
			}
		}
		return input;
	}
	/**
	 * Gets and returns a valid <code>double</code> with a value greater than or equal to the specified <code>min</code>
	 * @param min minimum value of returned <code>double</code>
	 * @return valid <code>double</code> with a minimum value of <code>min</code>
	 */
	public static double getDoubleMinValue(double max){
		double input = 0;
		boolean notValid = true;
		while(notValid){
			input = getInteger();
			if(input >= max){
				notValid = false;
			}else{
				System.err.print("Input Error - Double Value to Small (Min: "+max+"\n");
				System.err.print("Enter Again:\n");
			}
		}
		return input;
	}

}
