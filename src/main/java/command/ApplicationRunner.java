package command;

import command.commands.FanStartCommand;
import command.commands.FanStopCommand;
import command.commands.LightOffCommand;
import command.commands.LightOnCommand;
import command.model.Fan;
import command.model.Light;
import command.model.RemoteControl;
import command.util.Command;

public class ApplicationRunner {
    public static void main(String[] args) {

                Light livingRoomLight = new Light();
                Fan livingRoomFan = new Fan();

                Command lightOn = new LightOnCommand(livingRoomLight);
                Command lightOff = new LightOffCommand(livingRoomLight);
                Command fanStart = new FanStartCommand(livingRoomFan);
                Command fanStop = new FanStopCommand(livingRoomFan);

                RemoteControl remote = new RemoteControl();

                remote.setCommand(lightOn);
                remote.pressButton();

                remote.setCommand(fanStart);
                remote.pressButton();

                remote.setCommand(lightOff);
                remote.pressButton();

                remote.setCommand(fanStop);
                remote.pressButton();
            }
        }



