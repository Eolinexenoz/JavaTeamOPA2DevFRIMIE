package fr.imie;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PersonController {

	@Autowired
	private PersonRepository repository;

	@RequestMapping("person")
	public String hello(Person person, Model m) {

		repository.save(new Person("anakin", "skywalker", "anakin@lepuceau.com"));
		repository.save(new Person("luke", "skywalker", "luke@lemancho.world"));
		repository.save(new Person("leia", "organa", "lafillefacile@pecho.com"));

		List<Person> persons = repository.findAll();

		m.addAttribute("person", persons);
		return "person";
	}

}
