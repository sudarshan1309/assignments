package question3;
import java.util.ArrayList;
public class answer {
/*  A checked exception is caught at compile time whereas a runtime or unchecked exception is, 
 * as it states, at runtime.
 * A checked exception must be handled either by re-throwing or with a try catch block, 
 * whereas an unchecked isn’t required to be handled.
 * A runtime exception is a programming error and is fatal whereas a checked exception 
 * is an exception condition within your code’s logic and can be recovered or re-tried from.
 */
public static void main(String[] args) {
    ArrayList<String> arrayList = new ArrayList<>();

    arrayList.add("Monday");
    arrayList.add("Tuesday");
    arrayList.add("Wednesday");

    String day = "Sunday";

    if (!arrayList.contains(day)) {

        try {
            throw new DayNotAvailableException("Day not available",day);
        } catch (DayNotAvailableException e) {
            e.getLocalizedMessage();
            e.printStackTrace();
        }
    }

}
}


class DayNotAvailableException extends RuntimeException {

    private String day;

    public DayNotAvailableException() {
        super();
    }

    public DayNotAvailableException(String message, String day) {
        super(message);
        this.day = day;
    }

    public DayNotAvailableException(String message, String day, Throwable cause) {
        super(message, cause);
        this.day = day;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String getMessage() {
        return super.getMessage() + " for the day :" + day;
    }

    @Override
    public String getLocalizedMessage() {
        return "The day "+day + " is not available.";
    }
}