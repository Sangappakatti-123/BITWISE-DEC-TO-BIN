package com.jspider.p11;

public class Bitwise {
public static void main(String[] args) {
	int x=68;
	System.out.println(convert(x));
	
	
}       public static String convert(int n) {
	 if(n==0) {
		 return "0";
	 }
	 String k=" ";
	 
	 while(n>0) {
		 k=(((n&1)==0)? '0':'1')+k;
		 n>>=1;
	 }
	 return k;
}
    
}
