package exercise;

public class Clock {

	private int hour;
	private int minute;
	private Clock alarm;

	public Clock() {
		this.hour = 0;
		this.minute = 0;
	}

	public Clock(int hour, int minute) {
		setHour(hour);
		setMinute(minute);
	}

	public int getHour() {
		return this.hour;
	}

	public void setHour(int hour) {
		if (hour >= 24 || hour < 0) {
			this.hour = 0;
		} else {
			this.hour = hour;
		}
	}

	public int getMinute() {
		return this.minute;
	}

	public void setMinute(int minute) {
		if (minute >= 60 || minute < 0) {
			this.minute = 0;
		} else {
			this.minute = minute;
		}
	}

	public void setAlarm(int hour, int minute) {
		this.alarm = new Clock(hour, minute);
	}

	public void removeAlarm() {
		this.alarm = null;
	}

	public void tick() {
		this.minute++;
		if (this.minute >= 60) {
			this.minute = 0;
			this.hour++;
			if (this.hour >= 24) {
				this.hour = 0;
			}
		}
		if (this.equals(alarm)) {
			System.out.println("ALARM!!!!!!!!!!");
		}
	}

	public String toString() {
		return "It's " + this.hour + " o'Clock and " + this.minute + " minutes.";
	}

	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (!(obj instanceof Clock))
			return false;
		Clock other = (Clock) obj;
		if (this.hour == other.hour && this.minute == other.minute) {
			return true;
		} else {
			return false;
		}
	}

}
