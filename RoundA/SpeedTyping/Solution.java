import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tests = in.nextInt();
        in.nextLine();
        for (int i = 0; i < tests; i++) {
            String first = in.nextLine();
            String second = in.nextLine();
            int toCorrect = 0;
            String check = "";


            if(first.length() == 0){
                toCorrect = second.length();
            } else if(first.length()>second.length()){
                System.out.println("Case #" + (i+1) + ": IMPOSSIBLE");
                continue;
            } else{
                for (int j = 0; j < second.length(); j++) {
                    if(j-toCorrect >= first.length()){
                        break;
                    }

                    if(first.charAt(j-toCorrect) == second.charAt(j)){
                        check += first.charAt(j-toCorrect);
                    } else {
                        toCorrect++;

                    }
                }
                toCorrect = second.length() - first.length();
            }
            if(!check.equals(first)){
                System.out.println("Case #" + (i+1) + ": IMPOSSIBLE");
            } else {
                System.out.println("Case #" + (i+1) + ": " + toCorrect);
            }
        }
    }

}