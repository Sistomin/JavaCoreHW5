import java.io.*;

public class WriteToFile {
    public static void main(String[] args) {
        byte[] bytes = {1, 2, 0, 3, 2, 1, 0, 3, 2};

        try (DataOutputStream outputStream = new DataOutputStream(new FileOutputStream("file_write.dat"))) {
            for (byte value : bytes) {
                outputStream.writeByte(value);
            }
            System.out.println("Данные успешно записаны в файл.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
