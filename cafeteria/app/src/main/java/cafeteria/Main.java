package cafeteria;

public class Main {


	public static void main(String[] args) {
		board board = new board();

		consumer haraldConsumer = new consumer(1000, board);
		producer haraldProducer = new producer(1400, board);
		producer kausiProducer = new producer(1000, board);

		haraldConsumer.start();
		haraldProducer.start();
		kausiProducer.start();
	}


}
