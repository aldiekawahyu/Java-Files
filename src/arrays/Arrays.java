package com.example.arrays;

public class Arrays {

    //<editor-fold desc="ATTRIBUTES">

    public int dimension, length, numel;
    public String type;
    public int[] shape;

    public double[] doubleVector; public double[][] doubleArray; public double[][][] doubleThreeDArray;
    public int[] intVector; public int[][] intArray; public int[][][] intThreeDArray;
    //</editor-fold>


    //<editor-fold desc="CONSTRUCTOR">

    /**
     * Class constructor for 1D double array.
     * @param vector a java 1D double array
     */
    public Arrays(double[] vector) {
        this.doubleVector = vector;
        this.dimension = 1;
        this.length = vector.length;
        this.shape = new int[] {1, vector.length};
        this.numel = vector.length;

        Class<? extends double[]> c = this.doubleVector.getClass();
        this.type =  c.getComponentType().toString();
    }

    /**
     * Class constructor for 1D int array.
     * @param vector a java 1D int array
     */
    public Arrays(int[] vector) {
        this.intVector = vector;
        this.dimension = 1;
        this.length = vector.length;
        this.shape = new int[] {1, vector.length};
        this.numel = vector.length;

        Class<? extends int[]> c = this.intVector.getClass();
        this.type =  c.getComponentType().toString();
    }

    /**
     * Class constructor for 2D double array.
     * @param array a java 2D double array
     */
    public Arrays(double[][] array) {
        this.doubleArray = array;
        int[] shape = new int[] {array.length, array[0].length};
        this.dimension = 2;
        this.shape = shape;
        this.numel = this.shape[0] * this.shape[1];

        Class<? extends double[]> c = this.doubleArray[0].getClass();
        this.type = c.getComponentType().toString();
    }

    /**
     * Class constructor for 2D int array.
     * @param array a java 2D int array
     */
    public Arrays(int[][] array) {
        this.intArray = array;
        int[] shape = new int[] {array.length, array[0].length};
        this.dimension = 2;
        this.shape = shape;
        this.numel = this.shape[0] * this.shape[1];

        Class<? extends int[]> c = this.intArray[0].getClass();
        this.type = c.getComponentType().toString();
    }

    /**
     * Class constructor for 3D double array.
     * @param threeDArray a java 3D double array
     */
    public Arrays(double[][][] threeDArray) {
        this.doubleThreeDArray = threeDArray;
        int[] shape = new int[] {threeDArray[0].length, threeDArray[0][0].length, threeDArray.length};
        this.dimension = 3;
        this.shape = shape;
        this.numel = this.shape[0] * this.shape[1] * this.shape[2];

        Class<? extends double[]> c = this.doubleThreeDArray[0][0].getClass();
        this.type = c.getComponentType().toString();
    }

    /**
     * Class constructor for 3D int array.
     * @param threeDArray a java 3D int array
     */
    public Arrays(int[][][] threeDArray) {
        this.intThreeDArray = threeDArray;
        int[] shape = new int[] {threeDArray[0].length, threeDArray[0][0].length, threeDArray.length};
        this.dimension = 3;
        this.shape = shape;
        this.numel = this.shape[0] * this.shape[1] * this.shape[2];

        Class<? extends int[]> c = this.intThreeDArray[0][0].getClass();
        this.type = c.getComponentType().toString();
    }
    //</editor-fold>


    //<editor-fold desc="GETTER METHOD">

    /**
     * Getter method for 1D double array
     * @return doubleVector 1D double array
     */
    public double[] getDoubleVector() {
        return doubleVector;
    }

    /**
     * Getter method for 1D int array
     * @return intVector 1D int array
     */
    public int[] getIntVector() {
        return intVector;
    }

    /**
     * Getter method for 2D double array
     * @return doubleArray 2D double array
     */
    public double[][] getDoubleArray() {
        return doubleArray;
    }

    /**
     * Getter method for 2D int array
     * @return intArray 2D int array
     */
    public int[][] getIntArray() {
        return intArray;
    }

    /**
     * Getter method for 3D double array
     * @return doubleThreeDArray 3D double array
     */
    public double[][][] getDoubleThreeDArray() {
        return doubleThreeDArray;
    }

    /**
     * Getter method for 3D int array
     * @return intThreeDArray 3D int array
     */
    public int[][][] getIntThreeDArray() {
        return intThreeDArray;
    }
    //</editor-fold>


    //<editor-fold desc="MIN MAX">

    //<editor-fold desc="MAX">
    
    /**
     * A function to get the maximum or the greatest number of Arrays object.
     * @param array Arrays object
     * @return max A maximum or the greatest number of the Arrays object
     */
    public static double max(Arrays array) {
        String type = array.type;
        int dimension = array.dimension;

        switch (type.toLowerCase()) {
            case "double" -> {
                switch (dimension) {
                    case 1 -> {
                        double max = array.doubleVector[0];
                        for (int i = 0; i < array.shape[1]; i++) {
                            if (max < array.doubleVector[i]) max = array.doubleVector[i];
                        }
                        return max;
                    }

                    case 2 -> {
                        double max = array.doubleArray[0][0];
                        for (int i = 0; i < array.shape[0]; i++) {
                            for (int j = 0; j < array.shape[1]; j++) {
                                if (max < array.doubleArray[i][j]) max = array.doubleArray[i][j];
                            }
                        }
                        return max;
                    }

                    case 3 -> {
                        double max = array.doubleThreeDArray[0][0][0];
                        for (int i = 0; i < array.shape[0]; i++) {
                            for (int j = 0; j < array.shape[1]; j++) {
                                for (int k = 0; k < array.shape[2]; k++) {
                                    if (max < array.doubleThreeDArray[k][i][j]) max = array.doubleThreeDArray[k][i][j];
                                }
                            }
                        }
                        return max;
                    }

                    default -> {
                        return 0;
                    }
                }
            }

            case "int" -> {
                switch (dimension) {
                    case 1 -> {
                        int max = array.intVector[0];
                        for (int i = 0; i < array.shape[1]; i++) {
                            if (max < array.intVector[i]) max = array.intVector[i];
                        }
                        return max;
                    }

                    case 2 -> {
                        int max = array.intArray[0][0];
                        for (int i = 0; i < array.shape[0]; i++) {
                            for (int j = 0; j < array.shape[1]; j++) {
                                if (max < array.intArray[i][j]) max = array.intArray[i][j];
                            }
                        }
                        return max;
                    }

                    case 3 -> {
                        int max = array.intThreeDArray[0][0][0];
                        for (int i = 0; i < array.shape[0]; i++) {
                            for (int j = 0; j < array.shape[1]; j++) {
                                for (int k = 0; k < array.shape[2]; k++) {
                                    if (max < array.intThreeDArray[k][i][j]) max = array.intThreeDArray[k][i][j];
                                }
                            }
                        }
                        return max;
                    }

                    default -> {
                        return 0;
                    }
                }
            }

            default -> {
                return 0;
            }
        }
    }

