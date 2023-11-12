package app13.com.test;

import java.util.Scanner;

public class WorkReport2 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("社員番号を入力してください: ");
	        String employeeNumber = scanner.nextLine();

	        System.out.print("作業内容を入力してください: ");
	        String workContent = scanner.nextLine();

	        System.out.print("作業時間を入力してください（例：02:00）: ");
	        String workTime = scanner.nextLine();

	        ReadWriteThread2 readWriteThread = new ReadWriteThread2(employeeNumber, workContent, workTime);
	        Thread thread = new Thread(readWriteThread);

	        thread.start();
	        scanner.close();
	    }
	}
	






