package cafeteria;

public class consumer extends Thread{
	int napTime;

	board board;
	consumer(int napTime, board board){
		this.napTime = napTime;
		this.board = board;
	}

	@Override
	public void run(){
		do {
			try {
				Thread.sleep(napTime);
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
			takeTablet();
		}while (true);
	}

	void takeTablet(){
		if(board.isEmpty()){
			System.out.println("Aborted Take Tablet: Board is empty");
			return;
		}
		System.out.println("Removing tablet. Tablets left: "+ board.getNumberOfTabletsPresent());
		board.remove();
	}
}
