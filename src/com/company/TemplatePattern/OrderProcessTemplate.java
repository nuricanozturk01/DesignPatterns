package com.company.TemplatePattern;

public abstract class OrderProcessTemplate
{
    public final void processOrder (Customer customer, PaymentType paymentType)
    {
        handlePayment(paymentType);
        handleDelivery(customer);
    }
    public abstract void handlePayment(PaymentType paymentType);

    public abstract void handleDelivery (Customer customer);


}
