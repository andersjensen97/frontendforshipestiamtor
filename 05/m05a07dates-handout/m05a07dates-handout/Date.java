public class Date {
    private int year;
    private int month;
    private int day;

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String toISO() {
        String yearStr = String.valueOf(year);
        String monthStr = String.valueOf(month);
        String dayStr = String.valueOf(day);

        if (month < 10) {
            monthStr = "0" + monthStr;
        }

        if (day < 10) {
            dayStr = "0" + dayStr;
        }

        return yearStr + " " + monthStr + " " + dayStr;
    }

    public boolean isValid() {
        if (month < 1 || month > 12) {
            return false;
        }

        int daysInMonth = daysInMonth(year, month);
        if (day < 1 || day > daysInMonth) {
            return false;
        }

        return true;
    }

    public int daysUntil(Date target) {
        int days = 0;

        int daysInCurrentYearUpToCurrentMonth = 0;
        for (int i = 1; i < month; i++) {
            daysInCurrentYearUpToCurrentMonth += daysInMonth(year, i);
        }

        int daysInTargetYearUpToTargetMonth = 0;
        for (int i = 1; i < target.month; i++) {
            daysInTargetYearUpToTargetMonth += daysInMonth(target.year, i);
        }

        days = daysInTargetYearUpToTargetMonth - daysInCurrentYearUpToCurrentMonth + target.day - day;

        if (target.year > year) {
            days += daysInYear(year);
        }

        return days;
    }

    private static int daysInMonth(int year, int month) {
        if (month == 2 && isLeapYear(year)) {
            return 29;
        } else if (month == 2) {
            return 28;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        } else {
            return 31;
        }
    }

    private static boolean isLeapYear(int year) {
        return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
    }
}
