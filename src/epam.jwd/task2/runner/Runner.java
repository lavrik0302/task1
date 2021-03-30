package epam.jwd.task2.runner;

import epam.jwd.scanner.DataScanner;
import epam.jwd.task2.scanner.MonthScanner;
import epam.jwd.task2.unit.DateLogics;
import epam.jwd.task2.unit.Month;

public class Runner {

    public static void main(String[] args) {
        System.out.print("Enter year: ");
        int year = DataScanner.enterPositiveIntegerFromConsole();
        System.out.print("Enter month number: ");
        Month month = MonthScanner.enterMonthFromConsole();

        int daysInMonthAmount = DateLogics.retrieveDaysAmountInMonth(year, month);

        System.out.printf("Amount of days in the %d month of %d: %d\n", month.ordinal() + 1, year, daysInMonthAmount);
    }
}
