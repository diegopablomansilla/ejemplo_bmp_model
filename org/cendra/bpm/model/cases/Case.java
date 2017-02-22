package org.cendra.bpm.model.cases;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * Caso
 */
@ApiModel(description = "Caso")
public class Case {

	private String id = null;
	private Boolean erased = null;
	private String code = null;
	private String title = null;
	private String description = null;
	private CaseType caseType = null;

	// //////////////////////////////////////////////////////////////////

	// -------------------------- id ------------------------------------

	public Case id(String id) {
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

	public Case erased(Boolean erased) {
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

	public Case code(String code) {
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

	public Case name(String title) {
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

	// -------------------------- description ------------------------------

	public Case description(String description) {
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

	// -------------------------- caseType ------------------------------------

	public Case CaseType(CaseType caseType) {
		this.caseType = caseType;
		return this;
	}

	/**
	 * Get caseType
	 * 
	 * @return caseType
	 **/
	@ApiModelProperty(value = "")
	public CaseType getCaseType() {
		return caseType;
	}

	public void setCaseType(CaseType caseType) {
		this.caseType = caseType;
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
		Case caseCards = (Case) o;
		return Objects.equals(this.id, caseCards.id)
				&& Objects.equals(this.erased, caseCards.erased)
				&& Objects.equals(this.code, caseCards.code)
				&& Objects.equals(this.title, caseCards.title)
				&& Objects.equals(this.description, caseCards.description)
				&& Objects.equals(this.caseType, caseCards.caseType);

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
		sb.append("    caseType: ").append(toIndentedString(caseType)).append("\n");

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
