/**
 * Too Many Fields
 */
public class TooManyFieldsException extends Exception{
    /**
     * constructor
     */
    public TooManyFieldsException(){
        super("Too many field");
    }
    /**
     * A constructor that takes a String parameter
     */
    public TooManyFieldsException(String s){
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
