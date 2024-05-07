/**
 *  price is smaller than 0
 */
public class BadPriceException extends Exception{
    /**
     * constructor
     */
    public BadPriceException() {
        super("invalid price");
    }

    /**
     * A constructor that takes a String parameter
     */
    public BadPriceException(String s) {
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
