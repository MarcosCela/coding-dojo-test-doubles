package coding;

import java.util.Date;

public class ConsolePrinter implements DatePrinter {
    public void printDate(Date currentDate) {
        System.out.println(currentDate);
    }
}
