package enum_practices;

import conditional_statements.switch_statements.SwitchWithInteger;

import java.time.DayOfWeek;

public class Task1 {
    public static void main(String[] args) {
        /*
        Write program that prints
         */

        Frequency frequency = Frequency.HOURLY;
        switch (frequency){
            case HOURLY:
                System.out.println(20);
                break;
            case WEEKLY:
                System.out.println("800");
                break;
            case DAILY:
                System.out.println("1600");
                break;
            case MONTHLY:
                System.out.println("3200");
                break;
            case YEARLY:
                System.out.println("38400");
                break;
            default:
                throw new IllegalStateException("No such frequency!!!");
        }


    }
}
