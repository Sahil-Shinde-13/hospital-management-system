package model;

public class OutPatient extends Patient {

	private double consultationFee;
	private double medicineCharges;
	private double testCharges;

	public OutPatient(double consultationFee, double medicineCharges, double testCharges) {
		super();
		this.consultationFee = consultationFee;
		this.medicineCharges = medicineCharges;
		this.testCharges = testCharges;
	}

	public OutPatient() {
		super();

	}

	public OutPatient(int patientId, String patientName, int age, String department, PatientStatus status,
			double consultationFee, double medicineCharges, double testCharges) {
		super(patientId, patientName, age, department, status);
		this.consultationFee = consultationFee;
		this.medicineCharges = medicineCharges;
		this.testCharges = testCharges;

	}

	@Override
	public double calculateBill() {

		return consultationFee + medicineCharges + testCharges;
	}

	@Override
	public double calculateDiscount() {

		return 0;
	}

	@Override
	public String getPatientType() {

		return "OUTPATIENT";
	}

}
