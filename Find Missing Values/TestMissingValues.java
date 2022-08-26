import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestMissingValues {
    
    MissingValues object = new MissingValues();

    @Test
    public void emptyStringInput(){
        assertEquals("Empty input should return an empty string","", object.findMissingValues(""));
    }
    
    @Test
    public void inputWithSingleValue(){
        assertEquals("Single value input should return an empty string","", object.findMissingValues("45"));
    }

    @Test
    public void inputStringWithNoMissingValue(){
        assertEquals("String with no missing values should return an empty string","", object.findMissingValues("1 2 3"));
    }

    @Test
    public void inputWithMissingValues(){
        assertEquals("String with missing values should return all those missing values","3 6 7",object.findMissingValues("1 2 4 5 8"));    
    }
}