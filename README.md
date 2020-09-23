# PA 1: Gregorian Calendar
Programming Assignment #1 is designed to strengthen your use of method calls in objects.  You will do this by being introduced to a new object type, the GregorianCalendar.  An additional goal of this assignment is to get comfortable looking up java documentation on objects and determine which methods are best suited for your goals.  This project is adapted from Project 2.1 in Java Concepts for AP Computer Science by Cay Horrstman.
### Specification
You will write a program that uses the GregorianCalendar class.  The GregorianCalendar  class is part of the java.util  library.  Include the following statement above your class to be sure the library is included:

import java.util.*;

A GregorianCalendar object describes a point in time, as measured by the Gregorian calendar, the standard calendar that is commonly used throughout the world today.  You can construct a GregorianCalendar object several ways, including from a year, month, and day of the month, like these examples:

GregorianCalendar cal = new GregorianCalendar();
GregorianCalendar twardsBday = new GregorianCalendar(1987, Calendar.JANUARY, 19);

The GregorianCalendar class uses constants to represent months.  Use Calendar.JANUARY  … Calendar.DECEMBER  to specify the month.

The add method can be used to add a number of days to a GregorianCalendar object:

cal.add(Calendar.DAY_OF_MONTH, 10);  
//Now cal is 10 days from today

Note, add is a mutator method.  It changes the object.

The get method can be used to query a given GregorianCalendar object:

int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
int month = cal.get(Calendar.MONTH);
int year = cal.get(Calendar.YEAR);
int weekday = cal.get(Calendar.DAY_OF_WEEK);
	//Something you’ll want to check: Is Sunday 0 or 1?

### Your Task
Your job is to write a program that prints the following:
1) The current date 
2) Checks that the current month, year, and day produced by the *get* method are correct
2) The date and week day that is 100 days from today
3) The weekday of your birthday
4) The date that is 10,000 days from your birthday

NOTE: What data type is a weekday stored as?  You may print out the value (number) of the day of the week (e.g. “My birthday is a 5”).

Your output should contain descriptive language that helps the user read the information you are presenting.  For example, the output for the first requirement may be:

“The current date is:  3 / 10 / 2013”

You will name your class **CalendarTester**

### If you finish early
If you finish this project early, use *if* statements to print out the actual name of the day, instead of the integer.  We have not talked about *if* statements yet, which is why this is extra credit!  You will need to do a little research (online/in your book) on your own for the extra credit.


### Tests
This project does not contain any tests, I will instead grade it based on inspecting your code and console output.

### Submitting your PA
Once you finish your PA, commit your changes and push them to GitHub.