package ec.edu.epn.git.calculator;

public class CalculatorExecute {
    public static void main(String[] args) {
        System.out.println("== CALCULATOR EXECUTE ==");

        Calculator c = new Calculator();
        int add = c.addition(4,7);
        System.out.println("c.addition(4,7)" + add);

        int sus = c.subtraction(7,1);
        System.out.println("c.subtraction(7,1)" + sus);
        /*
        * REVIEW
        * */
    }
}
