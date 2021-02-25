package sample;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Main  {

    static String input_file = "./src/input/";
    static String output_file = "./src/output/";
    static ArrayList<String> inputList;
    static ArrayList<String> outputList;

    public static void main(String[] args) throws IOException {
        String[] input_files = {"a_example"};
        for (String inputFile : input_files) {
            inputList = new ArrayList<>();
            outputList = new ArrayList<>();
            processFile(inputFile);
        }
    }

    private static void processFile(String fileName) throws IOException {
        //function to generate input and output
        //System.out.println("");
        System.out.println("------------------------");
        System.out.println(fileName);
        System.out.println("------------------------");

        BufferedReader fr = new BufferedReader(new FileReader(input_file + fileName + ".in"));
        outputList = solve(inputList);

        // Print output data and create output file
        try (PrintWriter output = new PrintWriter(output_file + fileName + ".out", "UTF-8")) {
            output.println(outputList.size());
            System.out.println(outputList.size());
            for (String outputLine : outputList) {
                output.print(outputLine + " ");
                System.out.print(outputLine + " ");
            }
        }
    }

    private static ArrayList<String> solve(ArrayList<String> inputList) {
        //solution to problem here
        return  null;
    }
}
