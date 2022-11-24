package WestTwo.Round2.Problem3;

public class ValidEmail {
    public static void main(String[] args) {
        System.out.println(checkEmail("1217013295@qq@123.com"));
        System.out.println(checkEmail("1217013295@qq.com"));
    }

    public static boolean checkEmail(String Email) {
        if (Email.matches("^[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-zA-Z0-9]+$")) {
            return true;
        } else {
            return false;
        }
    }
}
