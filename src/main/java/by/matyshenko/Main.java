package by.matyshenko;

import by.matyshenko.comparator.CompareTable;
import by.matyshenko.reader.DataReader;
import by.matyshenko.reader.FileDataReader;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DataReader dataReader = new FileDataReader();
        CompareTable compareTable = new CompareTable();
        System.out.println(compareTable.compareStrings(dataReader.readData()));
    }
}
