package com.sapient.Overloading;



public class TestOverLoad {

    public static void main(String[] args) {
        OverLoadedMethods overLoadedMethods = new OverLoadedMethods();
        overLoadedMethods.sum(10,20);
        overLoadedMethods.sum(10,20,30);
        overLoadedMethods.sum(10,20.3d);

    }
}
