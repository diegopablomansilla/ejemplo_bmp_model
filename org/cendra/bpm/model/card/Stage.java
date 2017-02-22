package org.cendra.bpm.model.card;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * Etapa (fase) de Tarjeta
 */
@ApiModel(description = "Etapa (fase) de Tarjeta")
public class Stage {

	private String id = null;
	private Boolean erased = null;
	private String code = null;
	private String title = null;
	private String description = null;

	// //////////////////////////////////////////////////////////////////

	// -------------------------- id ------------------------------------

	public Stage id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * Identificador (UUID) único de la etapa (fase) de tarjeta.
	 * 
	 * @return id
	 **/
	@ApiModelProperty(value = "Identificador (UUID) único de la etapa (fase) de tarjeta.")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	// -------------------------- erased ------------------------------------

	public Stage erased(Boolean erased) {
		this.erased = erased;
		return this;
	}

	/**
	 * Determina si la etapa (fase) de tarjeta fue borrada o deshabilitada.
	 * 
	 * @return erased
	 **/
	@ApiModelProperty(value = "Determina si la etapa (fase) de tarjeta fue borrada o deshabilitada.")
	public Boolean getErased() {
		return erased;
	}

	public void setErased(Boolean erased) {
		this.erased = erased;
	}

	// -------------------------- code ------------------------------------

	public Stage code(String code) {
		this.code = code;
		return this;
	}

	/**
	 * Código de la etapa (fase) de tarjeta.
	 * 
	 * @return code
	 **/
	@ApiModelProperty(value = "Código de la etapa (fase) de tarjeta.")
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	// -------------------------- title ------------------------------------

	public Stage name(String title) {
		this.title = title;
		return this;
	}

	/**
	 * Título (nombre) de la etapa (fase) de tarjeta.
	 * 
	 * @return name
	 **/
	@ApiModelProperty(value = "Título (nombre) de la etapa (fase) de tarjeta.")
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	// -------------------------- description ----------------------------------

	public Stage description(String description) {
		this.description = description;
		return this;
	}

	/**
	 * Descripción de la etapa (fase) de tarjeta.
	 * 
	 * @return description
	 **/
	@ApiModelProperty(value = "Descripción de la etapa (fase) de tarjeta.")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	// //////////////////////////////////////////////////////////////////

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Stage cardType = (Stage) o;
		return Objects.equals(this.id, cardType.id)
				&& Objects.equals(this.erased, cardType.erased)
				&& Objects.equals(this.code, cardType.code)
				&& Objects.equals(this.title, cardType.title)
				&& Objects.equals(this.description, cardType.description);

	}

	@Override
	public int hashCode() {
		return Objects.hash(id, erased, code, title, description);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class SchoolShift {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    erased: ").append(toIndentedString(erased)).append("\n");
		sb.append("    code: ").append(toIndentedString(code)).append("\n");
		sb.append("    name: ").append(toIndentedString(title)).append("\n");
		sb.append("    description: ").append(toIndentedString(description))
				.append("\n");

		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}
