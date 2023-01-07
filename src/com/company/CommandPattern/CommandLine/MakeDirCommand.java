package com.company.CommandPattern.CommandLine;

final class MakeDirCommand implements Command
{
    private Kernel kernel;
    private String path;

    public MakeDirCommand(Kernel kernel) {
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
        kernel.mkdirAPI(path);
    }
}
