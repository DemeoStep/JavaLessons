package homework4.task3;

public class Player implements Playable, Recordable {
    private String state = "stopped";

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public void play() {
        state = "playing";
    }

    @Override
    public void record() {
        state = "recording";
    }

    @Override
    public void pause() {
        state = "paused";
    }

    @Override
    public void stop() {
        state = "stopped";
    }

    @Override
    public String toString() {
        return "Player is " + state;
    }
}
