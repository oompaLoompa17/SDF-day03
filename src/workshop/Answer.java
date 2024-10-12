package day03.workshop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Answer {

    public static void main(String[] args) throws FileNotFoundException, IOException{

        String inputFile = args[0];
        String outputFile = args[1];

        // Open inputFile for reading
        FileReader reader = new FileReader(inputFile);
        BufferedReader br = new BufferedReader(reader);

        // Open outputFile for writing
        FileWriter writer = new FileWriter(outputFile);
        BufferedWriter bw = new BufferedWriter(writer);

        String line = "x";
        while (null != line){
            // Read a line
            line = br.readLine();  

            // If line is null, we have reached EOF
            if (null == line)
                break;
            
            // System.out.printf(">>>>> line: %s\n", line.toUpperCase());
            String transformed = line.toUpperCase();

            // Write to file
            bw.write(transformed + "\n");
        }

        // Flush remaining data to file
        bw.close();

        // writer flush
        writer.flush();

        // Close the files
        reader.close();
    }
}
