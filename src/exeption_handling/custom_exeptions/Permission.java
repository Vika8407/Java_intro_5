package exeption_handling.custom_exeptions;

public class Permission {
    /*
    Create a method called as isAgeValid
    takes an int argument
    it return true is age more than 16
    otherwise eit throws an IllegalStateException with "AGe of {age} is restricted!!!
     */

    public static boolean isAgeValid( int age){
         if (age > 16) return true;
          throw new IllegalStateException("Age of " + age + "is restricted!!!");
    }

           /*
       Create a method that takes an int as an argument to state the day in the week
       1 - Sunday
       2 - Monday
       7 - Saturday

       method name = getCheckInHours()
       if it is weekday user is allowed to check in from 10 AM to 5 PM -> Check in hours are from 10 AM to 5 PM
       if it is weekend user is allowed to check in 10 AM to 3 PM -> Check in hours are from 10 AM to 3 PM
       if the input is not in the range of 1-7, then throw an exception with message
       "The input does not represent any day!!!"
        */

    public static String getCheckInHours(int day){

       if (day == 1 || day == 7 )return "Check in hours are from 10 AM to 3 PM";
       else if (day > 1 && day < 7) return "Check in hours are from 10 AM to 5 PM";
        throw new IllegalStateException("The input does not represent any day!!!");

       }

    }

