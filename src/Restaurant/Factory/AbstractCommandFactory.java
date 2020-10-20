package Restaurant.Factory;

import Restaurant.Command.Command;

public abstract class AbstractCommandFactory {
    public abstract Command createCommand();
}
