package org.cendra.bpm.model.time;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Tiempo
 */
@ApiModel(description = "Tiempo")
public class TimeValue {

	private Double value;
	private UnitTime unitTime;

	// //////////////////////////////////////////////////////////////////

	// value -----------------------------

	public TimeValue id(Double value) {
		this.value = value;
		return this;
	}

	/**
	 * Valor de tiempo.
	 * 
	 * @return value
	 **/
	@ApiModelProperty(value = "Valor de tiempo.")
	public Double getId() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	// unitTime --------------------------------

	public TimeValue unitTime(UnitTime unitTime) {
		this.unitTime = unitTime;
		return this;
	}

	/**
	 * Get unitTime
	 * 
	 * @return unitTime
	 **/
	@ApiModelProperty(value = "")
	public UnitTime getUnitTime() {
		return unitTime;
	}

	public void setUnitTime(UnitTime unitTime) {
		this.unitTime = unitTime;
	}

}
