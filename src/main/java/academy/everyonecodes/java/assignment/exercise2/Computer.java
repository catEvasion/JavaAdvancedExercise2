package academy.everyonecodes.java.assignment.exercise2;

import java.util.List;

public class Computer {

    List<WifiCard> connectedCards = List.of(new WifiCard2Point4GHz(), new WifiCard5GHz());
    String receive(WifiMessage message){
        if(connectedCards.stream().anyMatch(wifiCard -> wifiCard.getFrequency().equals(message.getFrequency()))){
            return message.getContent();
        }
        return "";
    }
}
