package RSAKeypair;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpRequest;
import java.security.Signature;

public class RestApi {

    public static void main(String[] args) throws URISyntaxException {
        long timeStamp = System.currentTimeMillis();

/*        String message = "Lili, Petra, Ádám!";
        Signature signature = Signature.getInstance("SHA256withRSA");
        signature.initSign(privateKey);
        signature.update(message.getBytes());
        byte[] signatureBytes = signature.sign();*/

/*        HttpRequest = HttpRequest.newBuilder().uri
                (new URI("http://javachallenge.loxon.eu:8081/game_api/getGameKey?email=petra.montovay%gmail." +
                        "com&team=Error%404&ts=" + timeStamp + "&signature=" < UrlEncode(Base64(RSA " +
                        "signature(összes eddigi paraméter)))>"));*/

    }
}
