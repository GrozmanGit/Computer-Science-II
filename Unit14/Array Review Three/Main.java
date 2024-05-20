ArrayReviewThree

```
import java.util.*;

public class Main 
{
  public static boolean isEven(int x) 
  {
    if (x % 2 == 0) 
    { return true; }
    return false;
  }

  public static boolean isOdd(int x) 
  {
    if (x % 2 != 0) 
    { return true; }
    return false;
  }

  public static int countEvens(int[] list) 
  {
    int cnt = 0;

    for (int j : list) 
    {
      if (isEven(j)) 
      { cnt++; }
    }
    return cnt;
  }

  public static int[] getListOfEvens(int[] list) 
  {
    int[] evenList = new int[countEvens(list)];

    int i = 0;
    for (int j : list) 
    {
      if (isEven(j)) 
      { evenList[i++] = j; }
    }
    return evenList;
  }

  public static int countOdds(int[] list) 
  {
    int cnt = 0;

    for (int j : list) 
    {
      if (isOdd(j)) 
      { cnt++; }
    }
    return cnt;
  }

  public static int[] getListOfOdds(int[] list) 
  {
    int[] oddList = new int[countOdds(list)];

    int i = 0;
    for (int j : list) 
    {
      if (isOdd(j)) 
      { oddList[i++] = j; }
    }

    return oddList;
  }

  public static int countRange(int[] list, int start, int stop) 
  {
    int cnt = 0;

    for (int x : list)
    {
      if ((x >= start) && (x <= stop)) 
      { cnt++; }
    }
    return cnt;
  }

  public static int[] getListOfRangeValues(int[] list, int start, int stop) 
  {
    int rangeCount = countRange(list, start, stop);
    int[] rangeList = new int[rangeCount];

    int i = 0;
    for (int j : list) 
    {
      if ((j >= start) && (j <= stop)) 
      { rangeList[i++] = j; }
    }
    return rangeList;
  }

  public static void printList(int[] list) 
  {
    for (int j : list) 
    { System.out.print(j + "  "); }
    System.out.println();
  }

  public static void main(String[] args) 
  {
    int[] list1 = { 70, 80, 85, 74, 56, 100 };

    int[] list2 = new int[7];
    list2[0] = 73;
    list2[1] = 95;
    list2[2] = 99;
    list2[3] = 83;
    list2[4] = 100;
    list2[5] = 100;
    list2[6] = 99;

    System.out.println("\u001B[32m" +
        "Array Review 3" +
        "\u001B[33m\n");

    System.out.println("\u001B[32m" +
        "Name: Teresh/GrozmanGit" +
        "\u001B[33m");

    System.out.println("List of All list1 values: ");
    printList(list1);

    System.out.println("\nList of Evens: ");
    int[] array = getListOfEvens(list1);
    printList(array);

    System.out.println("\nList of Odds: ");
    array = getListOfOdds(list1);
    printList(array);

    System.out.println("\nList of values between 90-100 inclusive: ");
    array = getListOfRangeValues(list1, 90, 100);
    printList(array);

    System.out.println("\nList of values below 70: ");
    array = getListOfRangeValues(list1, 0, 69);
    printList(array);

    System.out.println("\n=====================\n");

    System.out.println("List of All list2 values: ");
    printList(list2);
    System.out.println();

    System.out.println("List of Evens: ");
    array = getListOfEvens(list2);
    printList(array);

    System.out.println("\nList of Odds: ");
    array = getListOfOdds(list2);
    printList(array);

    System.out.println("\nList of values between 90-100 inclusive: ");
    array = getListOfRangeValues(list2, 90, 100);
    printList(array);

    System.out.println("\nList of  below 70: ");
    array = getListOfRangeValues(list2, 0, 69);
    printList(array);
  }
}
```
