package loclt.application.array;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        // declare an array of integer
        boolean[] anArray;
        anArray = new boolean[2];
        // initialize first element
        anArray[0] = true;
        // initialize second element
        anArray[1] = false;
        System.out.println(anArray[0] + " " + anArray[1]);

        /* Here is the multidimensional */
        String[][][] names = {
                { {"Mr. ", "Ms. "} ,  {"Mr. ", "Mrs. ", "Ms. "}},
                { {"Mr. ", "Mrs. ", "Ms. "} ,  {"Mr. ", "Mrs. ", "Ms. "}},
                { {"asdas", "Alo", "smitl "},  {"Mr. ", "John ", "Ms. "}}
        };

        //Copy array
        String[] copyFrom = {
                "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",
                "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",
                "Marocchino", "Ristretto" };

        String[] copyTo = new String[7];
        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
        for (String coffee : copyTo) {
            System.out.print(coffee + " ");
        }
    }
}
