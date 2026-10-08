package model;

import java.time.LocalDate;

public class PaymentTransaction {
	private int transactionId;
	private  int patientId;
	private PaymentType paymentType;
	private double amount;
	private double remainingAmount;
	private LocalDate date;
	public PaymentTransaction(int transactionId, int patientId, PaymentType paymentType, double amount,
			double remainingAmount, LocalDate date) {
		this.transactionId = transactionId;
		this.patientId = patientId;
		this.paymentType = paymentType;
		this.amount = amount;
		this.remainingAmount = remainingAmount;
		this.date = date;
	}
	
	
	
	
	

	
	
}

//PaymentTransaction
//properties:
//transactionId
//patientId
//paymentType
//amount
//date
//remainingAmount