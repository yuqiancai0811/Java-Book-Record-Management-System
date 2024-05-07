/**
 * invalid ISBN-10
 */
public class BadIsbn10Exception extends Exception{
    /**
     * constructor
     */
    public BadIsbn10Exception() {
        super("invalid ISBN-10");
    }

    /**
     * A constructor that takes a String parameter
     */
    public BadIsbn10Exception(String s) {
        super(s);
    }

    /**
     * method for getting message
     *
     * @return String as a message
     */
    public String getMessage() {
        return super.getMessage();
    }
}
