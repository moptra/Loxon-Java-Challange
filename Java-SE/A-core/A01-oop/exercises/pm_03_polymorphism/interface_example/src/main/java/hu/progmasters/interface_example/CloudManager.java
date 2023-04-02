package hu.progmasters.interface_example;

import java.io.File;

public class CloudManager implements FileManager {

    @Override
    public void upload(String fileName) {
        System.out.println("Uploading to cloud...");
    }

    @Override
    public File download(Long fileId) {
        System.out.println("Download from cloud...");
        return null;
    }
}
