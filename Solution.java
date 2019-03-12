/**
 * Created by esmasert on 21.05.2017.
 */
public class Solution {

    public static boolean detectCapitalUse(String word) {


        int x=0,b=0;
        int y = 0;
        int z=0;

        boolean a;


        for (int i=0; i<=word.length()-1; i++){

            if (word.charAt(0) == word.toUpperCase().charAt(0)){

                if(word.charAt(i)==word.toLowerCase().charAt(i)){

                    y+=1;
                }

                if(word.charAt(i)==word.toUpperCase().charAt(i)){

                    x+=1;
                }
            }
            else{

                if(word.charAt(i)== word.toLowerCase().charAt(i)){

                    z+=1;
                }
            }
        }

        if(x==word.length()){

            a=true;
            System.out.println("True");
        }
        else if(y+1==word.length()){

            a=true;

            System.out.println("True");
        }
        else if(z==word.length()){

            a=true;

            System.out.println("True");
        }
        else {
            a=false;

            System.out.println("False");
        }

        return a;
    }

    public static void main(String[] args) {

        detectCapitalUse("Leetcode");
    }
}