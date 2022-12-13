package academy.everyonecodes.java.assignment.exercise4;

import java.util.List;

public class TotalOrganicAvocadosSoldIn2015InTotalUSAnalyser implements AvocadoAnalyser {
    public String analyse(List<AvocadoEntry> avocadoEntries){
        String sentence = "In 2015, the number of organic avocados sold in the whole of the US was: ";
        if(avocadoEntries != null && !avocadoEntries.isEmpty()){
            Double totalSold = avocadoEntries.stream()
                    .filter(avocadoEntry -> avocadoEntry.getYear() == 2015
                            && avocadoEntry.getType().equals("organic")
                            && avocadoEntry.getRegion().equals("TotalUS"))
                    .map(AvocadoEntry::getTotalSold)
                    .reduce(0.0, Double::sum);
            return sentence + totalSold;
        }
        else {
            return sentence + "Result not found";
        }
    }
}
