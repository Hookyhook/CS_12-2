package cafeteria;

public class producer extends Thread{
	int napTime;

	board board;
	producer(int napTime, board board){
		this.napTime = napTime;
		this.board = board;
	}

	@Override
	public void run(){
		do{
			try {
				Thread.sleep(napTime);
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
			dropTablet();
		}while(true);

	}

	void dropTablet(){
		if(board.isFull()){
			System.out.println("Aborted Drop Table: Board is full");
			return;
		}
		System.out.println("Dropping Table. Tablets present: "+ board.getNumberOfTabletsPresent());
		board.drop(new tablet());
	}
}
