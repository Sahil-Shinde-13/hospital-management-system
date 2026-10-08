package model;

public class InPatient extends Patient implements DiscountEligible {

	private int roomChargesPerDay;
	private int numberOfDays;
	private double treatmentCharges;
	private static final double DISCOUNT_RATE = 0.10;

	public InPatient(int roomChargesPerDay, int numberOfDays, double treatmentCharges) {
		super();
		this.roomChargesPerDay = roomChargesPerDay;
		this.numberOfDays = numberOfDays;
		this.treatmentCharges = treatmentCharges;
	}

	

	public double calculateBill() {
		return (roomChargesPerDay * numberOfDays) + treatmentCharges;
	}

	public double calculateDiscount() {
		return treatmentCharges * DISCOUNT_RATE;
	}

	public String getPatientType() {

		return "INPATIENT";

	}
}
