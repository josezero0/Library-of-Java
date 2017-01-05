package com.sort.method;

/**
 * Sorting method: Bubble Sort.
 *
 * @author
 */
public final class BubbleSort {

    /**
     * Sort an <code>byte array</code> ascending using the bubble sort.
     *
     * @param array Array to be sorted.
     * @return Array sorted, if array is null, return <code>null</code>.
     */
    public static final byte[] ascending(byte[] array) {
        if (array == null) {
            return null;
        }
        int n = array.length - 1, newn;
        do {
            newn = 0;
            for (int i = 0; i < n; i++) {
                if (array[i] > array[i + 1]) {
                    byte temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    newn = i;
                }
            }
            n = newn;
        } while (n != 0);
        return array;
    }

    /**
     * Sort an <code>byte array</code> descending using the bubble sort.
     *
     * @param array Array to be sorted.
     * @return Array sorted, if array is null, return <code>null</code>.
     */
    public static final byte[] descending(byte[] array) {
        if (array == null) {
            return null;
        }
        int n = array.length - 1, newn;
        do {
            newn = 0;
            for (int i = 0; i < n; i++) {
                if (array[i] < array[i + 1]) {
                    byte temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    newn = i;
                }
            }
            n = newn;
        } while (n != 0);
        return array;
    }

    /**
     * Sort an <code>short array</code> ascending using the bubble sort.
     *
     * @param array Array to be sorted.
     * @return Array sorted, if array is null, return <code>null</code>.
     */
    public static final short[] ascending(short[] array) {
        if (array == null) {
            return null;
        }
        int n = array.length - 1, newn;
        do {
            newn = 0;
            for (int i = 0; i < n; i++) {
                if (array[i] > array[i + 1]) {
                    short temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    newn = i;
                }
            }
            n = newn;
        } while (n != 0);
        return array;
    }

    /**
     * Sort an <code>short array</code> descending using the bubble sort.
     *
     * @param array Array to be sorted.
     * @return Array sorted, if array is null, return <code>null</code>.
     */
    public static final short[] descending(short[] array) {
        if (array == null) {
            return null;
        }
        int n = array.length - 1, newn;
        do {
            newn = 0;
            for (int i = 0; i < n; i++) {
                if (array[i] < array[i + 1]) {
                    short temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    newn = i;
                }
            }
            n = newn;
        } while (n != 0);
        return array;
    }

