package RSAKeypair;

import java.io.*;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.security.*;
import java.security.interfaces.RSAPrivateKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Scanner;

import org.apache.commons.codec.binary.Base64;

import com.google.common.base.Splitter;

public class PEMEncodingExample {
    public static void main(String[] args) throws Exception {

        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        keyPairGenerator.initialize(2048);
        KeyPair keyPair = keyPairGenerator.generateKeyPair();
        PublicKey publicKey = keyPair.getPublic();
        PrivateKey privateKey = keyPair.getPrivate();

        String encodedPublicKey = Base64.encodeBase64String(publicKey.getEncoded());

        String publicKeyFormatted = "-----BEGIN PUBLIC KEY-----" + System.lineSeparator();
        for (final String row : Splitter.fixedLength(64).split(encodedPublicKey)) {
            publicKeyFormatted += row + System.lineSeparator();
        }
        publicKeyFormatted += "-----END PUBLIC KEY-----";
        try (Writer writer = new FileWriter("C:\\Users\\DELL\\Desktop\\Loxon Java Challange\\Keys\\public_key.pem")) {
            writer.write(publicKeyFormatted);
        }

        System.out.println("Public key encoded in PEM format and saved to public_key.pem");

        String encodedPrivateKey = Base64.encodeBase64String(privateKey.getEncoded());

        String privateKeyFormatted = "-----BEGIN PRIVATE KEY-----" + System.lineSeparator();
        for (final String row : Splitter.fixedLength(64).split(encodedPrivateKey)) {
            privateKeyFormatted += row + System.lineSeparator();
        }
        privateKeyFormatted += "-----END PRIVATE KEY-----";

        try (Writer writer = new FileWriter("C:\\Users\\DELL\\Desktop\\Loxon Java Challange\\Keys\\private_key.pem")) {
            writer.write(privateKeyFormatted);
        }

        System.out.println("Private key encoded in PEM format and saved to private_key.pem");


        long timeStamp = System.currentTimeMillis();

        File file = new File("C:\\Users\\DELL\\Desktop\\Loxon Java Challange\\Keys\\private_key.pem");

        Scanner br = new Scanner(new FileReader(file));

        String st = "";

        while (br.hasNextLine()) {
            st += br.nextLine() + "\n";
        }

        System.out.println(st);

        String stringPublicKey = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCtTMAOMbRkm7pX\n" +
                "XsdmDduPPzD9Icr6NYB8zS9pFTJMbkcdygmUrygEVnqcrU7gkevR75GMbyDN8/qy\n" +
                "fSWFBT6VTlL0gStPUwn20Tu4a+yR4NpESfjBuDG6Hn53bzKCvqPcLIUV+L/R7H/c\n" +
                "I1YKmBa0vp8B7nBZJYANgGRrMrH6GoK8g8YGgl3JhRAkrdQume9UIfCoUnvrhMl/\n" +
                "2obbsfu5QixbEip6TJgWQUCMOfVNzk/8P2VdtzvpFbSvx7n45+y5cTSyOJN41Fz+\n" +
                "0JMi2kFkLqrpvazlQJlH0NByTB9CPm2Ip+8YHV7FmTIsFpCvw704aTjAxhdivO+2\n" +
                "aYhtK7n9AgMBAAECggEAKCq/4QpYO3F00UdghCD2IM+OtT0d5Lx92W9da8fD7r8o\n" +
                "sJjhe5rVdZvts17gB2EK/Y+/doNTYSkJlFE5XwmGJekPhShjN3GRv6ljZC1vmag6\n" +
                "LtXOWGgu7mqe+WPGm1NAe4m+FweevjNIt2dhS/dQW/hKtpHjbGYqtfZqUAZiBgu3\n" +
                "sVrk/3cPH0uZ0xRLDMxM6Lclur2FKeKfApmK9/bZsiK9mEPIRYhqavXhFpBnP6uz\n" +
                "VAnQDgVzY1j09gET7ZrhCcCvNZYXpDVKgwg4WkrrD1q0s1W3sdM+U7qryvYF/so+\n" +
                "LQ/MXI9/jnqL4q+mqvXuvLbh4M0PYykiSvTgzrENQQKBgQD9MJovn3jHVf3b1JKH\n" +
                "Fx51KC7QP27RF9uMrZ65kdHxdRts/QQ6pWl2gG0i11xJ8cpW3dx5rWIsQAiKJ2wB\n" +
                "42gFhTTJJ2+6wOjipi0k0rMpP2GfDHNS5KHMq1NBrpXNdJu1N4flPQ+JsgE107y8\n" +
                "t9GMKMNipBaNVOK0rgfX/V2GZQKBgQCvOSdDpbJYfjNs07pkolRzPqfi7mEXIqwn\n" +
                "qq/K+JyzUiHUuGXmxq9tKl4b8kD4tt83YPiTUD5jALdG7lHG3pytdFEIPRHEOEqv\n" +
                "srCE9IRwLiQ+bF3ziu99YohIy9apW9a/EeR0kGWRbZ8otzVeW01n/dt0CCSH7UiG\n" +
                "8CCBSev/uQKBgBCP4FYjKWRotJ1vr1IU6hIh2cYXkCkvVVZDeTGMX15bGbssZd1s\n" +
                "OpTc28a+rbPMlD7Qbn6rH9PjMGvRHliVRpWt3AEYik9+FP3Wfvd8rOmS0tDzoIuY\n" +
                "lxjrUBvozrXM3e6hvkr5jo2kTj32Js91esifVgCa2TrPhbDp/WtckISdAoGAefS/\n" +
                "nVfAb9M2m7Ip800Alk2vsETWErIxPFKSlCTBfBXYMiQ92IfFJaftZGoSSomNhw/Z\n" +
                "Mz8QjPu8lIPfKxlZ12gz1hYbPYUohm1Kat99Jk8XLtNh+NZkpdJkpLYrLCkdqFMd\n" +
                "vPublcLEmiQZ4xiNIaoQigv40RqX9kM/fH0k4xECgYEA9vXA8q/cact06nTLL0wc\n" +
                "ERYe5UiiB3F/iYZc1PBKNSPJjhT37nGSQjI0VY9C7Moiqhnb3HzZD93oHCMs3scl\n" +
                "fscbcdipkw1Sm1v+AlSBVMdIx0FDYgT7TFd0dMUDm2swx3bjf8hc+q4zU4t3NCQh\n" +
                "kGUlvlZf4sLw66J8B0aRFsg=\n";

        KeyFactory kf = KeyFactory.getInstance("RSA");
        PKCS8EncodedKeySpec keySpecPKCS8 = new PKCS8EncodedKeySpec(Base64.decodeBase64(st));
        PrivateKey newPrivateKey = kf.generatePrivate(keySpecPKCS8);

        PKCS8EncodedKeySpec pubicKeySpec = new PKCS8EncodedKeySpec(Base64.decodeBase64(stringPublicKey));
        PublicKey newPublicKey = kf.generatePublic(pubicKeySpec);

        String message = "email=petra.montovay%40gmail.com&team=Error%20404&ts=" + timeStamp;
        Signature signature = Signature.getInstance("SHA256withRSA");
        signature.initSign(newPrivateKey);

        signature.update(message.getBytes());
        byte[] signatureBytes = signature.sign();
        signature.initVerify(newPublicKey);

        String encodedSignature = Base64.encodeBase64String(signatureBytes);
        String pemSignature = "-----BEGIN SIGNATURE-----\n" + encodedSignature + "\n-----END SIGNATURE-----";
        try (
                Writer writer = new FileWriter("C:\\Users\\DELL\\Desktop\\Loxon Java Challange\\Keys\\signature.pem")) {
            writer.write(pemSignature);
        }
        System.out.println("Signature encoded in PEM format and saved to signature.pem");

        String urlEncodedString = URLEncoder.encode(encodedSignature, "UTF-8");

        HttpRequest httpRequest = java.net.http.HttpRequest.newBuilder().uri
                (new URI("http://javachallenge.loxon.eu:8081/game_api/getGameKey?email=petra.montovay%40gmail." +
                        "com&team=Error%20404&ts=" + timeStamp + "&signature=" + urlEncodedString)).build();

        HttpClient httpClient = HttpClient.newHttpClient();
        HttpResponse<String> getResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());

        System.out.println(getResponse.body());
    }
}

