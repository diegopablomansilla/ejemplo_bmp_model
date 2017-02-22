package org.cendra.bpm.model.cases;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * Tipo de Caso
 */
@ApiModel(description = "Tipo de Caso")
public class CaseType {

	private String id = null;
	private Boolean erased = null;
	private String code = null;
	private String title = null;
	private String description = null;

	// //////////////////////////////////////////////////////////////////

	// -------------------------- id ------------------------------------

	public CaseType id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * Identificador (UUID) único del tipo de caso.
	 * 
	 * @return id
	 **/
	@ApiModelProperty(value = "Identificador (UUID) único del tipo de caso.")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	// -------------------------- erased ------------------------------------

	public CaseType erased(Boolean erased) {
		this.erased = erased;
		return this;
	}

	/**
	 * Determina si el tipo de caso fue borrado o deshabilitado.
	 * 
	 * @return erased
	 **/
	@ApiModelProperty(value = "Determina si el tipo de caso fue borrado o deshabilitado.")
	public Boolean getErased() {
		return erased;
	}

	public void setErased(Boolean erased) {
		this.erased = erased;
	}

	// -------------------------- code ------------------------------------

	public CaseType code(String code) {
		this.code = code;
		return this;
	}

	/**
	 * Código del tipo de caso.
	 * 
	 * @return code
	 **/
	@ApiModelProperty(value = "Código del tipo de caso.")
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	// -------------------------- title ------------------------------------

	public CaseType name(String title) {
		this.title = title;
		return this;
	}

	/**
	 * Título (nombre) del tipo de caso.
	 * 
	 * @return name
	 **/
	@ApiModelProperty(value = "Título (nombre) del tipo de caso.")
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	// -------------------------- description
	// ------------------------------------

	public CaseType description(String description) {
		this.description = description;
		return this;
	}

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

	// //////////////////////////////////////////////////////////////////

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		CaseType caseType = (CaseType) o;
		return Objects.equals(this.id, caseType.id)
				&& Objects.equals(this.erased, caseType.erased)
				&& Objects.equals(this.code, caseType.code)
				&& Objects.equals(this.title, caseType.title)
				&& Objects.equals(this.description, caseType.description);

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
