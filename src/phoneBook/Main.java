package phoneBook;


public class Main {
	public static void main(String[] args) {
		

		PhoneBook phoneBook = new PhoneBook();
		
		
		long hashInsertStart = System.nanoTime();
		for(Integer x=1; x<100000; x++) {
			phoneBook.hashAdd(new User(x.toString()));
		}
		long hashInsertEnd = System.nanoTime();
		System.out.println((hashInsertEnd - hashInsertStart) + " - HashSet insertion time");
		
		
		long hashFindStart = System.nanoTime();
		phoneBook.hashFind("99998");
		long hashFindEnd = System.nanoTime();
		System.out.println((hashFindEnd - hashFindStart) + " - HashSet find time with for loop");
		
		long hashFindIStart = System.nanoTime();
		phoneBook.hashFindIterator("99998");
		long hashFindIEnd = System.nanoTime();
		System.out.println((hashFindIEnd - hashFindIStart) + " - HashSet find time with iterator");
		
		
		long listInsertStart = System.nanoTime();
		for (Integer x=0; x<100000; x++) {
			phoneBook.listAdd(new User(x.toString()));
		}
		long listInsertEnd = System.nanoTime();
		System.out.println((listInsertEnd - listInsertStart) + " - ArrayList insertion time");
		
		
		long listFindStart = System.nanoTime();
		phoneBook.listFind("99998");
		long listFindEnd = System.nanoTime();
		System.out.println((listFindEnd - listFindStart) + " - ArrayList find time");
		
	}
}
