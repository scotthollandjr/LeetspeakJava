import org.junit.*;
import static org.junit.Assert.*;

public class LeetspeakTest {

  @Test
  public void convert_replaceLettersWithLeet_e_3() {
    Leetspeak testLeet = new Leetspeak();
    String expected = "3";
    assertEquals(expected, testLeet.leetSpeakIt("e"));
  }

  @Test
  public void convert_replaceLettersWithLeet_E_3() {
    Leetspeak testLeet = new Leetspeak();
    String expected = "3";
    assertEquals(expected, testLeet.leetSpeakIt("E"));
  }

  @Test
  public void convert_replaceLettersWithLeet_S_S() {
    Leetspeak testLeet = new Leetspeak();
    String expected = "330";
    assertEquals(expected, testLeet.leetSpeakIt("Eeo"));
  }
}
