import java.io.IOException;
import java.io.FileOutputStream;

public class Main {

    public static void main(String[] args)
            throws IOException {

        FileOutputStream outputStream = new FileOutputStream("50k_descending.txt");
        int fileSize = 50000;

        // random
            /*for (int i = 0; i < fileSize; i++) {
                byte[] strToBytes = (String.valueOf((int)(Math.random() * 100 + 1)) + " ").getBytes();
                outputStream.write(strToBytes);
            }*/

        // Ascending
            /*for (int i = 0; i < fileSize; i++) {
                byte[] strToBytes = (String.valueOf(i) + " ").getBytes();
                outputStream.write(strToBytes);
            }*/

        // Descending
        for (int i = fileSize; i > 0; i--) {
            byte[] strToBytes = (String.valueOf(i) + " ").getBytes();
            outputStream.write(strToBytes);
        }

        outputStream.close();
    }
}
