import exceptions.ExceptionDueToBlankFields;
import exceptions.WrongLoginException;
import exceptions.WrongPasswordException;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {


        String  login = "JAVA_2024";
        String password = "55_go";
        String confirmPassword = "55_go";



        ServiceImpl service = new ServiceImpl();
        try {
            service.check(login, password, confirmPassword);
        } catch (WrongLoginException e) {
            System.out.println("Максимальное количество символов = 20, логин должен быть только из латинский букв и цифр, а так же разрешено нижнее подчеркивание");
        } catch (WrongPasswordException e) {
            System.out.println("Пароли не совпадают либо не учтенено требование к паролю: Максимальное количество символов = 20, пароль должен быть только из латинский букв и цифр, а тк же разрешено нижнее подчеркивание");
        } catch (ExceptionDueToBlankFields e) {
            System.out.println("Не все поля заполнены");
        } finally {
            System.out.println("Работа метода service окончена");
        }






    }
}