import java.io.*;

class CopyFile{
    public static void main(String[] args) throws IOException{
        File filein = new File("MyFile.txt");
        FileReader reader = new FileReader(filein);
        char[] words = new char[(int) filein.length()];

        reader.read(words);
        
        File fileout = new File("MyFile2.txt");
        FileWriter writer = new FileWriter(fileout);

        writer.write(words);
        writer.flush();
        reader.close();
        writer.close();
        System.out.println("Data successfully written from MyFile.txt to MyFile2.txt");
    }
}