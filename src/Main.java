import java.util.Scanner;

public class Main {

    public static class Register{

        String username, password;

        public Register(String username, String password) {
            this.username = username;
            this.password = password;
        }

        public boolean confirmPassword(String password) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Wpisz hasło: ");
            String inputPassword = scanner.nextLine();
            return password.equals(inputPassword);
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

    }

    public static void main(String[] args) {
        Register register = new Register("Cristiano7", "cr7-1985");

        if(register.confirmPassword(register.password)) {
            System.out.println("Zarejestrowano poprawnie");
        } else {
            System.out.println("Nie udało się zarejestrować");
        }
    }
}