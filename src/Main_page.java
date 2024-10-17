import java.util.Scanner;

public class Main_page
{

    private String current_user;

    public Main_page (String u){
        current_user = u;
    }

    public void showPage ()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to application main page user " +current_user);
        System.out.println("Please input any key to logout ...");
        sc.nextLine();
    }

    public void setUser (String usr)
    {
        current_user = usr;
    }

    public String getUser ()
    {
        return current_user;
    }
}
