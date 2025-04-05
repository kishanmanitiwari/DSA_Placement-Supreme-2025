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
        ans+=word.substring(1+(target+targetWord.length()));

        // StringBuilder sb = new StringBuilder(word);
        // sb.insert(target,targetWord);

        // return sb.toString();

        return ans;

    }

    static boolean isPalindrome(String word){
        int start = 0 , end = word.length()-1;
        word = word.toLowerCase();

        while(start<end){
            if (word.charAt(start)!=word.charAt(end)) {
                return false;
            }
            start++; end--;
        }
        return true;
    }

    static boolean isVowel(char value){
        if (value == 'a' || value == 'e' || value == 'i' || value == 'o' ||value == 'u'){
            return true;
        }else{
            return false;
        }
     }

    static int countVowel(String word){
        // int count = 0;
        // word = word.toLowerCase();

        // for(int i=0;i<word.length();i++){
        //     char currentChracter = word.charAt(i);
        //     if(isVowel(currentChracter)){
        //         count++; 
        //     } 
        // }
        // return count;
        int count = 0;
        String vowels = "aeiouAEIOU";

        for(int i=0;i<word.length();i++){
          char currentChracter = word.charAt(i); //a
            if(vowels.indexOf(currentChracter)!=-1){//Vowel - Count++
                count ++;
            }

        }
        return count;
    }

    static char firstNonRepeating(String word){
        //frequency array
        int[] freq = new int[26];

        for(int i=0;i<word.length();i++){
            char currentChar = word.charAt(i);
            int insertingIndex = currentChar - 'a';
            freq[insertingIndex]++;


        }

        System.out.println(Arrays.toString(freq));

        for(int i=0;i<word.length();i++){
            char currentChar = word.charAt(i);
            int insertingIndex = currentChar - 'a';
            if(freq[insertingIndex]==1){
                //1 - non repeating
                return currentChar;
            }
        }
        return '?';
    }

    static String reverseWord(String sentence){
        // the sky is blue - blue is sky the
        sentence = sentence.trim();
        String[] allWords = sentence.split("\\s+"); //[the,sky,is,blue]
        // \\ - tab , ! , *
        //s - spaces
        //+ - multiple
        System.out.println(Arrays.toString(allWords));
        String ans = "";
        for(int i=allWords.length-1;i>=0;i--){
            ans=ans+allWords[i]+" ";
            //blue is sky the 
        }

        return ans.trim();
    }

    //New Methods
    //1) Contains - Bonus
    //2) IndexOf
    //4) Split ("\\s+") - split() uses regex, so some characters like ., |, *, ?, etc. need to be escaped with \\.

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

        //11) IndexOf - character index - mmhb -> m index - 0 -1
            String myNameNew = "Kisshan";
            System.out.println(myNameNew.indexOf("ssh"));

        //12)split() - dilimiter/regex = Jo input uss basisi split 
        //eg - "Hello wolrd" - split(" ") - Array(String) = ["Hello","World"]
        //eg - "Hello,Wolrd" - split(",") - Array(String) = ["Hello","World"]
        //eg - "Hello,Wol-rd" - split("-") - Array(String) = ["HelloWol","rd"]
        String exampleString = "Hello Worl-d";
        String[] currentSplit = exampleString.split("-");

        System.out.println("The length is " + Arrays.toString(currentSplit));
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
        
        // String newString = "Kishan";
        // char [] newStringChar = newString.toCharArray(); 
        // System.out.println(Arrays.toString(newStringChar));
        // newString= newString + 'D';


        // //replace
        // //kishan - kishzan

        // System.out.println(newString);

        //11) - toCharArray()
        //12 - toString()

        //Asci

        // char ch = 'a'; //97
        // char ch_1 = 'A'; //98

        // int chValue = ch;
        // int chValue_2 = ch_1;

        // System.out.println(chValue);
        // System.out.println('T'-'A');

      // System.out.println(firstNonRepeating("swiss"));

      System.out.println(reverseWord(" the sky                   is blue "));

        
    }

    
}