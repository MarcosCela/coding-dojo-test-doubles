package coding;

import org.junit.Test;

import java.util.Date;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class PrintDateTest {
    @Test
    public void printsExactlyOneTimeWithDateFromProvider() throws Exception {
        DateProvider testDateProvider = new TestDateProvider();
        DatePrinter testDatePrinter = new TestDatePrinter();
        PrintDate printDate = new PrintDate(testDateProvider, testDatePrinter);

        printDate.printCurrentDate();

        assertEquals(((TestDatePrinter) testDatePrinter).timesPrinted, 1);
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

    public int timesPrinted = 0;
    public Date printedDate = null;

    @Override
    public void printDate(Date currentDate) {
        printedDate = currentDate;
        timesPrinted += 1;
    }
}