    /**
     * A function to get the maximum or the greatest number of array.
     * @return max A maximum or the greatest number of the array.
     */
    public double maxDouble() {
        if (this.dimension == 1) { // Vector
            double max = this.doubleVector[0];
            for (int i = 0; i < this.length; i++) {
                if (max < this.doubleVector[i]) max = this.doubleVector[i];
            }
            return max;
        } else if (this.dimension == 2) { // 2D Array
            double max = this.doubleArray[0][0];
            for (int i = 0; i < this.shape[0]; i++) {
                for (int j = 0; j < this.shape[1]; j++) {
                    if (max < this.doubleArray[i][j]) max = this.doubleArray[i][j];
                }
            }
            return max;
        } else {
            double max = this.doubleThreeDArray[0][0][0];
            for (int i = 0; i < this.shape[0]; i++) {
                for (int j = 0; j < this.shape[1]; j++) {
                    for (int k = 0; k < this.shape[2]; k++) {
                        if (max < this.doubleThreeDArray[k][i][j]) max = this.doubleThreeDArray[k][i][j];
                    }
                }
            }
            return max;
        }
    }

    /**
     * A function to get the maximum or the greatest number of array.
     * @return max A maximum or the greatest number of the array.
     */
    public int maxInt() {
        if (this.dimension == 1) { // Vector
            int max = this.intVector[0];
            for (int i = 0; i < this.length; i++) {
                if (max < this.intVector[i]) max = this.intVector[i];
            }
            return max;
        } else if (this.dimension == 2) { // 2D Array
            int max = this.intArray[0][0];
            for (int i = 0; i < this.shape[0]; i++) {
                for (int j = 0; j < this.shape[1]; j++) {
                    if (max < this.intArray[i][j]) max = this.intArray[i][j];
                }
            }
            return max;
        } else {
            int max = this.intThreeDArray[0][0][0];
            for (int i = 0; i < this.shape[0]; i++) {
                for (int j = 0; j < this.shape[1]; j++) {
                    for (int k = 0; k < this.shape[2]; k++) {
                        if (max < this.intThreeDArray[k][i][j]) max = this.intThreeDArray[k][i][j];
                    }
                }
            }
            return max;
        }
    }

    /**
     * A function to get the maximum or the greatest number of array.
     * @param vector An input 1D double array
     * @return max A maximum or the greatest number of the array.
     */
    public static double max(double[] vector) {
        double max = vector[0];
        for (double v : vector) {
            if (max < v) max = v;
        }
        return max;
    }

    /**
     * A function to get the maximum or the greatest number of array.
     * @param vector An input 1D double array
     * @return max A maximum or the greatest number of the array.
     */
    public static int max(int[] vector) {
        int max = vector[0];
        for (int j : vector) {
            if (max < j) max = j;
        }
        return max;
    }

    /**
     * A function to get the maximum or the greatest number of array.
     * @param vector An input 1D double array
     * @param left Left index of the array
     * @param right Right index of the array
     * @return A maximum or the greatest number of the array
     */
    public static double max(double[] vector, int left, int right) {
        if (left == right) return vector[left];
        int mid = (left + right) / 2;
        double u = max(vector, left, mid);
        double v = max(vector,mid+1, right);
        return Math.max(u, v);
    }

    /**
     * A function to get the maximum or the greatest number of array.
     * @param vector An input 1D int array
     * @param left Left index of the array
     * @param right Right index of the array
     * @return A maximum or the greatest number of the array
     */
    public static int max(int[] vector, int left, int right) {
        if (left == right) return vector[left];
        int mid = (left + right) / 2;
        int u = max(vector, left, mid);
        int v = max(vector,mid+1, right);
        return Math.max(u, v);
    }

    /**
     * A function to get the maximum or the greatest number of array.
     * @param array An input 2D double array
     * @return max A maximum or the greatest number of the array.
     */
    public static double max(double[][] array) {
        double max = array[0][0];
        for (double[] doubles : array) {
            for (int j = 0; j < array[0].length; j++) {
                if (max < doubles[j]) max = doubles[j];
            }
        }
        return max;
    }

    /**
     * A function to get the maximum or the greatest number of array.
     * @param array An input 2D double array
     * @return max A maximum or the greatest number of the array.
     */
    public static int max(int[][] array) {
        int max = array[0][0];
        for (int[] ints : array) {
            for (int j = 0; j < array[0].length; j++) {
                if (max < ints[j]) max = ints[j];
            }
        }
        return max;
    }

    /**
     * A function to get the maximum or the greatest number of array.
     * @param threeDArray An input 3D double array
     * @return max A maximum or the greatest number of the array.
     */
    public static double max(double[][][] threeDArray) {
        double max = threeDArray[0][0][0];
        for (int i = 0; i < threeDArray[0].length; i++) {
            for (int j = 0; j < threeDArray[0][0].length; j++) {
                for (double[][] doubles : threeDArray) {
                    if (max < doubles[i][j]) max = doubles[i][j];
                }
            }
        }
        return max;
    }

    /**
     * A function to get the maximum or the greatest number of array.
     * @param threeDArray An input 3D double array
     * @return max A maximum or the greatest number of the array.
     */
    public static int max(int[][][] threeDArray) {
        int max = threeDArray[0][0][0];
        for (int i = 0; i < threeDArray[0].length; i++) {
            for (int j = 0; j < threeDArray[0][0].length; j++) {
                for (int[][] ints : threeDArray) {
                    if (max < ints[i][j]) max = ints[i][j];
                }
            }
        }
        return max;
    }
    //</editor-fold>

    //<editor-fold desc="MIN">

