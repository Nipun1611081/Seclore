package com.seclore.main;

import java.io.IOException;
import java.util.Map;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class JacksonJSONMapMain {
	public static void main(String[] args) {

		ObjectMapper mapper = new ObjectMapper();
		String jsonString = "{\"name\":\"Vivek Gohil\", \"age\":\"30\"}";

		try {
			Map<String, String> map = mapper.readValue(jsonString, Map.class);
			System.out.println(map);

		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
