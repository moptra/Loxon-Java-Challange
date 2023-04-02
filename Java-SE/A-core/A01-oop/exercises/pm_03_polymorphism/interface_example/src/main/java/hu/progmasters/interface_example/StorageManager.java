package hu.progmasters.interface_example;

import java.io.File;

public class StorageManager implements FileManager {
    @Override
    public void upload(String fileName) {
        System.out.println("Storage upload...");
    }

    @Override
    public File download(Long fileId) {
        System.out.println("Storage download...");
        return null;
    }
}
