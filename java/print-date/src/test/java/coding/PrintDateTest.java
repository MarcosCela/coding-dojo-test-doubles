package coding;

import coding.PrintDate;
import org.junit.Test;

public class PrintDateTest {
    @Test
    public void printDate() throws Exception {
        PrintDate printDate = new PrintDate(new CurrentDateProvider(), new DatePrinter());

        printDate.printCurrentDate();
    }
}
