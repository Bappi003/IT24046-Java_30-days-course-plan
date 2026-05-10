#  Example 1
~~~ java
import java.io.File;

public class IT24046 {

    public static void main(String[] args) {

        File myFile = new File("example.txt");

        if(myFile.exists()) {

            System.out.println("File exists.");
        }
        else {

            System.out.println("File does not exist.");
        }
    }
}
~~~
#  Example 2
~~~ java
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class IT24046 {

    public static void main(String[] args) {

        try {

            FileWriter writer =
                    new FileWriter("output.txt");

            BufferedWriter bufferedWriter =
                    new BufferedWriter(writer);

            bufferedWriter.write("Hello, World!");

            bufferedWriter.newLine();

            bufferedWriter.write(
                    "This is a Java file handling example.");

            bufferedWriter.close();

            System.out.println(
                    "Data written to file successfully.");

        }
        catch(IOException e) {

            System.out.println(
                    "An error occurred: "
                    + e.getMessage());
        }
    }
}
~~~
#  Example 3
~~~ java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class IT24046 {

    public static void main(String[] args) {

        try {

            FileReader reader =
                    new FileReader("output.txt");

            BufferedReader bufferedReader =
                    new BufferedReader(reader);

            String line;

            while((line =
                    bufferedReader.readLine()) != null) {

                System.out.println(line);
            }

            bufferedReader.close();
        }
        catch(IOException e) {

            System.out.println(
                    "An error occurred: "
                    + e.getMessage());
        }
    }
}
~~~
