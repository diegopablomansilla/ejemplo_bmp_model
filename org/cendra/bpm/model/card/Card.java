package org.cendra.bpm.model.card;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import org.cendra.bpm.model.cases.Case;

/**
 * Tarjeta
 */
@ApiModel(description = "Tarjeta")
public class Card {

	private String id = null;
	private Boolean erased = null;
	private CardType cardType = null;
	private Case caseCards = null;
	private String code = null;
	private String shortTitle = null;
	private String title = null;
	private String subject = null;
	private String message = null;
	private Stage stage = null;

	// //////////////////////////////////////////////////////////////////

	// --------------------------------------------------------------

	/**
	 * Identificador (UUID) único de la tarjeta.
	 * 
	 * @return id
	 **/
	@ApiModelProperty(value = "Identificador (UUID) único de la tarjeta.")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	// --------------------------------------------------------------

	/**
	 * Determina si la tarjeta fue borrado o deshabilitado.
	 * 
	 * @return erased
	 **/
	@ApiModelProperty(value = "Determina si la tarjeta fue borrado o deshabilitado.")
	public Boolean getErased() {
		return erased;
	}

	public void setErased(Boolean erased) {
		this.erased = erased;
	}

	// --------------------------------------------------------------

	/**
	 * Get cardType
	 * 
	 * @return cardType
	 **/
	@ApiModelProperty(value = "")
	public CardType getCardType() {
		return cardType;
	}

	public void setCardType(CardType cardType) {
		this.cardType = cardType;
	}

	// ----------------------------------------------------------------

	/**
	 * Get caseCards
	 * 
	 * @return caseCards
	 **/
	@ApiModelProperty(value = "")
	public Case getCaseCards() {
		return caseCards;
	}

	public void setCaseCards(Case caseCards) {
		this.caseCards = caseCards;
	}

	// --------------------------------------------------------------

	/**
	 * Código de la tarjeta.
	 * 
	 * @return code
	 **/
	@ApiModelProperty(value = "Código de la tarjeta.")
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	// --------------------------------------------------------------

	/**
	 * Título corto de la tarjeta, por lo general destinado a definir el tipo de
	 * tarjeta, como por ejemplo "Verificación de CUIT". Si la tarjeta tiene un
	 * CardType, el título corto de la tarjeta es tomado del título del tipo de
	 * tarjeta (CardType).
	 * 
	 * @return shortTitle
	 **/
	@ApiModelProperty(value = "Título corto de la tarjeta, por lo general destinado a definir el tipo de tarjeta, como por ejemplo \"Verificación de CUIT\". Si la tarjeta tiene un CardType, el título corto de la tarjeta es tomado del título del tipo de tarjeta (CardType).")
	public String getShortTitle() {
		return shortTitle;
	}

	public void setShortTitle(String shortTitle) {
		this.shortTitle = shortTitle;
	}

	// --------------------------------------------------------------

	/**
	 * Título de la tarjeta, por lo general destinado a definir el tipo de caso,
	 * como por ejemplo "Contratos de Locación de Servicio". Si la tarjeta tiene
	 * un Case, el título de la tarjeta es tomado del título del tipo de caso
	 * (CardCase).
	 * 
	 * @return title
	 **/
	@ApiModelProperty(value = "Título de la tarjeta, por lo general destinado a definir el tipo de caso, como por ejemplo \"Contratos de Locación de Servicio\". Si la tarjeta tiene un Case, el título de la tarjeta es tomado del título del tipo de caso (CardCase).")
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	// --------------------------------------------------------------

	/**
	 * Asunto de la tarjeta.
	 * 
	 * @return subject
	 **/
	@ApiModelProperty(value = "Asunto de la tarjeta.")
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	// --------------------------------------------------------------

	/**
	 * Mensaje (cuerpo) de la tarjeta. Por lo general destinado a describir el
	 * objetivo de la tarjeta, es decir que hay que hacer.
	 * 
	 * @return message
	 **/
	@ApiModelProperty(value = "Mensaje (cuerpo) de la tarjeta. Por lo general destinado a describir el objetivo de la tarjeta, es decir que hay que hacer")
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	// --------------------------------------------------------------

	/**
	 * Get stage
	 * 
	 * @return stage
	 **/
	@ApiModelProperty(value = "")
	public Stage getStage() {
		return stage;
	}

	public void setstage(Stage stage) {
		this.stage = stage;
	}

}
