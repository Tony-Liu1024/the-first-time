package javaBasics.array;

public class Sum {
    public static void main(String[] args) {

        int [] num = {1,2,3,4,5,6,7,8,9};
        int sum = suanfa(num);
        System.out.println(sum);

    }
    public static int suanfa (int [] a){

        int b = 0;

        for (int i = 0; i<a.length; i++)
        {
            if (a[i]%2 == 0)
            {
                b += a[i];
            }
        }

        return b;

    }
}
