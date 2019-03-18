public class Calculator {
    int firstNumber;
    int secondNumber;

    public Calculator(int firstNumber, int secondNumber){
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public double add(){
        return firstNumber + secondNumber;
    }
    public double subtract(){
        return firstNumber - secondNumber;
    }

    public double multiply() {
        return firstNumber * secondNumber;
    }

    public double divide() {
        return firstNumber / secondNumber;
    }
}



//    Create a Calculator class. This should have functions for Add, Subtract, Multiply and Divide, each taking in two integers to perform the calculations on.