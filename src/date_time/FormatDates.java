package date_time;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatDates {
    public static void main(String[] args) {

        System.out.println("\n========== Formatting Date ==========\n");

        Date date = new Date();
        System.out.println(date);//Sun Dec 11 11:35:15 CST 2022

        // Print the date in the format of MM/dd//yyyy
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        System.out.println(formatter.format(date));

        // Print the date in the format of yyyy 2022

        System.out.println( new SimpleDateFormat("yyyy").format(new Date()));//2022
        System.out.println(new SimpleDateFormat("hh  'o'clock a, z").format(new Date()));


    }
}
