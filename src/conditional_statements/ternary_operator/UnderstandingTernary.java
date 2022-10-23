package conditional_statements.ternary_operator;

public class UnderstandingTernary {
    public static void main(String[] args) {
          /*
          f -> for female -> Jane
          m -> for male -> John
           */

        char gender = 'M';

        String name = gender =='F' || gender == 'f' ? " Jane " : " John ";// we can read it like  ? mean if , : mean else
                                                                          // we can use it only for simple condition
        System.out.println(name);



    }
}
