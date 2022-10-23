package string_methods;

public class _07_IndexOf_lastIndexOf_Method {
    public static void main(String[] args) {
        /*
        1. RETURN
        2. RETURNS INT WHICH IS MATCHING INDEX
        3.NON STATIC
        4. IT TAKES A CHAR OR STRING - THERE ARE OVERLOADED METHOD
        5.
         */
          String company = " TechGlobal School";

          int firsIndexOfO = company.indexOf('o');//6
          int lastIndexOfO = company.lastIndexOf('o');
          System.out.println(firsIndexOfO);
          System.out.println(lastIndexOfO);


        int firsIndexOfl = company.indexOf('l');
        int lastIndexOfl = company.lastIndexOf('l');
        System.out.println(firsIndexOfl);
        System.out.println(lastIndexOfl);
        System.out.println(company.indexOf('l'));
        System.out.println(company.lastIndexOf('l'));

        System.out.println(company.indexOf('x'));// -1 mean not found

        //NOTE : IF AN  ATTEMPT TO GET AN INDEX OF NON EXISTING CHARACTERS OR A SEQUENCE FROM STRING
        //HAPPENS, THEN INDEXOF() OR LASTINDEXOF()- RETURNS -1 NOT FOUND

        System.out.println(company.indexOf("School"));//11



    }
}
