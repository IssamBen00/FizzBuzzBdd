package org.boufnichel;

public class FizzBuzz {

  public String play(int num) {
    String rst = "";

    if(isFizz(num))
      rst += "Fizz";

    if(isBuzz(num))
      rst +=  "Buzz";

    if(rst.isBlank())
      return String.valueOf(num);
    return rst;
  }

  public static boolean isFizz(int num) {
    return num %3 == 0;
  }

  public static boolean isBuzz(int num) {
    return num %5 == 0;
  }
}
