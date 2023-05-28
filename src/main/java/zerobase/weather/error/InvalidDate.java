package zerobase.weather.error;

public class InvalidDate extends RuntimeException{
    private static final String MESSAGE ="Too past or future date.";

    public InvalidDate(){
        super(MESSAGE);
    }
}
