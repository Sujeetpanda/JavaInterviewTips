package com.sujeet.interview;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Codility {
    public static void main(String[] args) {
        Map<String,Integer> mp = new HashMap<>();
        mp.put("1",10);
        mp.put("2",20);
        Map<String,Integer> mp2 = new HashMap<>();
        mp2.put("1",10);
        mp2.put("2",20);
        Map<String,Integer> mp3 = new HashMap<>();
        mp2.put("1",10);
        mp2.put("2",20);
        Map<String,Integer>[]myDataArray=new HashMap[3];
        myDataArray[0] = mp;
        myDataArray[1] = mp2;
        myDataArray[2] = mp3;
        count(myDataArray);
    }
    public static Map<Long,Long> count(Map<String,Integer>... visits){
        System.out.println(visits.length);
        //Map<Long,Long> mp = new HashMap<>();
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i = 0; i < visits.length;i++){
            System.out.println("Sujeet ");
            Map<String,Integer> m = visits[i];
            for ( Map.Entry<String, Integer> entry : m.entrySet()) {
                try {
                    Integer key = Integer.parseInt(entry.getKey());
                    Integer val = entry.getValue();
                    System.out.println(key + "**************" + val);
                    if (mp.containsKey(key))
                        mp.put(key, val + mp.get(key));
                    else
                        mp.put(key, val);
                }catch (Exception e){
                    System.out.println("Ignoring exception");
                }
            }
        }
        for ( Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            Integer key = entry.getKey();
            Integer val = entry.getValue();
            System.out.println(key+"**************"+val);
        }
        return null;
    }
}
