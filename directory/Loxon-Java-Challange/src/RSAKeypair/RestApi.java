package RSAKeypair;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpRequest;

public class RestApi {

    public static void main(String[] args) throws URISyntaxException {
        HttpRequest postRequest = (HttpRequest) HttpRequest.newBuilder().uri
                (new URI ("http://javachallenge.loxon.eu:8081/game_api/getGameKey?email=petra.montovay@gmail." +
                        "com&team=Error 404&ts=<current timestamp in milli seconds>&signature=<UrlEncode(Base64(RSA " +
                        "signature(összes eddigi paraméter)))>"));

    }
}
