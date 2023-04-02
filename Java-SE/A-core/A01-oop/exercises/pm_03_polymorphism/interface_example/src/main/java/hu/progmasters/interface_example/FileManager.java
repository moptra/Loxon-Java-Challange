package hu.progmasters.interface_example;

import java.io.File;

/**
 * I know very well, that a FileManager should always have the same behaviour
 * It must have a way, to upload a file
 * and must also know, how to download/return a file based on an ID
 * The way this works in the background, doesn't concern me.
 * I just need a contract, that guarantee, that I can always use these features.
 */
public interface FileManager {

    void upload(String fileName);

    File download(Long fileId);

}
