package th2;

import java.util.List;

public class FindMaxValue {
    public static int findMax(List<Integer>numbers){
        int max=numbers.get(0);
        for (int i = 0; i <numbers.size() ; i++) {
            if (numbers.get(i)>max){
                max=numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile=new ReadAndWriteFile();
        String PATH_NUMBER="D:\\JAVA\\session16\\th16-file-Text\\src\\th2\\number.txt";
        String PATH_RESULT="D:\\JAVA\\session16\\th16-file-Text\\src\\th2\\result.txt";
        List<Integer> numbers=readAndWriteFile.readFile(PATH_NUMBER);
        int maxValue=findMax(numbers);
        readAndWriteFile.writeFile(PATH_RESULT,maxValue);
    }

}
