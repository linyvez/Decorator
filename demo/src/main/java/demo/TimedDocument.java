package demo;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TimedDocument implements Document {
    public Document document;

    @Override
    public String parse() {
        long start = System.currentTimeMillis();

        String result = document.parse();

        long end = System.currentTimeMillis();

        long difference = end - start;
        System.out.println("Time taken to parse: " + difference + " ms");

        return result;
    }
    
}
