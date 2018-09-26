package project3;

import java.util.Scanner;

public class Project {
	static public void main(String[] ag) {
		Scanner sc = new Scanner(System.in);
		int star;
		System.out.print("몇개의 줄로 별을 출력할까요?");
		star = sc.nextInt();
		if (star <= 0)
			star = 9;
		int sstar = star/2+1;
		for(int j = 0; j < star; j++) {
			if(sstar >= j+1) 
				for (int i = 1; i <= star; i++)
				    if(sstar-j<=i&&i<=sstar+j)
				    	System.out.print("*");
				    else
				    	System.out.print(" ");
			
			else
				for (int i = 1; i<=star; i++)
					if(j+1-sstar>=i||i>=star-j+sstar)
				    	System.out.print(" ");
				    else
				    	System.out.print("*");
			System.out.println();
		}
	}

}


