package ua.opnu;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {

        System.out.println("Hello world!");

        System.out.println(icyHot(120, -1)); // true
        System.out.println(icyHot(-1, 120)); // true
        System.out.println(icyHot(2, 120));  // false

        System.out.println(in1020(12, 99)); // true

        System.out.println(hasTeen(13, 20, 10)); // true
        System.out.println(hasTeen(20, 19, 10)); // true
        System.out.println(hasTeen(20, 10, 13)); // true
        System.out.println(hasTeen(10, 22, 30)); // false

        System.out.println(posNeg(1, -1, false));   // true
        System.out.println(posNeg(-1, 1, false));   // true
        System.out.println(posNeg(-4, -5, true));   // true
        System.out.println(posNeg(-4, -5, false));  // false
        System.out.println(posNeg(1, 1, false));    // false
        System.out.println(posNeg(-1, -1, false));  // false
        System.out.println(posNeg(1, 1, true));    //false

        System.out.println(helloName("Bob"));   // Hello Bob!
        System.out.println(helloName("Alice")); // Hello Alice!
        System.out.println(helloName("X"));     // Hello X!

        System.out.println(lastTwo("coding"));
        System.out.println(lastTwo("cat"));
        System.out.println(lastTwo("ab"));

        System.out.println(middleTwo("string"));   // ri
        System.out.println(middleTwo("code"));     // od
        System.out.println(middleTwo("Practice")); // ct
    }

    // ======== Logical operations ========

    /**
     * Given two temperatures, return true if one is less than 0 and the other is greater than 100.
     * Example:
     * icyHot(120, -1) → true
     * icyHot(-1, 120) → true
     * icyHot(2, 120) → false
     */

// ======== Logical operations ========
    public static boolean icyHot(int temp1, int temp2) {
        if (temp1 < 0 && temp2 > 100) {
            return true;
        }
        if (temp1 > 100 && temp2 < 0) {
            return true;
        }
        return false;
    }
    /* метод icyHot в якому створила 3 умови . */
    /**
     * We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 3 int values, return true if 1
     * or more of them are teen.
     * Example:
     * hasTeen(13, 20, 10) → true
     * hasTeen(20, 19, 10) → true
     * hasTeen(20, 10, 13) → true
     */
    public static boolean hasTeen(int a, int b, int c) {
        if (a >= 13 && a <= 19) {
            return true;
        }
        if (b >= 13 && b <= 19) {
            return true;
        }
        if (c >= 13 && c <= 19) {
            return true;
        }
        return false;
    }
    // ======== Boolean expressions ========



    /**
     * The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.
     * We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
     * Example:
     * sleepIn(false, false) → true
     * sleepIn(true, false) → false
     * sleepIn(false, true) → true
     */
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        // TODO: write method body
        if (!weekday || vacation) {
            return true;
        }
        return false;
    }

    /**
     * We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling.
     * We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.
     * Example:
     * monkeyTrouble(true, true) → true
     * monkeyTrouble(false, false) → true
     * monkeyTrouble(true, false) → false
     */
    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        // TODO: write method body
        if (aSmile && bSmile) {
            return true;
        }
        if (!aSmile && !bSmile) {
            return true;
        }
        return false;
    }

    /**
     * Given 2 int values, return true if one is negative and one is positive. Except if the parameter "negative"
     * is true, then return true only if both are negative.
     * Example:
     * posNeg(1, -1, false) → true
     * posNeg(-1, 1, false) → true
     * posNeg(-4, -5, true) → true
     */
    public static boolean posNeg(int a, int b, boolean negative) {
        if (!negative) {
            if (a > 0 && b < 0) {
                return true;
            }
            if (a < 0 && b > 0) {
                return true;
            }
        }
        if (negative) {
            if (a < 0 && b < 0) {
                return true;
            }
        }
        return false;
    }


    // ======== Loops and Arrays ========

    /**
     * Given an array of ints, return the number of 9's in the array.
     * Example:
     * arrayCount9([1, 2, 9]) → 1
     * arrayCount9([1, 9, 9]) → 2
     * arrayCount9([1, 9, 9, 3, 9]) → 3
     */
    public static int arrayCount9(int[] nums) {
        // TODO: write method body
        int count = 0; //створила перемену count, яка буде рахувати дев'ятки

        for (int i = 0; i < nums.length; i++) { //тут цикл for буде перебирати всі цифри масива nums
            if (nums[i] == 9) { //перевіряемо чи равен елемент 9 і якщ так то виконуємо його
                count = count + 1;//тут присвоюємо нове значення до переменої  count
            }
        }

        return count;  //це значеення рахували у циклі
    }


    /**
     * Given an array of ints, return true if one of the first 4 elements in the array is a 9.
     * The array length may be less than 4.
     * Example:
     * arrayFront9([1, 2, 9, 3, 4]) → true
     * arrayFront9([1, 2, 3, 4, 9]) → false
     * arrayFront9([1, 2, 3, 4, 5]) → false
     */
    public static boolean arrayFront9(int[] nums) {
        // TODO: write method body
        int end = Math.min(nums.length, 4);//тут перевіряємо лише перші 4 цифри масиву
        for (int i = 0; i < end; i++) {
            if (nums[i] == 9) {
                return true; //перевіряемо чи є 9 і якщо є то правда
            }

        }


        return false;//а тут якщо немає 9 то не правда
    }

    /**
     * Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.
     * Example:
     * array123([1, 1, 2, 3, 1]) → true
     * array123([1, 1, 2, 4, 1]) → false
     * array123([1, 1, 2, 1, 2, 3]) → true
     */
    public static boolean array123(int[] nums) {
        // TODO: write method body
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == 1) { //перший елемент
                if (nums[i + 1] == 2) {//другий елемент
                    if (nums[i + 2] == 3) { //третій елемент
                        //тут перевіряємо кожне всі елементи
                        return true; //нашла последовательность 1,2,3
                    }
                }
            }
        }
        return false;//не правда якщо нічого не знайшлось
    }

    public static boolean in1020(int a, int b) {
        return (a >= 10 && a <= 20) || (b >= 10 && b <= 20);
    }
    // ======== Strings ========

    /**
     * Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
     * Example:
     * helloName("Bob") → "Hello Bob!"
     * helloName("Alice") → "Hello Alice!"
     * helloName("X") → "Hello X!"
     */
    public static String helloName(String name) {
        return "Hello " + name + "!";
    }

    /**
     * Given a string of any length, return a new string where the last 2 chars, if present, are swapped, so "coding"
     * yields "codign".
     * Example:
     * lastTwo("coding") → "codign"
     * lastTwo("cat") → "cta"
     * lastTwo("ab") → "ba"
     */
    public static String lastTwo(String str) {

        if (str.length() < 2) {
            return str;//якщо довжина рядка менше 2 символів повертаємо як було
        }
        String start = str.substring(0, str.length() - 2);//початок рядка без двох останніх символів
        return start //міняємо місцями останні два символи і додаємо до початку
                + str.charAt(str.length() - 1)  // останній символ
                + str.charAt(str.length() - 2); // передостанній символ
    }

    /**
     * Given a string of even length, return a string made of the middle two chars, so the string "string" yields "ri".
     * The string length will be at least 2.
     * middleTwo("string") → "ri"
     * middleTwo("code") → "od"
     * middleTwo("Practice") → "ct"
     */
    public static String middleTwo(String str) {

        int len = str.length();// довжина рядка
        int mid = len / 2;// середина
        char first = str.charAt(mid - 1);// беремо два символи по середині
        char second = str.charAt(mid);
        return "" + first + second; // склеюємо їх у рядок
    }
}



