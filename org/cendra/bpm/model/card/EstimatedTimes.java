package org.cendra.bpm.model.card;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import org.cendra.bpm.model.time.TimeValue;

/**
 * Tiempos para resolver la la tarjeta, como por ejemplo el de vencimiento.
 */
@ApiModel(description = "Tiempos para resolver la la tarjete, como por ejemplo el de vencimiento.")
public class EstimatedTimes {

	private TimeValue normalRuntimeCardCheckin;
	private TimeValue expirationOfCardCheckin;
	private TimeValue expirationOfCard;

	// -------------------------- normalRuntimeCardCheckin ----------

	public EstimatedTimes normalRuntimeCardCheckin(
			TimeValue normalRuntimeCardCheckin) {
		this.normalRuntimeCardCheckin = normalRuntimeCardCheckin;
		return this;
	}

	/**
	 * (te) Tiempo normal de ejecución de tarjeta en checkin.
	 * 
	 * @return normalRuntimeCardCheckin
	 **/
	@ApiModelProperty(value = "(te) Tiempo normal de ejecución de tarjeta en checkin.")
	public TimeValue getNormalRuntimeCardCheckin() {
		return normalRuntimeCardCheckin;
	}

	public void setNormalRuntimeCardCheckin(TimeValue normalRuntimeCardCheckin) {
		this.normalRuntimeCardCheckin = normalRuntimeCardCheckin;
	}

	// -------------------------- expirationOfCardCheckin -----------

	public EstimatedTimes expirationOfCardCheckin(
			TimeValue expirationOfCardCheckin) {
		this.expirationOfCardCheckin = expirationOfCardCheckin;
		return this;
	}

	/**
	 * (tme) Expiración de la tarjeta en checkin. Tiempo máximo de ejecución de
	 * la tarjeta en checkin.
	 * 
	 * @return expirationOfCardCheckin
	 **/
	@ApiModelProperty(value = "(tme) Expiración de la tarjeta en checkin. Tiempo máximo de ejecución de la tarjeta en checkin.")
	public TimeValue getExpirationOfCardCheckin() {
		return expirationOfCardCheckin;
	}

	public void setExpirationOfCardCheckin(TimeValue expirationOfCardCheckin) {
		this.expirationOfCardCheckin = expirationOfCardCheckin;
	}

	// -------------------------- expirationOfCard -----------

	public EstimatedTimes expirationOfCard(TimeValue expirationOfCard) {
		this.expirationOfCard = expirationOfCard;
		return this;
	}

	/**
	 * (tv) Máximo tiempo para el vencimiento de la tarjeta. Tiempo máximo para
	 * que la tarea sea resuelta, este o no este la tarea en checkin.
	 * 
	 * @return expirationOfCard
	 **/
	@ApiModelProperty(value = "(tv) Máximo tiempo para el vencimiento de la tarjeta. Tiempo máximo para que la tarea sea resuelta, este o no este la tarea en checkin.")
	public TimeValue getExpirationOfCard() {
		return expirationOfCard;
	}

	public void setExpirationOfCard(TimeValue expirationOfCard) {
		this.expirationOfCard = expirationOfCard;
	}

}
