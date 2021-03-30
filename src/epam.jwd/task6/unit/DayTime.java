package epam.jwd.task6.unit;

public class DayTime {
    private final int hours;
    private final int minutes;
    private final int seconds;

    public DayTime(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }


    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }
}
