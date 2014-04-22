import javax.xml.soap.MessageFactory;
import javax.xml.soap.MimeHeaders;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPConnection;
import javax.xml.soap.SOAPConnectionFactory;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;


public class Teste {
	
	public static final String URI = "http://10.200.108.167:8080";
	// public static final String URI = "http://localhost:8080";
	
	private static final String URL = URI + "/portal-servicos/IServicePortal?wsdl";
	private static final String NAMESPACE = URI + "/jaxws";
	private static final String PREFIX = "jax";
	private static final String OPERATION = "consultarListaExcecao";
	private static final String SOAP_ACTION = NAMESPACE + "/" + OPERATION;
	
	public static void main(String args[]) {
	        try {
	            // Create SOAP Connection
	            SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
	            SOAPConnection soapConnection = soapConnectionFactory.createConnection();

	            // Send SOAP Message to SOAP Server
	            SOAPMessage soapResponse = soapConnection.call(createSOAPRequest(), URL);

	            // Process the SOAP Response
	            printSOAPResponse(soapResponse);

	            soapConnection.close();
	        } catch (Exception e) {
	            System.err.println("Error occurred while sending SOAP Request to Server");
	            e.printStackTrace();
	        }
	    }

	    private static SOAPMessage createSOAPRequest() throws Exception {
	        MessageFactory messageFactory = MessageFactory.newInstance();
	        SOAPMessage soapMessage = messageFactory.createMessage();
	        SOAPPart soapPart = soapMessage.getSOAPPart();

	        // SOAP Envelope
	        SOAPEnvelope envelope = soapPart.getEnvelope();
	        envelope.addNamespaceDeclaration(PREFIX, NAMESPACE);

	        /*
	        Constructed SOAP Request Message:
	        <SOAP-ENV:Envelope xmlns:SOAP-ENV="http://schemas.xmlsoap.org/soap/envelope/" xmlns:example="http://ws.cdyne.com/">
	            <SOAP-ENV:Header/>
	            <SOAP-ENV:Body>
	                <example:VerifyEmail>
	                    <example:email>mutantninja@gmail.com</example:email>
	                    <example:LicenseKey>123</example:LicenseKey>
	                </example:VerifyEmail>
	            </SOAP-ENV:Body>
	        </SOAP-ENV:Envelope>
	         */

	        // SOAP Body
	        SOAPBody soapBody = envelope.getBody();
	        SOAPElement soapBodyElem = soapBody.addChildElement(OPERATION, PREFIX);
//	        SOAPElement soapBodyElem1 = soapBodyElem.addChildElement("email", "example");
//	        soapBodyElem1.addTextNode("mutantninja@gmail.com");
//	        SOAPElement soapBodyElem2 = soapBodyElem.addChildElement("LicenseKey", "example");
//	        soapBodyElem2.addTextNode("123");

	        MimeHeaders headers = soapMessage.getMimeHeaders();
	        headers.addHeader("SOAPAction", SOAP_ACTION);

	        soapMessage.saveChanges();

	        /* Print the request message */
	        System.out.print("Request SOAP Message = ");
	        soapMessage.writeTo(System.out);
	        System.out.println();

	        return soapMessage;
	    }

	    /**
	     * Method used to print the SOAP Response
	     */
	    private static void printSOAPResponse(SOAPMessage soapResponse) throws Exception {
	        TransformerFactory transformerFactory = TransformerFactory.newInstance();
	        Transformer transformer = transformerFactory.newTransformer();
	        Source sourceContent = soapResponse.getSOAPPart().getContent();
	        System.out.print("\nResponse SOAP Message = ");
	        StreamResult result = new StreamResult(System.out);
	        transformer.transform(sourceContent, result);
	    }

}
