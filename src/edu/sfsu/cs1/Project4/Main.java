package edu.sfsu.cs1.Project4;
import edu.sfsu.autograder.advanced.Autograder;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;


public class Main {
    
    public static void main(String[] args) {
        try {
            Autograder autograder = new Autograder();
            autograder.addErrorDictionary("./resources/errors.json");
            autograder.run(false, false, "./testcasesp4", part1.class.getCanonicalName(), null, new ArrayList<>(List.of(NoSuchElementException.class)));
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
