package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeSession {

    static String reverseString(String word){
        String ans = "";
        int n = word.length();
        for (int i = n-1; i >= 0; i--) {
            ans+=word.charAt(i);
        }

        return ans;
}

    static String addInBetween(String word,int target,String targetWord){
        //kishan - //kishzan
        //target - 4
        String ans = "";
        String firstPart = word.substring(0, target);
        ans+=firstPart;
        ans+=targetWord;
        ans+=word.substring(target+1);

        return ans;

    }

    public static void main(String[] args) {
        //Strings - Sequence of characters
        //characters - 'a' 'b' 'c' 'd' -> "abcd"
        //charcaters - 'a'
        //strings - "abcd"

        //String Declare
        String myName = "Kishan"; //string literal -> Pool Memeory
        //String myNames = new String("Kishan"); //Object -> Heap Memory

        //Java String - Immutable Nature

        //Object - Moethod
        //1) charAt() - CharracterAt - Index = 0
        System.out.println(myName.charAt(0));//K
        System.out.println(myName.charAt(3)); // h // myName[2];

        //2) length() - Returns the length of the string
        System.out.println(myName.length());//6

        //3) tuUpperCase - Converst to upper case
        System.out.println(myName.toUpperCase()); //KISHAN

        //4) toLowerCase - Convers to lower case
        System.out.println(myName.toLowerCase()); //kishan

        //5)contains - T/F
        System.out.println(myName.contains("ish")); //True
        System.out.println(myName.contains("sdfhjshfd")); //False

        //6) Replace- Replace series of character
        System.out.println(myName.replace("k", "d"));//dishan

        //7) substring
        System.out.println(myName.substring(1,4));//ki

        //8) Equals
        // == -> Address
        // .equals(Content)
        System.out.println("The ans is" + myName.equals("Kishan"));//True
        String secondName = new String("Kishan");
        if (secondName.equals(myName)) {
            System.out.println("True");
        }else{
            System.out.println("false");
        }

        //9) Trim() - Leading/Trailing white spaces
        // "__Kishan" -leading whitespaces
        //"Kishan__" -> Trailing Spaces
        //"__Kishan__" = myName.trim() - "Kishan"
        System.out.println(myName.trim());

        //10) isEmpty() - True/False
        System.out.println(myName.isEmpty()); //str.length==0

        // String input;
        // Scanner scn = new Scanner(System.in);
        // input = scn.next();
        // System.out.println(input);
        // scn.close();

        // //myName = "Kishan"; -- Immuatble
        // myName+= 's';
        // System.out.println(myName.hashCode());
        // myName+= 's';
        // System.out.println(myName.hashCode());

        // String str2 = new String("Kishan2");
        // str2+="3";

        // System.out.println("The final string is " + str2);

        // Scanner scn = new Scanner(System.in);
        // String word = scn.next();
        // System.out.println(reverseString(word));
        // scn.close();
        
        String newString = "Kishan";
        char [] newStringChar = newString.toCharArray(); 
        System.out.println(Arrays.toString(newStringChar));
        newString= newString + 'D';


        //replace
        //kishan - kishzan

        System.out.println(newString);

        //11) - toCharArray()
        //12 - toString()


        
    }

    
}