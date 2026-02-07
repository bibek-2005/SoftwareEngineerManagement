package com.example;

import java.util.List;
import com.example.SoftwareEngineerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Api/v1/software-engineer")
public class SoftwareEngineerController {
	
	@GetMapping
	public List<SoftwareEngineerService> getEngineer(){
		
		
		return List.of(
				new SoftwareEngineerService(
				1,
				"biibek",
				"spring,kotlin, ml "
			
				),
				new SoftwareEngineerService(
						2,
						"shardha",
						"java, python,engilsh"
						
						)
				);
				
				
	}

	
	
}
