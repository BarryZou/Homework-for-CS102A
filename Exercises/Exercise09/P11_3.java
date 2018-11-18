import java.util.*;
import java.io.*;
import java.net.*;

public class P11_3 {
    public static void main(String[] args) throws FileNotFoundException, MalformedURLException, IOException {
        PrintWriter web = new PrintWriter("website.txt");
        System.out.println("Please input the address of the website:");
        Scanner console = new Scanner(System.in);
        String address = console.nextLine();
        console.close();
        web.printf("The URL of the page is \"%s\", and it's saved in \"website.txt\".", address);
        URL pagelocation = new URL(address);
        Scanner in = new Scanner(pagelocation.openStream());
        while (in.hasNextLine()) {
            String line = in.nextLine();
            web.println(line);
        }
        in.close();
        web.close();
    }
}
