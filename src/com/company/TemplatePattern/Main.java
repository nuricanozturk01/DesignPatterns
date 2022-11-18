package com.company.TemplatePattern;


public class Main {
    public static void main(String[] args)
    {
        Item computer = new Item("Computer -1", 4634.7);
        Item television = new Item("TV -1", 1634.7);
        Item smartPhone = new Item("Samsung S-21", 14634.7);
        Item mouse = new Item("Mouse -1", 20.4);
        Item keyboard = new Item("Keyboard -1", 50.4);


        Customer nurican = new Customer("Nuri Can", "ÖZTÜRK");
        nurican.addItem(computer);
        nurican.addItem(television);
        nurican.addItem(keyboard);
        nurican.addItem(mouse);
        OrderProcessTemplate online =  new OnlineOrder();
        online.processOrder(nurican, PaymentType.CREDIT);



        System.out.println("\n\n\n");


        Customer mustafa = new Customer("Mustafa", "ALADAĞ");
        mustafa.addItem(computer);
        mustafa.addItem(smartPhone);
        OrderProcessTemplate inStore =  new InStoreOrder();
        inStore.processOrder(mustafa,PaymentType.DEBIT);

        System.out.println("\n\n\n");


        Customer ahmet = new Customer("Ahmet", "KOÇ");
        ahmet.addItem(computer);
        ahmet.addItem(smartPhone);
        ahmet.addItem(computer);
        ahmet.addItem(television);
        OrderProcessTemplate crypto =  new CryptoOrder();
        crypto.processOrder(ahmet, PaymentType.CRYPTO);

    }
}