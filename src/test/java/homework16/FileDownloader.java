package homework16; // package-ს სახელი

import com.codeborne.selenide.Configuration; // Selenide-ის კონფიგურაცია
import com.codeborne.selenide.SelenideElement; // Selenide-ის ელემენტის ტიპი

import java.io.File; // File კლასი — ფაილზე წვდომისთვის
import java.io.FileWriter; // FileWriter — ფაილის ჩასაწერად
import java.io.IOException; // შეცდომის ტიპი ფაილის ოპერაციებისთვის

import static com.codeborne.selenide.Selenide.*; // Selenide მეთოდები (open,$,$$)

public class FileDownloader {

    // ეს მეთოდი შლის ფაილში ყველაფერს და წერს ახალ ტექსტს
    public static File downloadAndModifyFile() throws IOException {

        // აქ ვინახავ გადმოწერილ ფაილებს
        Configuration.downloadsFolder = "downloads";

        // ტესტ რეპორტებისთვის
        Configuration.reportsFolder = "test-results";

        //  **გახსენით** https://the-internet.herokuapp.com/
        open("https://the-internet.herokuapp.com/");

        // **ვალიდაცია:** გვერდი ჩაიტვირთა თუ არა
        $("h1").shouldHave(com.codeborne.selenide.Condition.text("Welcome"));

        // დააკლიკე "File Download" ლინკზე
        $x("//a[text()='File Download']").click();

        // **ვალიდაცია:** File Download გვერდი ჩაიტვირთა
        $("h3").shouldHave(com.codeborne.selenide.Condition.text("File Downloader"));

        //  **მოძებნეთ** testfile.txt (კარგი ლოკატორით!)
        SelenideElement fileLink = $$("div.example a").findBy(com.codeborne.selenide.Condition.text("testfile.txt"));

        //**გადმოწერეთ** ფაილი
        File downloadedFile = fileLink.download();

        // **გახსენით** ფაილი Java-ში
        try (FileWriter writer = new FileWriter(downloadedFile, false)) {

            // ჩაწერე ტექსტი ფაილში — როგორც უნდა ჩანდეს DataProvider-ში
            writer.write("Accepted usernames are:\n\n"); // ტექსტი
            writer.write("standard_user\n"); // იუზერები
            writer.write("locked_out_user\n");
            writer.write("problem_user\n");
            writer.write("performance_glitch_user\n");
            writer.write("error_user\n");
            writer.write("visual_user\n\n");
            writer.write("Password for all users:\n"); // პაროლის სათაური
            writer.write("secret_sauce\n");// პაროლი
        }

        // დააბრუნე ფაილი (საჭირო იქნება შემდეგ DataProvider-ში)
        return downloadedFile;
    }
}
