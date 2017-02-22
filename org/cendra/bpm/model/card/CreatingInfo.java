package org.cendra.bpm.model.card;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.sql.Timestamp;

import org.cendra.bpm.model.time.TimeValue;
import org.cendra.bpm.model.user.User;

/**
 * Información relacionada a la creació de la tarjeta, como fecha, autor, etc.
 */
@ApiModel(description = "Información relacionada a la creació de la tarjeta, como fecha, autor, etc.")
public class CreatingInfo {

	private Timestamp creationTime;
	private User createdBy;
	private TimeValue elapsedTimeFromMomentCreation;

	// //////////////////////////////////////////////////////////////////

	// creationTime -------------------------

	public CreatingInfo creationTime(Timestamp creationTime) {
		this.creationTime = creationTime;
		return this;
	}

	/**
	 * (ma) Fecha y hora en que se creó la tarjeta.
	 * 
	 * @return creationTime
	 **/
	@ApiModelProperty(value = "(ma) Fecha y hora en que se creó la tarjeta.")
	public Timestamp getCreationTime() {
		return creationTime;
	}

	public void setCreationTime(Timestamp creationTime) {
		this.creationTime = creationTime;

	}

	// createdBy ---------------------------

	public CreatingInfo createdBy(User createdBy) {
		this.createdBy = createdBy;
		return this;
	}

	/**
	 * Get createdBy
	 * 
	 * @return createdBy
	 **/
	@ApiModelProperty(value = "")
	public User getUser() {
		return createdBy;
	}

	public void setUser(User createdBy) {
		this.createdBy = createdBy;
	}

	// -------------------------- elapsedTimeFromMomentCreation -----------

	public CreatingInfo expirationOfCard(TimeValue elapsedTimeFromMomentCreation) {
		this.elapsedTimeFromMomentCreation = elapsedTimeFromMomentCreation;
		return this;
	}

	/**
	 * (tdc) Tiempo transcurrido desde el momento de creacion.
	 * 
	 * @return elapsedTimeFromMomentCreation
	 **/
	@ApiModelProperty(value = "(tdc) Tiempo transcurrido desde el momento de creacion.")
	public TimeValue getExpirationOfCard() {
		return elapsedTimeFromMomentCreation;
	}

	public void setExpirationOfCard(TimeValue elapsedTimeFromMomentCreation) {
		this.elapsedTimeFromMomentCreation = elapsedTimeFromMomentCreation;
	}
}
