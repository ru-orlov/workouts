package com.example.user.myapplication.JavaPart;

public class StringTokens {
    public static void main(String[] args) {
        String s = "He is a very very good boy, isn't he?";
        System.out.println(getCountOfWords(escapeMetaCharacters(s)));
        outOfWords(escapeMetaCharacters(s));
    }

    private static int getCountOfWords(String s){
        String tempStr = s.replace("  "," ");
        String[] arr = tempStr.split(" ");
        return arr.length;
    }

    private static void outOfWords(String s){
        String tempStr = s.replace("  "," ");
        String[] arr = tempStr.split(" ");
        for (String item: arr){
            if (!item.equals(" ")){System.out.println(item);}
        }
    }

    public static String escapeMetaCharacters(String inputString){
        final String[] metaCharacters = {"\\","^","$","{","}","[","]","(",")",".","*","+","?","|","<",">","-","&","%","'",",","!"};

        for (int i = 0 ; i < metaCharacters.length ; i++){
            if(inputString.contains(metaCharacters[i])){
                inputString = inputString.replace(metaCharacters[i]," ");
            }
        }
        return inputString;
    }
}
