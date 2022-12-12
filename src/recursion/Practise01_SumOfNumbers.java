package recursion;

public class Practise01_SumOfNumbers {

    /*
    Create  public method  called sum
    takes int which is positive number
    It returns the sum of numbers starting from 1 to given int
    5 -> 1+2+3+4+5
     */

    //iterative way
    public static int sum( int end ){
        int sum = 0;
        for (int i = 0; i <= end ; i++) {
            end += i;
        }return sum;
    }
    //recursion way
    public static int sumRecursively(int end){
        if (end != 0 ) return  end + sumRecursively(end -1);// 5 + 4 + 3 + 2 + 1
        return 0;
    }
    /*
    Create  public static  method  called product
    takes int which is positive number
    It returns the product of numbers starting from 1 to given int
    5 -> 1*2*3*4*5
     */

    public static int productRecursively(int end){
        if (end != 1 ) return  end* productRecursively(end-1);
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(sum(5));//15 +0
        System.out.println(sum(6));//21 +0
        System.out.println(sum(8));//36 +0

        System.out.println(sumRecursively(5));
        System.out.println(sumRecursively(6));
        System.out.println(sumRecursively(8));

        System.out.println(productRecursively(3));//
        System.out.println(productRecursively(4));
        System.out.println(productRecursively(5));
    }
}
