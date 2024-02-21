package lulamile.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LeftRotation {
    /*
     * Complete the 'rotLeft' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER d
     */

    public static List<Integer> rotLeft(List<Integer> a, int d) {
        // Write your code here
        for(int  i=0;i<d;i++){//Shifts
            int toMove = a.get(0);//Stores the first element of the array
            int j;
            for(j= 0; j < a.size()-1; j++){
                a.set(j,a.get(j+1));//Shift element of  array to the left by one
            }
            a.set(j,toMove);//First element of array will be added to the end
        }
        System.out.println(a);
        return a;
    }

    public static void main(String[] args) {
        List<Integer> result = LeftRotation.rotLeft(Arrays.asList(1,2,3,4,5), 4);
    }
}
