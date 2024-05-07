/**
 * Missing Field
 */
public class MissingFieldException  extends Exception{
    /**
     * constructor
     */
    public MissingFieldException(){
        super("missing");
    }
    /**
     * A constructor that takes a String parameter
     */
    public MissingFieldException(String s){
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
