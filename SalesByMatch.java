import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class SalesByMatch {
    /*
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */

    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here
        int matching =0;

        for(int i=0;i<n-1;i++){
            for(int y=1;y<n;y++) {
                if (Objects.equals(ar.get(i), ar.get(y)) && !ar.get(i).equals(0) && !ar.get(y).equals(0)&&i!=y) {
                    System.out.println(ar.get(i) + " + " + ar.get(y) + " -- [" + i + "--" + y + "]");
                    ar.set(i, 0);
                    ar.set(y, 0);
                    System.out.println(ar);
                    matching++;

                }
            }
        }
        System.out.println(matching);
        return matching;

    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(50 ,49, 38, 49, 78, 36, 25, 96, 10, 67, 78, 58, 98, 8, 53, 1 ,4 ,7, 29, 6, 59, 93, 74, 3, 67, 47, 12 ,85 ,84 ,40, 81, 85, 89, 70, 33, 66, 6, 9, 13, 67, 75, 42, 24, 73 ,49, 28, 25, 5, 86 ,53, 10 ,44, 45, 35 ,47, 11, 81, 10, 47, 16, 49, 79, 52 ,89 ,100 ,36 ,6 ,57, 96, 18 ,23 ,71 ,11 ,99 ,95 ,12 ,78 ,19 ,16, 64, 23, 77, 7 ,19, 11, 5 ,81, 43, 14, 27, 11, 63, 57, 62, 3, 56, 50, 9, 13, 45));
        //int result = Result.sockMerchant(n, arr);
        int result = SalesByMatch.sockMerchant(100, arr);
    }
}

