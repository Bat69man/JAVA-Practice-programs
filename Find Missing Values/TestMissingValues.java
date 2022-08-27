import static org.junit.Assert.*;
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
        assertEquals("String with missing values should return all those missing values","2 3 4 6 7 8 9",object.findMissingValues("1 5 10"));
    }

    @Test
    public void inputStringInRandomOrder(){
        assertEquals("String input with random numbers should return missing values in proper format","-1 0 1 2 3 5",object.findMissingValues("4 6 -2"));
    }
}