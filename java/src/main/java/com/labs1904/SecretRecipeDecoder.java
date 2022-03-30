package com.labs1904;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SecretRecipeDecoder {
    private static Map<String, String> ENCODING = new HashMap<String, String>() {
        {
            put("y", "a");
            put("h", "b");
            put("v", "c");
            put("x", "d");
            put("k", "e");
            put("p", "f");
            put("z", "g");
            put("s", "h");
            put("a", "i");
            put("b", "j");
            put("e", "k");
            put("w", "l");
            put("u", "m");
            put("q", "n");
            put("n", "o");
            put("l", "p");
            put("m", "q");
            put("f", "r");
            put("o", "s");
            put("i", "t");
            put("g", "u");
            put("j", "v");
            put("t", "w");
            put("d", "x");
            put("r", "y");
            put("c", "z");
            put("3", "0");
            put("8", "1");
            put("4", "2");
            put("0", "3");
            put("2", "4");
            put("7", "5");
            put("5", "6");
            put("9", "7");
            put("1", "8");
            put("6", "9");
        }
    };

    /**
     * Given a string named str, use the Caesar encoding above to return the decoded string.
     * @param str
     * @return
     */
    public static String decodeString(String str) {
        // TODO: implement me
        return "1 cup";
    }

    /**
     * Given an ingredient, decode the amount and description, and return a new Ingredient
     * @param line
     * @return
     */
    public static Ingredient decodeIngredient(String line) {
        // TODO: implement me
        return new Ingredient("1 cup", "butter");
    }

    /**
     * Given a string named str, use the Caesar encoding above to return the decoded string.
     * @param num
     * @return
     */
    public static int getNextBiggestNumber(int num) {
        // TODO: implement me

        int result =0;
        //int to string array
        String str=String.valueOf(num);//Now it will return string

        char[] ch = str.toCharArray();

        int n = ch.length;

        int i;

        for (i = n - 1; i > 0; i--)
        {
            if (ch[i] > ch[i - 1]) {
                break;
            }
        }

        if (i == 0)
        {
        }
        else
        {
            int x = ch[i - 1], min = i;

            for (int j = i + 1; j < n; j++)
            {
                if (ch[j] > x && ch[j] < ch[min])
                {
                    min = j;
                }
            }

            char temp = ch[i-1];
            ch[i-1] = ch[min];
            ch[min] = temp;

            Arrays.sort(ch, i, n);

            String string = String.valueOf(ch);


            int integer=Integer.parseInt(string);

            result = integer;
        }
        return result;
    }

    // Utility function to swap two digit
    static void swap(char ar[], int i, int j)
    {
        char temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
    }

    // Given a number as a char array number[],
    // this function finds the next greater number.
    // It modifies the same array to store the result
    static int findNext(char ar[], int n)
    {
        int i;

        // I) Start from the right most digit
        // and find the first digit that is smaller
        // than the digit next to it.
        for (i = n - 1; i > 0; i--)
        {
            if (ar[i] > ar[i - 1]) {
                break;
            }
        }

        // If no such digit is found, then all
        // digits are in descending order means
        // there cannot be a greater number with
        // same set of digits
        if (i == 0)
        {
            System.out.println("Not possible");
        }
        else
        {
            int x = ar[i - 1], min = i;

            // II) Find the smallest digit on right
            // side of (i-1)'th digit that is greater
            // than number[i-1]
            for (int j = i + 1; j < n; j++)
            {
                if (ar[j] > x && ar[j] < ar[min])
                {
                    min = j;
                }
            }

            // III) Swap the above found smallest
            // digit with number[i-1]
            swap(ar, i - 1, min);

            // IV) Sort the digits after (i-1)
            // in ascending order
            Arrays.sort(ar, i, n);
            System.out.print("NfindNext is ");
            for (i = 0; i < n; i++)
                System.out.print(ar[i]);
        }
        return 0;
    }

    public static void main(String[] args) {
        // TODO: implement me

        int test = 12;
        String str=String.valueOf(test);//Now it will return string
//        System.out.println("String is "+str);
        // Creating array of string length
        char[] ch = new char[str.length()];

        // Copy character by character into array
        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
        }
        /*
        System.out.println("char array is");
        // Printing content of array
        for (char c : ch) {
            System.out.println(c);
        }
         */
        int n = ch.length;
//        System.out.println(findNext(ch,n)); //DEBUG: CHECK IF newIngredient IS SHOWING
        System.out.println(getNextBiggestNumber(test)); //DEBUG: CHECK IF newIngredient IS SHOWING
    }
}
