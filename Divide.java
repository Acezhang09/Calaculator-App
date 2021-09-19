package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Divide operation.
 */
public class Divide {
    // TODO - add your solution here.
    public int num1;
    public int num2;
    public Divide(int one, int two){
        num1 = one;
        num2 = two;
    }

    public String toString(){
        int answer = (num1)/num2;
        int remainder = num1 % num2;
        String finalAnswer = answer + " R:"+remainder;
        return finalAnswer;

    }

}
