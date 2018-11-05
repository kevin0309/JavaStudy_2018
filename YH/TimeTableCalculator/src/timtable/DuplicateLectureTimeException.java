package timtable;

public class DuplicateLectureTimeException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String causeMsg;
	
	public DuplicateLectureTimeException(String causeMsg) {
		super(causeMsg);
		this.causeMsg = causeMsg;
	}

	public String getCauseMsg() {
		return causeMsg;
	}
	
}
