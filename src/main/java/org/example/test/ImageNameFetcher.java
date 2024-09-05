package org.example.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class ImageNameFetcher {
    public static void main(String[] args) {
        // Specify the directory path
        String directoryPath = "/G:/Weeding selected photo 157";
        // Specify the output file path
        String outputPath = "/G:/Weeding selected photo 157.txt";

        // List of valid image extensions
        List<String> validExtensions = Arrays.asList(".jpg", ".jpeg", ".png", ".bmp", ".gif", ".tiff");

        // Create a File object for the directory
        File folder = new File(directoryPath);

        if (folder.isDirectory()) {
            // List all files in the directory
            File[] files = folder.listFiles();

            if (files != null) {
                try (FileWriter writer = new FileWriter(outputPath)) {
                    for (File file : files) {
                        // Check if the file is an image
                        if (file.isFile() && hasValidExtension(file.getName(), validExtensions)) {
                            // Write the image name to the text file
                            writer.write(file.getName() + System.lineSeparator());
                        }
                    }
                    System.out.println("Image names have been written to the file successfully.");
                } catch (IOException e) {
                    System.err.println("An error occurred while writing to the file: " + e.getMessage());
                }
            } else {
                System.err.println("The specified directory is empty or an error occurred while listing files.");
            }
        } else {
            System.err.println("The specified path is not a directory.");
        }
    }

    // Helper method to check if a file has a valid image extension
    private static boolean hasValidExtension(String fileName, List<String> validExtensions) {
        String fileNameLower = fileName.toLowerCase();
        return validExtensions.stream().anyMatch(fileNameLower::endsWith);
    }
}
