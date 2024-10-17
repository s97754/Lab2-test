import java.util.Objects;
import java.util.Scanner;

public class Main  {
    public static class Login {
        String username;
        String password;

        public boolean tryLogin() {
            Scanner sc = new Scanner(System.in);

            System.out.print("Username: ");
            String username = sc.nextLine();
            System.out.print("Password: ");
            String password = sc.nextLine();

            return Objects.equals(this.username, username) && Objects.equals(this.password, password);
        }

        public Login(String username, String password) {
            this.username = username;
            this.password = password;
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
        Login login = new Login("Krzysztof", "123");

        if(login.tryLogin()) {
            System.out.println("Zalogowano.");
        }
        else {
            System.out.println("Logowanie nieudane.");
        }
    }
}