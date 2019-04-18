package bee;

import bee.generated.client.FakeDevice;
import bee.generated.client.FakeDeviceService;

import java.net.URL;
import java.util.ArrayList;

public class SoapClient
{
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://localhost:8080/device?wsdl");


        FakeDevice devicePort = new FakeDeviceService(url).getFakeDevicePort();


        devicePort.getCapabilities(new ArrayList<>());
    }
}
