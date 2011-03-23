
/*****************************************************
* @author Jacob Juby
* @version 0.0.1
******************************************************/
//package
package command;//temporary need to find better place for it

public class Location {
    //private parts declarations*************************
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    //end of declarations********************************


    /*****************************************************
    * Default Constructor no params creates Location object
    ******************************************************/
    public Location() {}//end of default constructor


    /*****************************************************
    * Overloaded Constructor creates Location object
    * @param x1
    * @param y1
    * @param x2
    * @param y2
    ******************************************************/
    public Location(int x1,int y1,int x2,int y2,) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }//end of overloaded constructor


    /*****************************************************
    * function to set the value of x1
    * @param x1  
    ******************************************************/
    public void setx1(x1) {
        this.x1 = x1;
    }


    /*****************************************************
    * function to return the value of x1
    * @return x1  
    ******************************************************/
    public int getx1() {
        return x1;
    }


    /*****************************************************
    * function to set the value of y1
    * @param y1  
    ******************************************************/
    public void sety1(y1) {
        this.y1 = y1;
    }


    /*****************************************************
    * function to return the value of y1
    * @return y1  
    ******************************************************/
    public int gety1() {
        return y1;
    }


    /*****************************************************
    * function to set the value of x2
    * @param x2  
    ******************************************************/
    public void setx2(x2) {
        this.x2 = x2;
    }


    /*****************************************************
    * function to return the value of x2
    * @return x2  
    ******************************************************/
    public int getx2() {
        return x2;
    }


    /*****************************************************
    * function to set the value of y2
    * @param y2  
    ******************************************************/
    public void sety2(y2) {
        this.y2 = y2;
    }


    /*****************************************************
    * function to return the value of y2
    * @return y2  
    ******************************************************/
    public int gety2() {
        return y2;
    }


}//end of Location
