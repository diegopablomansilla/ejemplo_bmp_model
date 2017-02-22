package org.cendra.bpm.api.controller;

import io.swagger.annotations.ApiParam;

import java.util.List;

import org.cendra.bpm.api.CardTypeApi;
import org.cendra.bpm.model.card.CardType;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CardTypeApiController implements CardTypeApi {

	// -------------------------------------------------------------------------------

	@CrossOrigin(origins = "http://localhost:9000")
	public ResponseEntity<List<CardType>> getList(
			@ApiParam(value = endPointArg1Title_1) @RequestParam(value = endPointArg1_1, required = false) Integer offset,
			@ApiParam(value = endPointArg2Title_1) @RequestParam(value = endPointArg2_1, required = false) Integer limit) {

		return new ResponseEntity<List<CardType>>(HttpStatus.OK);
	}

	// -------------------------------------------------------------------------------

	@CrossOrigin(origins = "http://localhost:9000")
	public ResponseEntity<CardType> getById(
			@ApiParam(value = endPointArg1Title_2, required = true) @PathVariable(endPointArg1_2) String id) {

		return new ResponseEntity<CardType>(HttpStatus.OK);
	}

	// ================================================================================

}
