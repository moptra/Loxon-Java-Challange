package RSAKeypair;

import java.security.*;
import java.security.spec.*;
import javax.crypto.*;
import java.io.*;
import java.net.*;

import org.apache.commons.codec.binary.Base64;

public class Main {
    public static void main(String[] args) {
        try {
            // Generate 2048 bit RSA key pair
            KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
            keyGen.initialize(2048);
            KeyPair keyPair = keyGen.generateKeyPair();
            PrivateKey privateKey = keyPair.getPrivate();
            PublicKey publicKey = keyPair.getPublic();

            // Encode keys in base64
            String privateKeyBase64 = Base64.encodeBase64String(privateKey.getEncoded());
            String publicKeyBase64 = Base64.encodeBase64String(publicKey.getEncoded());
            String pemSignature = "-----BEGIN PUBLIC KEY-----\n" + publicKeyBase64 + "\n-----END PUBLIC KEY-----";
            System.out.println(pemSignature);

            // Sign message with private key
            long timeStamp = System.currentTimeMillis();
            String message = "email=petra.montovay@gmail.com&team=Error 404&ts=" + timeStamp;
            Signature signature = Signature.getInstance("SHA256withRSA");
            signature.initSign(privateKey);
            signature.update(message.getBytes());
            byte[] signatureBytes = signature.sign();
            String signatureBase64 = Base64.encodeBase64String(signatureBytes);

            // Send GET request with message and signature
            String url = "http://javachallenge.loxon.eu:8081/game_api/getGameKey?" + "email=petra.montovay%40gmail.com&team=Error%20404&ts=" + timeStamp + "&signature="
                    + URLEncoder.encode(signatureBase64, "UTF-8");
            URL obj = new URL(url);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
            con.setRequestMethod("GET");
            int responseCode = con.getResponseCode();
            System.out.println("Response Code: " + responseCode);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

