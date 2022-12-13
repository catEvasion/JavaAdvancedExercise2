package academy.everyonecodes.java.assignment.exercise4;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AnalyserTest {

    static AvocadoEntryReader reader = new AvocadoEntryReader();
    Analyser analyser = new Analyser();

    static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(
                        List.of("Highest average price in Boston is: Result not found",
                                "In 2015, the number of organic avocados sold in the whole of the US was: Result not found"),
                        List.of()),
                Arguments.of(
                        List.of("Highest average price in Boston is: 2.19 in 2015",
                                "In 2015, the number of organic avocados sold in the whole of the US was: 3.3569305489999995E7"),
                        reader.read()
                )
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void analyse(List<String> expected, List<AvocadoEntry> entries) {
        List<String> result = analyser.analyse(entries);

        assertEquals(expected, result);
    }
}