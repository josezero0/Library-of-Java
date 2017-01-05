package com.uncataloged.util;

/**
 * Class to display a System.err text with an specific format.
 *
 * @author
 */
public class MSGException {

    /**
     * Display an error on the command line with the next format:
     * <code>System.err.println(msgClass + " - " + msgMethod + " - " + msgException)</code>
     * <code>System.err.println(msgDescription)</code>
     * <code>System.err.println()</code>
     *
     * @param msgClass String with the name of the class where the exception
     * occurs.
     * @param msgMethod String with the method name where the exception occurs.
     * @param msgException String with the exception name that occurs.
     * @param msgDescription String with a description of the exception.
     */
    public static final void display(String msgClass, String msgMethod, String msgException, String msgDescription) {
        System.err.println(msgClass + " - " + msgMethod + " - " + msgException);
        System.err.println(msgDescription);
        System.err.println();
    }

    // Declaration of exceptions
    public static final String MSG_IOEXCEPTION = "IOException";
    public static final String MSG_ILLEGALARGUMENTEXCEPTION = "IllegalArgumentException";
    public static final String MSG_INDEXOUTOFBOUNDSEXCEPTION = "IndexOutOfBoundsException";
    public static final String MSG_NULLPOINTEREXCEPTION = "NullPointerException";
    public static final String MSG_ZIPEXCEPTION = "ZipException";
    // End declaration of exceptions

}
