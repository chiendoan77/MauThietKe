package Observer;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Connection {
    private String status;
    private PropertyChangeSupport support;

    public Connection() {
        support = new PropertyChangeSupport(this);
    }

    public void addObserver(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }

    public void removeObserver(PropertyChangeListener listener) {
        support.removePropertyChangeListener(listener);
    }

    public void setStatus(String newStatus) {
        String oldStatus = this.status;
        this.status = newStatus;

        System.out.println("User updated status: " + newStatus);

        support.firePropertyChange("status", oldStatus, newStatus);
    }
}