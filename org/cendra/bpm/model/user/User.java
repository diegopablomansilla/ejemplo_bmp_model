package org.cendra.bpm.model.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Usuario del sistema.
 */
@ApiModel(description = "Usuario del sistema.")
public class User {

	private String id = null;

	// //////////////////////////////////////////////////////////////////

	// -------------------------- id ------------------------------------

	public User id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * Identificador (UUID) único del usuario.
	 * 
	 * @return id
	 **/
	@ApiModelProperty(value = "Identificador (UUID) único del usuario.")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
