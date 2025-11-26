import java.io.*;
import java.util.*;

public class FivePointSum {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        String inputFile = "input.txt";
        String outputFile = "output.txt";

        try {
        
            Scanner sc = new Scanner(new File(inputFile));
            while (sc.hasNextInt()) {
                numbers.add(sc.nextInt());
            }
            sc.close();

            if (numbers.isEmpty()) {
                System.out.println("No data found in input file!");
                return;
            }

            

            Collections.sort(numbers);

            // Calculate min, max, mean, median, mode
            int min = numbers.get(0);
            int max = numbers.get(numbers.size() - 1);
            double mean = getMean(numbers);
            double median = getMedian(numbers);
            int mode = getMode(numbers);

            
            PrintWriter pw = new PrintWriter(new FileWriter(outputFile));
            pw.println("Five Point Summary:");
            pw.println("Minimum: " + min);
            pw.println("Maximum: " + max);
            pw.println("Mean: " + mean);
            pw.println("Median: " + median);
            pw.println("Mode: " + mode);
            pw.close();

            System.out.println("Five point summary written to " + outputFile);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    //  mean
    private static double getMean(List<Integer> list) {
        double sum = 0;
        for (int num : list)
            sum += num;
        return sum / list.size();
    }

    //  median
    private static double getMedian(List<Integer> list) {
        int size = list.size();
        if (size % 2 == 0)
            return (list.get(size / 2 - 1) + list.get(size / 2)) / 2.0;
        else
            return list.get(size / 2);
    }

    //  mode
    private static int getMode(List<Integer> list) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : list) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        int mode = list.get(0);
        int maxCount = 0;
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mode = entry.getKey();
            }
        }
        return mode;
    }
}
