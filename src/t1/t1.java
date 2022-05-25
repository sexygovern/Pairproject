package t1;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.security.Principal;
import java.util.Random;
import java.util.Scanner;


public class t1  {
	static Random r=new Random();
	static char[] c=new char[] {'+','-','*','%'};
	public static int change(int t){
		while(t==0) {
			t=(int)(Math.random()*100);
		}
		return t;
	}
   public static void main(String[] args) throws FileNotFoundException {
	   PrintStream ps = new PrintStream("D:\\1.txt");   //在d盘自动创建一个txt文件
	   Scanner sc=new Scanner(System.in); 
	   
	   System.out.println("请输入您需要的题目数量\n");
	   int i=sc.nextInt();
	   System.setOut(ps);
	   System.out.println("下面是您所需要的"+i+"道四则运算题：");
	   
	   for(int j=0;j<i;j++) {		   
	      int x=(int)(Math.random()*100);
	      int y=(int)(Math.random()*100);
	      
	      if(x==0||y==0) {  //如果random出来的x和y出现0的情况
	    	  if(x==0) {
	    		  x=change(x);
	    	  }
	    	  if(y==0) {
	    		  y=change(y);
	    	  }
	      }
	      char a=c[(int) (Math.random()*4)];
	      if(a=='-'||a=='%'){
	    	  if(y>x) {
	    	  int t=x;
	    	  x=y;
	    	  y=t;
	    	  }
	      }
	   
	      System.out.print(x+""+a+""+y+"=   ");
	      if(a=='*') {
	    	  System.out.print("答案为：");
    		  System.out.println(x*y);
	      }
	      if(a=='+') {
	    	  System.out.print("答案为：");
    		  System.out.println(x+y);
	      }
	      if(a=='-') {
    		  System.out.print("答案为：");
    		  System.out.println(x-y);
    	  }
    	  if(a=='%') {
    		  System.out.print("答案为：");
    		  System.out.printf("%.3f",(float)x/y);
    		  System.out.println();
	      }
	   }
	   ps.close();
   }
}
