package org.example;

public class Main {
    public static void main(String[] args) {
        int[] array = {4,5,15,25,12,52,11,23,42,11};
        System.out.print("все числа массива - ");

        for(int num : array){
            System.out.print(num + " ");
        }
         System.out.println();

        int sumEven = 0;
        int countOdd = 0;

        for(int num : array) {
            if (num % 2 == 0) {
                sumEven += num;
            }
            else {
                countOdd++;
            }
        }


        System.out.println("сумма всех четных элементов массива -" +" "+  sumEven );
        System.out.println("количество всех четных элементов массива -" +" "+ countOdd);
    }
}