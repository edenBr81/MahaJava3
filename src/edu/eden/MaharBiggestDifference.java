package edu.eden;

public class MaharBiggestDifference {

    public static void main(String[] args) {
        System.out.println(Dfnc(new int[] {1,1,1,1}));
        System.out.println(Dfnc(new int[] {2,5,1,8}));
    }

   static int Dfnc(int[] a){

        int temp;

        if(a == null || a.length ==0 || a.length==1){
            return -1;
        }

        for (int i=1; i<a.length; i++){
            if(a[0]>a[i])

            {
                temp = a[0];
                a[0]=a[i];
                a[i]=temp;
            }
        }

        int min = a[0];
        for(int i = 1; i<a.length; i++){
            if(a[0]<a[i])
            {
                temp = a[0];
                a[0]= a[i];
                a[i]=temp;
            }
        }

        int max = a[0];
        return max - min;
   }
}
