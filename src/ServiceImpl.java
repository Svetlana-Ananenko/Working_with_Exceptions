import exceptions.ExceptionDueToBlankFields;
import exceptions.WrongLoginException;
import exceptions.WrongPasswordException;

public class ServiceImpl implements ServiceInterface {




    public void check(String login, String password, String confirmPassword) throws WrongLoginException {
        int lengthLogin = login.length();
        boolean check2 = (lengthLogin <= 20) ;

        if (login.isEmpty()) {
            throw new ExceptionDueToBlankFields();
        }
        if (!check2 || !password.matches(RegExps.LOGIN_REGEXP)) {
            throw new WrongLoginException();
        }



        int lengthPassword = password.length();
        int lengthConfirmPassword = confirmPassword.length();
        boolean check3 = (lengthPassword <= 20) ;
        if (password.isEmpty() || confirmPassword.isEmpty()) {
            throw new ExceptionDueToBlankFields();
        }

        if (password != confirmPassword || !password.matches(RegExps.PASSWORD_REGEXP) || !check3 )  {
            throw new WrongPasswordException();
        }



    }
}




