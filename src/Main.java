
public class Main {

  public static void main(String[] args) {

  String str = "Twenty four";
  System.out.println(reverse(str));

  System.out.println(swapValues(10, 20));
  }
  
  public static String reverse(String in) {
    // Handles the exception if the string isn't a proper input
    if (in == null) {
      throw new IllegalArgumentException("Null is not a valid input");
    }
    // Created a StringBuilder
    StringBuilder out = new StringBuilder();

    // Holds the array of characters of 'str'
    char[] chars = in.toCharArray();

    // Iterates over the string starting at the back
    // ... while the index is above zero, continues to count down and print each char
    for (int i = chars.length - 1; i >= 0; i--) {
      out.append(chars[i]);
    }
    return out.toString();
  }

  public static int swapValues(int a, int b) {

    b = b + a;
    a = b - a;
    b = b - a;

    return swapValues(10, 20);
  }

}
