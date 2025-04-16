public class SetThermostatCommand implements Command {
    private Thermostat thermostat;
    private int temperature;
    private int prevTemperature;

    public SetThermostatCommand(Thermostat thermostat, int temperature) {
        this.thermostat = thermostat;
        this.temperature = temperature;
        this.prevTemperature = thermostat.getTemperature();
    }

    public void execute() {
        prevTemperature = thermostat.getTemperature();
        thermostat.setTemperature(temperature);
    }

    public void undo() {
        thermostat.revertTemperature(prevTemperature);
    }
}