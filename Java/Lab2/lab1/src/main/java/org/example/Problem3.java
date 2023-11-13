package org.example;

import java.util.Arrays;

public class Problem3 {

    /**
     * Метод flattenMatrix преобразует матрицу размера nxm в одномерный массив, записывая сперва элементы первого столбца,
     * затем элементы второго столбца и т.д.
     *
     * @param matrix матрица размера nxm
     * @return одномерный массив
     *
     * ПРИМЕР:
     * Вход: matrix = [[1, 2, 3],
     *                 [4, 5, 6],
     *                 [7, 8, 9]]
     * Выход: [1, 4, 7, 2, 5, 8, 3, 6, 9]
     */
    public static int[] flattenMatrix(int[][] matrix) {
        // TODO: implement this method
        int row=0;
        for(int i = 0; i < matrix.length;i++){
            for(int j = 0;j < matrix[i].length;j++) {
                row++;
            }
        }
        int[] matrix1 = new int[row];
        for(int i = 0; i < matrix.length;i++)
        {
            for(int j = 0; j < matrix[i].length;j++)
            {
                matrix1[i*matrix.length+j]=matrix[i][j];
            }
        }
        for(int elemnt:matrix1)
            System.out.printf("%d ",elemnt);
        return null;
    }

}