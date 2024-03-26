import java.io.*;

//Task3
//Прочитать числа из файла, полученного в результате выполнения задания 2

public class ReadFromFile {
    public static void main(String[] args) {
        try {
            byte[] bytes = readBytes("file_write.dat");
            printBytes(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static byte[] readBytes(String filename) throws IOException {
        try (DataInputStream inputStream = new DataInputStream(new FileInputStream(filename))) {
            byte[] bytes = new byte[9];
            for (int i = 0; i < 9; i++) {
                bytes[i] = inputStream.readByte();
            }
            return bytes;
        }
    }

    public static void printBytes(byte[] bytes) {
        System.out.println("Считанные значения из файла:");
        for (byte value : bytes) {
            System.out.println(value);
        }
    }
}
