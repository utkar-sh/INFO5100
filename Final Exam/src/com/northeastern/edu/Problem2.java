package com.northeastern.edu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Problem2 {
    public static List<List<String>> groupingAnagrams(String[] strs) {
        if (strs.length == 0){
            return new ArrayList();
        }

        HashMap<String, List> hashMap = new HashMap<>();
        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String key = String.valueOf(charArray);
            if (!hashMap.containsKey(key)) hashMap.put(key, new ArrayList());
            hashMap.get(key).add(str);
        }
        return new ArrayList(hashMap.values());
    }

    public static void main(String[] args){
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        String[] strs2 = {"a"};
        String[] strs3 = {""};
        System.out.println(groupingAnagrams(strs));
        System.out.println(groupingAnagrams(strs2));
        System.out.println(groupingAnagrams(strs3));
    }
}
