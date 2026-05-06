package Observer;

public class Main {
    public static void main(String[] args) {

        Connection user = new Connection();
        SocialMediaFeed feed = new SocialMediaFeed();

        user.addObserver(feed);

        user.setStatus("Hello world!");
        user.setStatus("Design Pattern is fun!");

        feed.printFeed();
    }
}
