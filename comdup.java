package deneme;

import java.util.*;

public class comdup {

    public static void main(String[] args) {

        Stack<Integer> s = new Stack<Integer>(); //creating stack

        s.push(2);
        s.push(2);
        s.push(2);
        s.push(2);
        s.push(2);
        s.push(-5);
        s.push(-5);
        s.push(3);
        s.push(3);
        s.push(3);
        s.push(3);
        s.push(4);
        s.push(4);
        s.push(1);
        s.push(0);
        s.push(17);
        s.push(17);

        compressDuplicates(s);

    }

    public static void compressDuplicates(Stack<Integer> s) {

        Stack<Integer> s2 = new Stack<Integer>();  //creating another stack to store the variables

        int n = s.pop();
        int count = 1;

        while (!s.isEmpty()) {

            if (n == s.peek()) {  //if variables are same, increment count by 1

                count++;
                s.pop();

            }

            else {  // if variable is different from the last one then add that variable
                    // and count then assign new value to n and continue from it

                s2.push(n);
                s2.push(count);

                n = s.pop();
                count = 1;

            }
        }
        s.push(count);
        s.push(n);

        while (!s2.isEmpty()){  //empty the s2 and fill the s
            s.push(s2.pop());}

        System.out.println(s);

    }

}