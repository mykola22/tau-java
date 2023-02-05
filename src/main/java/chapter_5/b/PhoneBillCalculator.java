package chapter_5.b;
import java.util.Scanner;

public class PhoneBillCalculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(final String[] args) {
        double planCost = getPlanCost();
        double overageMinutes = getOverageMinutes();

        double overageCost = calculateOverageFee(overageMinutes);
        double tax = calculateTax(planCost+overageCost);//passing two arguments as one. amazing

        calculateAll(planCost, overageCost, tax);
    }


    public static double getPlanCost() {
        System.out.println("What is your plan cost: ");
        double planCost = scanner.nextFloat();
        return planCost;
    }

    public static double getOverageMinutes() {
        System.out.println("How long had you talk: ");
        double minutes = scanner.nextFloat();
        return minutes;
    }

    public static double calculateOverageFee(double overageMinutes) {
        double payment = overageMinutes * 0.25;
        return payment;
    }

    public static double calculateTax(double total) {
        double tax = total * 0.15;
        return tax;
    }

    public static void calculateAll(double basePlanCost, double overageMinutes, double tax) {
        double allPayment = basePlanCost + overageMinutes + tax;

        System.out.println("Phone Bill Statement");
        System.out.println("Plan: "+basePlanCost);
        System.out.println("Overage: "+overageMinutes);
        System.out.println("Tax: "+tax);
        System.out.println("Total: "+allPayment);
    }
}

