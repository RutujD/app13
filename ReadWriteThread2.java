//問題１３
/*問題１２のプログラムを流用して、コマンドプロンプトから社員番号、作業内容、作業時間（例： 02:00）
を入力してもらい社員番号名のついた作業報告書（report_xxxx.rpt）を指定したディレクトリ
「C:\tmp(または/tmp)」に作成するプログラムを作ってください。
スレ⏿ドクラス名は ReadWriteThread2、スレ⏿ドを起動するクラスは WorkReport2 クラスとします。*/

package app13.com.test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWriteThread2 implements Runnable{
	   private String employeeNumber;
	    private String workContent;
	   private String workTime;
	    
	    public ReadWriteThread2(String employeeNumber, String workContent, String workTime) {
	        this.employeeNumber = employeeNumber;
	        this.workContent = workContent;
	        this.workTime = workTime;
	    }

	@Override
	public void run() {
		// TODO Auto-generated method stub
		String directory = "C:\\tmp"; 

        try {
            String fileName = directory + "\\report_" + employeeNumber + ".rpt";
            FileWriter fileWriter = new FileWriter(fileName);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write("社員番号: " + employeeNumber + "\n");
            bufferedWriter.write("作業内容: " + workContent + "\n");
            bufferedWriter.write("作業時間: " + workTime + "\n");

            bufferedWriter.close();
            System.out.println("報告書を作成しました: " + fileName);
        } catch (IOException e) {
            System.err.println("エラー: " + e.getMessage());
        }
    }
	}
	

