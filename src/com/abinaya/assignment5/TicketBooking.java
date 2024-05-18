package com.abinaya.assignment5;

public class TicketBooking {

	private String stageEvent;
	private String customer;
	private int noOfSeats;
	public String getStageEvent() {
		return stageEvent;
	}
	public void setStageEvent(String stageEvent) {
		this.stageEvent = stageEvent;
	}
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public int getNoOfSeats() {
		return noOfSeats;
	}
	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	public TicketBooking()
	{
		System.out.println("Default constructor");
	}
	public TicketBooking(String stageEvent,String customer,int noOfSeats)
	{
		this.stageEvent=stageEvent;
		this.customer=customer;
		this.noOfSeats=noOfSeats;
	}
	public void makePayment(Double amount)
	{
		System.out.println("Cash payment");
		System.out.println("Amount:"+amount+"paid in cash");
		
	}
	public void makePayment(String walletNumber,Double amount)
	{
		System.out.println("Wallet payment");
		System.out.println("Amount:"+amount+"paid using wallet number "+walletNumber);
		
	}
	public void makePayment(String creditCard,String ccv,String name,Double amount)
	{
		System.out.println("Creditcard payment");
		System.out.println("Amount:"+amount+"paid using Master card CCV:"+ccv);
		
	}
	
}

