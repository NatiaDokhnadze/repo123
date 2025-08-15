package DataProvider; // პაკეტი სადაც შენახული იქნება ეს კლასი

import homework16.FileDownloader;
import org.testng.annotations.DataProvider;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UserDataProvider {

    // ეს მეთოდი არის TestNG-ის DataProvider, რომელიც ტესტებს მიაწვდის იუზერს და პაროლს
    @DataProvider(name = "userCredentials")
    public static Object[][] provideUserCredentials() throws IOException {

        // ვიღებთ გადმოწერილ და მოდიფიცირებულ ფაილს
        File file = FileDownloader.downloadAndModifyFile();

        // ვქმნით ცარიელ სიას იუზერნეიმებისთვის
        List<String> usernames = new ArrayList<>();
        String password = ""; // ამ ცვლადში ვინახავთ პაროლს

        // ვკითხულობთ ფაილს ლაინ ბაი ლაინ
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            boolean readingUsernames = false;

            // ციკლი წაიკითხავს ყველა ხაზს ფაილიდან
            while ((line = reader.readLine()) != null) {
                line = line.trim(); // წაშლის ზედმეტ ცარიელ ადგილებს ხაზის დასაწყისში და ბოლოს


                if (line.equals("Accepted usernames are:")) {
                    readingUsernames = true;
                    continue;
                }

                // თუ მივედით პაროლის სათაურამდე — ვწყვეტთ იუზერების წაკითხვას და ვიღებთ პაროლს
                if (line.equals("Password for all users:")) {
                    readingUsernames = false;
                    password = reader.readLine().trim(); // ვიღებთ შემდეგ ხაზზე არსებულ პაროლს
                    break;
                }

                //  ეს ვერ გავიგე რისთვისაა და რას აკეთებს
                if (readingUsernames && !line.isEmpty()) {
                    usernames.add(line);
                }
            }
        }

        // ვქმნით ორმაგ მასივს (Object[][]) TestNG-ის DataProvider-ისთვის
        Object[][] data = new Object[usernames.size()][2];

        // ყოველი იუზერისთვის ვამატებთ მასივში შესაბამის იუზერნეიმს და პაროლს
        for (int i = 0; i < usernames.size(); i++) {
            data[i][0] = usernames.get(i); // იუზერნეიმი
            data[i][1] = password;         // პაროლი (ყველა იუზერისთვის ერთი და იგივეა)
        }

        return data; //
    }
}
