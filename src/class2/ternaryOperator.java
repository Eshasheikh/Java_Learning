package class2;

public class ternaryOperator {
    // Method demonstrating the ternary operator
    public void demonstrateTernaryOperator(int a, int b) {
        int min = (a < b) ? a : b; // Ternary operator

        System.out.println("The smaller value between " + a + " and " + b + " is: " + min);
    }

    public static void main(String[] args) {
        ternaryOperator ternaryOp = new ternaryOperator();
        ternaryOp.demonstrateTernaryOperator(10, 20);
    }
}
