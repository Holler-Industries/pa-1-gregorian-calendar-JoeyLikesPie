package com.example.project;
import java.util.*;

public class CalendarTester {


    public static void main(String[] args) {
        //This constructs a GregorianCalendar object
        GregorianCalendar myCal = new GregorianCalendar(2020, Calendar.SEPTEMBER, 23);


        /* You can use constants with the GregorianCalendar class to refer to its various
         * variables.  For example, "Calendar.MONTH" is a variable that refers to the
         * month of the calendar.  This can be used with the .get() method to test
         * the calendar.  Consider the example:
         * */

        System.out.println("The Current Date is September 23rd, 2020");

        //Call the .get method on myCal using Calendar.DAY_OF_WEEK as the argument

        String weekday;
        switch (myCal.get(Calendar.DAY_OF_WEEK)) {
            case 1: weekday = "Sunday";
                break;
            case 2: weekday = "Monday";
                break;
            case 3: weekday = "Tuesday";
                break;
            case 4: weekday = "Wednesday";
                break;
            case 5: weekday = "Thursday";
                break;
            case 6: weekday = "Friday";
                break;
            case 7: weekday = "Saturday";
                break;
            default: weekday = "Invalid Day, Somehow";
                break;
        }

        System.out.println("\nmyCal Day of Week: " + weekday);
        System.out.println("Expected: Wednesday");     //Note: 1 = Sunday, 2 = Monday, etc.


        //Write similar tests for month, year and day of month.

        System.out.println("myCal Month: " + (myCal.get(Calendar.MONTH) + 1)); //adding 1 to the month because months in this calendar aren't formatted like real months for some reason
        System.out.println("Expected: 9");     //1 = January, 2 = February, etc.

        System.out.println("myCal Year: " + myCal.get(Calendar.YEAR));
        System.out.println("Expected: 2020");

        System.out.println("myCal Day of Month: " + myCal.get(Calendar.DAY_OF_MONTH));
        System.out.println("Expected: 23");

        //Call the .add method to add 100 days to myCal.  Then, check the date and weekday of this new date.
        // To see that it is correct, check out this calendar calculator:
        //http://www.timeanddate.com/date/dateadd.html

        switch (myCal.get(Calendar.DAY_OF_WEEK)) {
            case 1: weekday = "Sunday";
                break;
            case 2: weekday = "Monday";
                break;
            case 3: weekday = "Tuesday";
                break;
            case 4: weekday = "Wednesday";
                break;
            case 5: weekday = "Thursday";
                break;
            case 6: weekday = "Friday";
                break;
            case 7: weekday = "Saturday";
                break;
            default: weekday = "Invalid Day, Somehow";
                break;
        }

        myCal.add(Calendar.DAY_OF_YEAR, 100);
        System.out.println("\nmyCal Date 100 Days in the Future: " + (myCal.get(Calendar.MONTH) + 1) + "/" + myCal.get(Calendar.DAY_OF_MONTH) + "/" + myCal.get(Calendar.YEAR));
        System.out.println("Expected: 1/1/2021");
        System.out.println("myCal Weekday 100 Days in the Future: " + weekday);
        System.out.println("Expected: Wednesday");

        //Finally, find what day of the week is 10,000 days after your 2020 birthday. Note, you may have to play around
        //with adding or subtracting days to get to your birthday date (hmm, how can you subtract days?)

        GregorianCalendar birthdayCal = new GregorianCalendar(2020, Calendar.MAY, 11); //making a new object so that the old one maintains its data
        String birthdayWeekday;
        switch (birthdayCal.get(Calendar.DAY_OF_WEEK)) {
            case 1: birthdayWeekday = "Sunday";
                break;
            case 2: birthdayWeekday = "Monday";
                break;
            case 3: birthdayWeekday = "Tuesday";
                break;
            case 4: birthdayWeekday = "Wednesday";
                break;
            case 5: birthdayWeekday = "Thursday";
                break;
            case 6: birthdayWeekday = "Friday";
                break;
            case 7: birthdayWeekday = "Saturday";
                break;
            default: birthdayWeekday = "Invalid Day, Somehow";
                break;
        }
        System.out.println("\nMy Birthday: May 11th, 2020");
        System.out.println("The Weekday of May 11th, 2020 is " + birthdayWeekday);
        System.out.println("Expected: Monday");
        birthdayCal.add(Calendar.DAY_OF_YEAR, 10000);

        switch (birthdayCal.get(Calendar.DAY_OF_WEEK)) {
            case 1: birthdayWeekday = "Sunday";
                break;
            case 2: birthdayWeekday = "Monday";
                break;
            case 3: birthdayWeekday = "Tuesday";
                break;
            case 4: birthdayWeekday = "Wednesday";
                break;
            case 5: birthdayWeekday = "Thursday";
                break;
            case 6: birthdayWeekday = "Friday";
                break;
            case 7: birthdayWeekday = "Saturday";
                break;
            default: birthdayWeekday = "Invalid Day, Somehow";
                break;
        }
        System.out.println("10000 Days after May 11, 2020: " + (birthdayCal.get(Calendar.MONTH) + 1) + "/" + birthdayCal.get(Calendar.DAY_OF_MONTH) + "/" + birthdayCal.get(Calendar.YEAR));
        System.out.println("Expected: 9/27/2047");
        System.out.println("The Weekday of September 27th, 2047 is " + birthdayWeekday);
        System.out.println("Expected: Friday");
    }
}