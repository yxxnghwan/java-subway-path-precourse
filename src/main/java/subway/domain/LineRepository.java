package subway.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class LineRepository {
    private static final List<Line> lines = new ArrayList<Line>(){
        {
            Line line2 = new Line("2호선");
            line2.addStation("교대역", new DistanceAndMinute(2, 3));
            line2.addStation("강남역", new DistanceAndMinute(2, 3));
            line2.addStation("역삼역", new DistanceAndMinute(0, 0));
            Line line3 = new Line("3호선");
            line3.addStation("교대역", new DistanceAndMinute(3, 2));
            line3.addStation("남부터미널역", new DistanceAndMinute(6, 5));
            line3.addStation("양재역", new DistanceAndMinute(1, 1));
            line3.addStation("매봉역", new DistanceAndMinute(0, 0));
            Line sinbundang = new Line("신분당선");
            sinbundang.addStation("강남역", new DistanceAndMinute(2, 8));
            sinbundang.addStation("양재역", new DistanceAndMinute(10, 3));
            sinbundang.addStation("양재시민의숲역", new DistanceAndMinute(0, 0));

            add(line2);
            add(line3);
            add(sinbundang);
        }
    };

    public static List<Line> lines() {
        return Collections.unmodifiableList(lines);
    }

    public static void addLine(Line line) {
        lines.add(line);
    }

    public static boolean deleteLineByName(String name) {
        return lines.removeIf(line -> Objects.equals(line.getName(), name));
    }

    public static void deleteAll() {
        lines.clear();
    }
}
