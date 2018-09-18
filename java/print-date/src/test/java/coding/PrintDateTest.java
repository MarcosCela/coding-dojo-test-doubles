package coding;

import org.junit.Test;

import java.util.Date;

public class PrintDateTest {
    @Test
    public void printDate() throws Exception {
        DateProvider testDateProvider = new DateProvider() {
            @Override
            public Date getDate() {
                return null;
            }
        };
        DatePrinter testDatePrinter = new DatePrinter() {
            @Override
            public void printDate(Date currentDate) {
            }

        };

        PrintDate printDate = new PrintDate(testDateProvider, testDatePrinter);

        printDate.printCurrentDate();
    }
}
