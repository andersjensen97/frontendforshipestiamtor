class Departure {
    public int hour, minutes;
    public String destination;

    public Departure(int hour, int minutes, String destination) {
        this.hour = hour;
        this.minutes = minutes;
        this.destination = destination;
    }

    @Override
    public String toString() {
        return hour + ":" + minutes + " to " + destination;
    }

    public boolean leavesBefore(Departure other) {
        if (hour < other.hour) {
            return true;
        } else if (hour == other.hour && minutes < other.minutes) {
            return true;
        } else {
            return false;
        }
    }
    
    public void delay(int minutes) {
        this.minutes += minutes;
        if (this.minutes >= 60) {
            this.minutes -= 60;
            this.hour++;
        }
    }
}