    /**
     * Sort an <code>int array</code> ascending using the bubble sort.
     *
     * @param array Array to be sorted.
     * @return Array sorted, if array is null, return <code>null</code>.
     */
    public static final int[] ascending(int[] array) {
        if (array == null) {
            return null;
        }
        int n = array.length - 1, newn;
        do {
            newn = 0;
            for (int i = 0; i < n; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    newn = i;
                }
            }
            n = newn;
        } while (n != 0);
        return array;
    }

    /**
     * Sort an <code>int array</code> descending using the bubble sort.
     *
     * @param array Array to be sorted.
     * @return Array sorted, if array is null, return <code>null</code>.
     */
    public static final int[] descending(int[] array) {
        if (array == null) {
            return null;
        }
        int n = array.length - 1, newn;
        do {
            newn = 0;
            for (int i = 0; i < n; i++) {
                if (array[i] < array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    newn = i;
                }
            }
            n = newn;
        } while (n != 0);
        return array;
    }

    /**
     * Sort an <code>long array</code> ascending using the bubble sort.
     *
     * @param array Array to be sorted.
     * @return Array sorted, if array is null, return <code>null</code>.
     */
    public static final long[] ascending(long[] array) {
        if (array == null) {
            return null;
        }
        int n = array.length - 1, newn;
        do {
            newn = 0;
            for (int i = 0; i < n; i++) {
                if (array[i] > array[i + 1]) {
                    long temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    newn = i;
                }
            }
            n = newn;
        } while (n != 0);
        return array;
    }

    /**
     * Sort an <code>long array</code> descending using the bubble sort.
     *
     * @param array Array to be sorted.
     * @return Array sorted, if array is null, return <code>null</code>.
     */
    public static final long[] descending(long[] array) {
        if (array == null) {
            return null;
        }
        int n = array.length - 1, newn;
        do {
            newn = 0;
            for (int i = 0; i < n; i++) {
                if (array[i] < array[i + 1]) {
                    long temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    newn = i;
                }
            }
            n = newn;
        } while (n != 0);
        return array;
    }

    /**
     * Sort an <code>float array</code> ascending using the bubble sort.
     *
     * @param array Array to be sorted.
     * @return Array sorted, if array is null, return <code>null</code>.
     */
    public static final float[] ascending(float[] array) {
        if (array == null) {
            return null;
        }
        int n = array.length - 1, newn;
        do {
            newn = 0;
            for (int i = 0; i < n; i++) {
                if (array[i] > array[i + 1]) {
                    float temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    newn = i;
                }
            }
            n = newn;
        } while (n != 0);
        return array;
    }

    /**
     * Sort an <code>float array</code> descending using the bubble sort.
     *
     * @param array Array to be sorted.
     * @return Array sorted, if array is null, return <code>null</code>.
     */
    public static final float[] descending(float[] array) {
        if (array == null) {
            return null;
        }
        int n = array.length - 1, newn;
        do {
            newn = 0;
            for (int i = 0; i < n; i++) {
                if (array[i] < array[i + 1]) {
                    float temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    newn = i;
                }
            }
            n = newn;
        } while (n != 0);
        return array;
    }

    /**
     * Sort an <code>double array</code> ascending using the bubble sort.
     *
     * @param array Array to be sorted.
     * @return Array sorted, if array is null, return <code>null</code>.
     */
    public static final double[] ascending(double[] array) {
        if (array == null) {
            return null;
        }
        int n = array.length - 1, newn;
        do {
            newn = 0;
            for (int i = 0; i < n; i++) {
                if (array[i] > array[i + 1]) {
                    double temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    newn = i;
                }
            }
            n = newn;
        } while (n != 0);
        return array;
    }

    /**
     * Sort an <code>double array</code> descending using the bubble sort.
     *
     * @param array Array to be sorted.
     * @return Array sorted, if array is null, return <code>null</code>.
     */
    public static final double[] descending(double[] array) {
        if (array == null) {
            return null;
        }
        int n = array.length - 1, newn;
        do {
            newn = 0;
            for (int i = 0; i < n; i++) {
                if (array[i] < array[i + 1]) {
                    double temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    newn = i;
                }
            }
            n = newn;
        } while (n != 0);
        return array;
    }

    /**
     * Sort an <code>char array</code> ascending using the bubble sort.
     *
     * @param array Array to be sorted.
     * @return Array sorted, if array is null, return <code>null</code>.
     */
    public static final char[] ascending(char[] array) {
        if (array == null) {
            return null;
        }
        int n = array.length - 1, newn;
        do {
            newn = 0;
            for (int i = 0; i < n; i++) {
                if (array[i] > array[i + 1]) {
                    char temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    newn = i;
                }
            }
            n = newn;
        } while (n != 0);
        return array;
    }

    /**
     * Sort an <code>char array</code> descending using the bubble sort.
     *
     * @param array Array to be sorted.
     * @return Array sorted, if array is null, return <code>null</code>.
     */
    public static final char[] descending(char[] array) {
        if (array == null) {
            return null;
        }
        int n = array.length - 1, newn;
        do {
            newn = 0;
            for (int i = 0; i < n; i++) {
                if (array[i] < array[i + 1]) {
                    char temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    newn = i;
                }
            }
            n = newn;
        } while (n != 0);
        return array;
    }

    /**
     * Sort an <code>String array</code> ascending using the bubble sort.
     *
     * @param array Array to be sorted.
     * @return Array sorted, if array is null, return <code>null</code>.
     */
    public static final String[] ascending(String[] array) {
        if (array == null) {
            return null;
        }
        int n = array.length - 1, newn;
        boolean breakpoint;
        do {
            newn = 0;
            for (int i = 0; i < n; i++) {
                breakpoint = false;
                for (int j = 0; j < array[i].length() && j < array[i + 1].length() && !breakpoint; j++) {
                    if (array[i].charAt(j) > array[i + 1].charAt(j)) {
                        String temp = array[i];
                        array[i] = array[i + 1];
                        array[i + 1] = temp;
                        newn = i;
                        breakpoint = true;
                    }
                    if (array[i].charAt(j) < array[i + 1].charAt(j)) {
                        breakpoint = true;
                    }
                }
                if (!breakpoint && array[i].length() > array[i + 1].length()) {
                    String temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    newn = i;
                }
            }
            n = newn;
        } while (n != 0);
        return array;
    }

    /**
     * Sort an <code>String array</code> descending using the bubble sort.
     *
     * @param array Array to be sorted.
     * @return Array sorted, if array is null, return <code>null</code>.
     */
    public static final String[] descending(String[] array) {
        if (array == null) {
            return null;
        }
        int n = array.length - 1, newn;
        boolean breakpoint;
        do {
            newn = 0;
            for (int i = 0; i < n; i++) {
                breakpoint = false;
                for (int j = 0; j < array[i].length() && j < array[i + 1].length() && !breakpoint; j++) {
                    if (array[i].charAt(j) < array[i + 1].charAt(j)) {
                        String temp = array[i];
                        array[i] = array[i + 1];
                        array[i + 1] = temp;
                        newn = i;
                        breakpoint = true;
                    }
                    if (array[i].charAt(j) > array[i + 1].charAt(j)) {
                        breakpoint = true;
                    }
                }
                if (!breakpoint && array[i].length() < array[i + 1].length()) {
                    String temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    newn = i;
                }
            }
            n = newn;
        } while (n != 0);
        return array;
    }

}
