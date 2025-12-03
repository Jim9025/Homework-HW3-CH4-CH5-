import java.io.*;

public class FileReadWriteExample {

    public static void main(String[] args) {
        String filename = "test.txt";

        try {
            // 寫入文字檔
            FileWriter writer = new FileWriter(filename);
            writer.write("Hello Java I/O!\n這是測試文字。");
            writer.close();

            // 讀取文字檔
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            System.out.println("=== 檔案內容如下 ===");

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("發生錯誤: " + e.getMessage());
        }
    }
}
