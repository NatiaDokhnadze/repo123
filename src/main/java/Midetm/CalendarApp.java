package Midetm;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;

// ეს კლასი შეიცავს აპლიკაციის ლოგიკას
public class CalendarApp {
//ვუწერთ final რადგან აღარ შეიცველბა ეს მონაცემები რასაც მომხმარებელი შეიტანს
    private final Scanner sc = new Scanner(System.in);
    private final List<Event> events = new ArrayList<>();

     public void run() {
            while (true) {
                printMenu();  // ვბეჭდავთ მენიუს
                String choice = sc.nextLine();
                switch (choice) {
                    case "1" -> addEvent();
                    case "2" -> viewEventsByDate();
                    case "3" -> markEventAsDone();
                    case "4" -> viewAllEventsSorted();
                    case "0" -> {
                        System.out.println("დროებით!");
                        return; // ლუპიდან გამოსვლა და აპლიკაციის დასრულება
                    }
                    default -> System.out.println("არასწორი არჩევანი, სცადეთ თავიდან.");
                }
            }
     }

    // მენიუს დაბეჭდვის მეთოდი
    private void printMenu() {
        System.out.println("\n=== კალენდარის მენიუ ===");
        System.out.println("1. ახალი ივენთის დამატება");
        System.out.println("2. ივენთების ძიება თარიღით");
        System.out.println("3. ივენთის სტატუსის შეცვლა");
        System.out.println("4. ყველა ივენთის ნახვა (სორტირებით)");
        System.out.println("0. გასვლა");
        System.out.print("შეიყვანეთ არჩევანი: ");
    }

    // 1. ახალი ივენთის დამატება
    private void addEvent() {
        System.out.println("\n=== ახალი ივენთის დამატება ===");

        System.out.print("ივენთის სახელი: ");
        String name = sc.nextLine();

        System.out.print("აღწერა: ");
        String description = sc.nextLine();

        LocalDate date = null;

        // თარიღი უნდა დავბეჭდოთ ამ ფორმატით: yyyy-MM-dd
        while (date == null) {
            System.out.print("თარიღი (yyyy-MM-dd): ");
            String input = sc.nextLine();

            try {
                date = LocalDate.parse(input, DateTimeFormatter.ISO_LOCAL_DATE);
            } catch (DateTimeParseException e) {
                System.out.println("თარიღის ფორმატი არასწორია. სცადეთ თავიდან.");
            }
        }

        // ვქმნით ახალ ივენთს და ვამატებთ სიაში
        Event newEvent = new Event(name, description, date);
        events.add(newEvent);

        System.out.println("ივენთი წარმატებით დაემატა!");
    }

    // 2. ივენთების ძიება თარიღით
    private void viewEventsByDate() {
        System.out.println("\n=== ივენთების ძიება თარიღით ===");

        LocalDate date = null;
        while (date == null) {
            System.out.print("შეიყვანეთ თარიღი (yyyy-MM-dd): ");
            String input = sc.nextLine();

            try {
                date = LocalDate.parse(input, DateTimeFormatter.ISO_LOCAL_DATE);
            } catch (DateTimeParseException e) {
                System.out.println("არასწორი თარიღი. სცადეთ თავიდან.");
            }
        }

        // მხოლოდ იმ ივენთების ჩვენება რომლებიც მითითებულ თარიღშია
        boolean found = false;
        for (Event e : events) {
            if (e.getDate().equals(date)) {
                System.out.println(e);
                found = true;
            }
        }

        if (!found) {
            System.out.println("ამ თარიღზე ივენთი ვერ მოიძებნა.");
        }
    }

    // 3. ივენთის სტატუსის შეცვლა
    private void markEventAsDone() {
        System.out.println("\n=== ივენთის სტატუსის შეცვლა ===");

        if (events.isEmpty()) {
            System.out.println("ივენთების სია ცარიელია.");
            return;
        }

        // ყველა ივენთის ჩვენება ნომრებთან ერთად
        for (int i = 0; i < events.size(); i++) {
            System.out.println((i + 1) + ". " + events.get(i));
        }

        System.out.print("აირჩიეთ ივენთის ნომერი სტატუსის შესაცვლელად: ");
        try {
            int choice = Integer.parseInt(sc.nextLine());

            if (choice < 1 || choice > events.size()) {
                System.out.println("არასწორი ნომერი.");
                return;
            }

            Event event = events.get(choice - 1);
            event.markAsDone();  // სტატუსის შეცვლა
            System.out.println("სტატუსი წარმატებით შეიცვალა!");

        } catch (NumberFormatException e) {
            System.out.println("გთხოვთ შეიყვანოთ რიცხვი.");
        }
    }

    // 4. ყველა ივენთის ნახვა თარიღით სორტირებით
    private void viewAllEventsSorted() {
        System.out.println("\n=== ყველა ივენთი (თარიღით სორტირებული) ===");

        if (events.isEmpty()) {
            System.out.println("ჯერ ივენთები არ არის დამატებული.");
            return;
        }

        // ვალაგებთ  თარიღის მიხედვით
        events.sort(Comparator.comparing(Event::getDate));

        // ივენთების დაბეჭდვა
        for (Event e : events) {
            System.out.println(e);
        }
    }
}
