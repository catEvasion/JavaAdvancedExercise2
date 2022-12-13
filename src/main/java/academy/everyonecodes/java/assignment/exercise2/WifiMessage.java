package academy.everyonecodes.java.assignment.exercise2;

public class WifiMessage {
    String content;
    Integer frequency;

    public WifiMessage(String content, Integer frequency) {
        this.content = content;
        this.frequency = frequency;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getFrequency() {
        return frequency;
    }

    public void setFrequency(Integer frequency) {
        this.frequency = frequency;
    }
}
