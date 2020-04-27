package com.seclore.main;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.codehaus.jackson.map.ObjectMapper;

import com.seclore.pojo.Staff;

public class WriteJSON {
	public static void main(String[] args) {
		// Staff staff = createStaff();
		// Staff staff = new Staff("Vivek", 30);
		Staff staff = new Staff();
		staff.setName("Vivek");

		ObjectMapper mapper = new ObjectMapper();
		try {
			// Java objects to JSON file
			mapper.writeValue(new File("c:/Files/JSONStaff.json"), staff);

			// Java object to JSON String
			String jsonString = mapper.writeValueAsString(staff);
			System.out.println(jsonString);
			System.out.println("--------------------------------");
			String jsonStringPretty = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(staff);
			System.out.println(jsonStringPretty);

		} catch (IOException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());

		}

	}

	private static Staff createStaff() {
		Staff staff = new Staff();
		staff.setName("Vivek Gohil");
		staff.setAge(30);
		staff.setPosition(new String[] { "Teacher", "Coporate Training", "Writer" });
		Map<String, BigDecimal> salary = new HashMap<String, BigDecimal>() {
			{
				put("2009", new BigDecimal(1000));
				put("2015", new BigDecimal(10000));
				put("2018", new BigDecimal(30000));
			}
		};
		staff.setSalary(salary);
		staff.setSkills(Arrays.asList("Java", "Python", "Kotlin"));
		return staff;
	}
}
