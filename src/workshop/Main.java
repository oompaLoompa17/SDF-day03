package day03.workshop;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    
    public static void main(String[] args)
        throws FileNotFoundException, IOException {

        BufferedReader br = new BufferedReader( new FileReader("catinthehat.txt") );

        int i;
        while ((i=br.read()) != -1){
            System.out.print((char)i);
        }
        br.close();


        //BufferedWriter bw = new BufferedWriter( new FileWriter("catinthehat.txt"));
        
    }
}
