package edu.eden;

public class Sum {

    public static void main(String[] args) {
        System.out.println(f(new int[]{1, 2, 3}));
    }

    static int f(int a[]) {
        if (a.length == 0)
            return 0;
        int sumeven = 0;
        int sumodd = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0)
                sumeven += a[i];
            else
                sumodd += a[i];
        }
            return sumodd - sumeven;

        }
    }
