package in.steve.eMart.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.steve.eMart.ApiService.EmailService;
import in.steve.eMart.dto.MailRequest;
import in.steve.eMart.dto.MailResponse;
@CrossOrigin("*")
@SpringBootApplication
@RestController
@RequestMapping("/email")
public class EmailController {
	
	@Autowired
	private EmailService service;

	@PostMapping("/sendingEmail")
	public MailResponse sendEmail(@RequestBody MailRequest request) {
		Map<String, Object> model = new HashMap<>();
		model.put("Name", request.getName());
		model.put("location", "Pondicherry,India");
		return service.sendEmail(request, model);

	}

}
