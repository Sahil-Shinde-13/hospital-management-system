package model;

public abstract class Patient {

	private int patientId;
	private String patientName;
	private int age;
	private String department;
	PatientStatus status;

	public Patient() {
		super();
	}

	public Patient(int patientId, String patientName, int age, String department, PatientStatus status) {
		this.patientId = patientId;
		this.patientName = patientName;
		this.age = age;
		this.department = department;
		this.status = status;

	}

	public abstract double calculateBill();

	public abstract double calculateDiscount();

	public abstract String getPatientType();

	public void displayDetails() {
		System.out.println("Patient Id: " + patientId + "Patient Name: " + patientName + "Age: " + age + "Department: "
				+ department + "Patient Status: " + status);

	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public PatientStatus getStatus() {
		return status;
	}

	public void setStatus(PatientStatus status) {
		this.status = status;
	}

}
