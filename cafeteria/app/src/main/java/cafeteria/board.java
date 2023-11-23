package cafeteria;

public class board{
	int tableCapacity = 10;
	int numberOfTabletsPresent;
	tablet[] tablets;

	board(){
		tablets = new tablet[tableCapacity];
	}


	int getNumberOfTabletsPresent(){
		return numberOfTabletsPresent;
	}
	boolean isEmpty(){
		return numberOfTabletsPresent == 0;
	}

	boolean isFull(){
		return numberOfTabletsPresent == tableCapacity;
	}

	synchronized void drop(tablet tabletToDrop){
		tablets[numberOfTabletsPresent] = tabletToDrop;
		numberOfTabletsPresent++;
	}

	synchronized void remove(){
		numberOfTabletsPresent--;
		return;
	}
}
