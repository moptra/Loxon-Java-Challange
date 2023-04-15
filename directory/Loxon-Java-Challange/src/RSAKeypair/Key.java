package RSAKeypair;

import org.apache.commons.codec.BinaryDecoder;
import org.apache.commons.codec.binary.Base64;

import java.math.BigInteger;
import java.security.*;
import java.security.spec.RSAPublicKeySpec;


public class Key {

        public static void main (String[] args) throws Exception {
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");

            //2048 bites kulcsot generáljatok
          //  keyPairGenerator.initialize(2048);

           // KeyPair keyPair = keyPairGenerator.generateKeyPair();

          //  PrivateKey privateKey = keyPair.getPrivate();

       //     PublicKey publicKey = keyPair.getPublic();
            BigInteger modulus = new BigInteger("17248583783287079903113137271246031861209075473762271003520024344117478675283474652586161596113797206972168679306294164640942848955832300218529636529550445464194716774066718565749101228844792600232789383363676497017462772430420353599188799297798008756348723947738234251055168756629486299664040919845464748942034214756657090869376301609964555677402543150379616661533947903283149921424479647601855093455805446655898038754508361730381033130987866530604396453092334084252521426781012326321553975566200961121597792854921004443825416407210291755507356842478052159273195108200705007330001990318308207739804674561130732346233", 16);
         //   System.out.println(publicKey);
            BigInteger exp = new BigInteger("10001", 16);
            RSAPublicKeySpec spec = new RSAPublicKeySpec(modulus, exp);
            PublicKey pub = keyFactory.generatePublic(spec);
            byte[] data = pub.getEncoded();
            String base64encoded = new String(new Base64().encode(data));
            System.out.println(base64encoded);
            //a 'content' aláírásához SHA256withRSA algoritmust használjatok
            Signature sign = Signature.getInstance("SHA256withRSA");
            System.out.println(sign);
            //sign.initSign();
//            byte[] bytes = "hello how are you".getBytes();  // ez mi?
//
//            sign.update(bytes);
//
//            byte[] signature = sign.sign();
//
//            sign.initVerify(keyPair.getPublic());
//            sign.update(bytes);
//
//            boolean bool = sign.verify(signature);
//
//            if(bool) {
//                System.out.println("Signature verified");
//            } else {
//                System.out.println("Signature failed");
//            }




        }

}
