package org.cendra.bpm.model.card;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.sql.Timestamp;

import org.cendra.bpm.model.calendar.Calendar;

/**
 * Datos de fechas, tiempos y situación de la Tarjeta.
 */
@ApiModel(description = "Datos de fechas, tiempos y situación de la Tarjeta.")
public class TimerAudit {

	private Timestamp currentTime;
	private Calendar calendar;
	private EstimatedTimes estimatedTimes;
	private CreatingInfo creatingInfo;

	// //////////////////////////////////////////////////////////////////

	// currentTime -------------------------

	public TimerAudit currentTime(Timestamp currentTime) {
		this.currentTime = currentTime;
		return this;
	}

	/**
	 * (ma) Fecha y hora en que se consulto (a la base) la tarjeta.
	 * 
	 * @return creationTime
	 **/
	@ApiModelProperty(value = "(ma) Fecha y hora en que se consulto (a la base) la tarjeta.")
	public Timestamp getCurrentTime() {
		return currentTime;
	}

	public void setCurrentTime(Timestamp currentTime) {
		this.currentTime = currentTime;
	}

	// calendar ---------------------------

	public TimerAudit calendar(Calendar calendar) {
		this.calendar = calendar;
		return this;
	}

	/**
	 * Get calendar
	 * 
	 * @return calendar
	 **/
	@ApiModelProperty(value = "")
	public Calendar getCalendar() {
		return calendar;
	}

	public void setCalendar(Calendar calendar) {
		this.calendar = calendar;
	}

	// estimatedTimes ----------------------

	public TimerAudit estimatedTimes(EstimatedTimes estimatedTimes) {
		this.estimatedTimes = estimatedTimes;
		return this;
	}

	/**
	 * Get estimatedTimes
	 * 
	 * @return estimatedTimes
	 **/
	@ApiModelProperty(value = "")
	public EstimatedTimes getEstimatedTimes() {
		return estimatedTimes;
	}

	public void setEstimatedTimes(EstimatedTimes estimatedTimes) {
		this.estimatedTimes = estimatedTimes;
	}

	// creatingInfo ----------------------

	public TimerAudit creatingInfo(CreatingInfo creatingInfo) {
		this.creatingInfo = creatingInfo;
		return this;
	}

	/**
	 * Get creatingInfo
	 * 
	 * @return creatingInfo
	 **/
	@ApiModelProperty(value = "")
	public CreatingInfo getCreatingInfo() {
		return creatingInfo;
	}

	public void setCreatingInfo(CreatingInfo creatingInfo) {
		this.creatingInfo = creatingInfo;
	}

}
