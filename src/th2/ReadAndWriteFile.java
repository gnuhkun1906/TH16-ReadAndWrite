package th2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public List<Integer> readFile(String pathFile) {
        List<Integer> numbers = new ArrayList<>();
        try {
            //Khởi tạo đối tượng cần đọc
            File file=new File(pathFile);
            if (!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader br=new BufferedReader(new FileReader(file));
            String line="";
            while((line=br.readLine())!=null){
                numbers.add(Integer.parseInt(line));
            }
            br.close();
        } catch (Exception e) {
            System.err.println("File không tồn tại hoặc lỗi!");
        }
       return numbers;
    }
    public void writeFile(String path, int max){
        try {
            FileWriter writer=new FileWriter(path,true);
            BufferedWriter bufferedWriter=new BufferedWriter(writer);
            bufferedWriter.write("Giá trị lớn nhất là: "+max);
            bufferedWriter.close();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
