package org.cendra.bpm.model.calendar;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * Calendario
 */
@ApiModel(description = "Calendaraio")
public class Calendar {

	private String id = null;
	private Boolean erased = null;
	private String code = null;
	private String title = null;
	private String description = null;

	// //////////////////////////////////////////////////////////////////

	// -------------------------- id ------------------------------------

	public Calendar id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * Identificador (UUID) único del calendario.
	 * 
	 * @return id
	 **/
	@ApiModelProperty(value = "Identificador (UUID) único del calendario.")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	// -------------------------- erased ------------------------------------

	public Calendar erased(Boolean erased) {
		this.erased = erased;
		return this;
	}

	/**
	 * Determina si el calendario fue borrado o deshabilitado.
	 * 
	 * @return erased
	 **/
	@ApiModelProperty(value = "Determina si el calendario fue borrado o deshabilitado.")
	public Boolean getErased() {
		return erased;
	}

	public void setErased(Boolean erased) {
		this.erased = erased;
	}

	// -------------------------- code ------------------------------------

	public Calendar code(String code) {
		this.code = code;
		return this;
	}

	/**
	 * Código del calendario.
	 * 
	 * @return code
	 **/
	@ApiModelProperty(value = "Código del calendario.")
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	// -------------------------- title ------------------------------------

	public Calendar name(String title) {
		this.title = title;
		return this;
	}

	/**
	 * Título (nombre) del calendario.
	 * 
	 * @return name
	 **/
	@ApiModelProperty(value = "Título (nombre) del calendario.")
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	// -------------------------- description --------------------------

	public Calendar description(String description) {
		this.description = description;
		return this;
	}

	/**
	 * Descripción del calendario.
	 * 
	 * @return description
	 **/
	@ApiModelProperty(value = "Descripción del calendario.")
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
		Calendar cardType = (Calendar) o;
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
