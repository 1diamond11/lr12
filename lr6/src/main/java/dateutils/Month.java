package dateutils;

public class Month {
    private int month;

    public Month(int month) {
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Месяц должен быть от 1 до 12");
        }
        this.month = month;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Некорректный месяц");
        }
        this.month = month;
    }

    public int getDaysInMonth(int year) {
        switch (month) {
            case 2:
                return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ? 29 : 28;
            case 4: case 6: case 9: case 11:
                return 30;
            default:
                return 31;
        }
    }
}