import java.util.HashMap;
import java.util.HashSet;

public class PracticeProblems {

    public static boolean isAnagram(String s, String t) {
        //1) Freq Map

        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0;i<s.length();i++){
            
            Character currentCharacter = s.charAt(i);
            //if already exist
            if(map.containsKey(currentCharacter)){
                int currentValue = map.get(currentCharacter);
                map.put(currentCharacter,currentValue+1);
            }else{
                
            //First time map
            map.put(currentCharacter,1);
            }

        }
        
        for (Character ch : t.toCharArray()) {
            if(map.containsKey(ch)){
                map.put(ch,(map.get(ch))-1);
                if(map.get(ch)==0)map.remove(ch);    
            }else{
                return false;
            }
        }
        
        return map.isEmpty();
    
    }

    public static int firstUniqChar(String s) {
       

        HashMap<Character,Integer> map = new HashMap<>();

         //freq Map
        for(var ch : s.toCharArray()){
            if (map.containsKey(ch)) {
                map.put(ch,map.get(ch)+1);
            } else {
                map.put(ch,1);
            }
        }
        
        //traverse seedha
        for(int i=0;i<s.length();i++){
            if(map.get(s.charAt(i))==1){
                //if its 1 - matab it is unique
                return i; //index
            }
        }

        //nt found
        return -1;
    }

    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;

        HashSet<Character> jwellerySet = new HashSet<>();

        for (var ch : jewels.toCharArray()) {
            jwellerySet.add(ch);
        }
    
        for(var ch:stones.toCharArray()){
            if(jwellerySet.contains(ch)){
                count ++;
            } //tu sona hai 
        }
        return count;
    }

    public static void main(String[] args) {
        
        System.out.println(isAnagram("ratta", "artta"));

    }
}