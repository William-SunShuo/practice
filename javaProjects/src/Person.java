import java.io.File;

public class Person {

    public static void main(String[] args) {
        String recordFilePath = "abcd/abcd.wav";
        recordFilePath = recordFilePath.replaceAll("[a-fA-F0-9]+.wav", 1234+ ".wav");
        System.out.println(recordFilePath);
    }
}
