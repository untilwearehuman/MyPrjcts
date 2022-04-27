package untilwearehuman.studing.HT.HT001.dto;

import untilwearehuman.studing.HT.HT001.dto.api.IEngine;
import untilwearehuman.studing.HT.HT001.dto.api.IPart;

public class Engine implements IEngine {
    private String name;
    private int volume;
    private String model;

    public Engine(int volume, String model) {
        this.name = "Двигатель";
        this.volume = volume;
        this.model = model;
    }

    public Engine(String name, int volume, String model) {
        this.name = name;
        this.volume = volume;
        this.model = model;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String getDescription() {
        return name + " - " + "модель " + model + " , объём " + volume + " куб.см";
    }
}
