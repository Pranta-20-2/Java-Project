
package Project;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileOperation {
    
        private File file;			
	private FileWriter writer;		
	private FileReader reader;		
	private BufferedReader bfr;
        
        void write(String str){
            
            try{
                file = new File("Books.txt");
                file.createNewFile();
                public writer = new FileWriter(file, true);
                writer.write(str);
            }
            catch(IOException e){
                System.out.println("Exception caught while writing the file");
            }
        }
             
}
