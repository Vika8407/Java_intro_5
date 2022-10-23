package practice.methods;

public class ReturnMethodPractices {
    public static void main(String[] args) {

        System.out.println(ReturnMethodPractices.findDifference(6, 9));
        System.out.println(ReturnMethodPractices.findDifference(4, 1));
        System.out.println(ReturnMethodPractices.findDifference(23, 99));

        System.out.println(ReturnMethodPractices.findDifference(99.23, 23.99));
        System.out.println(ReturnMethodPractices.findDifference(6.12, 12.76));
        System.out.println(ReturnMethodPractices.findDifference(9.63, 43.1));

    }

    public static int findDifference(int num1, int num2) {
        return Math.abs(num1 - num2);

    }

    public static double findDifference(double num1, double num2) {
        return Math.abs(num1 - num2);

    }

}


