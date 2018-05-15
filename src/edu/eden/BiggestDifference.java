package edu.eden;

public class BiggestDifference {
    public static void main(String[] args) {
        System.out.println((new int[] {2,8,5,3}));
    }

    static int biggestDiff(int a[]){
        int greatest = 0, diff1 = 0, diff2=0;
        if(a==null ||a.length==1|| a.length==0)
            return -1;

        for(int i=0; i< a.length; i++){
            for (int j=i+1; j<a.length-1-i; j++){
                diff1 = Math.abs(a[i]-a[j]);
                diff2 = Math.abs(a[i]-a[j+1]);
                if(diff1 >= diff2 )
                    greatest = diff1;
                else greatest = diff2;

            }

        }
        return greatest;
    }
}
