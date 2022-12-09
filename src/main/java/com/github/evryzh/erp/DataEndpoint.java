package com.github.evryzh.erp;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.github.evryzh.erp.exchange2is.GetDataResponse;
import com.github.evryzh.erp.exchange2is.GetData;

@Endpoint
public class DataEndpoint {

	@PayloadRoot(namespace = "http://localhost:8080/exchange2is", localPart = "getData")
	@ResponsePayload
	public GetDataResponse getData(@RequestPayload GetData request) {
		GetDataResponse response = new GetDataResponse();	
		
		return response;
	}
	
}
