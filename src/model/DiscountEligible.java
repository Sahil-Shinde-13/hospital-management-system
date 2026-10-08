package model;

public interface DiscountEligible {
	double calculateDiscount();

	default void displayDiscount() {
		System.out.println("Discount: " + calculateDiscount());
	}
}