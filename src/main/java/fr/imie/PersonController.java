package fr.imie;

import java.util.ArrayList;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

public class PersonController
{

	ArrayList<Person> personList = new ArrayList<>();

	@RequestMapping("person")
	public String person(Person person, Model m)
	{
		if (person.getPrenom() != "" &&
				person.getPrenom() != null &&
				person.getNom() != "" &&
				person.getNom() != null &&
				person.getEmail() != "" &&
				person.getEmail() != null )

		{
			personList.add(person);
		}

		m.addAttribute("personList", personList);
		return "person";
	}

	@RequestMapping("update")
	public String update(Person person, Model m)
	{
		m.addAttribute("personList", personList);
		System.out.println("UPDATE");
		return "redirect:person";
	}

	@RequestMapping("delete")
	public String delete(Person person, Model m)
	{
		m.addAttribute("personList", personList);
		System.out.println("DELETE");
		return "redirect:person";
	}

} 