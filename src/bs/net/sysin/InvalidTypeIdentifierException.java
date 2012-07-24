/*
 * Created on Mar 3, 2005
 * Created by Bryan Saunders
 */
package bs.net.sysin;

/**
 * Invalid type identifer supplied as argument
 * @author Bryan Saunders
 * @version 1.0 (Feb 13, 2005)
 */
public class InvalidTypeIdentifierException extends Exception {
	private static final long serialVersionUID = 1L;

	public InvalidTypeIdentifierException() {
		System.err.print("Invalid Type Identifer Specified\n");
	}
}
