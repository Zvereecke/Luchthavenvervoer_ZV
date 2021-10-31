package Model;
import javax.swing.*;
import java.text.ParseException;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class TestClass {

    private static TransportationStrategy testtransport[] = {new TransportationStrategy(), new TransportationStrategy(), new TransportationStrategy(), new TransportationStrategy()};
    private static Transportmethod methoden [] = {new Auto(), new Trein(),new Bus (), new Taxi()};

    @BeforeAll
    public static void setUp(){
        int methodencounter = 0;
        for (TransportationStrategy t : testtransport){
                t.setStrategy(methoden[methodencounter]);
                methodencounter += 1;
            }
        }


    @Test
    public void test_set_Strategy_for_all_strategies(){
        for (int i = 0; i<4; i++){
            assertTrue(methoden[i].getClass().isInstance(testtransport[i].getStrategy()));
        }

    }


}
