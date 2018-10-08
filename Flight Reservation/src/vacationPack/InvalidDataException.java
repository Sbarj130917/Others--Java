package vacationPack;

public class InvalidDataException extends Exception {

	/**
	 * 
	 */
	
	String msg;
	private static final long serialVersionUID = 1L;
	public InvalidDataException(String msg) {
		this.msg=msg;
	}
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return msg;
	}
	

}
