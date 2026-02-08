package com.example;

import java.util.List;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("Api/v1/software-engineer")
public class SoftwareEngineerController {

    private final SoftwareEnginnerService softwareEngineerService;
    public SoftwareEngineerController(SoftwareEnginnerService softwareEngineerService){
        this.softwareEngineerService = softwareEngineerService;
    }

	@GetMapping
	public List<SoftwareEngineer> getEngineers(){
		return softwareEngineerService.getAllSoftwareEnginners();
	}

    @GetMapping("{id}")
    public SoftwareEngineer getEngineersById(@PathVariable Integer id){
        return softwareEngineerService.getAllSoftwareEnginnersById(id);
    }

    @PostMapping
    public void addSoftwareEngineer(@RequestBody SoftwareEngineer softwareEngineer){
        softwareEngineerService.insertSoftwareEngineer(softwareEngineer);
    }
}
