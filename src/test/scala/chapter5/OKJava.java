package chapter5;

import java.util.*;

public class OKJava {
  public static void main(String[] args) {
      // #snip
      //Java code
    ArrayList<Integer> list = new ArrayList<Integer>();
    ArrayList<Object> list2 = list; // Compilation error
      // #snip

      //#snip_1
    ArrayList list3 = list;
      //#snip_1
  }
}
