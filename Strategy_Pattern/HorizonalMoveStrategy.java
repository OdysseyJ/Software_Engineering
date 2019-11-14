package exam04.strategy;

public class HorizonalMoveStrategy extends DirectionStrategy {
	public void move(Ball ball) {
		ball.setIntervals(Ball.INTERVAL,0);
	}
}
