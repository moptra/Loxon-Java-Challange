package RSAKeypair;


import java.io.FileWriter;
import java.io.Writer;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;

import org.apache.commons.codec.binary.Base64;

public class PEMEncodingExample {
    public static void main(String[] args) throws Exception {
        // Generate RSA key pair
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        keyPairGenerator.initialize(2048); // Change the key size to suit your needs
        KeyPair keyPair = keyPairGenerator.generateKeyPair();
        PublicKey publicKey = keyPair.getPublic();
        PrivateKey privateKey = keyPair.getPrivate();

        // Encode public key into PEM format
        String encodedPublicKey = Base64.encodeBase64String(publicKey.getEncoded());
        String pemPublicKey = "-----BEGIN PUBLIC KEY-----\n" + encodedPublicKey + "\n-----END PUBLIC KEY-----";
        try (Writer writer = new FileWriter("C:\\Users\\DELL\\Desktop\\Loxon Java Challange\\Keys\\public_key.pem")) {
            writer.write(pemPublicKey);
        }
        System.out.println("Public key encoded in PEM format and saved to public_key.pem");

        // Encode private key into PEM format
        String encodedPrivateKey = Base64.encodeBase64String(privateKey.getEncoded());
        String pemPrivateKey = "-----BEGIN PRIVATE KEY-----\n" + encodedPrivateKey + "\n-----END PRIVATE KEY-----";
        try (Writer writer = new FileWriter("C:\\Users\\DELL\\Desktop\\Loxon Java Challange\\Keys\\private_key.pem")) {
            writer.write(pemPrivateKey);
        }
        System.out.println("Private key encoded in PEM format and saved to private_key.pem");

        // Sign the message
        String message = "Hello, world!";
        Signature signature = Signature.getInstance("SHA256withRSA");
        signature.initSign(privateKey);
        signature.update(message.getBytes());
        byte[] signatureBytes = signature.sign();

        // Encode signature into PEM format
        String encodedSignature = Base64.encodeBase64String(signatureBytes);
        String pemSignature = "-----BEGIN SIGNATURE-----\n" + encodedSignature + "\n-----END SIGNATURE-----";
        try (Writer writer = new FileWriter("C:\\Users\\DELL\\Desktop\\Loxon Java Challange\\Keys\\signature.pem")) {
            writer.write(pemSignature);
        }
        System.out.println("Signature encoded in PEM format and saved to signature.pem");
    }
}

