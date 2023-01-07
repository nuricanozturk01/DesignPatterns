package com.company.FacadePattern.Computer;

class Computer
{
    private ICase m_case;
    private IBios m_bios;
    private IKeyboard m_keyboard;
    private IMouse m_mouse;
    private IMonitor m_monitor;
    private ICPU m_cpu;
    private IRam m_ram;
    private IOperatingSystem m_operatingSystem;

    public static class Builder
    {
        private final Computer m_computer;

        public Builder()
        {
            m_computer = new Computer();
        }

        public Builder setCase(ICase iCase)
        {
            m_computer.m_case = iCase;
            return this;
        }


        public Builder setBios(IBios bios)
        {
            m_computer.m_bios = bios;
            return this;
        }

        public Builder setKeyboard(IKeyboard keyboard)
        {
            m_computer.m_keyboard = keyboard;
            return this;
        }

        public Builder setMouse(IMouse mouse)
        {
            m_computer.m_mouse = mouse;
            return this;
        }


        public Builder setMonitor(IMonitor monitor)
        {
            m_computer.m_monitor = monitor;
            return this;
        }

        public Builder setCPU(ICPU cpu)
        {
            m_computer.m_cpu = cpu;
            return this;
        }


        public Builder setRam(IRam ram)
        {
            m_computer.m_ram = ram;
            return this;
        }

        public Builder setOperatingSystem(IOperatingSystem os)
        {
            m_computer.m_operatingSystem = os;
            return this;
        }

        public Computer build()
        {
            return m_computer;
        }
    }

    public void open()
    {
        m_case.run();
        m_bios.start();
        m_cpu.run();
        m_ram.run();
        m_mouse.run();
        m_keyboard.run();
        m_monitor.run();
        m_operatingSystem.run();
    }


    public void close()
    {

        m_case.off();
    }

}
