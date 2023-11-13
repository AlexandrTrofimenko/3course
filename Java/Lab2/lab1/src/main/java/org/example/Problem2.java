package org.example;

public class Problem2 {

    /**
     * Метод segregateEvenAndOddNumbers разделяет четные и нечетные числа в массиве array, т.у. возвращает массив,
     * в котором сперва записаны все четные числа массива array в порядке их следования, а затем все нечетные числа
     * массива array в порядке их следования.
     *
     * @param array массив положительных чисел
     * @return массив с разделенными четными и нечетными числами
     *
     * ПРИМЕР:
     * Вход: array = [2, 1, 5, 6, 8]
     * Выход: [2, 6, 8, 1, 5]
     */
    public static int[] segregateEvenAndOddNumbers(int[] array) {
        // TODO: implement this method
        int[] evenarray = new int[array.length];
        int[] unevenarray = new int[array.length];
        int unevencount = 0,evencount = 0;
        for (int i = 0; i < array.length;i++) {
            if (array[i] % 2 == 0) {
                evenarray[evencount] = array[i];
                evencount++;
            }
            else {
                unevenarray[unevencount] = array[i];
                unevencount++;
            }
        }
        for(int i = 0; i < array.length;i++) {
            array[i] = evenarray[i];
        }
        for(int i = 0; i < array.length - unevencount;i++) {
            array[i+unevencount] = unevenarray[i];
        }
        for(int element:array)
            System.out.printf("%d ",element);
        return array;
    }

}