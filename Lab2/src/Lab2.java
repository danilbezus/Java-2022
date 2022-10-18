import java.util.Random;

public class Lab2 {
    public static void main(String[] args) {
        /*
        0302
        C5 = 2 -> C = A + B
        C7 = 1 -> byte
        C11 = 5 -> Обчислити суму найбільших елементів в
        рядках матриці з непарними номерами та
        найменших елементів в рядках матриці з парними номерами
        */

        int m,n; // Оскільки ми повинні додати матриці, то їх розміри одинакові [m,n]
        m = 5; n = 4;

        byte[][] A = new byte[m][n];
        byte[][] B = new byte[m][n];

        // Генеруємо матриці А та В та виводимо їх
        System.out.println("Матриця А:");
        generateAndPrintMatrix(A);
        System.out.println("Матриця  B:");
        generateAndPrintMatrix(B);

        byte[][] C = new byte[m][n];

        System.out.println("Матриця  C (C = A + B):");
        // Виконуємо додавання A+B та виводимо результат
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                C[i][j] += A[i][j] + B[i][j];
                System.out.format("%5d", C[i][j]);
            }
            System.out.println();
        }

            // Обчислюємо суму найбільших елементів в рядках матриці
            // з непарними номерами та найменших елементів
            // в рядках матриці з парними номерами та виводимо результат
        double SumMax = 0, SumMin = 0;
        for (int i = 0; i < m; i++) {
            if (i % 2 == 0) {
                byte max = Byte.MIN_VALUE;
                for (int j = 0; j < n; j++) {
                    if (max < C[i][j]) max = C[i][j];
                }
                SumMax += max;
            } else {
                byte min = Byte.MAX_VALUE;
                for (int j = 0; j < n; j++) {
                    if (min > C[i][j]) min = C[i][j];
                }
                SumMin += min;
            }
        }
        System.out.println("Сума найбільших значень:");
        System.out.println(SumMax);
        System.out.println("Сума найменших значень:");
        System.out.println(SumMin);

    }

    public static void generateAndPrintMatrix(byte[][] matrix){
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) { // matrix.length -> m
            for (int j = 0; j < matrix[0].length; j++) { // matrix[0].length -> n
                matrix[i][j] = (byte)(random.nextInt(10) * (random.nextBoolean() ? 1 : -1));
                System.out.format("%5d",matrix[i][j]);
            }
            System.out.println();
        }
    }
}