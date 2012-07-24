/*
 * Created on Feb 13, 2005
 * Created by Bryan Saunders
 * 
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
public class PrimitiveKeyboard {
	
	/**
	 * <code>MAX_BOUND</code> is a range mode specifier specifying -INFINITY to <code>boundry</code>
	 */
	public static final byte MAX_BOUND = 1;
	/**
	 * <code>MIN_BOUND</code> is a range mode specifier specifying <code>boundry</code> to INFINITY
	 */
	public static final byte MIN_BOUND = 0;
	
	public PrimitiveKeyboard(){
		
	}
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
			if(isLessThanLength(input,length)){
				notValid = false;
			}else{
				System.err.print("Input Error - String Too Long (Max "+length+" Chars)\n");
				System.err.print("Enter Again:\n");
			}
		}
		return input;
	}
	/**
	 * Validates wether or not a <code>input</code> is less than a certain length of characters
	 * @param input <code>int</code> value to check against <code>length</code>
	 * @param length the maximum length of <code>input</input>
	 * @return true if <code>input</code> is less then or equal to <code>length</code>
	 */
	public static boolean isLessThanInteger(int input, int length){
		return (input <= length);
	}
	/**
	 * Validates wether or not a <code>input</code> is longer than a certain length of characters
	 * @param input <code>int</code> value to check against <code>length</code>
	 * @param length the minimum length of <code>input</input>
	 * @return true if <code>input</code> is greater then or equal to <code>length</code>
	 */
	public static boolean isGreaterThanInteger(int input, int length){
		return (input >= length);
	}
	/**
	 * Validates wether or not a <code>String</code> is less than a certain length of characters
	 * @param input <code>String</code> value to check against <code>length</code>
	 * @param length the maximum length of <code>input</input>
	 * @return true if <code>input</code> is less then or equal to <code>length</code>
	 */
	public static boolean isLessThanLength(String input, int length){
		return (input.length() <= length);
	}
	/**
	 * Validates wether or not a <code>String</code> is longer than a certain length of characters
	 * @param input <code>String</code> value to check against <code>length</code>
	 * @param length the minimum length of <code>input</input>
	 * @return true if <code>input</code> is greater then or equal to <code>length</code>
	 */
	public static boolean isGreaterThanLength(String input, int length){
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
			if(isGreaterThanLength(input,length)){
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
			if(isLessThanLength(input,max)){
				if(isGreaterThanLength(input,min)){
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
		return (isInRange(getASCIIforChar(input),97,122));
	}
	/**
	 * Determines wether or not <code>input</code> is an upper case letter
	 * @param input <code>char</code> to test
	 * @return true if <code>input</code> is an upper case letter
	 */
	public static boolean isUpperCaseLetter(char input){
		return (isInRange(getASCIIforChar(input),65,90));
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
	public static boolean isEven(int input){
		return ((input % 2 == 0)? true: false);
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
			if(isLessThanLength(String.valueOf(input),length)){
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
			if(isLessThanLength(String.valueOf(input),length)){
				notValid = false;
			}else{
				System.err.print("Input Error - Double Too Long (Max "+length+" Digits)\n");
				System.err.print("Enter Again:\n");
			}
		}
		return input;
	}
	/**
	 * Validates wether or not <code>input</code> is within the specified range.
	 * @param min minimum value of range
	 * @param max maximum value of range
	 * @return true if <code>input</code> is within the range of <code>min</code> to <code>max</code>
	 */
	public static boolean isInRange(int input,int min, int max){
		return (input >= min && input <= max);
	}
	/**
	 * Validates wether or not <code>input</code> is within the specified range.
	 * @param min minimum value of range
	 * @param max maximum value of range
	 * @return true if <code>input</code> is within the range of <code>min</code> to <code>max</code>
	 */
	public static boolean isInRange(double input,double min, int max){
		return (input >= min && input <= max);
	}
	/**
	 * Gets and returns a valid <code>int</code> within the specified range.
	 * @param min minimum length of returned <code>int</code>
	 * @param max maximum length of returned <code>int</code>
	 * @return valid <code>int</code> with a length within the range of <code>min</code> to <code>max</code>
	 */
	public static int getIntegerInRange(int min, int max){
		int input = 0;
		boolean notValid = true;
		while(notValid){
			input = getInteger();
			if(isInRange(input,min,max)){
				notValid = false;
			}else{
				System.err.print("Input Error - Value Not in Range ("+min+" to "+max+")\n");
				System.err.print("Enter Again:\n");
			}
		}
		return input;
	}
	/**
	 * Gets and returns a valid <code>int</code> within the specified range. A <code>MIN_BOUND</code> range goes from <code>boundry</code> to ?. A <code>MAX_BOUND</code> range goes from -INFINITE to <code>boundry</code>.
	 * @param boundry boundry of returned <code>int</code>
	 * @param mode range mode specifier. Valid specifiers are <code>MIN_BOUND</code> and <code>MAX_BOUND</code>
	 * @return valid <code>int</code> within the sepcified range.
	 * @see MIN_BOUND
	 * @see MAX_BOUND
	 */
	public static int getIntegerInRange(int boundry,byte mode) throws InvalidRangeModeException{
		int input = 0;
		boolean notValid = true;
		while(notValid){
			input = getInteger();
			switch(mode){
				case MAX_BOUND:
					if(input <= boundry){
						notValid = false;
					}else{
						System.err.print("Input Error - Value Not in Range (-INFINITY to "+boundry+")\n");
						System.err.print("Enter Again:\n");
					}
					break;
				case MIN_BOUND:
					if(input >= boundry){
						notValid = false;
					}else{
						System.err.print("Input Error - Value Not in Range ("+boundry+"to INFINITY)\n");
						System.err.print("Enter Again:\n");
					}
					break;
				default:
					throw new InvalidRangeModeException();
			}
		}
		return input;
	}
	/**
	 * Gets and returns a valid <code>double</code> within the specified range. A <code>MIN_BOUND</code> range goes from <code>boundry</code> to ?. A <code>MAX_BOUND</code> range goes from -INFINITE to <code>boundry</code>.
	 * @param boundry boundry of returned <code>double</code>
	 * @param mode range mode specifier. Valid specifiers are <code>MIN_BOUND</code> and <code>MAX_BOUND</code>
	 * @return valid <code>double</code> within the sepcified range.
	 * @see MIN_BOUND
	 * @see MAX_BOUND
	 */
	public static double getDoubleInRange(double boundry,byte mode) throws InvalidRangeModeException{
		double input = 0;
		boolean notValid = true;
		while(notValid){
			input = getDouble();
			switch(mode){
				case MAX_BOUND:
					if(input <= boundry){
						notValid = false;
					}else{
						System.err.print("Input Error - Value Not in Range (-INFINITY to "+boundry+")\n");
						System.err.print("Enter Again:\n");
					}
					break;
				case MIN_BOUND:
					if(input >= boundry){
						notValid = false;
					}else{
						System.err.print("Input Error - Value Not in Range ("+boundry+"to INFINITY)\n");
						System.err.print("Enter Again:\n");
					}
					break;
				default:
					throw new InvalidRangeModeException();
			}
		}
		return input;
	}
	/**
	 * Gets and returns a valid <code>double</code> within the specified range.
	 * @param min minimum length of returned <code>double</code>
	 * @param max maximum length of returned <code>double</code>
	 * @return valid <code>double</code> with a length within the range of <code>min</code> to <code>max</code>
	 */
	public static double getDoubleInRange(double min, double max){
		double input = 0;
		boolean notValid = true;
		while(notValid){
			input = getDouble();
			if(input >= min && input <= max){
				notValid = false;
			}else{
				System.err.print("Input Error - Value Not in Range ("+min+" to "+max+")\n");
				System.err.print("Enter Again:\n");
			}
		}
		return input;
	}
}
