// FileHandler.java
package homework17;

import java.io.*;

import com.codeborne.selenide.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;

public class FileHandler {

    // ეს მეთოდი უნდა გამოუძახო სანამ ტესტი დაიწყება — ის გადმოწერს და შეცვლის testfile.txt-ს
    public static void downloadAndModifyFile() throws IOException {
        open("https://the-internet.herokuapp.com/"); // გახსნის საიტს
        $("h1").shouldHave(text("Welcome to the-internet")); // ვალიდაცია

        $(byText("File Download")).click(); // File Download ლინკზე დაწკაპუნება
        $("h3").shouldHave(text("File Downloader")); // ვალიდაცია

        // მოძებნე testfile.txt ლინკი და გადმოწერე
        SelenideElement fileLink = $$("a").findBy(text("testfile.txt"));
        File downloadedFile = fileLink.download(); // გადმოწერა

        // ფაილის გასუფთავება და ახალი მონაცემების ჩაწერა
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(downloadedFile))) {
            writer.write("Accepted usernames are:\n\n");
            writer.write("standard_user\n");
            writer.write("locked_out_user\n");
            writer.write("problem_user\n");
            writer.write("performance_glitch_user\n");
            writer.write("error_user\n");
            writer.write("visual_user\n");
            writer.write("Password for all users:\n\n");
            writer.write("secret_sauce");
        }
    }

    // აბრუნებს გადმოწერილი ფაილის ობიექტს (გამოიყენება DataProvider-ში)
    public static File getModifiedFile() {
        return new File(System.getProperty("user.home") + "/Downloads/testfile.txt");
    }
}
