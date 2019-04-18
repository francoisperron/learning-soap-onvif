How to soap java 11
- https://www.baeldung.com/jax-ws

Problem with onvif wsdl
- https://stackoverflow.com/questions/49937930/wsimport-for-onvif-wsdl-no-service-definition


wsimport -keep -p com.baeldung.jaxws.client http://localhost:8080/employeeservice?wsdl
wsimport -s . -p com.baeldung.jaxws.server.topdown employeeservicetopdown.wsdl