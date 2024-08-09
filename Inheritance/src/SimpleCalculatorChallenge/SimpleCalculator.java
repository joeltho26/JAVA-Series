package SimpleCalculatorChallenge;

public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber() {
        return firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public void add() {
        System.out.println("Addition of two numbers " + this.firstNumber +
                " & " + this.secondNumber + " is " + (this.firstNumber + this.secondNumber));
    }

    public void subtract() {
        System.out.println("Subtraction of two numbers " + this.firstNumber +
                " & " + this.secondNumber + " is " + (this.firstNumber - this.secondNumber));
    }

    public void divide() {
        if (this.secondNumber == 0) {
            System.out.println(0);
        } else {
            System.out.println("Division of two numbers " + this.firstNumber +
                    " & " + this.secondNumber + " is " + (this.firstNumber / this.secondNumber));
        }
    }

    public void multiply() {
        System.out.println("Multiplication of two numbers " + this.firstNumber +
                " & " + this.secondNumber + " is " + (this.firstNumber * this.secondNumber));
    }
}
