package com.tkonuklar.kayak;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FileUtils {

    public static String readFromFile(final String fileName, final Class<?> clazz) {
        if (!fileName.isBlank()) {
            final var is = clazz.getClassLoader().getResourceAsStream(fileName);
            try (BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
                String strLine;
                while ((strLine = br.readLine()) != null) {
                    return strLine;
                }
            } catch (final Exception e) {
                throw new RuntimeException("An exception occurred while reading the file :" + e.getMessage());
            }
        } else {
            throw new RuntimeException("File name can not be null");
        }
        return "";
    }
}
