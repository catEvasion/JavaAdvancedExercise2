package academy.everyonecodes.java.assignment.exercise1b;

import java.util.List;
import java.util.stream.Collectors;

public class AthleteFinder {
    public List<Athlete> find(List<Athlete> athletes){
        List<Athlete> filterdAthlets = athletes.stream()
                .filter(athlete -> !athlete.isSuspended() && athlete.getHeight() >= 1.75 && athlete.getHeight() <= 2.0)
                .collect(Collectors.toList());
        filterdAthlets.sort((a1, a2) -> a2.getHeight().compareTo(a1.getHeight()));
//        filterdAthlets.forEach(a -> System.out.println(a));
        List<Athlete> tallestFive = filterdAthlets.subList(0, 5);
//        System.out.println("---------------");
//        tallestFive.forEach(a -> System.out.println(a));
//        System.out.println("---------------");
        tallestFive.sort((a1, a2) -> a1.getLastName().compareTo(a2.getLastName()));
//        tallestFive.forEach(a -> System.out.println(a));
        return tallestFive;
    }
}
