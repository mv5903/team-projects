package logic;

public class Player {
	public boolean colorSide, playerType;

	public boolean isColorSide() {
		return colorSide;
	}

	public boolean isPlayerType() {
		return playerType;
	}
	
	public class PlayerType extends Player {
		public PlayerType(boolean colorSide) {
			this.colorSide = colorSide;
			this.playerType = true;
		}
	}
	
	public class ComputerPlayer extends Player {
		public ComputerPlayer(boolean colorSide) {
			this.colorSide = colorSide;
			this.playerType = false;	
		}
	}
	
	
}

