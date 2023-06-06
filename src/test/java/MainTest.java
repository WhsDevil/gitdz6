import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void test_generateClients() {
        LinkedList<Person> endList = Main.generateClients();
        Assertions.assertEquals(LinkedList.class, endList.getClass());
    }
}