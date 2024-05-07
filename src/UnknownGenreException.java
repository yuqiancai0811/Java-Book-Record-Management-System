/**
 * Unknown Genre
 */
public class UnknownGenreException extends Exception {
    /**
     * constructor
     */
    public UnknownGenreException() {
        super("Invalid genre");
    }

    /**
     * A constructor that takes a String parameter
     */
    public UnknownGenreException(String s) {
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
