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

  @Test
  public void convert_replaceLettersWithLeet_mult() {
    Leetspeak testLeet = new Leetspeak();
    String expected = "1 l0v3 3pic0duz";
    assertEquals(expected, testLeet.leetSpeakIt("I love Epicodus"));
  }
}
