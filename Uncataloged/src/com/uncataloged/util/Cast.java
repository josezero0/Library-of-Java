package com.uncataloged.util;

/**
 * Class to validate if a String can be parsed into a number format and deal
 * with the <code>NumberFormatException</code>.
 *
 * @author
 */
public final class Cast {

    /**
     * Can't instance it.
     */
    protected Cast() {

    }

    /**
     * Validate if a String can be parsed into a byte.
     *
     * @param number String to validate.
     * @return <code>true</code> if can be parsed, <code>false</code> otherwise.
     */
    public static final boolean isByte(String number) {
        try {
            Byte.parseByte(number);
            return true;
        } catch (NumberFormatException numberFormatException) {
            return false;
        }
    }

    /**
     * Validate if a String can be parsed into a Short.
     *
     * @param number String to validate.
     * @return <code>true</code> if can be parsed, <code>false</code> otherwise.
     */
    public static final boolean isShort(String number) {
        try {
            Short.parseShort(number);
            return true;
        } catch (NumberFormatException numberFormatException) {
            return false;
        }
    }

    /**
     * Validate if a String can be parsed into a Int.
     *
     * @param number String to validate.
     * @return <code>true</code> if can be parsed, <code>false</code> otherwise.
     */
    public static final boolean isInt(String number) {
        try {
            Integer.parseInt(number);
            return true;
        } catch (NumberFormatException numberFormatException) {
            return false;
        }
    }

    /**
     * Validate if a String can be parsed into a Long.
     *
     * @param number String to validate.
     * @return <code>true</code> if can be parsed, <code>false</code> otherwise.
     */
    public static final boolean isLong(String number) {
        try {
            Long.parseLong(number);
            return true;
        } catch (NumberFormatException numberFormatException) {
            return false;
        }
    }

    /**
     * Validate if a String can be parsed into a Float.
     *
     * @param number String to validate.
     * @return <code>true</code> if can be parsed, <code>false</code> otherwise.
     */
    public static final boolean isFloat(String number) {
        try {
            Float.parseFloat(number);
            return true;
        } catch (NumberFormatException numberFormatException) {
            return false;
        }
    }

    /**
     * Validate if a String can be parsed into a Double.
     *
     * @param number String to validate.
     * @return <code>true</code> if can be parsed, <code>false</code> otherwise.
     */
    public static final boolean isDouble(String number) {
        try {
            Double.parseDouble(number);
            return true;
        } catch (NumberFormatException numberFormatException) {
            return false;
        }
    }

    /**
     * Parse a String into a Byte and capture the exception.
     *
     * @param number String to be parsed.
     * @return <code>Byte</code> value of the String or <code>ERROR</code> if a
     * NumberFormatException occurs.
     */
    public static final byte parseByte(String number) {
        try {
            return Byte.parseByte(number);
        } catch (NumberFormatException numberFormatException) {
            return ERROR;
        }
    }

    /**
     * Parse a String into a Short and capture the exception.
     *
     * @param number String to be parsed.
     * @return <code>Short</code> value of the String or <code>ERROR</code> if a
     * NumberFormatException occurs.
     */
    public static final short parseShort(String number) {
        try {
            return Short.parseShort(number);
        } catch (NumberFormatException numberFormatException) {
            return ERROR;
        }
    }

    /**
     * Parse a String into a Int and capture the exception.
     *
     * @param number String to be parsed.
     * @return <code>Int</code> value of the String or <code>ERROR</code> if a
     * NumberFormatException occurs.
     */
    public static final int parseInt(String number) {
        try {
            return Integer.parseInt(number);
        } catch (NumberFormatException numberFormatException) {
            return ERROR;
        }
    }

    /**
     * Parse a String into a Long and capture the exception.
     *
     * @param number String to be parsed.
     * @return <code>Long</code> value of the String or <code>ERROR</code> if a
     * NumberFormatException occurs.
     */
    public static final long parseLong(String number) {
        try {
            return Long.parseLong(number);
        } catch (NumberFormatException numberFormatException) {
            return ERROR;
        }
    }

    /**
     * Parse a String into a Float and capture the exception.
     *
     * @param number String to be parsed.
     * @return <code>Float</code> value of the String or <code>ERROR</code> if a
     * NumberFormatException occurs.
     */
    public static final float parseFloat(String number) {
        try {
            return Float.parseFloat(number);
        } catch (NumberFormatException numberFormatException) {
            return ERROR;
        }
    }

    /**
     * Parse a String into a Double and capture the exception.
     *
     * @param number String to be parsed.
     * @return <code>Double</code> value of the String or <code>ERROR</code> if a
     * NumberFormatException occurs.
     */
    public static final double parseDouble(String number) {
        try {
            return Double.parseDouble(number);
        } catch (NumberFormatException numberFormatException) {
            return ERROR;
        }
    }

    /**
     * Value to return if an exception occurs.
     */
    private static final byte ERROR = -1;

}
