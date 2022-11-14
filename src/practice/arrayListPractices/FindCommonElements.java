package practice.arrayListPractices;

import java.util.ArrayList;
import java.util.Arrays;

public class FindCommonElements {
    public static void main(String[] args) {
        ArrayList<Integer> nums1 = new ArrayList<>(Arrays.asList(10, 20, 30, 50, 70));
        ArrayList<Integer> nums2 = new ArrayList<>(Arrays.asList(20, 50, 70, 100, 300));
        findCommonElements(nums2, nums1);

    }

           /*
        reate a public static method which will take two arraylists, and it will find the common
        lements between them then print it

        est data 1:
           numbers1 = {10, 20, 30, 50, 70};
           numbers2 = {20, 50, 70, 100, 300};
        xpected output 1:
           20
           50
           70

        est data 2:
          numbers1 = {30, 50, 70};
          numbers2 = {20, 100, 300};

        xpected output 2:
           There is no matching elements
        */
       public static void findCommonElements(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
           ArrayList<Integer> commons = new ArrayList<>();

           for (int i = 0; i < nums1.size(); i++) {
               for (int j = i + 1; j < nums2.size(); j++) {
                   System.out.println(" nums 1 gets (i) = " + nums1.get(i));
                   System.out.println(" nums 2 gets (i) = " + nums2.get(j));
                   if(nums1.get(i).equals(nums2.get(j)) && !commons.contains(nums1.get(i)))
                    commons.add(nums1.get(i));
               }
               System.out.println();
           }
           if(commons.isEmpty()) System.out.println("There is no matching elements");
           else System.out.println(commons);
       }



}
