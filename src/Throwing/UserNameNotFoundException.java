package Throwing;

public class UserNameNotFoundException extends Exception{
    public UserNameNotFoundException()
    {
    }
    public UserNameNotFoundException(String msg)
    {
        super(msg);
    }
}
