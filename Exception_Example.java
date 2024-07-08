
package self_study;

class AllException {
    void show() {
        System.out.println("Program started");

        // Arithmetic Exception
        int a = 10, b = 0, c;
        try {
            c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero");
        }

        // Null Pointer Exception
        String r = null;
        try {
            System.out.println(r.toUpperCase());
        } catch (NullPointerException e) {
            System.out.println("Null can't be casted");
        }

        // Multiple catch block example
        String p = "Rajjo";
        try {
            // Array Index Out Of Bounds Exception
            int d[] = {10, 20, 30, 40};
            System.out.println(d[5]);

            // Number Format Exception
            int x = Integer.parseInt(p);
            System.out.println(r);
        } catch (NumberFormatException e) {
            System.out.println("String name " + p + " can't be converted to integer");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }/* catch (Exception e) {   having problem with this must resolve later
                 System.out.println("All type of exception");
        } */finally {
            System.out.println("Program ended");
        }
    }
}

public class Exception_Example {
    public static void main(String[] args) {
        AllException r = new AllException();
        r.show();
    }
}


