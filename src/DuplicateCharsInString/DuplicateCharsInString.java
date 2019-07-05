package DuplicateCharsInString;

//Program to find out duplicate or repeated characters in a string, and calculate the count of repeatation

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharsInString {

    public void findDuplicateChars(String string){

        Map<Character,Integer> dupMap = new HashMap<Character, Integer>();
        char[] chars = string.toCharArray();
        for (Character character : chars){
            if(dupMap.containsKey(character)){
                dupMap.put(character, dupMap.get(character)+1);
            } else {
                dupMap.put(character,1);
            }
        }
        Set<Character> keys = dupMap.keySet();
        for (Character character:keys){
            if(dupMap.get(character) > 1){
                System.out.println(character+"--->"+dupMap.get(character));
            }
        }
    }

    public static void main(String args[]){
        DuplicateCharsInString duplicateCharsInString = new DuplicateCharsInString();
        duplicateCharsInString.findDuplicateChars("Java4You");
    }

}