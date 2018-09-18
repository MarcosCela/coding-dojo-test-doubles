package coding;

import org.junit.Test;

import java.util.Date;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static org.mockito.Mockito.*;

public class PrintDateTest {
    @Test
    public void printsExactlyOneTimeWithDateFromProvider() throws Exception {
        DateProvider testDateProvider = mock(DateProvider.class);
        DatePrinter printerSpy = spy(new ConsolePrinter());
        when(testDateProvider.getDate()).thenReturn(new Date(0));
        PrintDate printDate = new PrintDate(testDateProvider, printerSpy);

        printDate.printCurrentDate();

        verify(printerSpy, times(1)).printDate(new Date(0));
        verify(testDateProvider, times(1)).getDate();
    }

}

