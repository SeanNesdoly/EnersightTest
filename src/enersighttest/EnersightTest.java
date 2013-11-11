package enersighttest;

import com.enersight.wellspring.clientservices.ArrayOfDouble;

/**
 *
 * @author Sean
 */
public class EnersightTest {

    public static void main(String[] args) {
        String s = helloWorld("Sean Nesdoly");
        System.out.println(s);
        
        System.out.println(helloArray(156.08));
        
    }

    private static String helloWorld(java.lang.String name) {
        com.enersight.wellspring.clientservices.WsClientServices service = new com.enersight.wellspring.clientservices.WsClientServices();
        com.enersight.wellspring.clientservices.WsClientServicesSoap port = service.getWsClientServicesSoap();
        return port.helloWorld(name);
    }

    private static ArrayOfDouble helloArray(double startingNumber) {
        com.enersight.wellspring.clientservices.WsClientServices service = new com.enersight.wellspring.clientservices.WsClientServices();
        com.enersight.wellspring.clientservices.WsClientServicesSoap port = service.getWsClientServicesSoap();
        return port.helloArray(startingNumber);
    }
 
}
