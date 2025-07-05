package Trees.PriortiyQueues;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Data {
    int time;
    int amount;
    String city;
    String original;

    Data(int time, int amount, String city, String original) {
        this.time = time;
        this.amount = amount;
        this.city = city;
        this.original = original;
    }
}

class Solution {

    public List<String> invalidTransactions(String[] transactions) {
        HashMap<String, ArrayList<Data>> hmap = new HashMap<>();
        List<String> ans = new ArrayList<>();

        for (String transact : transactions) {
            String[] curr = transact.split(",");
            String name = curr[0];
            int time = Integer.parseInt(curr[1]);
            int amount = Integer.parseInt(curr[2]);
            String city = curr[3];

            Data currData = new Data(time, amount, city, transact);

            // amount > 1000
            if (amount > 1000) {
                ans.add(transact);
            }

            if (hmap.containsKey(name)) {
                ArrayList<Data> prevList = hmap.get(name);

                for (Data prev : prevList) {
                    if (Math.abs(prev.time - currData.time) <= 60 && !prev.city.equals(currData.city)) {
                        ans.add(transact);
                        ans.add(prev.original);
                    }
                }

                prevList.add(currData);
            } else {
                ArrayList<Data> al = new ArrayList<>();
                al.add(currData);
                hmap.put(name, al);
            }
        }

        return ans;
    }

    public int countCharacters(String[] words, String chars) {
        HashSet<Character> set = new HashSet<>();
        for (char ch : chars.toCharArray()) {
            set.add(ch);
        }

        for (String str : words) {
            for (Character character : str.toCharArray()) {
                if (set.contains(character) && tempSetConatins(character) == false) {

                }
            }

        }

    }

    public int heightChecker(int[] heights) {
        int[] expected = new int[heights.length];
        for(int i=0;i<heights.length;i++){
            expected[i] = heights[i];
        }

        Arrays.sort(expected);

        int ans = 0;

        for(int val : heights){
            for (int i : expected) {
                if (val!=i) {
                    ans++;
                }
            }
        }

        return ans;
    }

}
