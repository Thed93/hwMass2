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

        System.out.println("\n" +"Tusk 2" + "\n");
        int minDailySpend = 300000;
        int maxDailySpend = 0;
        for (int j : dailySpending) {
            if (minDailySpend > j) {
                minDailySpend = j;
            }
            if (maxDailySpend < j) {
                maxDailySpend = j;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minDailySpend + " рублей. Максимальная сумма трат за день составила " + maxDailySpend + " рублей.");

        System.out.println("\n" +"Tusk 3" + "\n");

        float total1 = 0;
        for (int j : dailySpending) {
            total1 = total1 + (float) j;
        }
        float averageSpending = total1 / 30;
        System.out.println("Средняя сумма трат за месяц составила " + averageSpending + " рублей.");

        System.out.println("\n" +"Tusk 4" + "\n");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >= 0; i--){
            System.out.print(reverseFullName[i]);
        }

    }
}
