package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class A {
	
	public static  long getNum(int n){
		long l = 1;
		for(int i = 0;i<n;i++){
			l=getNum(n-11)*n;
		}
		return l;
	}
	public static void getNum(){
		int i=0;  //保存百位上的数
		int j=0;  //保存十位上的数
		int k=0;  //保存各位上的数
		int t=0;  //保存数字个数 
		for(i=1;i<=4;i++){
		   for(j=1;j<=4;j++){
		   for(k=1;k<=4;k++){
		    if(i!=j && j!=k && i!=k){
		         t+=1;
		        System.out.println(i*100+j*10+k);
		    } 
		     }  
		   }
		 }
		System.out.println (t);
	}
	
	public static int getWord(String str){
		String[] s = str.split(" ");
		int n=0;
		for(int i=0;i<s.length;i++){
			boolean t =true;
			for(int j=i;j<s.length-1;j++){
				if(s[i].equals(s[j+1])){
					n++;
					t=false;
					break;
				}
			}
			
			if(t){
				System.out.println(s[i]);
			}
		}
		return s.length-n;
	}
	
	
	public static void main(String[] args) {
		int l=getWord("hi hi i hi hi li bing bing");
		System.out.println(l);
	}
	
	public static void read(String s,String[] ss) throws IOException{
		String[] word = null;
		File  f = new File("s");
		FileReader fr = new FileReader(f) ;
		char[] ch = new char[(int)f.length()];
		int len = fr.read(ch);
		String str = new String(ch, 0, len);
		
		word = str.split(" ");
	}
}
