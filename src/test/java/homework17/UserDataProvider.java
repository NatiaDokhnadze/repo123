// UserDataProvider.java
package data;

import org.testng.annotations.DataProvider;
import homework17.FileHandler;

import java.io.*;
import java.util.*;

public class UserDataProvider {

    @DataProvider(name = "usersFromFile")
    public static Object[][] getUserDataFromFile() throws IOException {
        File file = FileHandler.getModifiedFile(); // გადმოწერილი ფაილი
        List<String> usernames = new ArrayList<>();
        String password = "";

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            boolean readingUsers = false;
            while ((line = reader.readLine()) != null) {
                if (line.contains("Accepted usernames")) {
                    readingUsers = true;
                    continue;
                }
                if (line.contains("Password")) {
                    readingUsers = false;
                    continue;
                }
                if (readingUsers && !line.trim().isEmpty()) {
                    usernames.add(line.trim());
                }
                if (!readingUsers && line.contains("secret_sauce")) {
                    password = "secret_sauce";
                }
            }
        }

        Object[][] data = new Object[usernames.size()][2];
        for (int i = 0; i < usernames.size(); i++) {
            data[i][0] = usernames.get(i);   // username
            data[i][1] = password;           // password
        }
        return data;
    }
}
