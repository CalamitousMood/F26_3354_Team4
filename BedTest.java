import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BedTest {

    @Test
    public void testAvailableBed() {
        Bed bed = new Bed(101, "Available");
        assertTrue(bed.checkAvailability());
    }

    @Test
    public void testOccupiedBed() {
        Bed bed = new Bed(102, "Occupied");
        assertFalse(bed.checkAvailability());
    }

    @Test
    public void testUnavailableBed() {
        Bed bed = new Bed(103, "Unavailable");
        assertFalse(bed.checkAvailability());
    }
}
