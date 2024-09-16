package class2;

public class logical_operator {
    // Method demonstrating logical AND (&&) and logical OR (||)
    public void demonstrateLogicalOperators(boolean a, boolean b) {
        boolean andResult = a && b; // Logical AND
        boolean orResult = a || b;  // Logical OR

        System.out.println("Logical AND (a && b): " + andResult);
        System.out.println("Logical OR (a || b): " + orResult);
    }

    public static void main(String[] args) {
        logical_operator logicalOp = new logical_operator();
        logicalOp.demonstrateLogicalOperators(true, false);
    }
}
