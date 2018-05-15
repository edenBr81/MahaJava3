package edu.eden;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println(palindrome(new char[] {'t','0','p','s','p','o','t'}));
    }
       static boolean palindrome(char a[]){
        if(a.length==0)
            return false;
        for(int i=0;i<a.length;i++)
            if(a[i]!=a[(a.length-1)]-i)
                return false;

        return true;
    }



}
