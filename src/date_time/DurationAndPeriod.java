package date_time;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class DurationAndPeriod {
    public static void main(String[] args) {
        /*
        How many
         */
        LocalDate today = LocalDate.now();
        LocalDate DOB = LocalDate.of(1984, Month.APRIL,7);
        System.out.println(today);
        System.out.println(DOB);
        System.out.println(Period.between( DOB, today).getYears());//38
        System.out.println(Period.between( DOB, today).getMonths());//8
        System.out.println(Period.between( DOB, today).getDays());//4

        //Using ChronoUnit for that
        System.out.println(ChronoUnit.YEARS.between(DOB, today));//38
        System.out.println(ChronoUnit.MONTHS.between(DOB, today));//464 month past
        System.out.println(ChronoUnit.WEEKS.between(DOB, today));//2018 weeks past
        System.out.println(ChronoUnit.DAYS.between(DOB, today));// 14127 days past

        LocalTime localTime1 = LocalTime.of(12,44,15);
        LocalTime localTime2 = LocalTime.of(13,45,45);

        System.out.println(Duration.between(localTime1, localTime2).getSeconds());

        //ChronoUnits
        System.out.println(ChronoUnit.HOURS.between(localTime1, localTime2));//1
        System.out.println(ChronoUnit.MINUTES.between(localTime1, localTime2));//61
        System.out.println(ChronoUnit.SECONDS.between(localTime1, localTime2));//3690


    }
}
