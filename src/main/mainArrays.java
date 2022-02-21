package com.example.main;
import com.example.arrays.Arrays;
import com.example.arrays.LinearAlgebra;


public class Main {
    public static void main(String []args) {
        // 1D DOUBLE array
        Arrays myVector = new Arrays(new double[]{4, 7, 6});
        double x1 = 7, x2 = 5;
        int n1 = 4;
        // myVector.print();
        System.out.println("-- Unsorted 1D double array:");
        Arrays.printVector(myVector);
        Arrays.selectionSort(myVector);
        System.out.println("-- Sorted 1D double array:");
        Arrays.printVector(myVector);
        System.out.printf("-- Left rotate %d times:\n", n1);
        Arrays.printVector(Arrays.rotateLeft(myVector.doubleVector, n1));
        System.out.printf("Array type: %s\n", myVector.type);
        System.out.printf("Array dim: %d\n", myVector.dimension);
        // System.out.printf("Max: %.2f\n", myVector.maxDouble());
        // System.out.printf("Max: %.2f\n", Arrays.max(myVector.doubleVector));
        System.out.printf("Max: %.2f\n", Arrays.max(myVector));
        // System.out.printf("Min: %.2f\n", myVector.minDouble());
        // System.out.printf("Min: %.2f\n", Arrays.min(myVector.doubleVector));
        System.out.printf("Min: %.2f\n", Arrays.min(myVector));
        System.out.println("-- Sequential search:");
        System.out.printf("%.2f index: %d\n", x1, myVector.search(x1, "sequential"));
        System.out.printf("%.2f index: %d\n", x2, myVector.search(x2, "sequential"));
        System.out.println("-- Binary search:");
        System.out.printf("%.2f index: %d\n", x1, myVector.search(x1, "binary"));
        System.out.printf("%.2f index: %d\n", x2, myVector.search(x2, "binary"));

        // 2D DOUBLE array
        System.out.println();
        Arrays myArray = new Arrays(new double[][]{{2, 0, 0}, {3, 2, 0}, {1, 2, 3}});
        double x3 = 3, x4 = 10;
        // myArray.print();
        System.out.println("-- Unsorted 2D double array:");
        Arrays.printVector(myArray);
        Arrays.selectionSort(myArray);
        System.out.println("-- Sorted 1D double array:");
        Arrays.printVector(myArray);
        System.out.printf("Array type: %s\n", myArray.type);
        System.out.printf("Array dim: %d\n", myArray.dimension);
        // System.out.printf("Max: %.2f\n", myArray.maxDouble());
        // System.out.printf("Max: %.2f\n", Arrays.max(myArray.doubleArray));
        System.out.printf("Max: %.2f\n", Arrays.max(myArray));
        // System.out.printf("Min: %.2f\n", myArray.minDouble());
        // System.out.printf("Min: %.2f\n", Arrays.min(myArray.doubleArray));
        System.out.printf("Min: %.2f\n", Arrays.min(myArray));
        System.out.println("-- Sequential search:");
        System.out.printf("%.2f index: %d\n", x3, myArray.search(x3, "sequential"));
        System.out.printf("%.2f index: %d\n", x4, myArray.search(x4, "sequential"));
        System.out.println("-- Binary search:");
        System.out.printf("%.2f index: %d\n", x3, myArray.search(x3, "binary"));
        System.out.printf("%.2f index: %d\n", x3, myArray.search(x4, "binary"));

        // 3D DOUBLE array
        System.out.println();
        Arrays myThreeDArray = new Arrays(new double[][][]
                {{{1, 2, 3},{4, 5, 6}}, {{7, 8, 9}, {10, 11, 12}},
                 {{13, 14, 15}, {16, 17, 18}}, {{19, 20, 21}, {22, 23, 24}}});
        double x5 = 5, x6 = 21;
        // myThreeDArray.print();
        Arrays.printVector(myThreeDArray);
        System.out.printf("Array type: %s\n", myThreeDArray.type);
        System.out.printf("Array dim: %d\n", myThreeDArray.dimension);
        // System.out.printf("Max: %.2f\n", myThreeDArray.maxDouble());
        // System.out.printf("Max: %.2f\n", Arrays.max(myThreeDArray.doubleThreeDArray));
        System.out.printf("Max: %.2f\n", Arrays.max(myThreeDArray));
        // System.out.printf("Min: %.2f\n", myThreeDArray.minDouble());
        // System.out.printf("Min: %.2f\n", Arrays.min(myThreeDArray.doubleThreeDArray));
        System.out.printf("Min: %.2f\n", Arrays.min(myThreeDArray));
        System.out.println("-- Sequential search:");
        System.out.printf("%.2f index: %d\n", x5, myThreeDArray.search(x5, "sequential"));
        System.out.printf("%.2f index: %d\n", x6, myThreeDArray.search(x6, "sequential"));
        System.out.println("-- Binary search:");
        System.out.printf("%.2f index: %d\n", x5, myThreeDArray.search(x5, "binary"));
        System.out.printf("%.2f index: %d\n", x6, myThreeDArray.search(x6, "binary"));

        System.out.println("\n--- LINEAR EQUATION SOLVING ---");
        double[] result1 = LinearAlgebra.solveEquation(new double[][]{{2, 0, 0}, {3, 2, 0}, {1, 2, 3}},
                new double[]{4, 7, 6}); // [2, 0.5, 1]

        Arrays.printVector(result1);

    }
}
