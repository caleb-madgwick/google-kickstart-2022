import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tests = in.nextInt();
        in.nextLine();
        for (int i = 0; i < tests; i++) {
            int num = in.nextInt();
            in.nextLine();
            int len = String.valueOf(num).length();
            int[] numArr = new int[len];
            for (int j = 0; j < len; j++) {
                numArr[j] = (int) ((num % 10) * Math.pow(10, j));
                num = num / 10;
            }

            int[] newArr = new int[len+1];
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int j = 0; j < len +1; j++) {
                newArr[0] = numArr[0];
                for (int k = 0; k < len; k++) {
                    newArr[k+1] = numArr[k] * 10;
                }
                for (int k = 1; k < 10; k++) {
                    newArr[j] = (int) (k * Math.pow(10,j));
                    if(sum(newArr) % 9 == 0) {
                        arrayList.add(sum(newArr));
                    }
                }
            }
             Collections.sort(arrayList);
             int ans = arrayList.get(0);
            System.out.println("Case #" + (i + 1) + ": " + ans);

        }
    }

    public static int sum(int[] arr){
        int out =0;
        for (int i = 0; i < arr.length; i++) {
            out += arr[i];
        }
        return out;
    }

}