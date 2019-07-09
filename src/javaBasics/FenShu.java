package javaBasics;

import java.util.Scanner;

public class FenShu {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        suanfa(num);

    }

    public static void suanfa (int a)
    {

        if (a<=100 && a>=90)
        {
            System.out.println("A");
        }else if (a<90 && a>=80){
            System.out.println("B");
        }else if (a<80 && a>=70){
            System.out.println("C");
        }else if (a<70 && a>=60){
            System.out.println("D");
        }else if (a<60 && a>=0){
            System.out.println("E");
        }

    }


}
