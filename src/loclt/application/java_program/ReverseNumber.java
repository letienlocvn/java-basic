package loclt.application.java_program;

public class ReverseNumber {
    static int number = 123456;

    public static int reverseNumber(int number) {
        int reverse_number = 0;
        int reminder;
        while (number > 0) {
            reminder = number % 10;
            reverse_number = reverse_number * 10 + reminder;
            number = number / 10;
        }
        return reverse_number;
    }

    public static void main(String[] args) {
        System.out.println(reverseNumber(123456));
    }
}
