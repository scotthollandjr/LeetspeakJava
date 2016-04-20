import org.junit.*;
import static org.junit.Assert.*;

public class LeetspeakTest {

  @Test
  public void convert_replaceLettersWithLeet_3() {
    Leetspeak testLeet = new Leetspeak();
    String expected = "3";
    assertEquals(expected, testLeet.leetSpeakIt("e"));
  }

}
