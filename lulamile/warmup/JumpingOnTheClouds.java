package lulamile.warmup;

import java.util.*;

class JumpingOnTheClouds{
    public static int jumpingOnClouds(List<Integer> c) {
        // Write your code here
        int noOfJumps =0;
        for(int i=0;i<c.size()-1;i++) {
            if(i+2<c.size()&&Objects.equals(c.get(i), c.get(i+1))&&c.get(i)==0) {
                if (i+2<c.size()&&Objects.equals(c.get(i), c.get(i+2))) {
                    int sum= i+2;
                    System.out.println(c.get(i)+"("+i+")"+" -> "+(c.get(i+2))+"("+sum+")");
                    i += 1;
                } else {
                    int sum= i+1;
                    System.out.println(c.get(i)+"("+i+")"+" -> "+(c.get(i+1))+"("+sum+")");
                }
                System.out.println(noOfJumps += 1);
            }
            else{
                if (i+2<c.size()&&Objects.equals(c.get(i), c.get(i+2))&&c.get(i)==0) {
                    int sum= i+2;
                    System.out.println(c.get(i)+"("+i+")"+" -> "+(c.get(i+2))+"("+sum+")");
                    i += 1;
                }
                System.out.println(noOfJumps += 1);
            }
        }
        return  noOfJumps;
    }

    public static void main(String[] args) {
        List<Integer> c = new ArrayList<>(Arrays.asList(0, 0, 1, 0, 0, 1, 0));
        System.out.println(JumpingOnTheClouds.jumpingOnClouds(c));
    }
}