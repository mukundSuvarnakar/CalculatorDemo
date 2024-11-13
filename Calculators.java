public class Calculators {
    public int calculate(int a, int b) {
        // Initial method to add numbers
        return a + b;
    }

    public static void main(String[] args) {

        Calculators calc = new Calculators();
        System.out.println("Result: " + calc.calculate(5, 3));
    }
}
