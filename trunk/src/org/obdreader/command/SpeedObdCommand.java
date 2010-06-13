package org.obdreader.command;

import org.obdreader.config.ObdConfig;

public class SpeedObdCommand extends IntObdCommand {

	public SpeedObdCommand() {
		super("010D",ObdConfig.SPEED,"km/h","mph");
	}
	public SpeedObdCommand(SpeedObdCommand other) {
		super(other);
	}
	@Override
	public int getImperialInt() {
		if (intValue <= 0) {
			return 0;
		}
		return (int)(intValue * .625);
	}
}
