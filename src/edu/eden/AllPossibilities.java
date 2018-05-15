package edu.eden;

public class AllPossibilities {

    public static void main(String[] args) {
        System.out.println(f(new int[]{1, 2, 0, 3}));
    }

    static int f(int a[]) {
        if (a.length == 0)
            return 0;
        int count = 0;
        for (int i=0; i<a.length; i++) {
            for (int x : a) {
                if (i==x)
                    count++;
            }
        }
        if (count!= a.length)
            return 0;

        return 1;

    }
}
