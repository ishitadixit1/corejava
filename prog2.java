public class prog2 {

    public static void main(String[] args) {
        try {
            int result = divide(10, 0);
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: Division by zero!");
            e.printStackTrace();
        }
    }

    
    public static int divide(int num, int den) throws ArithmeticException {
        if (den == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return num / den;
    }
}
