package ru.skypro;

public class Main {

    public static void main(String[] args) {
// Задача 1 ===========================================
        int[] payment = generateRandomArray();
        int allPayment = 0;
        for (int f = 0; f < payment.length; f++) {
            allPayment += payment[f];
        }
        System.out.println("Сумма трат за месяц составила " + allPayment + " рублей");
// Задача 2 ===========================================
        int min = payment[0], max = payment[0];
        System.out.print(payment[0] + " ");
        for (int f = 1; f < payment.length; f++) {
            System.out.print(payment[f] + " ");
            if (payment[f] > max) {
                max = payment[f];
            }
            if (payment[f] < min) {
                min = payment[f];
            }
        }
        System.out.println();
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей.");
        System.out.println("Максимальная сумма трат за день составила " + max + " рублей.");
// Задача 3 ===========================================
        int middleValue;
        double middleValueFloat;
        if (allPayment % payment.length == 0) {
            middleValue = (int) allPayment / payment.length;
            System.out.println("Средняя сумма трат за месяц составила " + middleValue + " рублей.");
        } else {
            middleValueFloat = (float) allPayment / payment.length;
            System.out.println("Средняя сумма трат за месяц составила " + middleValueFloat + " рублей.");
        }
        printRightOrder();
    }

    public static int[] generateRandomArray() {  // метод генерирующий массив со случайными числами
        java.util.Random random = new java.util.Random();
        int[] arr = new int[9];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr; // ==========================================================================
    }

    // Задача 4  ===============================================================
    public static void printRightOrder() {
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}
