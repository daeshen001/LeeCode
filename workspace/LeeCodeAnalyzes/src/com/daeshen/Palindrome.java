package com.daeshen;

public class Palindrome {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
System.out.println(method(1232111));
  }
  
  public static boolean method(int x){
    if(x<0||(x%10 == 0 && x != 0)) return false;
    StringBuffer str = new StringBuffer(x+"");
   return str.reverse().toString().equals(String.valueOf(x)); 
  }

}