    /**
     * A function to get the minimum or the smallest number of Arrays object.
     * @param array Arrays object
     * @return min A minimum or the smallest number of the Arrays object
     */
    public static double min(Arrays array) {
        String type = array.type;
        int dimension = array.dimension;

        switch (type.toLowerCase()) {
            case "double" -> {
                switch (dimension) {
                    case 1 -> {
                        double min = array.doubleVector[0];
                        for (int i = 0; i < array.shape[1]; i++) {
                            if (min > array.doubleVector[i]) min = array.doubleVector[i];
                        }
                        return min;
                    }

                    case 2 -> {
                        double min = array.doubleArray[0][0];
                        for (int i = 0; i < array.shape[0]; i++) {
                            for (int j = 0; j < array.shape[1]; j++) {
                                if (min > array.doubleArray[i][j]) min = array.doubleArray[i][j];
                            }
                        }
                        return min;
                    }

                    case 3 -> {
                        double min = array.doubleThreeDArray[0][0][0];
                        for (int i = 0; i < array.shape[0]; i++) {
                            for (int j = 0; j < array.shape[1]; j++) {
                                for (int k = 0; k < array.shape[2]; k++) {
                                    if (min > array.doubleThreeDArray[k][i][j]) min = array.doubleThreeDArray[k][i][j];
                                }
                            }
                        }
                        return min;
                    }

                    default -> {
                        return 0;
                    }
                }
            }

            case "int" -> {
                switch (dimension) {
                    case 1 -> {
                        int min = array.intVector[0];
                        for (int i = 0; i < array.shape[1]; i++) {
                            if (min > array.intVector[i]) min = array.intVector[i];
                        }
                        return min;
                    }

                    case 2 -> {
                        int min = array.intArray[0][0];
                        for (int i = 0; i < array.shape[0]; i++) {
                            for (int j = 0; j < array.shape[1]; j++) {
                                if (min > array.intArray[i][j]) min = array.intArray[i][j];
                            }
                        }
                        return min;
                    }

                    case 3 -> {
                        int min = array.intThreeDArray[0][0][0];
                        for (int i = 0; i < array.shape[0]; i++) {
                            for (int j = 0; j < array.shape[1]; j++) {
                                for (int k = 0; k < array.shape[2]; k++) {
                                    if (min > array.intThreeDArray[k][i][j]) min = array.intThreeDArray[k][i][j];
                                }
                            }
                        }
                        return min;
                    }

                    default -> {
                        return 0;
                    }
                }
            }

            default -> {
                return 0;
            }
        }
    }

    /**
     * A function to get the minimum or the smallest number of array.
     * @return min A minimum or the smallest number of the array.
     */
    public double minDouble() {
        if (this.dimension == 1) { // Vector
            double min = this.doubleVector[0];
            for (int i = 0; i < this.length; i++) {
                if (min > this.doubleVector[i]) min = this.doubleVector[i];
            }
            return min;
        } else if (this.dimension == 2) { // 2D Array
            double min = this.doubleArray[0][0];
            for (int i = 0; i < this.shape[0]; i++) {
                for (int j = 0; j < this.shape[1]; j++) {
                    if (min > this.doubleArray[i][j]) min = this.doubleArray[i][j];
                }
            }
            return min;
        } else {
            double min = this.doubleThreeDArray[0][0][0];
            for (int i = 0; i < this.shape[0]; i++) {
                for (int j = 0; j < this.shape[1]; j++) {
                    for (int k = 0; k < this.shape[2]; k++) {
                        if (min > this.doubleThreeDArray[k][i][j]) min = this.doubleThreeDArray[k][i][j];
                    }
                }
            }
            return min;
        }
    }

    /**
     * A function to get the minimum or the smallest number of array.
     * @return min A minimum or the smallest number of the array.
     */
    public int minInt() {
        if (this.dimension == 1) { // Vector
            int min = this.intVector[0];
            for (int i = 0; i < this.length; i++) {
                if (min > this.intVector[i]) min = this.intVector[i];
            }
            return min;
        } else if (this.dimension == 2) { // 2D Array
            int min = this.intArray[0][0];
            for (int i = 0; i < this.shape[0]; i++) {
                for (int j = 0; j < this.shape[1]; j++) {
                    if (min > this.intArray[i][j]) min = this.intArray[i][j];
                }
            }
            return min;
        } else {
            int min = this.intThreeDArray[0][0][0];
            for (int i = 0; i < this.shape[0]; i++) {
                for (int j = 0; j < this.shape[1]; j++) {
                    for (int k = 0; k < this.shape[2]; k++) {
                        if (min > this.intThreeDArray[k][i][j]) min = this.intThreeDArray[k][i][j];
                    }
                }
            }
            return min;
        }
    }

    /**
     * A function to get the minimum or the smallest number of array.
     * @param vector An input 1D double array
     * @return min A minimum or the smallest number of the array.
     */
    public static double min(double[] vector) {
        double min = vector[0];
        for (double v : vector) {
            if (min > v) min = v;
        }
        return min;
    }

    /**
     * A function to get the minimum or the smallest number of array.
     * @param vector An input 1D double array
     * @return min A minimum or the smallest number of the array.
     */
    public static int min(int[] vector) {
        int min = vector[0];
        for (int j : vector) {
            if (min > j) min = j;
        }
        return min;
    }

    /**
     *  A function to get the minimum or the smallest number of array.
     * @param vector An input 1D double array
     * @param left Left index of the array
     * @param right Right index of the array
     * @return A minimum or the smallest number of the array
     */
    public static double min(double[] vector, int left, int right) {
        if (right - left == 1) return vector[left];
        int mid = (left + right) / 2;
        double u = min(vector, left, mid);
        double v = min(vector,mid, right);
        return Math.min(u, v);
    }

    /**
     *  A function to get the minimum or the smallest number of array.
     * @param vector An input 1D int array
     * @param left Left index of the array
     * @param right Right index of the array
     * @return A minimum or the smallest number of the array
     */
    public static int min(int[] vector, int left, int right) {
        if (right - left == 1) return vector[left];
        int mid = (left + right) / 2;
        int u = min(vector, left, mid);
        int v = min(vector,mid, right);
        return Math.min(u, v);
    }

