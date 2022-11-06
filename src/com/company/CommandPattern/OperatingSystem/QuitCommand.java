package com.company.CommandPattern.OperatingSystem;

public final class QuitCommand implements Command
{
    private final Kernel kernel;
    private String path;

    public QuitCommand(Kernel kernel)
    {
        this.kernel = kernel;
    }

    @Override
    public String getPath() {
        return path;
    }
    @Override
    public void setPath(String path) {
        this.path = path;
    }
    @Override
    public void execute()
    {
        kernel.quitAPI();
    }
}
