package converters;

import java.io.*;

import javax.xml.bind.*;

public class ToXmlConverter<T> implements PojoConverter<T> {

	public String convertPojo(Class<T> instanceType, T instance)
			throws PojoConvertorException {

		Writer stringWriter;
		try {
			JAXBContext context = JAXBContext.newInstance(instanceType);

			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,
					Boolean.TRUE);

			stringWriter = new StringWriter();

			marshaller.marshal(instance, stringWriter);
		} catch (JAXBException e) {
			throw new PojoConvertorException(e);
		}

		return stringWriter.toString();
	}

}
