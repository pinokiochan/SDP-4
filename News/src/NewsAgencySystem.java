import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NewsAgencySystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NewsAgency newsAgency = new NewsAgency();
        List<NewsChannel> channels = new ArrayList<>();

        while (true) {
            System.out.println("\n1. Add News Channel");
            System.out.println("2. Remove News Channel");
            System.out.println("3. Update Latest Headline");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter channel name: ");
                    String channelName = scanner.nextLine();
                    NewsChannel channel = new NewsChannel(channelName);
                    newsAgency.addObserver(channel);
                    channels.add(channel); // Store the channel for removal
                    System.out.println(channelName + " added.");
                    break;
                case 2:
                    System.out.print("Enter channel name to remove: ");
                    String nameToRemove = scanner.nextLine();
                    NewsChannel channelToRemove = null;
                    for (NewsChannel c : channels) {
                        if (c.getName().equalsIgnoreCase(nameToRemove)) {
                            channelToRemove = c;
                            break;
                        }
                    }
                    if (channelToRemove != null) {
                        newsAgency.removeObserver(channelToRemove);
                        channels.remove(channelToRemove); // Remove from the list
                        System.out.println(nameToRemove + " removed.");
                    } else {
                        System.out.println("Channel not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter latest headline: ");
                    String headline = scanner.nextLine();
                    newsAgency.setLatestHeadline(headline);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
