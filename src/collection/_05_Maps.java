package collection;

import java.util.HashMap;

public class _05_Maps {

    public static void main(String[] args) {

        /*
        Key                   Value
        Il                    Illinois
        WI                    Wisconsin
        CA                    California

        1                     Vlad
        2                     Andrii
        3                     Filiz
        4                     Vlad

        1                     10
        2                     2

        Altay               [Valentina,Aya,Bashar]



         */
        // HashMap doesb't keep inserted order if we wont to keep it we should use LinkHashMap
        HashMap<String,String> map = new HashMap<>();
        map.put("IL","Illinois");
        map.put("WI","California");
        map.put("CA","California");
        map.put("CA","abc");// always shoving the last one (updated)
        map.put(null,"xxx");
        map.put(null,"yyy");
        map.put("A",null);
        map.put("B",null);
        map.put("C",null);

        System.out.println(map.size());//3
        System.out.println(map);//{WI=California, IL=Illinois, CA=abc}
    }
}
