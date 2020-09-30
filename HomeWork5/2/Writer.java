package prog.kiev;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Writer{
    private File file;
    Writer(String fileName) throws IOException {
        file = new File(fileName);
        if(!file.exists()){
            file.createNewFile();
        }
    }

    public void write(String data) throws IOException{

        try (FileWriter fileWriter = new FileWriter(file)) {
            fileWriter.write(data);
        } catch (IOException e) {
            //TODO what?
        }
    }
}