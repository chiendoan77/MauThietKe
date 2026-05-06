package Observer;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

public class SocialMediaFeed implements PropertyChangeListener {
    private List<String> statuses = new ArrayList<>();

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if ("status".equals(evt.getPropertyName())) {
            String newStatus = (String) evt.getNewValue();
            statuses.add(newStatus);

            System.out.println("Feed updated: " + newStatus);
        }
    }

    public void printFeed() {
        System.out.println("=== FEED ===");
        for (String s : statuses) {
            System.out.println(s);
        }
    }
}