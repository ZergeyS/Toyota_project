package main.Components;

public class Wheel extends Component {
    private WheelSize wheelSize;

    public Wheel(boolean isWorked, WheelSize wheelSize) {
        super(isWorked);
        this.wheelSize = wheelSize;
    }
}
