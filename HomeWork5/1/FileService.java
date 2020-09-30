package prog.kiev;

import java.io.*;

public class FileService {

    public static void copyFile(File in, File out, int buffSize) throws IOException{
        if(buffSize < 1) {throw new IllegalArgumentException();}
        byte[] myBuff = new byte[buffSize];
        int readByte = 0;
        try(InputStream is = new FileInputStream(in);
            OutputStream os = new FileOutputStream(out)) {
            while((readByte = is.read(myBuff)) > 0){
                os.write(myBuff, 0, readByte);
            }
        }catch (IOException e){
            throw e;
        }
    }
}
