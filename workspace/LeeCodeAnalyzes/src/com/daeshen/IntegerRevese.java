package com.daeshen;

public class IntegerRevese {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    //System.out.println(reverse(Integer.MIN_VALUE));
    //System.out.println(Integer.MAX_VALUE);
  System.out.println(reverse(1234123457));
  }

  
  public static  int reverse(int x){
    if(x==Integer.MIN_VALUE)
      return Integer.MIN_VALUE;
    int temp = Math.abs(x);
    int res =0;
    while(temp!=0){
      if(res>(Integer.MAX_VALUE-temp%10)/10)
        return x>0?Integer.MAX_VALUE:Integer.MIN_VALUE;
      res=res*10+temp%10;
      System.out.println(res+"+"+ temp);
      temp/=10;
            }
    return x>0 ? res:-res;
  }
}
