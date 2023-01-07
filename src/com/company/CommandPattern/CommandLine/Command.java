package com.company.CommandPattern.CommandLine;

interface Command
{
    String getPath();
    void setPath(String path);
    void execute();
}
