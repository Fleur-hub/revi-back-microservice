package com.back.revi.reviback.echo;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Base64;
import java.util.Collections;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/echo")
@AllArgsConstructor
@NoArgsConstructor
public class EchoController {

	private static final Logger LOG = LoggerFactory.getLogger(EchoController.class);


	private HttpServletRequest request;

	@RequestMapping(value = "/**", consumes = MediaType.ALL_VALUE, produces =
			MediaType.APPLICATION_JSON_VALUE, method = {RequestMethod.GET, RequestMethod.POST,
			RequestMethod.PUT, RequestMethod.DELETE, RequestMethod.OPTIONS})
	public ResponseEntity<JsonPayload> echoBack(@RequestBody(required = false) byte[] rawBody) {

		final Map<String, String> headers = Collections.list(request.getHeaderNames()).stream()
													   .collect(Collectors.toMap(Function.identity(), request::getHeader));

		final JsonPayload response = new JsonPayload();
		response.set(JsonPayload.PROTOCOL, request.getProtocol());
		response.set(JsonPayload.METHOD, request.getMethod());
		response.set(JsonPayload.HEADERS, headers);
		response.set(JsonPayload.COOKIES, request.getCookies());
		response.set(JsonPayload.PARAMETERS, request.getParameterMap());
		response.set(JsonPayload.PATH, request.getServletPath());
		response.set(JsonPayload.BODY, rawBody != null ? Base64.getEncoder().encodeToString(rawBody) : null);
		LOG.info("REQUEST: {}", request.getParameterMap());

		return ResponseEntity.status(HttpStatus.OK).body(response);
	}


}