/**
 * invalid ISBN-length
 */
public class BadIsbnException extends Exception{
    /**
     * constructor
     */
    public BadIsbnException() {
        super("invalid ISBN");
    }

    /**
     * A constructor that takes a String parameter
     */
    public BadIsbnException(String s) {
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
