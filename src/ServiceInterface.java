import exceptions.ExceptionDueToBlankFields;
import exceptions.WrongLoginException;
import exceptions.WrongPasswordException;

public interface ServiceInterface {

    default void check(String login, String password, String confirmPassword) throws  WrongLoginException, WrongPasswordException, ExceptionDueToBlankFields {

    }


}
