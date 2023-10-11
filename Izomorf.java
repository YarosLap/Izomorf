package Sem5;

import java.util.HashMap;
import java.util.Map;

// Программа проверяет являются ли слова изоморфами.

public class Izomorf {
    public static void main(String[] args) {
        String s1 = "paper";
        String s2 = "title";
        String s3 = "foo";
        String s4 = "bar";
        System.out.println(izomorf(s1, s2));
        System.out.println(izomorf(s2, s1));
        System.out.println(izomorf(s3, s4));
        System.out.println(izomorf(s4, s3));
    }

    static boolean izomorf(String s1, String s2){
        if (s1.length()!=s2.length()){
            return false;
        }
        Map<Character, Character> map = new HashMap<>();
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        for (int i = 0; i < s1.length(); i++) {
            if (map.containsKey(c1[i])){
                if (map.get(c1[i]) != c2[i]){
                    return false;
                }
            }
            else{
                if (map.containsValue(c2[i])){
                    return false;
                }
                map.put(c1[i],c2[i]);
            }
        }
        return true;
    }
}
