package com.example.user.myapplication.JavaPart;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class RepeatedString {

    static long andWinnerIs(Map<String, Integer> fullMap) {
        long winnerScore = 0;
        for (Map.Entry<String, Integer> entry : fullMap.entrySet()) {
            if (winnerScore < entry.getValue()) {
                winnerScore += entry.getValue();
            }
        }
        return winnerScore;
    }

    static Map<String, Integer> getMapStrings(char[] fullString){
        Map<String, Integer> charsMap = new HashMap<>();
        for (char s: fullString) {
            if (!charsMap.containsKey(String.valueOf(s))) {
                charsMap.put(String.valueOf(s), 1);
            } else {
                Integer c = charsMap.get(String.valueOf(s));
                charsMap.put(String.valueOf(s), c + 1);
            }
        }
        return charsMap;
    }

    static char[] buildString(String finalString, long bound){
        return finalString.substring(0, (int) bound).toCharArray();
    }

    static String repeatedString(String s, long n) {
        List<String> stringToCharArray = new LinkedList<>(Arrays.asList(s));
        StringBuilder sb = new StringBuilder();
        while(stringToCharArray.listIterator().hasNext()) {
            String tmp = stringToCharArray.listIterator().next();
            if (sb.length() < n) {
                sb.append(tmp);
            } else {
                return sb.toString();
            }
        }
        return null;
    }


    public static void main(String[] args) {
        String str = "aba";
        long n = 10;
        String repStr = repeatedString(str, n);
        char[] fullStr = buildString(repStr, n);
        Map<String, Integer> fullMap = getMapStrings(fullStr);
        System.out.println(andWinnerIs(fullMap));
    }
}
