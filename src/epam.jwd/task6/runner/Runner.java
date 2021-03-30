package epam.jwd.task6.runner;

import epam.jwd.scanner.DataScanner;
import epam.jwd.task6.unit.DayTime;
import epam.jwd.task6.unit.TimeLogics;

public class Runner {

    public static void main(String[] args) {
        System.out.print("Enter current second: ");
        int currentSecond = DataScanner.enterPositiveIntegerFromConsole();

        DayTime dayTime = TimeLogics.calculateDayTimeByCurrentSecond(currentSecond);
        System.out.printf("Day time is %02d:%02d:%02d\n", dayTime.getHours(), dayTime.getMinutes(), dayTime.getSeconds());
    }
}
