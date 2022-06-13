package questionex;

public class EmployeeNotFoundException extends Exception {
	private static final long serialVersionUID = -2872694086602732648L;

	private int id;

	EmployeeNotFoundException(int i, String message) {
		super(message);
		this.id = i;
	}

	EmployeeNotFoundException(int i, String message, String cause) {
		super(message, new Throwable(cause));
		this.id = i;
	}

	@Override
	public String toString() {
		return String.format("EmployeeNotFoundException[%d]", this.id);
	}
}

/*
 * throw
 * Java throw keyword is used throw an exception explicitly in the code,
 *  inside the function or the block of code.
 *  The throw keyword is followed by an instance of Exception to be thrown.
 *  throw is used within the method.
 *  throws
 *  Java throws keyword is used in the method signature to declare an exception 
 *  which might be thrown by the function while the execution of the code.
 *  The throws keyword is followed by class names of Exceptions to be thrown.
 *  throws is used with the method signature
 *  */
