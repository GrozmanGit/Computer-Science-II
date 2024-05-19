ArrayReviewTwo

```
import java.util.*;

public class Main 
{
  public static boolean isDigit(char ch) 
  {
    if ((ch >= '0') && (ch <= '9')) 
    { return true; }
    return false;
  }

  public static boolean isLowerCase(char ch) 
  {
    if (ch >= 'a) && (ch <= 'z') {
      return true;
    }
    return false;
  }

  public static boolean isUpperCase(char ch) 
  {
    if (ch >= 'A' && ch <= 'Z') 
    { return true; }
    return false;
  }

  public static boolean isLetter(char ch) 
  {
    if ((isUpperCase(ch)) || (isLowerCase(ch)))
    { return true; }
    return false;
  }

  public static boolean isVowel(char ch) 
  {
    ch = Character.toLowerCase(ch);
    String vowels = "aeiou";

    return vowels.indexOf(ch) != -1 ? true : false;
  }

  public static int countDigits(char[] ray) 
  {
    int count = 0;

    for (int i = 0; i < ray.length; i++) 
    {
      if (isDigit(ray[i]))
      { count++; }
    }

    return count;
  }

  public static int countLetters(char[] ray) 
  {
    int cnt = 0;
    for (char ch : ray) 
    {
      if (isLetter(ch) == true)
      { cnt++; }
    }

    return cnt;
  }

  public static int countCapLetters(char[] ray) 
  {
    int cnt = 0;
    for (char ch : ray) 
    {
      if (isUpperCase(ch) == true)
      { cnt++; }
    }

    return cnt;
  }

  public static int countLowerLetters(char[] ray) 
  {
    int cnt = 0;
    for (char ch : ray) 
    {
      if (isLowerCase(ch) == true)
      { cnt++; }
    }

    return cnt;
  }

  public static int countVowels(char[] ray) 
  {
    int cnt = 0;
    for (char ch : ray) {
      if (isVowel(ch) == true)
        cnt++;
    }

    return cnt;
  }

  public static void main(String[] args) 
  {
    char[] array1 = { 'A', '0', 'B', '1', 'c', '.', 'd', 'a', 'e' };

    char[] array2 = new char[10];
    array2[0] = 'X';
    array2[1] = 'Y';
    array2[2] = 'Z';
    array2[3] = 'e';
    array2[4] = '0';
    array2[5] = '8';
    array2[6] = '9';
    
    for (int i = 7; i < array2.length; i++) 
    { array2[i] = '.'; }

    System.out.println("\u001B[32m" + 
       "Array Review 1"  + 
       "\u001B[33m\n");

    System.out.println("\u001B[32m" + 
    "Name: Teresh/GrozmanGit" + 
       "\u001B[33m");

    System.out.println("\u001B[37m\n");

    System.out.println("array1=" + Arrays.toString(array1));
    System.out.println("array2=" + Arrays.toString(array2));
    System.out.println();

    System.out.println("Is '5' a digit? " + isDigit('5'));
    System.out.println("Is 'A' a digit? " + isDigit('A'));

    System.out.println("Is 'a' lower case? " + isLowerCase('a'));
    System.out.println("Is 'A' lower case " + isLowerCase('A'));

    System.out.println("Is 'a' upper case? " + isUpperCase('a'));
    System.out.println("Is 'A' upper case " + isUpperCase('A'));

    System.out.println("Is 'a' letter? " + isLetter('a'));
    System.out.println("Is '.' a letter " + isLetter('.'));

    System.out.println("Is 'a' a vowel? " + isVowel('a'));
    System.out.println("Is 'B' a vowel " + isVowel('B'));

    System.out.println("Digits in array1? " + countDigits(array1));
    System.out.println("Digits in array2? " + countDigits(array2));

    System.out.println("Letters in array1? " + countLetters(array1));
    System.out.println("Letters in array2? " + countLetters(array2));

    System.out.println("Cap Letters in array1? " + countCapLetters(array1));
    System.out.println("CapLetters in array2? " + countCapLetters(array2));

    System.out.println("Lower Letters in array1? " + countLowerLetters(array1));
    System.out.println("Lower Letters in array2? " + countLowerLetters(array2));

    System.out.println("Vowels in array1? " + countVowels(array1));
    System.out.println("Vowels in array2? " + countVowels(array2));
  }
}
```
