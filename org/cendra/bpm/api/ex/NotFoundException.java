package org.cendra.bpm.api.ex;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-09-12T14:42:20.090Z")
public class NotFoundException extends ApiException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 705514646389451098L;

	@SuppressWarnings("unused")
	private int code;

	public NotFoundException(int code, String msg) {
		super(code, msg);
		this.code = code;
	}
}
