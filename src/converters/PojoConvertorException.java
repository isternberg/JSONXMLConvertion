package converters;

public class PojoConvertorException extends Exception {

	protected PojoConvertorException() {
		super();
	}

	protected PojoConvertorException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	protected PojoConvertorException(String message, Throwable cause) {
		super(message, cause);
	}

	protected PojoConvertorException(String message) {
		super(message);
	}

	protected PojoConvertorException(Throwable cause) {
		super(cause);
	}

}
