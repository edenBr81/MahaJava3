package edu.eden;

public class Eval {

    public static void main(String[] args) {
        System.out.println(eval((new int[]{0,1,2,3,4}),1.0));
//        System.out.println(f((new int[]{1,2,3}),8));
    }

    static double eval(int a[],double x) {
        double result = 0;

        for (int i = a.length - 1; i >= 0; i--) {
            result = result + a[i] * (Math.pow(x, i));
        }
             return result;
        }
    }

