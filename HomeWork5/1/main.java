package prog.kiev;

import java.io.File;
import java.io.IOException;

public class main {
    public static void main(String[] args){
        String pathDir = "C:/Users/React/Desktop/Sanya";
        String pathFile = "C:/Users/React/Desktop/Sanya/t.txt";
        String sourceName = "Chto.txt";
        String checkStr = "txt";
        if(sourceName.substring(sourceName.lastIndexOf('.')).equals(checkStr)) {
            try {
                boolean isDir;
                boolean isFile;
                File dir = new File(pathDir);
                isDir = dir.exists();
                if (!isDir) {
                    isDir = dir.mkdir();
                }
                File out = new File(pathFile);
                File in = new File(sourceName);
                isFile = out.exists();
                if (isDir) {
                    if (!isFile) {
                        isFile = out.createNewFile();
                    }
                    if (isFile) {
                        if (in.exists()) {
                            FileService.copyFile(in, out, 2048);
                        } else {
                            throw new IOException("find source trouble");
                        }
                    } else {
                        throw new IOException("file creating trouble");
                    }
                } else {
                    throw new IOException("directory creating trouble");
                }
                System.out.println("Done!");
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
