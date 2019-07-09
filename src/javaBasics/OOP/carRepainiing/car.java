package javaBasics.OOP.carRepainiing;

public class car {

    String name;
    String colour;
    int numOfTires;

    public static void main(String[] args) {

        car car1 = new car();
        car1.numOfTires = 3;
        car1.numOfTires =  car1.run(car1.numOfTires);
        System.out.println(car1.numOfTires);
    }

    public int run(int a)
    {

        if (numOfTires == 4)
        {
            System.out.println("running");
        }else {
            System.out.println("少了" + (4-a) + "个轮胎，需要修理");
            garage g1 = new garage();
            int lack = g1.withTheTytrs(a);
            a = a + lack;
        }

        return a;

    }

}
