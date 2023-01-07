package com.company.TemplateMethodPattern.Shopping;


public class OnlineOrder extends OrderProcessTemplate {

    public OnlineOrder()
    {
        System.out.println("------ Selecting items in online order.");
    }

    @Override
    public void handlePayment(PaymentType paymentType)
    {
        if (isValidPayment(paymentType))
            System.out.println("Handling Payment for in online order. Payment type is: " + paymentType);

        else System.out.println("Invalid Payment!");
    }

    @Override
    public void handleDelivery(Customer customer) {
        System.out.println(customer.getFirstName() + " " +  customer.getLastName() +", please fill out this form with your address");
        System.out.println("Your order of " + customer.getListOfItem().size() + " has been processed!");
    }

    private boolean isValidPayment(PaymentType paymentType) {
        return paymentType == PaymentType.DEBIT || paymentType == PaymentType.CREDIT;
    }
}
