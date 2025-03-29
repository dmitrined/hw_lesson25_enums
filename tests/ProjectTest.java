import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class ProjectTest {
    MinimumTask MoonPhase;


    @Test
    public void testGetPhaseDescription() {
        assertEquals("\uD83C\uDF1A Новолуние", MoonPhase.getPhaseDescription("NEW_MOON"));
        assertEquals("\uD83C\uDF15 Полнолуние", MoonPhase.getPhaseDescription("FULL_MOON"));
        assertEquals("\uD83C\uDF18 Убывающий серп", MoonPhase.getPhaseDescription("WAXING_CRESCENT"));
    }

    @Test
    public void testGetPhaseDescriptionCaseInsensitive() {
        assertEquals("\uD83C\uDF1A Новолуние", MoonPhase.getPhaseDescription("new_moon"));
        assertEquals("\uD83C\uDF12 Растущий серп", MoonPhase.getPhaseDescription("wAnInG_cReScEnT"));
    }
    @Test
    public void testValueOf() {
        assertEquals(MoonPhases.NEW_MOON, MoonPhases.valueOf(0));
        assertEquals(MoonPhases.FULL_MOON, MoonPhases.valueOf(100));
        assertEquals(MoonPhases.WANING_CRESCENT, MoonPhases.valueOf(20));

        assertNull(MoonPhases.valueOf(-1));
        assertNull(MoonPhases.valueOf(101));

    }

}

