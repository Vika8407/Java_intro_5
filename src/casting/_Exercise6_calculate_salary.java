package casting;

public class _Exercise6_calculate_salary {
    public static void main(String[] args) {

        String salary1 = "5000";
        String salary2 = "6000.25";
        String salary3 = "4000.50";
        double d1 = Double.parseDouble(salary1);
        double d2 = Double.parseDouble(salary2);
        double d3 = Double.parseDouble(salary3);

        double minSalary = Math.min( d3, Math.min(d1,d2));
        System.out.println( " Min salary is =" +  minSalary);
        //or
        System.out.println( " Max salary is  =" + Math.max( d1, Math.max(d2, d3)));


        /*
        Calculate the 10 percent of min salary
        output 400.05
         */

        System.out.println( minSalary * 01);//.1 means 01




    }
}
