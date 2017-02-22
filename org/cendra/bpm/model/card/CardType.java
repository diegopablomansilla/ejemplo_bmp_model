package org.cendra.bpm.model.card;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Tipo de Tarjeta
 */
@ApiModel(description = "Tipo de Tarjeta")
public class CardType {

	private String id = null;
	private Boolean erased = null;
	private String code = null;
	private String title = null;
	private String description = null;

	// //////////////////////////////////////////////////////////////////

	// --------------------------------------------------------------

	/**
	 * Identificador (UUID) único del tipo de tarjeta.
	 * 
	 * @return id
	 **/
	@ApiModelProperty(value = "Identificador (UUID) único del tipo de tarjeta.")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	// --------------------------------------------------------------

	/**
	 * Determina si el tipo de tarjeta fue borrado o deshabilitado.
	 * 
	 * @return erased
	 **/
	@ApiModelProperty(value = "Determina si el tipo de tarjeta fue borrado o deshabilitado.")
	public Boolean getErased() {
		return erased;
	}

	public void setErased(Boolean erased) {
		this.erased = erased;
	}

	// --------------------------------------------------------------

	/**
	 * Código del tipo de tarjeta.
	 * 
	 * @return code
	 **/
	@ApiModelProperty(value = "Código del tipo de tarjeta.")
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	// --------------------------------------------------------------

	/**
	 * Título (nombre) del tipo de tarjeta.
	 * 
	 * @return name
	 **/
	@ApiModelProperty(value = "Título (nombre) del tipo de tarjeta.")
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	// --------------------------------------------------------------

	/**
	 * Descripción del tipo de tarjeta.
	 * 
	 * @return description
	 **/
	@ApiModelProperty(value = "Descripción del tipo de tarjeta.")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
