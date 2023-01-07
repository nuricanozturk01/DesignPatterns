package com.company.CommandPattern.CommandLine;

final class ListCommand implements Command
{
    private Kernel kernel;
    private String path;

    public ListCommand(Kernel kernel) {
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
    public void execute() {
        kernel.dirListAPI(path);
    }
}
