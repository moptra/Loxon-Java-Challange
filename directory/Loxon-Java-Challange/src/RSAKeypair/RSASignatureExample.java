package RSAKeypair;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;

import org.apache.commons.codec.binary.Base64;

public class RSASignatureExample {
    public static void main(String[] args) throws Exception {
        // Generate RSA key pair
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        keyPairGenerator.initialize(2048); // Change the key size to suit your needs
        KeyPair keyPair = keyPairGenerator.generateKeyPair();
        PublicKey publicKey = keyPair.getPublic();
        PrivateKey privateKey = keyPair.getPrivate();

        // Sign the message
        String message = "Hello, world!";
        Signature signature = Signature.getInstance("SHA256withRSA");
        signature.initSign(privateKey);
        signature.update(message.getBytes());
        byte[] signatureBytes = signature.sign();

        // Encode the signature using Base64
        String encodedSignature = Base64.encodeBase64String(signatureBytes);
        System.out.println("Encoded Signature: " + encodedSignature);

        // Verify the signature
        Signature signatureVerifier = Signature.getInstance("SHA256withRSA");
        signatureVerifier.initVerify(publicKey);
        signatureVerifier.update(message.getBytes());
        boolean isValid = signatureVerifier.verify(Base64.decodeBase64(encodedSignature));
        System.out.println("Signature is valid: " + isValid);
    }
}