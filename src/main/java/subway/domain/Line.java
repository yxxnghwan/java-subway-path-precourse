package subway.domain;

import java.util.LinkedHashMap;
import java.util.Map;

public class Line {
    private String name;
    private Map<String, DistanceAndMinute> stations = new LinkedHashMap<>();

    public Line(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // 추가 기능 구현
    public void addStation(String stationName, DistanceAndMinute distanceAndMinute) {
        stations.put(stationName, distanceAndMinute);
    }
}
