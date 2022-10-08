package ru.skypro;

public class Main {
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println("\n" + "Tusk 1" + "\n");
        int[] dailySpending = generateRandomArray();
        int totalSpending = 0;
        for (int j : dailySpending) {
            totalSpending = totalSpending + j;
        }
        System.out.println("Сумма трат за месяц составила " + totalSpending + " рублей.");

    }
}
