package edu.eden;


/* Ancient multiplication method used for positive integers. In this program it is modified to include multiplication for negative numbers as well.
* while multiplying n1 and n2. In every loop, if n1 is odd, the n2 value is saved for later summation. Again in the same loop n1 is divided by 2 and n2 is multiplied by 2 until n1 is 0.
* The summation later represents the result of the multiplication*/
public class AncientMultiplication {

    public static void main(String[] args) {
        System.out.println(ancientMultiply(-17,-25));
    }

    static int ancientMultiply(int n1, int n2){
        int multiple = 0;
        int absN1 = 0, absN2 = 0;

        int origN1 = n1;
        int origN2 = n2;


        n1 = Math.abs(n1);
        n2 = Math.abs(n2);


        while(n1!=0){
            if(n1%2!=0){
                multiple += n2;
            }
            n1 = n1/2;
            n2 = n2 * 2;
        }

        if(origN1 < 0 && origN2 >0 ){
            multiple = -multiple;
        }
        if(origN2 < 0 && origN1 >0 ){
            multiple = -multiple;
        }

        return multiple;
    }

}
