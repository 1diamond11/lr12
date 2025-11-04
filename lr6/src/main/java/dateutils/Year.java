package dateutils;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Year {
    private Day day;
    private Month month;
    private int year;

    public Year(Day day, Month month, int year) {
        if (year < 1) {
            throw new IllegalArgumentException("Год должен быть положительным");
        }
        int daysInMonth = month.getDaysInMonth(year);
        if (day.getDay() < 1 || day.getDay() > daysInMonth) {
            throw new IllegalArgumentException(
                    "Некорректный день " + day.getDay() +
                            " для месяца " + month.getMonth() + " и года " + year
            );
        }
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Day getDay() {
        return day;
    }

    public Month getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(Day day) {
        int daysInMonth = this.month.getDaysInMonth(this.year);
        if (day.getDay() < 1 || day.getDay() > daysInMonth) {
            throw new IllegalArgumentException("Некорректный день для текущего месяца и года");
        }
        this.day = day;
    }

    public void setMonth(Month month) {
        int daysInMonth = month.getDaysInMonth(this.year);
        if (this.day.getDay() > daysInMonth) {
            throw new IllegalArgumentException(
                    "Текущий день (" + this.day.getDay() +
                            ") недопустим в новом месяце (" + month.getMonth() + ")"
            );
        }
        this.month = month;
    }

    public void setYear(int year) {
        if (year < 1) {
            throw new IllegalArgumentException("Год должен быть положительным");
        }
        if (this.month.getMonth() == 2 && this.day.getDay() == 29 && !isLeapYear(year)) {
            throw new IllegalArgumentException("29 февраля недопустим в невисокосном году " + year);
        }
        this.year = year;
    }

    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public DayOfWeek getDayOfWeek() {
        LocalDate date = LocalDate.of(year, month.getMonth(), day.getDay());
        return date.getDayOfWeek();
    }

    public static void calculatePeriod(Year startDate, Year endDate) {
        LocalDate start = LocalDate.of(
                startDate.getYear(),
                startDate.getMonth().getMonth(),
                startDate.getDay().getDay()
        );
        LocalDate end = LocalDate.of(
                endDate.getYear(),
                endDate.getMonth().getMonth(),
                endDate.getDay().getDay()
        );

        if (start.isAfter(end)) {
            throw new IllegalArgumentException("Начальная дата не может быть позже конечной");
        }

        long daysBetween = ChronoUnit.DAYS.between(start, end) + 1;
        long monthsBetween = ChronoUnit.MONTHS.between(start, end);

        System.out.println("Количество дней между датами: " + daysBetween);
        System.out.println("Количество полных месяцев между датами: " + monthsBetween);
    }

    @Override
    public String toString() {
        return String.format("%02d.%02d.%d", day.getDay(), month.getMonth(), year);
    }
}