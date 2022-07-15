package main.Components;

public abstract class Component {
    private boolean isWorked;

    public Component(boolean isWorked) {
        this.isWorked = isWorked;
    }

    public boolean isWorked() {
        return isWorked;
    }

    public void setWorked(boolean worked) {
        isWorked = worked;
    }
}
