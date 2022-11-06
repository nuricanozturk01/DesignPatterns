package com.company.CommandPattern.OperatingSystem;

public interface Command
{
    String getPath();
    void setPath(String path);
    void execute();
}
