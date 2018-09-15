package ch.co.gts.nis;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NisTest {

	@GetMapping(path = { "/login" })
	@ResponseBody
	public String authenticate() {

		return "test success jankins";
	}

}
