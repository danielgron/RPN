/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpn;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class Calculator {
    private PathStack<Long> numbers = new PathStack();
    private Scanner s = new Scanner(System.in);
    private long val1;
    private long val2;
    
    
    public void start(){
        String cmd;
    while (!(cmd=s.nextLine()).equals("quit")){
        String[] commands = cmd.split(" ");
        
        for (String command : commands) {
            switch (command) {
                case "*":
                    mult();
                    break;
                case "/":
                    div();
                    break;
                case "+":
                    add();
                    break;
                case "-":
                    sub();
                    break;
                default:
                    put(Long.parseLong(command));
                    break;
            }
        }
        
        numbers.printData();
    }
        
    }

    private void mult() {
        val2 = numbers.pop();
        val1 = numbers.pop();
        numbers.push(val1*val2);
    }

    private void div() {
        val2 = numbers.pop();
        val1 = numbers.pop();
        numbers.push(val1/val2);
    }

    private void add() {
        val2 = numbers.pop();
        val1 = numbers.pop();
        numbers.push(val1+val2);
    }

    private void sub() {
        val2 = numbers.pop();
        val1 = numbers.pop();
        numbers.push(val1-val2);
    }

    private void put(long val) {
        numbers.push(val);
    }
}
