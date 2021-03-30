package epam.jwd.task2.scanner;

import epam.jwd.scanner.DataScanner;
import epam.jwd.task2.unit.Month;

public class MonthScanner {

    public static Month enterMonthFromConsole() {
        int monthNumber;
        do {
            monthNumber = DataScanner.enterIntegerFromConsole();
        } while (monthNumber < 1 || monthNumber > 12);

        Month enteredMonth = Month.values()[monthNumber - 1];
        return enteredMonth;
    }
}
