package geekBraince.lesson1;

public class HomeWorkApp {
    public static void printThreeWords() {
        System.out.println("_Orange");
        System.out.println("_Banana");
        System.out.println("_Apple");
    }

    public static void checkSumSign(int a, int b) {
               if (a + b >= 0) {
            System.out.println("Сумма положительная");
        }
        if (a + b < 0) {
            System.out.println("Сумма отрицательная");
        }

    }

    public static void printColor(int value) {
            if (value <= 0) {
            System.out.println("Красный");
        }
            else if (value <=100)
        {
            System.out.println("Желтый");
        }
        else {
            System.out.println("Зеленый");
        }

    }

    public static void compareNumbers(int a, int b) {

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b"); // считаю что в задании неточность. При а > б выводится a >= b. Возможно стоит сделать варианты а>b и a=b ?
        }
    }

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign(2, -4);
        printColor(105);
        printColor(0);
        printColor(100);
        compareNumbers(4, 6);
    }
}