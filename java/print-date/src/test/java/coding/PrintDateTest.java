package coding;

import org.junit.Test;

public class PrintDateTest {
    @Test
    public void printDate() throws Exception {
        PrintDate printDate = new PrintDate(new CurrentDateProvider(), new ConsolePrinter());

        printDate.printCurrentDate();
    }
}
