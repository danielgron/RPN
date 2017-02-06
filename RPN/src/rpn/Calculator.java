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
    PathStack numbers = new PathStack();
    Scanner s = new Scanner(System.in);
    
    public void start(){
        String cmd;
    while (!(cmd=s.nextLine()).equals("quit")){
        String[] commands = cmd.split(" ");
        
        for (String command : commands) {
            if (command.equals("*")) mult();
            else if (command.equals("*")) mult();
            else if (command.equals("*")) mult();
            else if (command.equals("*")) mult();
        }
    }
        
    }

    private void mult() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
