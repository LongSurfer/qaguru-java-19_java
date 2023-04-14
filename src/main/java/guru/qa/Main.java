package guru.qa;

public class Main {
    public static void main(String[] args) {

        int a = 5;
        int b = 1;
        int m = Integer.MAX_VALUE;
        short s1 = Short.MAX_VALUE;
        short s2 = 2;
        float f = 2.5f;
        float maxFloat = Float.MAX_VALUE;
        float minFloat = Float.MIN_VALUE;
        double d = 3.14;

        System.out.println("Примеры с математическими операторами + комбинации типов данных:\n");
        System.out.println("result a + d = " + (a + d));
        System.out.println("result a * f = " + (a * f));
        System.out.println("result d - f = " + (d - f));
        System.out.println("result a % d = " + (a % d));
        System.out.println("result a / d = " + (a / d) + "\n");

        System.out.println("Примеры с логическими операторами:\n");
        System.out.println("'(d + f) > a' is " + ((d + f) > a));
        System.out.println("'(d + f) == (a - d)' is " + ((d + f) == (a - d)) + "\n");

        System.out.println("Примеры переполнения при вычислениях:\n");
        System.out.println("int sum = " + (m + b));
        System.out.println("short multiplication = " + (short) (s1 * s2));
        System.out.println("float subtraction = " + (maxFloat - minFloat));
    }
}