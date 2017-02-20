import java.io.*;
import java.util.*;

/**
Challenge: Create a method that splits a string on a specified character.
Method's Input Args: String, char

Additional questions:
  1.	Tell me what the runtime complexity of your method is.
  2.	Describe (don’t actually write) a few unit tests you would write for this method.
**/

//Below is my fixed solution:
//  Runtime would be O(N) because the char compare gets executed N times, so runtime will depend on the length of the string.
//  It takes O(N) to print the solution.
//  Tests: return type (is string array); not null; size of returned array (if equals 4); returns "hello", "how", "are", "you".

public class CodingChallenge {
	public static String[] mysplit(String str, char c) {
		ArrayList<String> strList = new ArrayList<String>();
		int lastidx = 0;

		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == c) {
				strList.add(str.substring(lastidx, i));
				lastidx = i + 1;
			}
		}
		
		strList.add(str.substring(lastidx, str.length()));

		return strList.toArray(new String[strList.size()]);
	}

	public static void main(String[] args) {
		String[] solution = mysplit("hello,how,are,you", ',');

		for(int i = 0; i < solution.length; i++) {
			System.out.println(solution[i]);
		}
	}
}

/**************************************************************************************
//Below is what I turned in; I had 15 min to complete the challenge and it was a mess.

public class CodingChallenge {
  public static String[] mysplit(String str, char c) {
    ArrayList strarr;     // WHERE DID ARRAYLIST COME FROM?!!?!??!
    Int origidx = 0; 
    
    For(int index = 0; index < str.length(); index++) {   // "index" should have been 'i'; also init "index" outside of loop
      origidx = index;  // set origidx last in loop
      index = str.indexOf(","); //This is a char dummy
      strarr[i] = substring(origidx, index);  // YOU DIDN'T INIT THE STRING ARRAY SIZE
    }
                
    return strarr;
  }
                
  public static void main(String args[]) {
    String[] solution = mysplit("hello,how,are,you", ",");
                                
    System.out.println(solution); //THIS ISN'T PYTHON!! LOOP TO PRINT!!
  }
}

//runtime is O(N) or as long as the string
//test to make sure not null, make sure str array is returned

**/
