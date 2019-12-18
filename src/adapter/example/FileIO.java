package adapter.example;


import java.io.IOException;

public interface FileIO {

    void readFromFile(String filename) throws IOException;

    void writeToFile(String filename) throws IOException;
}
