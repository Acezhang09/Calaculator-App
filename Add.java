package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Add operation.
 */
public class Add {
    // TODO - add your solution here.
    public int num1;
    public int num2;
    public Add(int one, int two){
        num1 = one;
        num2 = two;
    }

    public String toString(){
        return String.valueOf(num1+num2);
    }
}
