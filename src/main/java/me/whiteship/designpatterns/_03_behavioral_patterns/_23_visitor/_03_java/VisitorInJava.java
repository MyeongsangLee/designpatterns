package me.whiteship.designpatterns._03_behavioral_patterns._23_visitor._03_java;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class VisitorInJava {

    public static void main(String[] args) throws IOException {
        Path startingDirectory = Path.of("C:\\workspace1\\designpattern\\designpatterns");

        SearchFileVisitor searchFileVisitor = new SearchFileVisitor("Triangle11.java", startingDirectory);
        Files.walkFileTree(startingDirectory, searchFileVisitor);
    }
}
