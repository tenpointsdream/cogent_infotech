package lifecycle3.spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Patient {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
		System.out.println("Inside getId method");
	}

	@Override
	public String toString() {
		return "Patient[id=" + id + "]";
	}

	@PostConstruct
	public void hi() {
		System.out.println("Say hi to your initializing method!");
	}

	@PreDestroy
	public void bye() {
		System.out.println("Say goodbye to your destroy properties method!");
	}

}
