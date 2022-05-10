import org.eclipse.californium.core.CoapClient;
import org.eclipse.californium.core.CoapResponse;
import org.eclipse.californium.core.coap.MediaTypeRegistry;

/**
 * @author ebruno
 */
public class CoapPostClient {
    public static void main(String[] args) throws Exception {
        CoapClient client = new CoapClient("coap://localhost:5683/data");

        CoapResponse resp = client.post("payload", MediaTypeRegistry.TEXT_PLAIN);
        System.out.println("RESPONSE CODE: " + resp.getCode());
        System.out.println("RESPONSE TEXT: " + resp.getResponseText());
        System.out.println("\n");

        resp = client.post("<data>this is data</data>", MediaTypeRegistry.APPLICATION_XML);
        System.out.println("RESPONSE CODE: " + resp.getCode());
        System.out.println("RESPONSE TEXT: " + resp.getResponseText());

//        // asynchronous
//
//        client.get(new CoapHandler() {
//            @Override public void onLoad(CoapResponse response) {
//                String content = response.getResponseText();
//                System.out.println("onLoad: " + content);
//            }
//
//            @Override public void onError() {
//                System.err.println("Error");
//            }
//        });

        // wait for user
//        System.out.println("press enter to continue exit");
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        try { br.readLine(); } catch (IOException e) { }
    }

}
