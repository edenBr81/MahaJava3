package edu.eden;

public class Ascending {
    public static void main(String[] args) {
        System.out.println(f(new int[]{1,1,2,2,2,3,3}));
    }

    static int f(int a []) {

        int count = 0;
        if ((asc(a) == true) && (a.length > 1)){


        for (int i = 0; i < a.length; i++) {
            for (int x : a) {
                if (a[i] == x)
                    count++;
            }
            if (count < 2)

                return 0;
        }
          }else

            return 0;

            return 1;
        }
        static boolean asc(int a[]){
            for(int i=0;i<a.length-1;i++)
                if(a[i]>a[i+1])
                    return false;
                    return true;
        }
    }

