package com.company.DecoratorPattern.ServerApp;


class Main
{
    public static void main(String[] args)
    {
        Server server = new OnDemandE2HighCPU2();

        server = new PreEmptiblevCPU(server);
        server = new PreEmptiblevCPU(server);

        server = new OnDemandMemory(server);
        server = new OnDemandMemory(server);
        server = new OnDemandMemory(server);
        server = new OnDemandMemory(server);

        System.out.println(server);
        System.out.println(server.getPrice());


        Server server2 = new PreEmptibleE2HighCPU2();

        server2 = new OnDemandvCPU(server2);
        server2 = new OnDemandvCPU(server2);

        server2 = new OnDemandMemory(server2);
        server2 = new OnDemandMemory(server2);

        server2 = new PreEmptibleMemory(server2);
        server2 = new PreEmptibleMemory(server2);

        System.out.println(server2);
        System.out.println(server2.getPrice());

    }
}
