package exam04.strategy;

public class DiagonalMoveStrategy extends DirectionStrategy {
	public void move(Ball ball) {
		ball.setIntervals(Ball.INTERVAL, Ball.INTERVAL);
	}
}
