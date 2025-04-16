# Chain of Responsibility Pattern

• In this scenario, the Chain of Responsibility Pattern was used to model a tech support workflow for a helpdesk system. Without the pattern, every support case would need to be matched and routed manually using deeply nested if-else statements, leading to rigid and unscalable code. By introducing a chain of handlers (FAQBotHandler, JuniorSupportHandler, and SeniorSupportHandler), support requests are passed through a sequence of handlers, where each decides whether to process the issue or forward it to the next level.

• The Chain of Responsibility Pattern allowed requests to be handled dynamically without the sender knowing which specific handler would process them. This added flexibility and improved code readability. Since all handlers implement a shared interface, adding new levels (e.g., ExpertSupportHandler) is straightforward and doesn’t require changes to existing logic. This promotes separation of concerns and aligns with key OOP principles such as open/closed and single responsibility, making the support system more modular, extensible, and easier to maintain.

# Command Pattern

• In this scenario, the Command Pattern was used to design a flexible smart home remote control system that can execute and undo actions on different devices. Without this pattern, every button on the remote would need to hardcode logic for controlling devices like lights or thermostats, resulting in tight coupling and poor scalability. By introducing commands such as TurnOnLightCommand and SetThermostatCommand, each action was encapsulated into a reusable object that knows how to interact with a specific device.

• The Command Pattern decouples the invoker (SmartHomeRemoteControl) from the receivers (Light, Thermostat), allowing the same remote control to be easily reconfigured for different commands. This design supports advanced features like undo, macro recording, and delayed execution, all without modifying the devices themselves. It also simplifies testing and logging by treating actions as standalone objects. Overall, the pattern enhances code modularity and supports clean separation between interface logic and execution logic, which is especially beneficial in IoT and event-driven systems.
