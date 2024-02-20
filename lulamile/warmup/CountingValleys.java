package lulamile.warmup;

public class CountingValleys {
    public static int countingValleys(int steps, String path) {
        // Write your code here
        int valleys = 0;
        int stepsUp = 0;

        int stepsDown = 0;
        for(int i=0;i<=path.length()-1;i++){
            String stepType = path.substring(i,i+1);
            if(stepType.equals("U")){
                stepsUp++;
            }
            else if(stepType.equals("D")){
                stepsDown++;
            }if (stepsUp==stepsDown&&stepType.equals("U")) {
                valleys++;
                System.out.println(valleys+" "+i);
            }
        }
        return valleys;
    }

    public static void main(String[] args) {
        System.out.println(CountingValleys.countingValleys(8, "DDUUUUDD"));
    }
}
