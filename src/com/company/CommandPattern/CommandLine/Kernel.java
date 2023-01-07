package com.company.CommandPattern.CommandLine;

import java.io.File;
import java.util.Arrays;

@SuppressWarnings("all")
final class Kernel
{
    private void isValidPath(String path)
    {
        if (path.isEmpty() || path.isBlank())
            throw new RuntimeException("PATH IS NOT VALID!");
    }

    public void dirListAPI(String path)
    {
        isValidPath(path);

        var file = new File(path);
        var files = file.list();

        Arrays.stream(files).forEach(System.out::println);
    }

    public void mkdirAPI(String path)
    {
        isValidPath(path);
        new File(path).mkdir();
    }

    public void deleteAPI(String path)
    {
        isValidPath(path);
        new File(path).delete();
    }

    public void quitAPI()
    {
        System.out.println("EXIT!");
        System.out.println("==============================");
        System.exit(0);
    }
}
