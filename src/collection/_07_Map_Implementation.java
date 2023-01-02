package collection;

import java.util.HashMap;
import java.util.Set;

public class _07_Map_Implementation {
    public static void main(String[] args) {

        HashMap<Integer, String > map = new HashMap<>();
        map.put(1,"Beyza");
        map.put(1,"Malek");
        System.out.println(map.size());//1
        System.out.println(map);//{1=Malek}

        map.put(2,"Malek");
        System.out.println(map.size());//2
        System.out.println(map);//{1=Malek, 2=Malek}

        map.put(null, "Andrii");// only 1 null keyword allowed
        map.put(null,"Vlad");
        System.out.println(map);//{null=Vlad, 1=Malek, 2=Malek}

        map.put(3,"Viktoriia");
        map.put(4,null);
        map.put(5,null);
        map.put(6,null);
        System.out.println(map);//{null=Vlad, 1=Malek, 2=Malek, 3=Viktoriia, 4=null, 5=null, 6=null}



    }
}
