package br.com.mqmanager.consumer.client.rest;

import org.json.JSONObject;
import org.springframework.web.client.RestTemplate;

public class RESTClient {
    
	static final String URL_ESTORNAR_COMPRA = "http://localhost:8081/LojaVirtual/rest/compra/estornar";
    
	public RESTClient() {
	}
    
	public void send(String order) {
 
    	JSONObject jsonObject = new JSONObject(order);
    	int id = (int) jsonObject.get("id");
		
    	RestTemplate restTemplate = new RestTemplate();
 
        // Send request with DELETE method.
    	restTemplate.delete(URL_ESTORNAR_COMPRA +"/"+ id);
 
    }
}