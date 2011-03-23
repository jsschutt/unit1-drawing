/*****************************************************
* @author Jacob Juby
* @version 0.0.1
* this is the super class of the individual commands
* that power the functionality in the manipulation 
* side of the program
******************************************************/

//package
package command;

public abstract class Command {
    //private parts declarations*************************
    private String command; //string rep of the command
    //end of declarations********************************


    /*****************************************************
    * Default Constructor no params creates Command object
    ******************************************************/
    public Command() {}//end of default constructor


    /*****************************************************
    * Overloaded Constructor creates Command object
    * @param command the string rep of the command
    ******************************************************/
    public Command(String command,) {
        this.command = command;
    }//end of overloaded constructor


    /*****************************************************
    * function to set the value of command
    * @param command the string rep of the command
    ******************************************************/
    public void setcommand(command) {
        this.command = command;
    }


    /*****************************************************
    * function to return the value of command
    * @return command the string rep of the command  
    ******************************************************/
    public String getcommand() {
        return command;
    }
    
    /*****************************************************
    * abstract function that alters the two important 
    * points of any glyph
    * TODO change return type to something apropriate
    * TODO come up with a way to return a set of 2 points
    *        an location object maybe
    * TODO add more methods for inherited functionality in
    *        all commands
    *****************************************************/
    public abstract void perform() {
    }


}//end of Command
