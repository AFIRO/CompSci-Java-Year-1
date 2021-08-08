package Exceptions;

public class BuitenBereikException extends IllegalArgumentException{

	public BuitenBereikException() {
		super();
		
	}

	public BuitenBereikException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public BuitenBereikException(String msg) {
		super(msg);
		
	}

	public BuitenBereikException(Throwable cause) {
		super(cause);
		
	}
	
	

}
