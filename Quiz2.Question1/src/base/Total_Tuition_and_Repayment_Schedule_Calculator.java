package base;

import java.util.Scanner;

public class Total_Tuition_and_Repayment_Schedule_Calculator {
	
	/** main method*/
	
	static Scanner input = new Scanner(System.in);
	
	public double total_tuition;
	public double initial_tuition;
	public double percentage_increase;
	public double repayment_apr;
	public int repayment_schedule;
	public double monthly_payments;
	
	public double getMonthly_payments() {
		return monthly_payments;
	}

	public void setMonthly_payments(double monthly_payments) {
		this.monthly_payments = monthly_payments;
	}

	public double getTotal_tuition(){
		return total_tuition;
	}

	public void setTotal_tuition(double total_tuition) {
		this.total_tuition = total_tuition;
	}

	public double getInitial_tuition() {
		return initial_tuition;
	}

	public void setInitial_tuition(double initial_tuition) {
		this.initial_tuition = initial_tuition;
	}

	public double getPercentage_increase() {
		return percentage_increase;
	}

	public void setPercentage_increase(double percentage_increase) {
		this.percentage_increase = percentage_increase;
	}

	public double getRepayment_apr() {
		return repayment_apr;
	}

	public void setRepayment_apr(double repayment_apr) {
		this.repayment_apr = repayment_apr;
	}

	public int getRepayment_schedule() {
		return repayment_schedule;
	}

	public void setRepayment_schedule(int repayment_schedule) {
		this.repayment_schedule = repayment_schedule;
	}

	private void input(){
		
		System.out.print("Enter initial tuition:");
		initial_tuition = input.nextDouble();
		
		System.out.print("Enter percentage increase for tuition:");
		percentage_increase = input.nextDouble();
		
		System.out.print("Enter repayment APR:");
		repayment_apr = input.nextDouble();
		
		System.out.print("Enter number of years repayment will take:");
		repayment_schedule = input.nextInt();
	}
	
	public double total_and_monthly(){
		double tuition1 = initial_tuition;
		double tuition2 = initial_tuition*(1 + percentage_increase/100);
		double tuition3 = tuition2*(1 + percentage_increase/100);
		double tuition4 = tuition3*(1 + percentage_increase/100);
		
		total_tuition = tuition1 + tuition2 + tuition3 + tuition4;
		System.out.printf("Your total tuition is $ %.2f.", total_tuition);
		
		double total_annual_interest = 0;
		
		for(int i=1; i<5; i++){
			double annual_interest1 = tuition1 * Math.pow((1 + repayment_apr / 100), i);
			total_annual_interest += annual_interest1;
		}
		
		for(int i=1; i<4; i++){
			double annual_interest2 = tuition2 * Math.pow((1 + repayment_apr / 100), i);
			total_annual_interest += annual_interest2;
		}
		
		for(int i=1; i<3; i++){
			double annual_interest3 = tuition3 * Math.pow((1 + repayment_apr / 100), i);
			total_annual_interest += annual_interest3;
		}
		
		for(int i=1; i<2; i++){
			double annual_interest4 = tuition4 * Math.pow((1 + repayment_apr / 100), i);
			total_annual_interest += annual_interest4;
		}
		
		double monthly_payments = total_annual_interest * (((repayment_apr / 100) / 12) / 
				((Math.pow(1 + (repayment_apr / 100) / 12, repayment_schedule * 12)) - 1)); 
 
		
		System.out.printf("\nTo adequatly pay back your student debt in " + repayment_schedule + " years,"
				+ " you must pay %.2f monthly.", monthly_payments);
		
		return (monthly_payments);
	}
	
	public static void main(String[] args){
		Total_Tuition_and_Repayment_Schedule_Calculator run = new Total_Tuition_and_Repayment_Schedule_Calculator();
		run.input();
		run.total_and_monthly();
	}	
}
