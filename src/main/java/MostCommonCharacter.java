import java.util.HashMap;
import java.util.Map;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        char[] charArray = str.toCharArray();
        for(char i: charArray){

            if(map.containsKey(i))
               map.put(i, map.get(i)+1);
            else
               map.put(i, 1);
        }
        char bigRecc ='\0';
        int max=0;
 

        for (HashMap.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                bigRecc = entry.getKey();
                max = entry.getValue();
            }
        }

        return bigRecc;
    }
}
