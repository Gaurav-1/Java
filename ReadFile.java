import java.io.*;

class ReadFile{
    public static void main(String[] args) throws IOException{
        File filein = new File("MyFile.txt");
        FileReader reader = new FileReader(filein);
        char[] words = new char[(int) filein.length()];

        reader.read(words);
        System.out.println(words);
        reader.close();
    }
}