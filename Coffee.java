package org.example.Task2;

public class Coffee {
    private String espressoProportion = "";
    private String steamedmilkProportion = "";
    private String foamProportion = "";

    public void setEspressoProportion(String _espressoProportion) {
        espressoProportion = _espressoProportion;
    }

    public void setSteamedmilkProportion(String _steamedmilkProportion) {
        steamedmilkProportion = _steamedmilkProportion;
    }

    public void setFoamProportion(String _foamProportion) {
        foamProportion = _foamProportion;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "espressoProportion='" + espressoProportion + '\'' +
                ", steamedmilkProportion='" + steamedmilkProportion + '\'' +
                ", foamProportion='" + foamProportion + '\'' +
                '}';
    }
}

