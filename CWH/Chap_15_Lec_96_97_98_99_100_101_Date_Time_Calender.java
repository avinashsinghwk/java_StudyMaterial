package CWH;


// import java.util.Date;
// import java.util.Calendar;
// import java.util.TimeZone;

// import java.util.GregorianCalendar;

// import java.time.LocalDate;
// import java.time.LocalDateTime;
// import java.time.LocalTime;
// import java.time.format.DateTimeFormatter;

public class Chap_15_Lec_96_97_98_99_100_101_Date_Time_Calender {
    public static void main(String[] args) {
        System.out.println("In this lecture i will be learning about Date & Time, Calender and Time API");

        // Lecture - 96 (Time passed since 1970)

        // java has been started storing milli seconds since 1 jan 1970 and it has assumed that the world has started in 1900

        //  System.out.println("Time passed since 1970 is " + System.currentTimeMillis() / 1000 / 3600 / 24 / 365);

        // Quick Quiz : Is it safe to store milli second in long data type 
        // Yes, because maximum value of long can store is 
        // System.out.println("Maximum value of Long = " + Long.MAX_VALUE);
        // System.out.println("Total milli second passed = " + System.currentTimeMillis());

        // Lecture 97 (The Date Class)

        // Date d = new Date();
        // System.out.println(d);
        // System.out.println(d.getTime());
        // System.out.println(d.getYear()); // Depricated
        // System.out.println(d.getDate()); // Depricated
        // System.out.println(d.getMonth()); // Depricated
        // System.out.println(d.getDay());  // Depricated
        // System.out.println(d.getSeconds());  // Depricated

        // Lecture 98 (The Calender Class)

        // Calendar c = Calendar.getInstance();
        // System.out.println(c.getCalendarType());
        // System.out.println(c.getTimeZone());
        // System.out.println(c.getTime());

        // Calendar c = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
        // System.out.println(c.getCalendarType());
        // System.out.println(c.getTimeZone().getID());

        // System.out.println(c.getTime());
        // System.out.println(c.getTimeInMillis());

        // Lecture 99 (The Gregorian Calendar)

        // Calendar ca = Calendar.getInstance();

        // System.out.println(ca.getTime());
        // System.out.println(ca.get(Calendar.DATE));
        // System.out.println(ca.get(Calendar.MONTH));
        // System.out.println(ca.get(Calendar.DAY_OF_MONTH));
        // System.out.println(ca.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        
        // System.out.print("The time is ---->>>>   ");
        // System.out.println(ca.get(Calendar.HOUR_OF_DAY) + " : " + ca.get(Calendar.MINUTE) + " : " + ca.get(Calendar.SECOND));

        // GregorianCalendar gc = new GregorianCalendar();
        // System.out.println(gc.isLeapYear(2100));

        // TimeZone
        // System.out.println(TimeZone.getAvailableIDs()[0]);
        // System.out.println(TimeZone.getAvailableIDs()[1]);
        // System.out.println(TimeZone.getAvailableIDs()[2]);
        // System.out.println(TimeZone.getDefault());

        // Lecture - 100 (time API)

        // LocalDate l = LocalDate.now();
        // System.out.println(l);
        // LocalTime lt = LocalTime.now();
        // System.out.println(lt);
        // LocalDateTime ldt = LocalDateTime.now();
        // System.out.println(ldt);

        // Lecture - 101 (Date Time Formator java.time)

        // LocalDateTime ldt = LocalDateTime.now();  // this is the date
        // System.out.println(ldt);

        // DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd - MM - YYYY -- E -- H:m a"); // this is the format
        // String myDate = dtf.format(ldt); // creating a string that stores date in the format 
        // System.out.println(myDate);

    }
    
}
