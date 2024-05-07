/**
 * invalid year
 */
public class BadYearException extends Exception{
    /**
     * constructor
     */
    public BadYearException() {
        super("invalid year");
    }

    /**
     * A constructor that takes a String parameter
     */
    public BadYearException(String s) {
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
