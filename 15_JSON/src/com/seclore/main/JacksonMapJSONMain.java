package com.seclore.main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.ObjectMapper;

public class JacksonMapJSONMain {

	public static void main(String[] args) {
		ObjectMapper mapper = new ObjectMapper();
		List<String> data = new ArrayList<String>();
		data.add("A");
		data.add("B");
		data.add("C");

		Map<String, String> map = new HashMap<>();
		map.put("name", "Vivek");
		map.put("age", "30");

		try {

			// convert map to JSON string
			String json = mapper.writeValueAsString(map);

			System.out.println(json); // compact-print

			System.out.println("-----------------------------");

			json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(map);

			System.out.println(json); // pretty-print

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
