import java.util.Map;
import java.util.HashMap;

public class Leetspeak {

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

    for (int i = 0 ; i < letterArray.length ; i++) {
      String letter = Character.toString(letterArray[i]);
      if ( leetLibrary.get(letter) != null ) {
        leetWords += leetLibrary.get(letter);
      } else {
          leetWords += letter;
      }
    } return leetWords;
  }
}


// replace replace "e" with "3"
// replace "o" with "0"
// replace CAPITAL i with "1" (case-sensitive, UPPER)
// replace "s" with "z" unless it is the first letter (case-sensitive, LOWER)
