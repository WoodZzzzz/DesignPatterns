package adapter.example;

import java.io.*;
import java.util.Properties;

/**
 * 适配器模式，将Properties支持Stream适配成支持文件IO操作的类
 */
public class FileProperties extends Properties implements FileIO {

    @Override
    public void readFromFile(String filename) {
        try (InputStream inputStream = new FileInputStream(filename)) {
            load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void writeToFile(String filename) {
        try (OutputStream outputStream = new FileOutputStream(filename);) {
            store(outputStream, "这是注释");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setValue(String name, String value) {
        setProperty(name, value);
    }
}
