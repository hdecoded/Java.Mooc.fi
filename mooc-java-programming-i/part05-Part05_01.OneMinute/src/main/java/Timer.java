public class Timer {
    ClockHand hundrethsOfASecond = new ClockHand(100);
    ClockHand seconds = new ClockHand(60);

    public void advance() {
        hundrethsOfASecond.advance();
        if (hundrethsOfASecond.value() == 0)
        seconds.advance();
    }

    @Override
    public String toString() {
        return seconds + ":" + hundrethsOfASecond;
    }
}