    /**
     * A function to get the minimum or the smallest number of array.
     * @param array An input 2D double array
     * @return min A minimum or the smallest number of the array.
     */
    public static double min(double[][] array) {
        double min = array[0][0];
        for (double[] doubles : array) {
            for (int j = 0; j < array[0].length; j++) {
                if (min > doubles[j]) min = doubles[j];
            }
        }
        return min;
    }

    /**
     * A function to get the minimum or the smallest number of array.
     * @param array An input 2D double array
     * @return min A minimum or the smallest number of the array.
     */
    public static int min(int[][] array) {
        int min = array[0][0];
        for (int[] ints : array) {
            for (int j = 0; j < array[0].length; j++) {
                if (min > ints[j]) min = ints[j];
            }
        }
        return min;
    }

    /**
     * A function to get the minimum or the smallest number of array.
     * @param threeDArray An input 3D double array
     * @return min A minimum or the smallest number of the array.
     */
    public static double min(double[][][] threeDArray) {
        double min = threeDArray[0][0][0];
        for (int i = 0; i < threeDArray[0].length; i++) {
            for (int j = 0; j < threeDArray[0][0].length; j++) {
                for (double[][] doubles : threeDArray) {
                    if (min > doubles[i][j]) min = doubles[i][j];
                }
            }
        }
        return min;
    }

    /**
     * A function to get the minimum or the smallest number of array.
     * @param threeDArray An input 3D double array
     * @return min A minimum or the smallest number of the array.
     */
    public static int min(int[][][] threeDArray) {
        int min = threeDArray[0][0][0];
        for (int i = 0; i < threeDArray[0].length; i++) {
            for (int j = 0; j < threeDArray[0][0].length; j++) {
                for (int[][] ints : threeDArray) {
                    if (min > ints[i][j]) min = ints[i][j];
                }
            }
        }
        return min;
    }
    //</editor-fold>

    //</editor-fold>


    //<editor-fold desc="SUM">

    /**
     * Function to calculate the sum of 1D double array
     * @param vector 1D double array
     * @return the sum
     */
    public static double sum(double[] vector) {
        double sum = 0;
        for (double v : vector) {
            sum = sum + v;
        }
        return sum;
    }

    /**
     * Function to calculate the sum of 1D int array
     * @param vector 1D int array
     * @return the sum
     */
    public static int sum(int[] vector) {
        int sum = 0;
        for (int j : vector) {
            sum = sum + j;
        }
        return sum;
    }
    
    //</editor-fold>


    //<editor-fold desc="SORTING">

