import java.io.*;

public class SaveLoadData {
    public static void main(String[] args) {

        // The name of the file to open.
        String fileName = "src/main/saveData.txt";

        // This will reference one line at a time
        String line = null;

        try {
            // FileReader reads text files in the default encoding
            FileReader fileReader = new FileReader("resources/saveData.txt");

            //Always wrap FileReader in BufferedReader
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);

            }
        }
        catch(IOException ex) {
            System.out.println("Unable to open file");
            File file = new File("saveData.txt");
            System.out.println(file.getAbsoluteFile());

        }
    }
}
