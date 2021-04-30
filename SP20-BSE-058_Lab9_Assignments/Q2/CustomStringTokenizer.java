import java.util.*;

public class CustomStringTokenizer {

    public static int countTokens(StringTokenizer s) {
        int count = s.countTokens();
        int lastCount = 0;
        String temp;
        boolean flag;
        double value;

        for (int i = 0; i < count; i++) {
            flag = true;
            temp = s.nextToken();

            //checking if current token is a numeric value
            try {
                value = Double.parseDouble(temp);
            } catch (NumberFormatException e) {
                flag = false;
            }
            //counting the token only if it is not a numeric value
            if (!flag)
                lastCount++;
        }
        return lastCount;

    }
    public static void main(String[] args) {
        StringTokenizer s1 = new StringTokenizer("There are 7 students class");
        StringTokenizer s2 = new StringTokenizer("There are seven students class");
        int count = countTokens(s1);
        System.out.println("Total number of Tokens in string 1: "+ count);
        count = countTokens(s2);
        System.out.println("Total number of Tokens in string 2: "+ count);
    }
}
