public class Exercise_30 {
    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setLastNumber(4);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setLastNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());
    }
}

class SimpleCalculator {
    private double firstNumber;
    private double lastNumber;

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getLastNumber() {
        return lastNumber;
    }

    public void setLastNumber(double lastNumber) {
        this.lastNumber = lastNumber;
    }

    public double getAdditionResult() {
        return firstNumber + lastNumber;
    }

    public double getSubtractionResult() {
        return firstNumber - lastNumber;
    }

    public double getMultiplicationResult() {
        return firstNumber * lastNumber;
    }

    public double getDivisionResult() {
        if (lastNumber == 0) {
            return 0;
        }
        return firstNumber / lastNumber;
    }
}


