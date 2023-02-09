package chapter_6.a;

/**
 * This is representation of an object called Rectangle.
 */
public class Rectangle {
    /**
     * Fields. kinda parameters that this class will have
     * No other code outside this class can access code that is private
     */
    private double length;
    private double width;

    /**
     * Constructor. They used for convenient creation of the objects.
     * Should be the same name as class.
     * This particular constructor for the people that don't know the length and width
     * Public to make it usable outside of this class
     */
    public Rectangle(){
        //giving the default values to the parameters
        // we don't need the this. keyword because we don't pass any values into parentheses
        length = 0;
        width = 0;
    }

    /**
     * Look. Another constructor. We can create as many as we want.
     * All with the same name, but with different parameters.
     * This one will be for those, who know the length and width
     */
    public Rectangle(double length, double width){
        this.length = length; //using the standard this. keyword
        setWidth(width); //using setter methods with this. keyword to make it cooler
    }


    /**
     * These methods allow us to interact with rectangle object.
     * As we need to do this outside of this class we are making them public
     */
    //This is getter. Using it to know the fields values
    double getLength(){
        return length;
    }
    //Setter. Used to give a field some value
    void setLength(double length){
        /**
         * this. keyword means that we are giving the value of variable "length" from the arguments to the global variable from class.
         * These variables have the same name because books saying that this is convenient.
         */
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }


    //different methods to operate with rectangles
    public double calculatePerimeter() {
        return (2*length) + (2*width);
    }

    public double calculateArea() {
        return length * width;
    }
}
