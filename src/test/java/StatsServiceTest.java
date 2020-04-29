import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsServiceTest {
    @Test
    void shouIdCalculatedTotalSum() {
        StatsService service = new StatsService();
        int actual = service.calculateSum();
        int expected = 12;
        assertEquals(expected, actual);
    }
}
