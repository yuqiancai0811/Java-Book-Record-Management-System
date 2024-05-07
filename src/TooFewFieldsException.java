/**
 * Too Few Fields
 */
public class TooFewFieldsException extends Exception{
    /**
     * constructor
     */
    public TooFewFieldsException(){
        super("Too few field");
    }
    /**
     * A constructor that takes a String parameter
     */
    public TooFewFieldsException(String s){
        super(s);
    }

    /**
     *method for getting message
     * @return String as a message
     */
    public String getMessage(){
        return super.getMessage();
    }
}
