package com.sapilent.Training;

import java.util.*;
public class Problem2 {


        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int a = scan.nextInt();
            // Complete this line
            // Complete this line
            int b = scan.nextInt();
            int c = scan.nextInt();
            scan.close();

            System.out.println(a);
            // Complete this line
            // Complete this line
            System.out.println(b);
            System.out.println(c);
        }

    public static class Problem4 {
        public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                int numLines = Integer.parseInt(sc.nextLine());
                ArrayList<ArrayList> listArray = new ArrayList<ArrayList>();
                for(int i = 0;i<numLines;i++){
                    int numOfIntegers = sc.nextInt();
                    ArrayList<Integer> intArrayList =  new ArrayList<Integer>();
                    for(int j=0;j<numOfIntegers;j++){
                        intArrayList.add(new Integer(sc.nextInt()));
                    }
                    listArray.add(intArrayList);
                    sc.nextLine();
                }
                int numQueries = Integer.parseInt(sc.nextLine());
                for(int i=0;i<numQueries;i++){
                    int x = sc.nextInt()-1;
                    int y = sc.nextInt()-1;
                    sc.nextLine();
                    if(x<listArray.size() && y<listArray.get(x).size()){
                        System.out.println(listArray.get(x).get(y));
                    }else{
                        System.out.println("ERROR!");
                    }
                }
            }
        }

    public static class problem5 {
            static int B,H;
            static boolean flag = true;
            static {
                Scanner sc = new Scanner(System.in);
                B = sc.nextInt();
                H = sc.nextInt();
                if(B<=0 || H<=0){
                    System.out.println("java.lang.Exception: Breadth and height must be positive");
                    flag = false;
                }
            }
        }
}

