package sample;

import java.util.ArrayList;
import java.util.List;

public class Line extends Shape {

    private double x1, y1,
                   x2, y2;

    public Line(Instruction type, int pen, List<Double> coordinates) {
        super(type,pen,coordinates);

        x1 = coordinates.get(0);
        y1 = coordinates.get(1);
        x2 = coordinates.get(2);
        y2 = coordinates.get(3);
    }
}
