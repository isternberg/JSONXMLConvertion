package converters;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;

public class ToJsonConverter<T> implements PojoConverter<T> {

	@Override
	public String convertPojo(Class<T> instanceType, T pojo)
			throws PojoConvertorException {

		ObjectMapper mapper = new ObjectMapper();

		try {
			return mapper.writeValueAsString(pojo);
		} catch (JsonProcessingException e) {
			throw new PojoConvertorException(e);
		}

	}

}
