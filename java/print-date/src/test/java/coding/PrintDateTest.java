package coding;

import org.junit.Test;

import java.util.Date;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class PrintDateTest {
    @Test
    public void printDate() throws Exception {
        DateProvider testDateProvider = new TestDateProvider();
        DatePrinter testDatePrinter = new TestDatePrinter();
        PrintDate printDate = new PrintDate(testDateProvider, testDatePrinter);

        printDate.printCurrentDate();

        assertTrue(((TestDatePrinter) testDatePrinter).hasPrinted);
        assertEquals(((TestDatePrinter) testDatePrinter).printedDate, ((TestDateProvider) testDateProvider).dateToReturn);
    }

}

class TestDateProvider implements DateProvider {
    public final Date dateToReturn = new Date(0);

    @Override
    public Date getDate() {
        return dateToReturn;
    }
}

class TestDatePrinter implements DatePrinter {

    public boolean hasPrinted = false;
    public Date printedDate = null;

    @Override
    public void printDate(Date currentDate) {
        printedDate = currentDate;
        hasPrinted = true;
    }
}