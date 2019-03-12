/**
 * Created by esmasert on 5.08.2018.
 */
public class LongestPalindromicSubstring {

    public static String longestPalindrome(String s) {

        String word = "";

        for(int i=0; i<s.length(); i++){

            System.out.println("i bu:"+i);

            for(int a = s.length()-1; a>=i; a--){

                System.out.println("a bu:"+a);


                if (s.charAt(i) == s.charAt(a)){

                    word = word + s.charAt(i);
                    System.out.println(word);

                }
                else{
                    word.isEmpty();
                }

            }
        }

        return word;
    }

    public static void main(String[] args){

        System.out.println(longestPalindrome("araba"));
    }
}
