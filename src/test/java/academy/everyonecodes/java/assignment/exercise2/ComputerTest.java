package academy.everyonecodes.java.assignment.exercise2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComputerTest {

    Computer computer = new Computer();
    @Test
    void receive() {
        assertEquals("Hello World", computer.receive(new WifiMessage("Hello World", 5000)));
        assertEquals("Hello World", computer.receive(new WifiMessage("Hello World", 2400)));
        assertEquals("", computer.receive(new WifiMessage("Hello World", 5500)));
    }
}