package by.matyshenko.reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileDataReader implements DataReader {

    private static final String PATH_IN_FILE = "D:\\Programming\\Tests\\src\\main\\resources\\input.txt";

    @Override
    public List<String> readData() {
        List<String> stringList = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(PATH_IN_FILE))) {
            while (bufferedReader.ready()) {
                stringList.add(bufferedReader.readLine());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringList;
    }
}
