package https.api_mobipalma_mobi.docs;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;



public class JAXBCotxox {
	
	public static void main(String[] args) {
		
		try {
			JAXBContext jc = JAXBContext.newInstance(Carrera.class.getPackage().getName());
			
			Unmarshaller u = jc.createUnmarshaller();
			
			InputStream in = JAXBCotxox.class.getResourceAsStream("xml/javbcotxox.xml");
			
			
			JAXBElement<Carrera> objetoCarrera = (JAXBElement<Carrera>)u.unmarshal(in);
			
			
			System.out.println(objetoCarrera.getName() + " : ");
			
			System.out.println("Destino: " + objetoCarrera.getValue().destino);
			System.out.println("Origen: " + objetoCarrera.getValue().origen);
			System.out.println("Distancia: " + objetoCarrera.getValue().distancia + "km");
			System.out.println("Tarjeta de credito: " + objetoCarrera.getValue().tarjetaCredito);
			System.out.println("Coste de la carrera: " + objetoCarrera.getValue().costeTotal + "€");
			System.out.println("Propina: " + objetoCarrera.getValue().propina + "€");
			
			
			System.out.println("Objeto en memoria marshalled a XML: ");
			
			Marshaller m = jc.createMarshaller(); 			
			m.marshal( objetoCarrera, System.out );
			
			// Marshalling to a File:
			
			
			File fichero = new File("src/main/resources/org/foobarspam/xml/marshalizado.xml");
			fichero.createNewFile();
			
			m.setProperty(Marshaller.JAXB_SCHEMA_LOCATION, "https://api.mobipalma.mobi/docs/ jaxbcotxox.xsd");
			
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			m.marshal( objetoCarrera, fichero );
			System.out.println("\n Objeto en memoria marshalled a fichero: " + fichero.getPath());
			
		} 
		catch (JAXBException | IOException ex) {
			ex.printStackTrace();
		}

	
			
		
		
	}
}
