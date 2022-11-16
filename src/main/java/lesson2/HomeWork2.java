package lesson2;

public class HomeWork2 {

  public static void checkSumm (int a, int b) {
     if ((a + b) >= 10) {
       if ((a + b) <= 20) {
           System.out.println("true");}
       else {
           System.out.println("false");
     }}
       else {
             System.out.println("false");
         }
}                    // задание 1
public static void checkZnak (int a) {
    if (a < 0) {
        System.out.println("Число отрицательное");
    } else {System.out.println("Число положительное");
}}                             // задание 2
public static boolean checkNegative (int h) {
    return h >= 0;
}                      // задание 3
public static void printString (String t, int n){
    for (int i = 0; i < n; i++) {
        System.out.println(t);
    }

    }                  // задание 4
public static boolean checkVisokos (int g) {
    if ((g % 4) == 0) {
        if (g >= 100) {
            if ((g % 100) == 0) {
                if ((g % 400) == 0) {
                    return true;
                } else {
                    return false;
                }


            } else {
                return true;
            }
        } else {
            return true;
        }
    } else {
        return false;
    }
}                       // задание 5*



    public static void main (String[] args) {
        //checkSumm (19, -8);
        //checkZnak(0);
        //System.out.println( checkNegative(-4));
        // printString("Hi? am test string!", 9);
        //System.out.println( checkVisokos(1600));

    }}

