package academy.everyonecodes.java.assignment.exercise1;

import academy.everyonecodes.java.assignment.exercise1.NumberNameShifter;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NumberNameShifterTest {
    NumberNameShifter nameShifter  = new NumberNameShifter();
    @Test
    void shift() {
        assertEquals(List.of(1, 4),nameShifter.shift(List.of("one", "ten", "twenty", "four")));
    }
}