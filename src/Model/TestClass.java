package Model;
import javax.swing.*;
import java.text.ParseException;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class TestClass {

    private static TransportationStrategy testtransport[];
    private static Transportmethod methoden [] = {new Auto(), new Trein(),new Bus (), new Taxi()};

    @BeforeAll
    public static void setUp(){
        for (int i = 0; i<4; i++){
            testtransport[i] = new TransportationStrategy();
        }
        for (TransportationStrategy t : testtransport){
            for (int c = 0; c<4; c++){
                t.setStrategy(methoden[c]);
            }
        }
    }

    //een array maken van testt
    @Test
    public void test_set_Strategy_trein(){
        assertTrue(methoden[1].getClass().isInstance(testtransport[1].getStrategy()));
    }


}
