import java.util.ArrayList;

public class Assignment1 {
    // Returns the maximum value in an ArrayList, ArrayList builtin functions to find the max are ok to use here
    private int findMaxWithBuiltin(ArrayList arr){
        int retval = 0;
        return retval;
    }

    // Returns the maximum value in an ArrayList, do not use ArrayList builtin functions to find max
    private int findMaxWithoutBuiltin(ArrayList arr){
        int retval = 0;
        return retval;
    }

    // Returns the maximum value in an ArrayList, ArrayList builtin functions to find the max are ok to use here
    private int findThirdMaxWithBuiltin(ArrayList arr){
        int retval = 0;
        return retval;
    }

    // Returns the maximum value in an ArrayList, do not use ArrayList builtin functions to find the max here
    private int findThirdMaxWithoutBuiltin(ArrayList arr){
        int retval = 0;
        return retval;
    }

    private ArrayList<Integer> setupArrayList(int[] arr) {
        ArrayList<Integer> output = new ArrayList<Integer>();
        for (int a:
             arr) {
            output.add(a);
        }
        return output;
    }

    public static void main(String args[]){
        Assignment1 assignment1 = new Assignment1();
        int[] testArray = {1, 2, 3, 4};
        ArrayList<Integer> testArrayList1 = assignment1.setupArrayList(testArray);

        System.out.println(assignment1.findMaxWithBuiltin(testArrayList1)); // should output 4
        System.out.println(assignment1.findMaxWithoutBuiltin(testArrayList1)); // should output 4
        System.out.println(assignment1.findThirdMaxWithBuiltin(testArrayList1)); // should output 2
        System.out.println(assignment1.findThirdMaxWithoutBuiltin(testArrayList1)); // should output 2
    }
}
