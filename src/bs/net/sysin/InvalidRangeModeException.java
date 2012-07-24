/*
 * Created on Feb 13, 2005
 * Created by Bryan Saunders
 *
 */
package bs.net.sysin;

/**
 * Invalid range mode supplied as argument
 * @author Bryan Saunders
 * @version 1.0 (Feb 13, 2005)
 */
public class InvalidRangeModeException extends Exception {

	private static final long serialVersionUID = 1L;

	public InvalidRangeModeException() {
		System.err.print("Invalid Mode Specified\n");
	}
}
