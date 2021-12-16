package subway.domain;

public class DistanceAndMinute {
	private Integer distance;
	private Integer minute;

	public DistanceAndMinute(Integer distance, Integer minute) {
		this.distance = distance;
		this.minute = minute;
	}

	public Integer getDistance() {
		return distance;
	}

	public Integer getMinute() {
		return minute;
	}
}
