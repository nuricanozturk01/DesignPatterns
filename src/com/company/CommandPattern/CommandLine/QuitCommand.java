package com.company.CommandPattern.CommandLine;

final class QuitCommand implements Command
{
    private Kernel kernel;
    private String path;

    public QuitCommand(Kernel kernel) {
        this.kernel = kernel;
    }
    @Override
    public String getPath() {
        return null;
    }
    @Override
    public void setPath(String path) {}
    @Override
    public void execute() {
        kernel.quitAPI();
    }
}
