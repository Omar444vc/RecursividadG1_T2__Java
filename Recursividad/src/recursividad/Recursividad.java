package recursividad;

/**
 *
 * @author omarv
 */
public class Recursividad {

    public static void main(String[] args) {

        System.out.println("Versión 02: recursividades");

        System.out.println("Factorial de 5: " + factorial(5));
        System.out.println("Suma de 5: " + suma(5));
        System.out.println("Fibonacci de 5: " + fibonacci(5));
    }

    
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    
    public static int suma(int n) {
        if (n == 0) {
            return 0;
        }
        return n + suma(n - 1);
    }

    
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1; 
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}