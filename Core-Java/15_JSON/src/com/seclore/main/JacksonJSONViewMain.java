package com.seclore.main;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.codehaus.jackson.map.ObjectMapper;

import com.seclore.pojo.Person;
import com.seclore.pojo.Staff;
import com.seclore.views.CompanyViews;

public class JacksonJSONViewMain {
	public static void main(String[] args) {
		Staff staff = createStaff();
		Person person = new Person(101, staff);

		ObjectMapper mapper = new ObjectMapper();

		try {
			String normalView = mapper.writerWithView(CompanyViews.Normal.class).withDefaultPrettyPrinter()
					.writeValueAsString(person);
			System.out.println("Normal View");
			System.out.println(normalView);
			System.out.println("---------------------------------------------");

			String managerView = mapper.writerWithView(CompanyViews.Manager.class).withDefaultPrettyPrinter()
					.writeValueAsString(person);
			System.out.println("Manager View");
			System.out.println(managerView);
			System.out.println("---------------------------------------------");

			String HRView = mapper.writerWithView(CompanyViews.HR.class).withDefaultPrettyPrinter()
					.writeValueAsString(person);
			System.out.println("HR View");
			System.out.println(HRView);
			System.out.println("---------------------------------------------");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
