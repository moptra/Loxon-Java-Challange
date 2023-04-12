package RSAKeypair;

import java.security.*;
import java.util.Base64;

public class Key {
    public class SHA256withRSA {
        public void main (String[] args) throws Exception {
            KeyPairGenerator kpg = KeyPairGenerator.getInstance("RSA");
            kpg.initialize(2048); KeyPair kp = kpg.generateKeyPair();

            System.out.println ("-----BEGIN PUBLIC KEY-----");
            System.out.println (Base64.getMimeEncoder().encodeToString( kp.getPublic().getEncoded()));
            System.out.println ("-----END PUBLIC KEY-----");

        }
    }
}
