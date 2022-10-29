import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.*;

public class ListTests {
    @Test
    public void testFilter(){
        StringChecker sc = new checkA();

        List<String> input1 = new ArrayList<>();
        List<String> result = new ArrayList<>();

        input1.add("TOYOTA");
        input1.add("HONDA");
        input1.add("NISSAN");
        input1.add("MITSUBISHI");

        result.add("TOYOTA");
        result.add("HONDA");
        result.add("NISSAN");

        //assertArrayEquals(result.toArray(), ListExamples.filter(input1, sc).toArray());
        assertEquals(result, ListExamples.filter(input1, sc));
    }
}
