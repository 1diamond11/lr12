import marmot.Marmot;
import dateutils.*;

import java.time.DayOfWeek;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1: Сурок");
        Marmot marmot1 = new Marmot();
        Marmot marmot2 = new Marmot("Фил", 5, "Пенсильвания", false, 4);

        System.out.println(marmot1);
        System.out.println(marmot2);

        marmot2.whistle();
        marmot2.feed();

        System.out.println("\nЗадание 2: Дата");

        Day day = new Day(2);
        Month month = new Month(2);
        Year date = new Year(day, month, 2025);

        DayOfWeek dow = date.getDayOfWeek();
        System.out.println(date + " — " + dow);

        Year start = new Year(new Day(1), new Month(1), 2025);
        Year end = new Year(new Day(31), new Month(12), 2025);

        Year.calculatePeriod(start, end);
    }
}