package DSA.Arana.DSAThinkitive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//This is the Java classical method to take input, Introduced in JDK1.0.
//        This method is used by wrapping the System.in (standard input stream)
//        in an InputStreamReader which is wrapped in a BufferedReader, we can read input from the user in the command line.
//
//        The input is buffered for efficient reading.
//        The wrapping code is hard to remember.
public class WaysToReadInput {

  public static void main(String[] args) throws IOException, IOException {
    BufferedReader reader = new BufferedReader(
      new InputStreamReader(System.in)
    );
    String name = reader.readLine();
    System.out.println(name);
  }
}
