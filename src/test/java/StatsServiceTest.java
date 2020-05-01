import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsServiceTest {
    @Test
    void shouIdCalculatedTotalSum() {
        StatsService service = new StatsService();
        int[] numbers = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.calculateSum( numbers );
        int expected = 180;
        assertEquals( expected, actual );
    }

    @Test
    void shouIdCalculatedAverageSales() {
        StatsService service = new StatsService();
        int[] numbers = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.calculateAverage( numbers );
        int expected = 15;
        assertEquals( expected, actual );
    }
    @Test
    void shouIdCalculatedMaxIndex() {
        StatsService service = new StatsService();
        int[] numbers = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.calculateMax( numbers );
        int expected = 5;
        assertEquals( expected, actual );
    }
    @Test
    void shouIdCalculatedMinIndex() {
        StatsService service = new StatsService();
        int[] numbers = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.calculateMin( numbers );
        int expected = 8;
        assertEquals( expected, actual );
    }
    @Test
    void shouIdCalculatedLowAverage() {
        StatsService service = new StatsService();
        int[] numbers = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.calculateLowAverage( numbers );
        int expected = 5;
        assertEquals( expected, actual );
    }
    @Test
    void shouIdCalculatedHighAverage() {
        StatsService service = new StatsService();
        int[] numbers = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.calculateHighAverage( numbers );
        int expected = 5;
        assertEquals( expected, actual );
    }
}
