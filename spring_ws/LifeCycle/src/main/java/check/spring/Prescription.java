package check.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

@SuppressWarnings("deprecation")
public class Prescription {

	private int id;
	private String patientName;
	private List<String> medicines;

	public int getId() {
		return id;
	}

	@Required
	public void setId(int id) {
		this.id = id;
	}

	public String getPatientName() {
		return patientName;
	}

	@Required
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public List<String> getMedicines() {
		return medicines;
	}

	public void setMedicines(List<String> medicines) {
		this.medicines = medicines;
	}

	@Override
	public String toString() {
		return "Prescription[id=" + id + ", PatientName=" + patientName + ", medicines=" + medicines + "]";
	}

}
