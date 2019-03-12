/**
 * Created by esmasert on 17.03.2016.
 */
public class peak {

    static int findPeak(int[] array) {

        int N = array.length;

        if (N == 1) {  //if the number of elements of array is 1 then return 0
            return 0;

        }

        int left = 0, right = N - 1;

        while (right - left > 1) {

            int mid = left + (right - left) / 2; //index of middle element

            if (array[mid] < array[mid + 1]) {  //If middle element is not peak and the left element is
                    // greater than middle,then left element will be mid+1
                left = mid + 1;
            }
            else {   //If the middle element is greater than middle+1,then right element will be mid
                right = mid;
            }
        }

        return (left == N - 1 || array[left] > array[left + 1]) ? left : right;  //when the sub list remain as 2 element
                    //compare them. then return the big one
    }

    public static void main(String[] args){

        int array[] = {1, 3, 10, 4, 1, 8};

        System.out.println("Index of a peak point is " + findPeak(array));

    }

}
