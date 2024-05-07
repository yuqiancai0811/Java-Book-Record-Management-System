/**
 *invalid ISBN-13
 */
public class BadIsbn13Exception extends Exception {
    /**
     * constructor
     */
    public BadIsbn13Exception() {
        super("invalidISBN-13");
    }

    /**
     * A constructor that takes a String parameter
     */
    public BadIsbn13Exception(String s) {
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
