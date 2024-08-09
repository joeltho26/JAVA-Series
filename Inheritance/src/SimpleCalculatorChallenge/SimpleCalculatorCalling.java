package SimpleCalculatorChallenge;

public class SimpleCalculatorCalling {
    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(10);
        calculator.setSecondNumber(5);

        calculator.add();
        calculator.subtract();
        calculator.divide();
        calculator.multiply();

        System.out.println(calculator.getFirstNumber());
        System.out.println(calculator.getSecondNumber());
    }

}
