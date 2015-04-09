package converters;

public interface PojoConverter<T> {

	String convertPojo(Class<T> instanceType, T pojo)
			throws PojoConvertorException;
}
