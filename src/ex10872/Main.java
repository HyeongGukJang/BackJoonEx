package ex10872;

import java.util.Scanner;

public class Main {
	  static long ans;
	  static int num;

	  public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    num = sc.nextInt();
	    ans = 1; //초기화

	    fac(num);
 
	    System.out.print(ans);
	  }

	  //재귀함수
	  static void fac(int num) {
	    //0과 1일 땐 ans에 영향을 주지 않음
	    if (num != 1 && num != 0) {
	      ans = ans * num;
	      num--;
	      fac(num);
	    }
	  }
}