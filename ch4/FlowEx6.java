package ch4;

import java.util.Scanner;

public class FlowEx6 {
	public static void main(String[] args) {
		System.out.println("현재 월을 입력하세요");
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		switch(month) {
		case 3:
		case 4:
		case 5:
			System.out.println("현재의 계절은 봄입니다");
			break;
		case 6:	case 7: case 8:
			System.out.println("현재의 계절은 여름입니다");
			break;
		case 9:	case 10: case 11:
			System.out.println("현재의 계절은 가을입니다");
			break;
		case 12:case 1: case 2:
			System.out.println("현재의 계절은 겨울입니다");
		}
	}
}
