package test.ThinkinJava.cha10;

interface Selector{
	boolean end();
	Object current();
	void next();
}

class Sequence{
	private Object[]  items;
	private int next = 0;
	public Sequence(int size) {
		items = new Object[size];
	}
	public void add(Object x) {
		if(next < items.length)
			items[next++] = x;
	}
	private class SequenceSelector implements Selector{
		private int i = 0;
		public boolean end() {
			return i == items.length;
		}
		public Object current() {
			return items[i];
		}
		public void next() {
			if(i < items.length)
				i++;
		}
	}
	public Selector selector() {
		return new SequenceSelector();
	}
}

class StringHolder{
	private String data;
	public StringHolder(String data) {
		this.data = data;
	}
	public String toString() {
		return data;
	}
}

public class E02_SequenceOfStringHolders {

	public static void main(String[] args) {
		Sequence sequence = new Sequence(10);
		for(int i = 0; i < 10; i++)
			sequence.add(new StringHolder(Integer.toString(i)));
		Selector selector = sequence.selector();
		while(!selector.end()) {
			System.out.print(selector.current() + " ");
			selector.next();
		}
	}
}
