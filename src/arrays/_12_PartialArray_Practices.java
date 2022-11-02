package arrays;

public class _12_PartialArray_Practices {
    public static void main(String[] args) {

    }
        /*
        /*
        create a public static method which will take an int array then it will get the
        sum of first 3 elements and return it. Note: Given array should be at least 3 elements

        Example:

        Array -> int[] numbers = {10, -3, -7, 0, 0, 7, 22};

        Return:
        0

        Example2:

        Array -> int[] numbers = {10, -3, 7, 1, 22};

        Return2:
        14

         */

    public static int findSumOfTree(int[] numbers){
        /*
        1. Create conteiner
        2. Create a Loop
        3. Return hte container
         */
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += numbers[i];
        }
        return sum;
    }


                    /*
        create a public static method which will take an int array then it will get the
        sum of last 5 elements and return it.

        Note: Given array should be at least 5 elements
        Note2: Use LOOPS

        Example:
        Array -> int[] numbers = {10, -3, -7, 0, 0, 7, 22};

        Return:
        22

        Example2:
        Array -> int[] numbers = {10, -3, 7, 1, 22};

        Return2:
        38
         */

  public static int findSumOfLastFive(int[] numbers){
      /*
      1.Create a container
      2. Loop( start = length -1; i > length -6; --i)
       */
      int sum = 0;
      for (int i = numbers.length; i < numbers.length -6; i++) {
          sum += numbers[i];
      }
      return sum;

  }

          /*
        create a public static method which will take a String array then it will print the longest and shortest
        string from that array.

        Example:
        Array ->  String[] colors = {"red", "blue", "yellow", "white"};

        Output:
            Shortest = red
            Longest = yellow

         */
   public static void printShortestLongest (String[] strings) {
       /*
       1. Two containers
       2. Fori incremant Loops, two if conditions(for small and enothe rfor big one
       3. print in the end
      */
       String shortest = strings[0], longest = strings[0];
       for (int i = 1; i < strings.length; i++) {
           if (longest.length() < strings[i].length()) {//if long str is smaller than curent- reassign it!
               longest = strings[i];
           }
           if (shortest.length() > strings[i].length()) {//If my short str longer then current str reassign it
               shortest = strings[i];
           }
       }
       System.out.println(" Longest = " + longest);
       System.out.println(" Shortest = " + shortest);

   }

}
