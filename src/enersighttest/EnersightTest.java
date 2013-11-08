package enersighttest;

/**
 *
 * @author Sean
 */
public class EnersightTest {

    public static void main(String[] args) {
        String s = helloWorld("Hello World");
        //github test
    }

    private static String helloWorld(java.lang.String name) {
        com.enersight.wellspring.clientservices.WsClientServices service = new com.enersight.wellspring.clientservices.WsClientServices();
        com.enersight.wellspring.clientservices.WsClientServicesSoap port = service.getWsClientServicesSoap();
        return port.helloWorld(name);
    }
    
}
