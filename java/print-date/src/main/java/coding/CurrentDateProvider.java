package coding;

import java.util.Date;

public class CurrentDateProvider implements DateProvider {
    public Date getDate() {
        return new Date();
    }
}