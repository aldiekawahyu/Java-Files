package arrays;

public class Arrays {
    public int dimension, length, numel;
    public Class type;
    public int[] shape;

    public double[] doubleVector; public double[][] doubleArray; public double[][][] doubleThreeDArray;
    public int[] intVector; public int[][] intArray; public int[][][] intThreeDArray;

    /**
     * Class constructor for 1D double array.
     * @param vector a java 1D double array
     */
    public Arrays(double[] vector) {
        this.doubleVector = vector;
        this.dimension = 1;
        this.length = vector.length;
        this.numel = vector.length;

        Class<? extends double[]> c = this.doubleVector.getClass();
        this.type =  c.getComponentType();
    }

    /**
     * Class constructor for 1D int array.
     * @param vector a java 1D int array
     */
    public Arrays(int[] vector) {
        this.intVector = vector;
        this.dimension = 1;
        this.length = vector.length;
        this.numel = vector.length;

        Class<? extends int[]> c = this.intVector.getClass();
        this.type =  c.getComponentType();
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
        this.type = c.getComponentType();
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
        this.type = c.getComponentType();
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
        this.type = c.getComponentType();
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
        this.type = c.getComponentType();
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

    // SORTING
    

    // SEARCHING
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

    // PRINTING
    /**
     * Print 1D array
     */
    public void printVector() {
        System.out.print("[");
        for (int i = 0; i < this.length; i++){
            if (i != this.length - 1) System.out.printf("%6.2f\t", this.doubleVector[i]);
            else System.out.printf("%6.2f", this.doubleVector[i]);
        }
        System.out.print("]\n");
    }

    /**
     * Print 2D array
     */
    public void printArray() {
        int m = this.shape[0]; int n = this.shape[1];
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
    }

    /**
     * Print 3D array
     */
    public void printThreeDArray() {
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

    /**
     * Print the array
     */
    public void print() {
        if (this.dimension == 1) printVector();
        else if (this.dimension == 2) printArray();
        else printThreeDArray();
    }

}
