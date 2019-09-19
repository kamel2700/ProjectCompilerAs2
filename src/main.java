import java.io.*;

public class main {
    private static Parser rp;
    private static String stringCode;
    public static void main(String[] args)throws IOException {
        FileReader fr = new FileReader("input.txt");
        FileWriter fw = new FileWriter("output.txt");
        rp = new Parser();
        while (true) {
            int c = fr.read();
            if (c == -1) {
                break;
            }
            stringCode += (char)c + "";
        }
        fr.close();
        System.out.println(stringCode);
        //hi
    }
}
