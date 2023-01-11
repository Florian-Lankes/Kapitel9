package ExceptionBar;

public class OutOfStockException extends Exception {
	public OutOfStockException(String Errormsg) {
		super(Errormsg);
	}

}
