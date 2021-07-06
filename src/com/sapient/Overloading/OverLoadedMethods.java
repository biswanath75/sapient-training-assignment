package com.sapient.Overloading;

public class OverLoadedMethods {
  public  void sum(int n1, int n2){
      System.out.println("Sum of "+n1+" "+n2+"::"+(n1+n2));
  }
  public void sum(int n1,int n2,int n3){
      System.out.println("sum of "+n1+" "+n2+" "+n3+":::::"+(n1+n2+n3));
  }
  public void sum(int n1, Double d1){
      System.out.println("sum of the"+ n1+" "+d1+":::::: "+(n1+d1));
  }


}
