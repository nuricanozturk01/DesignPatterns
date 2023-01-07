package com.company.TemplateMethodPattern.Shopping;


public class InStoreOrder extends OrderProcessTemplate
{

    public InStoreOrder()
    {
        System.out.println("------ Selecting items in store order.");
    }

    @Override
    public void handlePayment(PaymentType paymentType)
    {
        if (isValidpaymentType(paymentType))
            System.out.println("Handling Payment for int store order. Payment type is: " + paymentType);
        else System.out.println("Invalid Payment!");
    }

    @Override
    public void handleDelivery(Customer customer)
    {
        System.out.println(customer.getFirstName() + " " +  customer.getLastName() +", we are shipping your items to your address");
        System.out.println("Your order of " + customer.getListOfItem().size() + " has been processed!");
    }

    private boolean isValidpaymentType (PaymentType paymentType)
    {
        return paymentType != PaymentType.CRYPTO;
    }
}
