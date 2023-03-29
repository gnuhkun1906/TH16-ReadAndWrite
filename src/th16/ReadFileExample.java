package th16;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFileExample {
public static void readFileText(String pathFile){
    try {
        //Đọc file
       File file = new File(pathFile);
       if (!file.exists()){
           throw new FileNotFoundException();
       }
       //Đọc từng dòng
        FileReader fr=new FileReader(file);
        BufferedReader br = new BufferedReader(new FileReader(file));
       String line="";
       int sum=0;
        while ((line=br.readLine())!=null){
            System.out.println(line);
            sum+=Integer.parseInt(line);
        }
        System.out.println("Tổng ="+sum);
        br.close();
    }catch (Exception e){
        System.err.println("File không tồn tại hoặc có lỗi!");
    }
}

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập vào đường dẫn");
        String path=scanner.nextLine();
       readFileText(path);
    }
}
