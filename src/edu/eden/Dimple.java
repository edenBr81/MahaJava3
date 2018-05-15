package edu.eden;

public class Dimple {
    public static void main(String[] args) {
        System.out.println(countdimpels(new int[]{3,-2,0,1000,83,84}));
    }
    static int countdimpels(int a[]){
        int count=0;
        for (int i=1;i<a.length-1;i++){
            if((a[i-1]<a[i]) && a[i]>a[i+1])
                count++;

        }
        return count;
    }
}
