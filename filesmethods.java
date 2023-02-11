
import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors
import java.io.FileWriter;   // Import the FileWriter class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class filesmethods {
    public static void main(String[] args){
        //File handling is an important part of any application.
        //Java has several methods for creating, reading, updating, and deleting files.
        //The File class from the java.io package, allows us to work with files.
        File myObj = new File("filename.txt"); // Specify the filename
       //canRead()	Boolean	Tests whether the file is readable or not
       //canWrite()	Boolean	Tests whether the file is writable or not
        //createNewFile()	Boolean	Creates an empty file
        ///delete()	Boolean	Deletes a file
        //exists()	Boolean	Tests whether the file exists
        //getName()	String	Returns the name of the file
        //getAbsolutePath()	String	Returns the absolute pathname of the file
        //list()	String[]	Returns an array of the files in the directory
        //

        //Vamos criar u marquivo
        try{

            File arquivo = new File("Arquivocriado.txt"); // para criar o objeto arquivo e 
            //atribuir a classe File, com seus métodos, tais como criar, ai depois é necessário
            // chamar o objeto e atribuir seu método createNewFile para criar o arquivo

            if(arquivo.createNewFile()){
                System.out.println("Arquivo criado com sucesso e seu nome é" +arquivo.getName());
            }else{
                System.out.println("File already exists.");
            }

        } catch(IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


        //Se quiser criar o arquivo em um diretório específico, na hora de criar o objeto com classe
        // file, vc coloca o caminho antes do nome
        File myObj2 = new File("C:\\Users\\MyName\\filename.txt"); // dessa forma

        //In the following example, we use the FileWriter class together with its write() method to write 
        //some text to the file we created in the example above. 
        //Note that when you are done writing to the file, you should close it with the close() method:

        try{
            //Crie o objeto escrever com a classe FileWriter e coloque o nome do arquivo para ser escrito
            FileWriter escrever = new FileWriter("Arquivocriado.txt");
            //Escreva com o método write() do objeto que herdou os métodos da classe FileWriter
            escrever.write("Files in Java might be tricky, but it is fun enough!");
            escrever.close();
            System.out.println("Successfully wrote to the file.");

        }catch(IOException e){
            System.out.println("An error occurred.");
        e.printStackTrace();
        }


        //In the following example, we use the Scanner class to 
        //read the contents of the text file we created in the previous chapter:

        try{

            File documento = new File("documento.txt"); // criaremos um novo objeto p/ criar o documento
            documento.createNewFile();

        } catch(IOException e){
            System.out.println("An error occurred.");
        e.printStackTrace();
        }

        try{
            File documento = new File("documento.txt");
            FileWriter escrever2 = new FileWriter("documento.txt");
            escrever2.write("Escrevendo algo no documento criado para ser lido");
            escrever2.close();
            Scanner reader = new Scanner("documento");
            while(reader.hasNextLine()){
                String data = reader.nextLine();
                System.out.println(data);
            }
            reader.close();


        }catch(IOException e){
            System.out.println("An error occurred.");
        e.printStackTrace();
        }
        

        









    }
}