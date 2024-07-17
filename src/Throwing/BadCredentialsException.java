package Throwing;

public class BadCredentialsException extends Exception{
    public BadCredentialsException()
    {}
    public BadCredentialsException(String msg)
    {
        super(msg);
    }
}
