/* 
+------------------------------------+
|             MyDate                 |
+------------------------------------+
| - year: int                        |
| - month: int                       |
| - day: int                         |
+------------------------------------+
| + MyDate()                         |
| + MyDate(elapsedTime: long)        |
| + MyDate(year: int, month: int, day: int) |
| + getYear(): int                   |
| + getMonth(): int                  |
| + getDay(): int                    |
| + setDate(elapsedTime: long): void |
+------------------------------------+
| - initializeToCurrentDate(): void  |
| - initializeFromElapsedTime(elapsedTime: long): void |
| - isValidDate(year: int, month: int, day: int): boolean |
+------------------------------------+
*/

import java.util.Calendar;

public class MyDate {
    private int year;
    private int month; 
    private int day;

    // No-arg constructor creates a MyDate object for the current date
    public MyDate() {
        initializeToCurrentDate();
    }

    // Constructor that constructs a MyDate object with a specified elapsed time
    public MyDate(long elapsedTime) {
        initializeFromElapsedTime(elapsedTime);
    }

    // Constructor that constructs a MyDate object with the specified year, month, and day
    public MyDate(int year, int month, int day) {
        if (isValidDate(year, month, day)) {
            this.year = year;
            this.month = month;
            this.day = day;
        } else {
            throw new IllegalArgumentException("Invalid date");
        }
    }

    // Getter for year
    public int getYear() {
        return year;
    }

    // Getter for month
    public int getMonth() {
        return month;
    }

    // Getter for day
    public int getDay() {
        return day;
    }

    // Method to set date from elapsed time
    public void setDate(long elapsedTime) {
        initializeFromElapsedTime(elapsedTime);
    }

    // Private method to initialize date to current date
    private void initializeToCurrentDate() {
        Calendar now = Calendar.getInstance();
        this.year = now.get(Calendar.YEAR);
        this.month = now.get(Calendar.MONTH);
        this.day = now.get(Calendar.DAY_OF_MONTH);
    }

    // Private method to initialize date from elapsed time
    private void initializeFromElapsedTime(long elapsedTime) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(elapsedTime);
        this.year = calendar.get(Calendar.YEAR);
        this.month = calendar.get(Calendar.MONTH);
        this.day = calendar.get(Calendar.DAY_OF_MONTH);
    }

    // Method to validate if a given date is valid
    private boolean isValidDate(int year, int month, int day) {
        if (month < 0 || month > 11) {
            return false;
        }

        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, day);
        return (calendar.get(Calendar.YEAR) == year &&
                calendar.get(Calendar.MONTH) == month &&
                calendar.get(Calendar.DAY_OF_MONTH) == day);
    }

    // Main method to test the MyDate class
    public static void main(String[] args) {
        MyDate date1 = new MyDate();
        System.out.println("Date1: Year = " + date1.getYear() + ", Month = " + date1.getMonth() + ", Day = " + date1.getDay());

        MyDate date2 = new MyDate(34355555133101L);
        System.out.println("Date2: Year = " + date2.getYear() + ", Month = " + date2.getMonth() + ", Day = " + date2.getDay());
    }
}
