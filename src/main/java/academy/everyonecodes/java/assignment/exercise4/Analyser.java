package academy.everyonecodes.java.assignment.exercise4;

import java.util.List;

public class Analyser {
    private AvocadoAnalyser analyserBoston = new HighestAveragePriceInBostonAnalyser();
    private AvocadoAnalyser analyser2015 = new TotalOrganicAvocadosSoldIn2015InTotalUSAnalyser();

    public List<String> analyse(List<AvocadoEntry> avocadoEntries){
        return List.of(analyserBoston.analyse(avocadoEntries), analyser2015.analyse(avocadoEntries));
    }
}
