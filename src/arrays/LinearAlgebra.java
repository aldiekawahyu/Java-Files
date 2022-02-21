package com.example.arrays;

public class LinearAlgebra extends Arrays {

    //<editor-fold desc="CONSTRUCTOR">

    /**
     * Class constructor for 1D double array.
     * @param vector a java 1D double array
     */
    public LinearAlgebra(double[] vector) {
        super(vector);
    }

    /**
     * Class constructor for 1D int array.
     * @param vector a java 1D int array
     */
    public LinearAlgebra(int[] vector) {
        super(vector);
    }

    /**
     * Class constructor for 2D double array.
     * @param array a java 2D double array
     */
    public LinearAlgebra (double[][] array) {
        super(array);
    }

    /**
     * Class constructor for 2D int array.
     * @param array a java 2D int array
     */
    public LinearAlgebra (int[][] array) {
        super(array);
    }

    /**
     * Class constructor for 3D double array.
     * @param threeDArray a java 3D double array
     */
    public LinearAlgebra (double[][][] threeDArray) {
        super(threeDArray);
    }

    /**
     * Class constructor for 3D int array.
     * @param threeDArray a java 3D int array
     */
    public LinearAlgebra (int[][][] threeDArray) {
        super(threeDArray);
    }
    //</editor-fold>

    //<editor-fold desc="MATRIX_OPERATIONS">

    /**
     * Function to multiply a 2D double array by a 2D double array
     * @param a 2D double array
     * @param b 2D double array
     * @return 2D double array
     */
    public static double[][] matmul(double[][] a, double[][] b) {
        int m1 = a.length; int n1 = a[0].length;
        int m2 = b.length; int n2 = b[0].length;

        if (n1 != m2) {
            throw new IllegalArgumentException("Matriks tidak dapat dikalikan. Ukuran matriks tidak sesuai!");
        }

        double[][] product = new double[m1][n2];

        for(int i = 0; i < m1; i++) {
            for (int j = 0; j < n2; j++) {
                for (int k = 0; k < m2; k++) {
                    product[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return product;
    }

    /**
     * Function to multiply a 2D int array by a 2D int array
     * @param a 2D int array
     * @param b 2D int array
     * @return 2D int array
     */
    public static int[][] matmul(int[][] a, int[][] b) {
        int m1 = a.length; int n1 = a[0].length;
        int m2 = b.length; int n2 = b[0].length;

        if (n1 != m2) {
            throw new IllegalArgumentException("Matriks tidak dapat dikalikan. Ukuran matriks tidak sesuai!");
        }

        int[][] product = new int[m1][n2];

        for(int i = 0; i < m1; i++) {
            for (int j = 0; j < n2; j++) {
                for (int k = 0; k < m2; k++) {
                    product[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return product;
    }

    /**
     * Function to multiply a 2D double array by a 1D double array
     * @param a 2D double array
     * @param b 1D double array
     * @return 1D double array
     */
    public static double[] matmul(double[][] a, double[] b) {
        int m = a.length; int n = a[0].length;

        if (b.length != n) {
            throw new IllegalArgumentException("Matriks tidak dapat dikalikan. Ukuran matriks tidak sesuai!");
        }

        double[] product = new double[m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                product[i] += a[i][j] * b[j];
            }
        }

        return product;
    }

    /**
     * Function to multiply a 2D double array by a 1D double array
     * @param a 2D double array
     * @param b 1D double array
     * @return 1D double array
     */
    public static int[] matmul(int[][] a, int[] b) {
        int m = a.length; int n = a[0].length;

        if (b.length != n) {
            throw new IllegalArgumentException("Matriks tidak dapat dikalikan. Ukuran matriks tidak sesuai!");
        }

        int[] product = new int[m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                product[i] += a[i][j] * b[j];
            }
        }

        return product;
    }

    //</editor-fold>
}
