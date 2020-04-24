package com.seclore.main;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import org.codehaus.jackson.map.ObjectMapper;

import com.seclore.pojo.Staff;

public class ReadJSON {

	public static void main(String[] args) {
		ObjectMapper mapper = new ObjectMapper();

		try {
			Staff staff = mapper.readValue(new File("c:/Files/JSONStaff.json"), Staff.class);
			System.out.println(staff);

			// JSON string to Java object with null values

			String jsonString = "{\"name\":\"Vivek\" ,\"age\":30 , \"skills\":[\"Java\",\"Python\"]}";
			Staff staff2 = mapper.readValue(jsonString, Staff.class);
			System.out.println(staff2);

			String staffPrettyString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(staff2);
			System.out.println(staffPrettyString);

		} catch (

		IOException e) {
			e.printStackTrace();
		}
	}

}
