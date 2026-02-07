package com.example;
import java.util.Objects;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;

@Entity
public class SoftwareEngineerService {

	@Id
	private Integer id;
	private String name;
	private String techStack;
	public SoftwareEngineerService() {

	}
	public SoftwareEngineerService(Integer id,
									String name,
									String techStack) {
		this.id = id;
		this.name = name;
		this.techStack = techStack;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTechStack() {
		return techStack;
	}
	public void setTechStack(String techStack) {
		this.techStack = techStack;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, name, techStack);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SoftwareEngineerService other = (SoftwareEngineerService) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name)
				&& Objects.equals(techStack, other.techStack);
	}
}
