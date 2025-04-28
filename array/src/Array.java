public class Array {

    public static void intNumber() {
        int[] arrayInteri = new int[10];
        for (int i = 0; i < arrayInteri.length; i++) {
            arrayInteri[i] = i;
            System.out.print(arrayInteri[i] + " ");
        }
        System.out.println();
    }

    public static void evenNumber() {
        int[] arrayInteri = new int[13];
        for (int i = 0; i < arrayInteri.length; i++) {
            arrayInteri[i] = i;
            if (arrayInteri[i] % 2 == 0) {
                System.out.print(arrayInteri[i] + " ");
            }
        }
        System.out.println();
    }

    public static void oddNumber() {
        int[] arrayInteri = new int[8];
        int index = 0;
        for (int i = -3; i <= 11; i++) {
            if (i % 2 != 0) {
                arrayInteri[index] = i;
                System.out.print(arrayInteri[index] + " ");
                index++;
            }
        }
        System.out.println();
    }

    public static void stampaStringhe() {
        String[] stringhe = { "Porcospino", "Barbabietola da zucchero", "Ssd", "Bonsai" };
        for (String stringa : stringhe) {
            System.out.print(stringa + ", ");
        }
        System.out.println();
    }

    public static void checkNegative() {
        int[] numbers = { 3, 7, -2, 5, 0 };
        boolean check = false;
        System.out.println("Array :");

        for (int number : numbers) {
            System.out.println(number);

            if (number < 0) {
                check = true;
                break;
            }
        }
        for (int number : numbers) {
            System.out.println(number);
        }
        if (check) {
            System.out.println("L'array contiene numeri negativi.");
        } else {
            System.out.println("L'array non contiene numeri negativi.");
        }
    }

    public static void sum() {
        int[] numbers = { 1, 2, 3, 4, 5 };
        int sum = 0;
        System.out.println("Array :");

        for (int number : numbers) {
            System.out.println(number);
            sum += number;
        }
        System.out.println("La somma degli elementi è: " + sum);
    }

    public static void average() {
        int[] numbers = { 1, 2, 3, 4, 5 };
        int sum = 0;
        System.out.println("Array :");

        for (int number : numbers) {
            System.out.println(number);
            sum += number;
        }
        double average = (double) sum / numbers.length;
        System.out.println("La media degli elementi è: " + average);
    }

    public static void findNumber(int target) {
        int[] numbers = { 5, 8, 12, 3, 7 };
        boolean find = false;
        System.out.println("target : " + target);
        System.out.println("Array :");

        for (int number : numbers) {
            System.out.println(number);
            if (number == target) {
                find = true;
                break;
            }
        }
        if (find) {
            System.out.println("Il numero " + target + " è presente nell'array.");
        } else {
            System.out.println("Il numero " + target + " non è presente nell'array.");
        }
    }

    public static void max() {
        int[] numbers = { 3, 7, 2, 9, 5 };
        int max = numbers[0];
        System.out.println("Array _:");
        for (int number : numbers) {
            System.out.println(number);

            if (number > max) {
                max = number;
            }
        }
        System.out.println("Il massimo elemento è: " + max);
    }
}