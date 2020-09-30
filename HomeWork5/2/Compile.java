package prog.kiev;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

abstract public class Compile {
    static public String Intersection(List<String> first, List<String> second){
        String ans = "";
        HashSet<String> mySet = new HashSet<String>(first);
        for(String i: second) {
            if(mySet.contains(i)){
                ans += i + " ";
            }
        }
        return ans.trim();
    }
}
