import static org.junit.jupiter.api.DynamicTest.dynamicTest;

/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME: Stella
*****************************************************************************************************
*/

public class Main {



    public static void main(String[] args) {
        System.out.println(add(6,2,4,3));
        System.out.println(morningGreet("Stella"));
        System.out.println(afternoonGreet("Stella"));
        System.out.println(triple("Stella"));
        System.out.println(half(5));
        System.out.println(roundPos(5.4));
        System.out.println(roundNeg(-5.5));

    }

    // 1. add
    public static int add(int a, int b) {
        return a+b;

    }

 
    // 2. add
    public static int add(int a, int b, int c, int d) {
        int x = add(a, b);
        int y = add(c, d);
        return add(x, y);

    }

    // 3. morningGreeting
    public static String morningGreet(String a) {
        return "Good Morning, " + a + "!";

    }

    // 4. afternoonGreeting
    public static String afternoonGreet(String a) {
        return "Good Afternoon, " + a + "!";

    }


    // 5. triple
    public static String triple(String a) {
        return a + a + a;

    }


    // 6. half
    public static float half(float a) {
        return a/2;

    }

    // 7. roundPositiveValueToNearestInteger
    public static int roundPos(double a) {
        double y = a + 0.5;
        int x = (int) y;
        return x;

    }

    // 8. roundNegativeValueToNearestInteger
    public static int roundNeg(double a) {
        double y = a - 0.5;
        int x = (int) y;
        return x;

    }   

}
