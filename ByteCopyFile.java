import java.io.*;

class ByteCopyFile{
    public static void main(String[] args) throws IOException{
        FileInputStream filein;
        try {
            filein = new FileInputStream("MyFile.txt");
        byte[] words = new byte[(int) filein.toString().length()];

        filein.read(words);
        
        FileOutputStream fileout = new FileOutputStream("MyFile2.txt");

        fileout.write(words);
        filein.close();
        fileout.close();
        System.out.println("Data successfully written from MyFile.txt to MyFile2.txt");
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}