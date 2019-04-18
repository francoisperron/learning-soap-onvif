package bee;

import javax.xml.ws.Endpoint;

public class SoapServer
{
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/device", new FakeDevice());

        System.out.println(":)");
    }
}
