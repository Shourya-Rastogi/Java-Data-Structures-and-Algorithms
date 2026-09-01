package Strings.Medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortCharactersByFrequency {
    static String sortCharacters(String s){
        List<Character>[] arr=new ArrayList[s.length()+1];
        StringBuilder sb=new StringBuilder();
        Map<Character,Integer> mp=new HashMap<>();
        for(char c:s.toCharArray()){
            mp.put(c,mp.getOrDefault(c,0)+1);
        };
        mp.keySet().forEach(
                c->{
                    if(arr[mp.get(c)]==null){
                        arr[mp.get(c)]=new ArrayList<>();
                    }
                    arr[mp.get(c)].add(c);
                }
        );
        for(int i=arr.length-1;i>0;i++){
            if(arr[i]!=null){
                for(Character c:arr[i]){
                    for(int j=0;j<i;j++) sb.append(c);
                }
            }
        }
        return sb.toString();
    }
}
