package edu.eden;

public class Balanced {

    public static void main(String[] args) {
        System.out.println(f(new int[]{2, 11, 6, 7}));
    }

    static int f(int a[]) {
        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0) {
                if (a[i] % 2 != 0)
                    return 0;
            }
                else if (i % 2 != 0) {
                if (a[i] % 2 == 0)
                    return 0;
            }
                }
                return 1;
            }
        }


