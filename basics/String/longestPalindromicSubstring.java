package String;

import java.util.Scanner;

public class longestPalindromicSubstring {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string to get the longest palindromicsubstring");
        String s=sc.nextLine();
        System.out.println(lps(s));
        sc.close();
    }
    public static String lps(String s){
        if(s==null){
            return "";
        }
        int start=0,maxLen=0;
        for(int i=0;i<s.length();i++){
            int len1=expandFromCenter(s,i,i);
            int len2=expandFromCenter(s,i,i+1);

            int len=Math.max(len1,len2);

            if(len>maxLen){
                maxLen=len;
                start=i-(len-1)/2;
            }
        }
        return s.substring(start,start+maxLen);
    }
    public static int expandFromCenter(String s,int l,int r){
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
            l--;
            r++;
        }
        return r-l-1;
    }
}
