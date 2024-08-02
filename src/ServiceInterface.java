import exceptions.WrongLoginException;

public interface ServiceInterface {

    default void check(String login, String password, String confirmPassword) throws WrongLoginException {

    }


}
