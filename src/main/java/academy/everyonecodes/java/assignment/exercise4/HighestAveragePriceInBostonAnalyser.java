package academy.everyonecodes.java.assignment.exercise4;

import java.util.List;
import java.util.Optional;

public class HighestAveragePriceInBostonAnalyser implements AvocadoAnalyser {
    public String analyse(List<AvocadoEntry> avocadoEntries){
        String sentence = "Highest average price in Boston is: ";

        if(avocadoEntries != null && !avocadoEntries.isEmpty()){
            Optional<AvocadoEntry> bostonFirst = avocadoEntries.stream()
                    .filter(avocadoEntry -> avocadoEntry.getRegion().equals("Boston"))
                    .sorted((a1, a2) -> Double.valueOf(a2.getAveragePrice()).compareTo(Double.valueOf(a1.getAveragePrice())))
                    .findFirst();
            if(bostonFirst.isPresent()){
                AvocadoEntry first = bostonFirst.get();
                return sentence + first.getAveragePrice() + " in " + first.getYear();
            }
        }
        return sentence + "Result not found";
    }
}
