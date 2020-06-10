package com.knolx.files;

import java.nio.file.Files;
import java.nio.file.Path;

public class FileDemo {
    public static void main(String[] args) throws Exception {
        Files.writeString(Path.of("knolx.txt"), "Knolx - Java11 Introduction");
        String fileContent = Files.readString(Path.of("knolx.txt"));
        System.out.println(fileContent);
        boolean isSame = Files.isSameFile(Path.of("knolx.txt"), Path.of("knolx.txt"));
        System.out.println(isSame);
    }
}
