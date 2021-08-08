package exceptions;

public class BuitenBereikException extends IllegalArgumentException {

	public BuitenBereikException() {
		super("Input moet tussen het gevraagde interval liggen.");
		
	}
	
	public BuitenBereikException(String msg) {
		super(msg);
	}
	
	public BuitenBereikException(Throwable cause) {
		super(cause);
	}

	
	public BuitenBereikException(String msg, Throwable cause) {
		super(msg, cause);
	}
}
