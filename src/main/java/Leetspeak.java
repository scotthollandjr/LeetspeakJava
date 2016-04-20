import java.util.Map;
import java.util.HashMap;

public class Leetspeak {
  public static void main(String[] args) {

  }

  public static String leetSpeakIt(String inputWords) {

    HashMap<String, String> leetLibrary = new HashMap<String, String>();
    leetLibrary.put("e", "3");
    leetLibrary.put("E", "3");
    leetLibrary.put("o", "0");
    leetLibrary.put("O", "0");
    leetLibrary.put("I", "1");
    leetLibrary.put("s", "z");

    char[] letterArray = inputWords.toCharArray();
    String leetWords = new String();

    for (char letter : letterArray) {
      leetWords += leetLibrary.get(Character.toString(letterArray[0]));
    }
    return leetWords;
  }
}


// replace replace "e" with "3"
// replace "o" with "0"
// replace CAPITAL i with "1" (case-sensitive, UPPER)
// replace "s" with "z" unless it is the first letter (case-sensitive, LOWER)
