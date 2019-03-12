import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by esmasert on 18.06.2017.
 */
public class TwoSum {

    static int[] list =new int[4];
    static int[] list2 = new int[2];



    public static int[] twoSum(int[] numbers, int target) {

        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) {
                result[1] = i + 1;
                result[0] = map.get(target - numbers[i]);
                return result;
            }
            map.put(numbers[i], i + 1);
        }
        return result;
    }

    public static void main (String[] args){

        int a, result,b,x,k;

        Scanner in3 = new Scanner(System.in);


        for(b=0;b<4;b++){

            Scanner in = new Scanner(System.in);

            System.out.println("lutfen bir sayi giriniz:");
            a = in.nextInt();

            list[b]=a;

        }

        Scanner in2 = new Scanner(System.in);

        System.out.println("lutfen bir target giriniz:");
        x = in2.nextInt();

        twoSum(list,x);

        System.out.println("["+list2[0]+ ","+list2[1]+"]");

    }
}