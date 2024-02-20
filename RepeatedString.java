class RepeatedString {
    public static long countRepeats(String s){
        char[] str = s.toCharArray();
        long count=0;
        for (char c : str) {
            if (c == ('a')) {
                count++;
            }
        }
        return count;
    }

    public static long repeatedString(String s, long n) {
        // Write your code here
        //Number of a's in the original string
        long originalCount = countRepeats(s);
        //Number of repeats for the string s
        long noOfRepeats = n/s.length();
        //remaining chars after complete repeat of string s
        long remainderCount = n%s.length();
        long remainingCount = countRepeats(s.substring(0,(int) remainderCount));


        return noOfRepeats*originalCount+remainingCount;
    }

    public static void main(String[] args) {
        System.out.println(repeatedString("ceebbcb",817723));
    }
}
