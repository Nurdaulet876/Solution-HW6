public class Thermostat {
    private int temperature;

    public void setTemperature(int temp) {
        System.out.println("[Thermostat] Setting temperature to " + temp + "°C");
        temperature = temp;
    }

    public void revertTemperature(int prevTemp) {
        System.out.println("[Thermostat] Reverting to previous temperature " + prevTemp + "°C");
        temperature = prevTemp;
    }

    public int getTemperature() {
        return temperature;
    }
}