package edu.sfsu.cs1.Project4;

import edu.sfsu.autograder.advanced.Test;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class TicTacToe_Test {
    
    public void testPlayerOValidMove(Test t) {
        char[][] board = new char[][]{
                {'1', '2', '3'},
                {'4', '5', '6'},
                {'7', '8', '9'},
        };
        
        t.errorf("Expected: this \n\nActual: that");
    }
    
    public void testPlayerOInvalidMove(Test t) {
        char[][] board = new char[][]{
                {'1', '2', '3'},
                {'4', '5', 'X'},
                {'7', '8', '9'},
        };
    
        Scanner input = new Scanner(new ByteArrayInputStream("5 \n 6".getBytes(StandardCharsets.UTF_8)));
        
        TicTacToe.makeMove(board, 'O', input);
    
    }
    
    
}
