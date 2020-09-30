package prog.kiev;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String args[]){
        try {
            Reader r1 = new Reader("a.txt");
            Reader r2 = new Reader("b.txt");
            List<String> str1 = r1.read();
            List<String> str2 = r2.read();
            System.out.println(r1);
            System.out.println(r2);
            String ans = Compile.Intersection(str1, str2);
            System.out.println(ans);
            Writer writer = new Writer("ans");
            writer.write(ans);
        }
        catch (IOException exception){
            System.out.println(exception.getMessage());
        }
    }
}
