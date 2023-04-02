package hu.progmasters.interface_example;

public class Main {

    public static void main(String[] args) {

        /* I wrote this code in '95, and as a wise developer, I used
         an interface, to provide an exchangeable way of the implementation
         */
        FileManager fileManager = new StorageManager();
        fileManager.upload("");
        fileManager.download(1L);

        /*In 2012 cloud services started to become more popular, therefore, to keep up
         with market requirements, I had to replace my outdated storage based file manager,
         and replace it with a cloud based one, without having to rewrite a bunch of code.
         So I simply wrote a new implementation for my FileManager
        */
        fileManager = new CloudManager();
        fileManager.upload("");
        fileManager.download(1L);

        //... Another 50.000 lines of code, all relying/using the methods of my FileManager interface
        //...
        //...
        //...
        //...
        //...
    }
}
