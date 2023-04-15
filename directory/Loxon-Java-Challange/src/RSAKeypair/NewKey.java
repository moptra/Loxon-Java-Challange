package RSAKeypair;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.Signature;
import org.apache.commons.codec.binary.Base64;

public class NewKey {
    public static void main(String args[]) throws Exception {

        KeyPairGenerator keyPairGen = KeyPairGenerator.getInstance("RSA");

        FileWriter fileWriter = new FileWriter("C:\\loxon\\keygenerator.pem");

        String str = "xyz";

        for (int i = 0; i < str.length(); i++)
            fileWriter.write(str.charAt(i));
        System.out.println("Successfully written");

        // close the file
        fileWriter.close();


        //Initializing the key pair generator
        keyPairGen.initialize(2048);

        //Generate the pair of keys
        KeyPair pair = keyPairGen.generateKeyPair();

        //Getting the privatekey from the key pair
        PrivateKey privKey = pair.getPrivate();
        //System.out.println(privKey);

        System.out.println(pair.getPrivate());
        System.out.println(pair.getPublic());

/*        System.out.println ("-----BEGIN PRIVATE KEY-----");
        System.out.println (Base64.encode(pair.getPrivate().getEncoded()));
        System.out.println ("-----END PRIVATE KEY-----");
        System.out.println ("-----BEGIN PUBLIC KEY-----");
        System.out.println (Base64.encodeInteger().encodeToString( pair.getPublic().getEncoded()));
        System.out.println ("-----END PUBLIC KEY-----");*/


        //Creating a Signature object
        Signature sign = Signature.getInstance("SHA256withRSA");

        //Initializing the signature
        sign.initSign(privKey);
        byte[] bytes = "Hello how are you".getBytes();


        //Adding data to the signature
        sign.update(bytes);

        //Calculating the signature
        byte[] signature = sign.sign();

        //Initializing the signature
        sign.initVerify(pair.getPublic());
        sign.update(bytes);

        //Verifying the signature
        boolean bool = sign.verify(signature);

        if (bool) {
            System.out.println("Signature verified");
        } else {
            System.out.println("Signature failed");
        }
    }
}

