package prog.kiev;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reader{
    private String text = "Not read";
    private File file;

    Reader(String fileName) throws IOException{
        file = new File(fileName);
        if(!file.exists()) throw new FileNotFoundException("file not exist");
    }

    public List<String> read() throws IOException {
        text = "";
        String line;
        List<String> ans = new ArrayList<String>();
        try(Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                line = scanner.next();
                text += line + " ";
                ans.add(line);
            }
        }
        catch (IOException e){
            throw new FileNotFoundException("file is change");
        }
        return ans;
    }

    @Override
    public String toString() {
        return text;
    }
}
