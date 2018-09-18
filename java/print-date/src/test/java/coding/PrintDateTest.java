package coding;

import org.junit.Test;

import java.util.Date;

import static junit.framework.TestCase.assertTrue;

public class PrintDateTest {
    @Test
    public void printDate() throws Exception {
        DateProvider testDateProvider = new DateProvider() {
            @Override
            public Date getDate() {
                return null;
            }
        };
        DatePrinter testDatePrinter = new TestDatePrinter();

        PrintDate printDate = new PrintDate(testDateProvider, testDatePrinter);

        printDate.printCurrentDate();

        assertTrue(((TestDatePrinter) testDatePrinter).hasPrinted);
    }
}

class TestDatePrinter implements DatePrinter {
    public boolean hasPrinted = false;

    @Override
    public void printDate(Date currentDate) {
        hasPrinted = true;
    }
}