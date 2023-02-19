package Basic_Programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Get_Input_from_the_User {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();

        System.out.println(name);
    }
}
