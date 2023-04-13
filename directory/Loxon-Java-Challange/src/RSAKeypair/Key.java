package RSAKeypair;

import java.security.*;
import java.util.Base64;

public class Key {
    public class SignatureVerification {
        public void main (String[] args) throws Exception {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");

            //2048 bites kulcsot generáljatok
            keyPairGenerator.initialize(2048);

            KeyPair keyPair = keyPairGenerator.generateKeyPair();

            PrivateKey privateKey = keyPair.getPrivate();

            //a 'content' aláírásához SHA256withRSA algoritmust használjatok
            Signature sign = Signature.getInstance("SHA256withRSA");

            sign.initSign(privateKey);
            byte[] bytes = "hello how are you".getBytes();

            sign.update(bytes);

            byte[] signature = sign.sign();

            sign.initVerify(keyPair.getPublic());
            sign.update(bytes);

            boolean bool = sign.verify(signature);

            if(bool) {
                System.out.println("Signature verified");
            } else {
                System.out.println("Signature failed");
            }

        }
    }
}
