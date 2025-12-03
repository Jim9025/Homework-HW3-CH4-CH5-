import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

class Sample5_7
{
    public static void main(String[] args)
    {
        try
        {
            // 指定檔案名稱並建立將資料輸出到檔案的文字串流
            FileWriter fw = new FileWriter("test1.txt");
            PrintWriter pw = new PrintWriter(new BufferedWriter(fw));

            // 一行一行輸出資料到檔案
            pw.println("Hello!");
            pw.println("GoodBye!");

            pw.close();   // 關閉檔案

            System.out.println("已經寫入檔案了");
        }
        catch (IOException e)
        {
            System.out.println("輸出入錯誤");
        }
    }
}
