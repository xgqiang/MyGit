package coursemanagesystem.exception;

public class UserDuplicatedException extends Exception{
    public UserDuplicatedException(String message){
        super(message);
    }
}
