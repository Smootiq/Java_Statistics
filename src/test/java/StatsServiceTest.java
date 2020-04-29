import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsServiceTest {
    @Test
    void shouIdCalculatedTotalSum() {
        StatsService service = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.calculateSum(purchases);
        int expected = 180;
        assertEquals(expected, actual);
    }
    @Test
    void shouIdCalculatedTotalMax() {
        StatsService service = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.findMax(purchases);
        int expected = 20;
        assertEquals(expected, actual);
    }
    @Test
    void shouIdCalculatedTotalMin() {
        StatsService service = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.findMin( purchases );
        int expected = 7;
        assertEquals( expected, actual );
    }
}