public class RemoteControlDemo {
    public static void main(String[] args) {
        Light livingRoomLight = new Light();
        Thermostat thermostat = new Thermostat();

        Command lightOnCommand = new TurnOnLightCommand(livingRoomLight);
        Command setTempCommand = new SetThermostatCommand(thermostat, 22);

        SmartHomeRemoteControl remote = new SmartHomeRemoteControl();
        remote.setCommand("light", lightOnCommand);
        remote.setCommand("temp", setTempCommand);

        remote.pressButton("light");
        remote.pressButton("temp");

        System.out.println("Undo last command");
        remote.undoButton();
    }
}

