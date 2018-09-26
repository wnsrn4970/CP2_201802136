package project2;

import java.util.Scanner;

public class Project {
	static public void main(String[] age) {
		Scanner sc = new Scanner(System.in);
		int star;
		System.out.print("몇개의 줄로 별을 출력할까요?");
		star = sc.nextInt();
		if (star <= 0)
			star = 5;
		for(int j = star; j > 0; j--) {
			for (int i = 1; i<=j; i++)
				System.out.print("*");
			System.out.println();
		}
	}

}
