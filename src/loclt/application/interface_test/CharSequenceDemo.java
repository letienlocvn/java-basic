package loclt.application.interface_test;

public class CharSequenceDemo implements java.lang.CharSequence {
    private String s;

    public CharSequenceDemo(String s) {
        this.s = s;
    }

    public int fromEnd(int index) {
        return s.length() - 1 - index;
    }
    @Override
    public int length() {
        return s.length();
    }

    @Override
    public char charAt(int index) {
        if ((index < 0) || (index >= s.length())) {
            throw new StringIndexOutOfBoundsException(index);
        }
        return s.charAt(fromEnd(index));
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        if (start < 0) {
            throw new StringIndexOutOfBoundsException(start);
        }
        if (end > s.length()) {
            throw new StringIndexOutOfBoundsException(end);
        }
        if (start > end) {
            throw new StringIndexOutOfBoundsException(start - end);
        }
        StringBuilder sub = new StringBuilder(s.subSequence(fromEnd(end), fromEnd(start)));
        return sub.reverse();
    }

    public String toString() {
        StringBuilder s = new StringBuilder(this.s);
        return s.reverse().toString();
    }

    public static int random(int max) {
        return (int) Math.round(Math.random() * (max+1));
    }

    public static void main(String[] args) {
        CharSequenceDemo s =
                new CharSequenceDemo("Hello Anh Loc Dep Trai");

        //exercise charAt() and length()
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i));
        }

        System.out.println("");

        //exercise subSequence() and length();
        int start = random(s.length() - 1);
        int end = random(s.length() - 1 - start) + start;
        System.out.println(s.subSequence(start, end));

        //exercise toString();
        System.out.println(s);

    }
}