    /**
     * Sort Arrays object
     * @param array Arrays object
     */
    public static void selectionSort(Arrays array) {
        switch (array.type.toLowerCase()) {
            case "double" -> {
                switch (array.dimension) {
                    case 1 -> { // 1D double array
                        for (int i = 0; i < array.length-1; i++) {
                            // Find the minimum element in unsorted array
                            int minIdx = i;
                            for (int j = i+1; j < array.length; j++)
                                if (array.doubleVector[j] < array.doubleVector[minIdx]) minIdx = j;

                            // Swap the found minimum element with the first element
                            double temp = array.doubleVector[minIdx];
                            array.doubleVector[minIdx] = array.doubleVector[i];
                            array.doubleVector[i] = temp;
                        }
                    }

                    case 2 -> { // 2D double array
                        for (int i = 0; i < array.shape[0]; i++) {
                            for (int j = 0; j < array.shape[1]; j++) {
                                // Find min value, and swap with i, j
                                int minIdx1 = i;
                                int minIdx2 = j;
                                double minVal = array.doubleArray[i][j];
                                // Finish the row current row
                                for (int k = j+1; k < array.shape[1]; k++) {
                                    if (array.doubleArray[i][k] < minVal) {
                                        // minIdx1 = i;
                                        minIdx2 = k;
                                        minVal = array.doubleArray[i][k];
                                    }
                                }
                                // Evaluate remaining rows
                                for (int l = i+1; l < array.shape[0]; l++) {
                                    for (int k = 0; k < array.shape[1]; k++) {
                                        if (array.doubleArray[l][k] < minVal) {
                                            minIdx1 = l;
                                            minIdx2 = k;
                                            minVal = array.doubleArray[l][k];
                                        }
                                    }
                                }
                                // Swap. No aux needed, as minVal contains value of min
                                array.doubleArray[minIdx1][minIdx2] = array.doubleArray[i][j];
                                array.doubleArray[i][j] = minVal;
                            }
                        }
                    }
                }
            }

            case "int" -> {
                switch (array.dimension) {
                    case 1 -> { // 1D int array
                        for (int i = 0; i < array.length-1; i++) {
                            // Find the minimum element in unsorted array
                            int minIdx = i;
                            for (int j = i+1; j < array.length; j++)
                                if (array.intVector[j] < array.intVector[minIdx]) minIdx = j;

                            // Swap the found minimum element with the first element
                            int temp = array.intVector[minIdx];
                            array.intVector[minIdx] = array.intVector[i];
                            array.intVector[i] = temp;
                        }
                    }

                    case 2 -> { // 2D int array
                        for (int i = 0; i < array.shape[0]; i++) {
                            for (int j = 0; j < array.shape[1]; j++) {
                                // Find min value, and swap with i, j
                                int minIdx1 = i;
                                int minIdx2 = j;
                                int minVal = array.intArray[i][j];
                                // Finish the row current row
                                for (int k = j+1; k < array.shape[1]; k++) {
                                    if (array.intArray[i][k] < minVal) {
                                        // minIdx1 = i;
                                        minIdx2 = k;
                                        minVal = array.intArray[i][k];
                                    }
                                }
                                // Evaluate remaining rows
                                for (int l = i+1; l < array.shape[0]; l++) {
                                    for (int k = 0; k < array.shape[1]; k++) {
                                        if (array.intArray[l][k] < minVal) {
                                            minIdx1 = l;
                                            minIdx2 = k;
                                            minVal = array.intArray[l][k];
                                        }
                                    }
                                }
                                // Swap. No aux needed, as minVal contains value of min
                                array.intArray[minIdx1][minIdx2] = array.intArray[i][j];
                                array.intArray[i][j] = minVal;
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Sort 1D double array using selection method
     * @param vector unsorted 1D double array
     */
    public static void selectionSort(double[] vector) {
        for (int i = 0; i < vector.length-1; i++) {
            // Find the minimum element in unsorted array
            int minIdx = i;
            for (int j = i+1; j < vector.length; j++)
                if (vector[j] < vector[minIdx]) minIdx = j;

            // Swap the found minimum element with the first element
            double temp = vector[minIdx];
            vector[minIdx] = vector[i];
            vector[i] = temp;
        }
    }

    /**
     * Sort 1D double array using selection method
     */
    public void selectionSort() {
        if (this.type.equalsIgnoreCase("double")) {
            for (int i = 0; i < this.doubleVector.length-1; i++) {
                // Find the minimum element in unsorted array
                int minIdx = i;
                for (int j = i+1; j < doubleVector.length; j++)
                    if (this.doubleVector[j] < this.doubleVector[minIdx]) minIdx = j;

                // Swap the found minimum element with the first element
                double temp = this.doubleVector[minIdx];
                this.doubleVector[minIdx] = this.doubleVector[i];
                this.doubleVector[i] = temp;
            }
        } else if (this.type.equalsIgnoreCase("int")) {
            for (int i = 0; i < this.intVector.length-1; i++) {
                // Find the minimum element in unsorted array
                int minIdx = i;
                for (int j = i+1; j < intVector.length; j++)
                    if (this.intVector[j] < this.intVector[minIdx]) minIdx = j;

                // Swap the found minimum element with the first element
                int temp = this.intVector[minIdx];
                this.intVector[minIdx] = this.intVector[i];
                this.intVector[i] = temp;
            }
        }

    }

    /**
     * Sort 1D int array using selection method
     * @param vector unsorted 1D int array
     */
    public void selectionSort(int[] vector) {
        for (int i = 0; i < vector.length-1; i++) {
            // Find the minimum element in unsorted array
            int minIdx = i;
            for (int j = i+1; j < vector.length; j++)
                if (vector[j] < vector[minIdx]) minIdx = j;

            // Swap the found minimum element with the first element
            int temp = vector[minIdx];
            vector[minIdx] = vector[i];
            vector[i] = temp;
        }
    }

    /**
     * Function to swap element in 1D int array
     * @param vector 1D int array
     * @param i index
     * @param j index
     */
    static void swap(double[] vector, int i, int j) {
        double temp = vector[i];
        vector[i] = vector[j];
        vector[j] = temp;
    }

    /**
     * Function to swap element in 1D double array
     * @param vector 1D double array
     * @param i index
     * @param j index
     */
    static void swap(int[] vector, int i, int j) {
        int temp = vector[i];
        vector[i] = vector[j];
        vector[j] = temp;
    }

    /**
     * Function to partition 1D double array
     * @param vector 1D int array
     * @param low index
     * @param high index
     * @return index
     */
    static int partition(double[] vector, int low, int high) {

        // pivot
        double pivot = vector[high];

        // Index of smaller element and
        // indicates the right position
        // of pivot found so far
        int i = (low - 1);

        for(int j = low; j <= high - 1; j++) {

            // If current element is smaller
            // than the pivot
            if (vector[j] < pivot) {

                // Increment index of
                // smaller element
                i++;
                swap(vector, i, j);
            }
        }
        swap(vector, i + 1, high);
        return (i + 1);
    }

    /**
     * Function to partition 1D int array
     * @param vector 1D int array
     * @param low index
     * @param high index
     * @return index
     */
    static int partition(int[] vector, int low, int high) {

        // pivot
        int pivot = vector[high];

        // Index of smaller element and
        // indicates the right position
        // of pivot found so far
        int i = (low - 1);

        for(int j = low; j <= high - 1; j++) {

            // If current element is smaller
            // than the pivot
            if (vector[j] < pivot) {

                // Increment index of
                // smaller element
                i++;
                swap(vector, i, j);
            }
        }
        swap(vector, i + 1, high);
        return (i + 1);
    }

    /**
     * Sort 1D double array using quick method
     * @param vector unsorted 1D double array
     * @param low index
     * @param high index
     */
    static void quickSort(double[] vector, int low, int high) {
        if (low < high) {

            // pi is partitioning index, arr[p]
            // is now at right place
            int pi = partition(vector, low, high);

            // Separately sort elements before
            // partition and after partition
            quickSort(vector, low, pi - 1);
            quickSort(vector, pi + 1, high);
        }
    }

    /**
     * Sort 1D double array using quick method
     * @param vector unsorted 1D double array
     * @param low index
     * @param high index
     */
    static void quickSort(int[] vector, int low, int high) {
        if (low < high) {

            // pi is partitioning index, arr[p]
            // is now at right place
            int pi = partition(vector, low, high);

            // Separately sort elements before
            // partition and after partition
            quickSort(vector, low, pi - 1);
            quickSort(vector, pi + 1, high);
        }
    }
    //</editor-fold>


    //<editor-fold desc="SEARCHING">

    /**
     * Search element in array and return the index using sequential method
     * @param x Element to be search
     * @return index of x
     */
    public int seqSearch(double x) {
        if (this.dimension == 1) { // 1D double array
            int j = 0;
            while (j < this.length && x != this.doubleVector[j]) {
                j ++;
            }
            if (j < this.length) return j;
            else return -1;

        } else if (this.dimension == 2) { // 2D double array
            boolean found = false;
            for (int i = 0; i < this.shape[0]; i++) {
                int j = 0;
                while (j < this.shape[0] && !found) {
                    if (x == this.doubleArray[i][j]) {
                        return this.shape[1] * i + j;
                    } else {
                        j++;
                    }
                }
            }
            return -1;

        } else { // 3D double array
            boolean found = false;
            for (int k = 0; k < this.shape[2]; k++) {
                for (int i = 0; i < this.shape[0]; i++) {
                    int j = 0;
                    while (j < this.shape[1] && !found) {
                        if (x == this.doubleThreeDArray[k][i][j]) {
                            return (this.shape[0] * this.shape[1] * k) + (this.shape[1] * i) + j;
                        } else {
                            j++;
                        }
                    }
                }
            }
            return -1;

        }
    }

    /**
     * Search element in array and return the index using sequential method
     * @param x Element to be search
     * @return index of x
     */
    public int seqSearch(int x) {
        if (this.dimension == 1) { // 1D int array
            int j = 0;
            while (j < this.length && x != this.intVector[j]) {
                j ++;
            }
            if (j < this.length) return j;
            else return -1;

        } else if (this.dimension == 2) { // 2D int array
            boolean found = false;
            for (int i = 0; i < this.shape[0]; i++) {
                int j = 0;
                while (j < this.shape[0] && !found) {
                    if (x == this.intArray[i][j]) {
                        return this.shape[1] * i + j;
                    } else {
                        j++;
                    }
                }
            }
            return -1;

        } else { // 3D int array
            boolean found = false;
            for (int k = 0; k < this.shape[2]; k++) {
                for (int i = 0; i < this.shape[0]; i++) {
                    int j = 0;
                    while (j < this.shape[1] && !found) {
                        if (x == this.intThreeDArray[k][i][j]) {
                            return (this.shape[0] * this.shape[1] * k) + (this.shape[1] * i) + j;
                        } else {
                            j++;
                        }
                    }
                }
            }
            return -1;

        }
    }

    /**
     * Search element in array and return the index using binary method
     * @param x Element to be search
     * @return index of x
     */
    public int binSearch(double x) {
        if (this.dimension == 1) { // 1D double array
            int left = 0, right = this.length - 1;
            int j;
            while (left <= right) {
                j = (left + right) / 2;
                if (x == this.doubleVector[j]) return j;
                else if (x < this.doubleVector[j]) right = j - 1;
                else left = j + 1;
            }
            return -1;

        } else if (this.dimension == 2) { // 2D double array
            for (int i = 0; i < this.shape[0]; i++) {
                int left = 0, right = this.shape[1] - 1;
                int j;
                while (left <= right) {
                    j = (left + right) / 2;
                    if (x == this.doubleArray[i][j]) return this.shape[1] * i + j;
                    else if (x < this.doubleArray[i][j]) right = j - 1;
                    else left = j + 1;
                }
            }
            return -1;

        } else { // 3D double array
            for (int k = 0; k < this.shape[2]; k++) {
                for (int i = 0; i < this.shape[0]; i++) {
                    int left = 0, right = this.shape[1] - 1;
                    int j;
                    while (left <= right) {
                        j = (left + right) / 2;
                        if (x == this.doubleThreeDArray[k][i][j]) {
                            return (this.shape[0] * this.shape[1] * k) + (this.shape[1] * i) + j;
                        } else if (x < this.doubleThreeDArray[k][i][j]) {
                            right = j - 1;
                        } else {
                            left = j + 1;
                        }
                    }
                }
            }

        }
        return -1;
    }

    /**
     * Search element in array and return the index using binary method
     * @param x Element to be search
     * @return index of x
     */
    public int binSearch(int x) {
        if (this.dimension == 1) { // 1D int array
            int left = 0, right = this.length - 1;
            int j;
            while (left <= right) {
                j = (left + right) / 2;
                if (x == this.intVector[j]) return j;
                else if (x < this.intVector[j]) right = j - 1;
                else left = j + 1;
            }
            return -1;

        } else if (this.dimension == 2) { // 2D int array
            for (int i = 0; i < this.shape[0]; i++) {
                int left = 0, right = this.shape[1] - 1;
                int j;
                while (left <= right) {
                    j = (left + right) / 2;
                    if (x == this.intArray[i][j]) return this.shape[1] * i + j;
                    else if (x < this.intArray[i][j]) right = j - 1;
                    else left = j + 1;
                }
            }
            return -1;

        } else { // 3D int array
            for (int k = 0; k < this.shape[2]; k++) {
                for (int i = 0; i < this.shape[0]; i++) {
                    int left = 0, right = this.shape[1] - 1;
                    int j;
                    while (left <= right) {
                        j = (left + right) / 2;
                        if (x == this.intThreeDArray[k][i][j]) {
                            return (this.shape[0] * this.shape[1] * k) + (this.shape[1] * i) + j;
                        } else if (x < this.intThreeDArray[k][i][j]) {
                            right = j - 1;
                        } else {
                            left = j + 1;
                        }
                    }
                }
            }

        }
        return -1;
    }

    /**
     * Search element in array and return the index
     * @param x Element to be search
     * @return index of x
     */
    public int search(double x, String method) {
        method = method.toLowerCase();
        return switch (method) {
            case "sequential" -> seqSearch(x);
            case "binary" -> binSearch(x);
            default -> -1;
        };
    }

    /**
     * Search element in array and return the index
     * @param x Element to be search
     * @return index of x
     */
    public int search(int x, String method) {
        method = method.toLowerCase();
        return switch (method) {
            case "sequential" -> seqSearch(x);
            case "binary" -> binSearch(x);
            default -> -1;
        };
    }
    //</editor-fold>


    //<editor-fold desc="ROTATING">

    /**
     * Function to perform left rotate on 1D double array without given range
     * @param vector 1D double array
     * @return rotated 1D double array
     */
    public static double[] rotateLeft(double[] vector) {
        return rotateLeft(vector, 1);
    }

    /**
     * Function to perform left rotate on 1D double array with given range
     * @param vector 1D double array
     * @param n range
     * @return rotated 1D double array
     */
    public static double[] rotateLeft(double[] vector, int n) {
        int N = vector.length; // Panjang 1D array

        if (N < 1 || n == N) {
            return vector;
        }

        if (n > N) {
            n = n % N;
        }

        // Membuat array sementara berukuran n
        double[] temp = new double[n];

        // Menyalin n-elemen pertama ke array temp
        System.arraycopy(vector, 0, temp, 0, n);

        // Memindahkan elemen sisanya ke indeks nol ke N-n
        if (N - n >= 0) System.arraycopy(vector, n, vector, 0, N - n);

        // Menyalin array temp ke array asli
        System.arraycopy(temp, 0, vector, N - n, n);
        return vector;
    }

    /**
     * Function to perform left rotate on 1D int array without given range
     * @param vector 1D int array
     * @return rotated 1D int array
     */
    public static int[] rotateLeft(int[] vector) {
        return rotateLeft(vector, 1);
    }

    /**
     * Function to perform left rotate on 1D int array with given range
     * @param vector 1D int array
     * @param n range
     * @return rotated 1D int array
     */
    public static int[] rotateLeft(int[] vector, int n) {
        int N = vector.length; // Panjang 1D array

        if (N < 1 || n == N) {
            return vector;
        }

        if (n > N) {
            n = n % N;
        }

        // Membuat array sementara berukuran n
        int[] temp = new int[n];

        // Menyalin n-elemen pertama ke array temp
        System.arraycopy(vector, 0, temp, 0, n);

        // Memindahkan elemen sisanya ke indeks nol ke N-n
        if (N - n >= 0) System.arraycopy(vector, n, vector, 0, N - n);

        // Menyalin array temp ke array asli
        System.arraycopy(temp, 0, vector, N - n, n);
        return vector;
    }
    //</editor-fold>


    //<editor-fold desc="PRINTING">

    // Static method of objects
    /**
     * Print Arrays object
     * @param array object
     */
    public static void printVector(Arrays array) {
        switch (array.type.toLowerCase()) {
            case "double" -> {
                switch (array.dimension) {
                    case 1 -> { // 1D double array
                        System.out.print("[");
                        for (int i = 0; i < array.doubleVector.length; i++) {
                            if (i != array.doubleVector.length - 1) System.out.printf("%6.2f\t", array.doubleVector[i]);
                            else System.out.printf("%6.2f", array.doubleVector[i]);
                        }
                        System.out.print("]\n");
                    }

                    case 2 -> { // 2D double array
                        int m = array.shape[0];
                        int n = array.shape[1];
                        System.out.print("[");
                        for (int i = 0; i < m; i++) {
                            if (i == 0) System.out.print("[");
                            else System.out.print(" [");

                            for (int j = 0; j < n; j++) {
                                if (j != n - 1) System.out.printf("%6.2f\t", array.doubleArray[i][j]);
                                else System.out.printf("%6.2f", array.doubleArray[i][j]);

                            }
                            if (i != m - 1) System.out.print("],\n");
                            else System.out.print("]");
                        }
                        System.out.print("]\n");
                    }

                    case 3 -> {
                        int m = array.shape[0], n = array.shape[1], o = array.shape[2];
                        System.out.print("[");
                        for (int k = 0; k < o; k++){
                            if (k == 0) System.out.print("[");
                            else System.out.print(" [");

                            for (int i = 0; i < m; i++) {
                                if (i == 0) System.out.print("[");
                                else System.out.print("  [");

                                for (int j = 0; j < n; j++) {
                                    if (j != n - 1) System.out.printf("%6.2f\t", array.doubleThreeDArray[k][i][j]);
                                    else System.out.printf("%.2f", array.doubleThreeDArray[k][i][j]);
                                }
                                if (i != m - 1) System.out.print("],\n");
                                else System.out.print("]");

                            }
                            if (k != o - 1) System.out.print("],\n");
                            else System.out.print("]");

                        }
                        System.out.print("]\n");
                    }

                }
            }

            case "int" -> {
                switch (array.dimension) {
                    case 1 -> { // 1D int array
                        System.out.print("[");
                        for (int i = 0; i < array.length; i++) {
                            if (i != array.length - 1) System.out.printf("%6.2d\t", array.intVector[i]);
                            else System.out.printf("%6.2d", array.intVector[i]);
                        }
                        System.out.print("]\n");
                    }

                    case 2 -> { // 2D int array
                        int m = array.shape[0];
                        int n = array.shape[1];
                        System.out.print("[");
                        for (int i = 0; i < m; i++) {
                            if (i == 0) System.out.print("[");
                            else System.out.print(" [");

                            for (int j = 0; j < n; j++) {
                                if (j != n - 1) System.out.printf("%6.2d\t", array.intArray[i][j]);
                                else System.out.printf("%6.2d", array.intArray[i][j]);

                            }
                            if (i != m - 1) System.out.print("],\n");
                            else System.out.print("]");
                        }
                        System.out.print("]\n");
                    }

                    case 3 -> { // 3D int array
                        int m = array.shape[0], n = array.shape[1], o = array.shape[2];
                        System.out.print("[");
                        for (int k = 0; k < o; k++){
                            if (k == 0) System.out.print("[");
                            else System.out.print(" [");

                            for (int i = 0; i < m; i++) {
                                if (i == 0) System.out.print("[");
                                else System.out.print("  [");

                                for (int j = 0; j < n; j++) {
                                    if (j != n - 1) System.out.printf("%6.2d\t", array.intThreeDArray[k][i][j]);
                                    else System.out.printf("%.2d", array.intThreeDArray[k][i][j]);
                                }
                                if (i != m - 1) System.out.print("],\n");
                                else System.out.print("]");

                            }
                            if (k != o - 1) System.out.print("],\n");
                            else System.out.print("]");

                        }
                        System.out.print("]\n");
                    }
                }
            }
        }
    }

    // Static method of arrays
    /**
     * Print 1D double array
     * @param doubleVector 1D double array
     */
    public static void printVector(double[] doubleVector) {
        System.out.print("[");
        for (int i = 0; i < doubleVector.length; i++) {
            if (i != doubleVector.length - 1) System.out.printf("%6.2f\t", doubleVector[i]);
            else System.out.printf("%6.2f", doubleVector[i]);
        }
        System.out.print("]\n");
    }

    /**
     * Print 1D int array
     * @param intVector 1D int array
     */
    public static void printVector(int[] intVector) {
        System.out.print("[");
        for (int i = 0; i < intVector.length; i++) {
            if (i != intVector.length - 1) System.out.printf("%6.2d\t", intVector[i]);
            else System.out.printf("%6.2d", intVector[i]);
        }
        System.out.print("]\n");
    }

    /**
     * Print 2D double array
     * @param doubleArray 2D double array
     */
    public static void printVector(double[][] doubleArray) {
        int m = doubleArray.length;
        int n = doubleArray[0].length;
        System.out.print("[");
        for (int i = 0; i < m; i++) {
            if (i == 0) System.out.print("[");
            else System.out.print(" [");

            for (int j = 0; j < n; j++) {
                if (j != n - 1) System.out.printf("%6.2f\t", doubleArray[i][j]);
                else System.out.printf("%6.2f", doubleArray[i][j]);

            }
            if (i != m - 1) System.out.print("],\n");
            else System.out.print("]");
        }
        System.out.print("]\n");
    }

    /**
     * Print 2D int array
     * @param intArray 2D int array
     */
    public static void printVector(int[][] intArray) {
        int m = intArray.length;
        int n = intArray[0].length;
        System.out.print("[");
        for (int i = 0; i < m; i++) {
            if (i == 0) System.out.print("[");
            else System.out.print(" [");

            for (int j = 0; j < n; j++) {
                if (j != n - 1) System.out.printf("%6.2d\t", intArray[i][j]);
                else System.out.printf("%6.2d", intArray[i][j]);

            }
            if (i != m - 1) System.out.print("],\n");
            else System.out.print("]");
        }
        System.out.print("]\n");
    }

    /**
     * Print 3D double array
     * @param doubleThreeDArray 3d double array
     */
    public static void printVector(double[][][] doubleThreeDArray) {
        int m = doubleThreeDArray[0].length;
        int n = doubleThreeDArray[0][0].length;
        int o = doubleThreeDArray.length;

        System.out.print("[");
        for (int k = 0; k < o; k++){
            if (k == 0) System.out.print("[");
            else System.out.print(" [");

            for (int i = 0; i < m; i++) {
                if (i == 0) System.out.print("[");
                else System.out.print("  [");

                for (int j = 0; j < n; j++) {
                    if (j != n - 1) System.out.printf("%6.2f\t", doubleThreeDArray[k][i][j]);
                    else System.out.printf("%.2f", doubleThreeDArray[k][i][j]);
                }
                if (i != m - 1) System.out.print("],\n");
                else System.out.print("]");

            }
            if (k != o - 1) System.out.print("],\n");
            else System.out.print("]");

        }
        System.out.print("]\n");
    }

    /**
     * Print 3D int array
     * @param intThreeDArray 3d int array
     */
    public static void printVector(int[][][] intThreeDArray) {
        int m = intThreeDArray[0].length;
        int n = intThreeDArray[0][0].length;
        int o = intThreeDArray.length;

        System.out.print("[");
        for (int k = 0; k < o; k++){
            if (k == 0) System.out.print("[");
            else System.out.print(" [");

            for (int i = 0; i < m; i++) {
                if (i == 0) System.out.print("[");
                else System.out.print("  [");

                for (int j = 0; j < n; j++) {
                    if (j != n - 1) System.out.printf("%6.2d\t", intThreeDArray[k][i][j]);
                    else System.out.printf("%.2d", intThreeDArray[k][i][j]);
                }
                if (i != m - 1) System.out.print("],\n");
                else System.out.print("]");

            }
            if (k != o - 1) System.out.print("],\n");
            else System.out.print("]");

        }
        System.out.print("]\n");
    }

    // Nonstatic method without parameters
    /**
     * Print 1D array
     */
    public void printVector() {
        switch (this.type.toLowerCase()) {
            case "double" -> {
                System.out.print("[");
                for (int i = 0; i < this.length; i++) {
                    if (i != this.length - 1) System.out.printf("%6.2f\t", this.doubleVector[i]);
                    else System.out.printf("%6.2f", this.doubleVector[i]);
                }
                System.out.print("]\n");
            }
            case "int" -> {
                System.out.print("[");
                for (int i = 0; i < this.length; i++) {
                    if (i != this.length - 1) System.out.printf("%6.2d\t", this.intVector[i]);
                    else System.out.printf("%6.2d", this.intVector[i]);
                }
                System.out.print("]\n");
            }
        }
    }

    /**
     * Print 2D array
     */
    public void printArray() {
        switch (this.type.toLowerCase()) {
            case "double" -> {
                int m = this.shape[0];
                int n = this.shape[1];
                System.out.print("[");
                for (int i = 0; i < m; i++) {
                    if (i == 0) System.out.print("[");
                    else System.out.print(" [");

                    for (int j = 0; j < n; j++) {
                        if (j != n - 1) System.out.printf("%6.2f\t", this.doubleArray[i][j]);
                        else System.out.printf("%6.2f", this.doubleArray[i][j]);

                    }
                    if (i != m - 1) System.out.print("],\n");
                    else System.out.print("]");
                }
                System.out.print("]\n");

            } case "int" -> {
                int m = this.shape[0];
                int n = this.shape[1];
                System.out.print("[");
                for (int i = 0; i < m; i++) {
                    if (i == 0) System.out.print("[");
                    else System.out.print(" [");

                    for (int j = 0; j < n; j++) {
                        if (j != n - 1) System.out.printf("%6.2d\t", this.intArray[i][j]);
                        else System.out.printf("%6.2d", this.intArray[i][j]);

                    }
                    if (i != m - 1) System.out.print("],\n");
                    else System.out.print("]");
                }
                System.out.print("]\n");
            }
        }
    }

    /**
     * Print 3D array
     */
    public void printThreeDArray() {
        switch (this.type.toLowerCase()) {
            case "double" -> {
                int m = this.shape[0], n = this.shape[1], o = this.shape[2];
                System.out.print("[");
                for (int k = 0; k < o; k++){
                    if (k == 0) System.out.print("[");
                    else System.out.print(" [");

                    for (int i = 0; i < m; i++) {
                        if (i == 0) System.out.print("[");
                        else System.out.print("  [");

                        for (int j = 0; j < n; j++) {
                            if (j != n - 1) System.out.printf("%6.2f\t", this.doubleThreeDArray[k][i][j]);
                            else System.out.printf("%.2f", this.doubleThreeDArray[k][i][j]);
                        }
                        if (i != m - 1) System.out.print("],\n");
                        else System.out.print("]");

                    }
                    if (k != o - 1) System.out.print("],\n");
                    else System.out.print("]");

                }
                System.out.print("]\n");
            }

            case "int" -> {
                int m = this.shape[0], n = this.shape[1], o = this.shape[2];
                System.out.print("[");
                for (int k = 0; k < o; k++){
                    if (k == 0) System.out.print("[");
                    else System.out.print(" [");

                    for (int i = 0; i < m; i++) {
                        if (i == 0) System.out.print("[");
                        else System.out.print("  [");

                        for (int j = 0; j < n; j++) {
                            if (j != n - 1) System.out.printf("%6.2d\t", this.intThreeDArray[k][i][j]);
                            else System.out.printf("%.2d", this.intThreeDArray[k][i][j]);
                        }
                        if (i != m - 1) System.out.print("],\n");
                        else System.out.print("]");

                    }
                    if (k != o - 1) System.out.print("],\n");
                    else System.out.print("]");

                }
                System.out.print("]\n");
            }
        }


    }

    /**
     * Print the array
     */
    public void print() {
        if (this.dimension == 1) printVector();
        else if (this.dimension == 2) printArray();
        else printThreeDArray();
    }
    //</editor-fold>

}

