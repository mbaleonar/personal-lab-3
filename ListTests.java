import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.*;

interface StringChecker { boolean checkString(String s); }

public class ListTests implements StringChecker{
    @Test 
	public void testFilter() {
        List<String> testList = new ArrayList<>();
        testList.add("First");
        testList.add("Second");
        testList.add("Paris");
        testList.add("Coffee");
        StringChecker sc = new StrLen();
        checkString("He");
        List<String> newList = ListExamples.filter(testList, sc);
        assertEquals(new ArrayList<> ("First"), newList);
    }

    @Test 
	public void testMerge() {
    }

    //checks if string is 
    public boolean checkString(String s){

        return false;
    }
}
