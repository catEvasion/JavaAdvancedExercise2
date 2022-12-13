package academy.everyonecodes.java.assignment.exercise1;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class NumberNameShifter {
    NumberNamesDictionary dictionary = new NumberNamesDictionary();
    public List<Integer> shift(List<String> numberNames){
        return numberNames.stream()
                .map(numberName -> dictionary.getNumber(numberName))
                .filter(Optional::isPresent)
                .map(Optional::get)
                .collect(Collectors.toList());
    }

}
