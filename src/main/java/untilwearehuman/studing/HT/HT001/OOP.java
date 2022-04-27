package untilwearehuman.studing.HT.HT001;

import untilwearehuman.studing.HT.HT001.dto.Engine;
import untilwearehuman.studing.HT.HT001.dto.api.IEngine;
import untilwearehuman.studing.HT.HT001.dto.api.IPart;

public class OOP {
    public static void main(String[] args) {

        IPart[] parts = new IPart[10];
        parts[0] = new Engine(1600, "JSDX1.6");
        parts[1] = new Engine("Engine", 2000, "JVSD2.0");

        for (IPart part : parts) {
            if (part != null) {
                System.out.println(part.getDescription());
            }
        }
    }
}
