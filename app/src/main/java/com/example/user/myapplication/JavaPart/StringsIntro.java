package com.example.user.myapplication.JavaPart;

public class StringsIntro {

    public static void main(String[] args) {
        String A="java";
        String B="java";

        int answerFirst = A.length()+B.length();

        String capitalA = A.substring(0, 1).toUpperCase() + A.substring(1);;
        String capitalB = B.substring(0, 1).toUpperCase() + B.substring(1);;

        String answerTwo = getTheOrderOfLetter(A.charAt(0)) <= getTheOrderOfLetter(B.charAt(0)) ? "No" : "Yes";

        String answerThird = capitalA.concat(" ").concat(capitalB);

        System.out.println(answerFirst);
        System.out.println(answerTwo);
        System.out.println(answerThird);
    }

    private static int getTheOrderOfLetter(char letter){
        char ch;
        int i = 0;
        for (ch = 'a'; ch <= 'z'; ch++){
            i++;
            if (letter == ch){
                return i;
            }
        }
        return 0;
    }
}
