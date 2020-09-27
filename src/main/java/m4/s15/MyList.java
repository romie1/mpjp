package m4.s15;

/**
 * Exercise: write a simple linked list.
 * 
 * @see tester for expected results
 * @author manny
 */
public class MyList {

	Node head;

	public int size() {
		// se head nullo, significa che lista è vuota
		if (head == null) {
			return 0;
		}
		// altrimenti fisso il primo node a head
		Node node = head;
		int count = 0;
		// scorro per la linkedlist, finchè non trovo un node.next == null
		while (node.next != null) {
			count += 1;
			node = node.next;
		}
		// sono all'ultimo nodo, aumento di uno il contatore
		count++;

		return count;
	}

	public void add(int i) {
		// creo un nuovo nodo
		Node newNode = new Node();
		// definisco le proprietà
		newNode.data = i;
		newNode.next = null;

		// controllo se è il primo nodo o no
		if (head == null) {
			head = newNode;
		} else {
			Node n = head;
			// scorro tra la linkedlist, finchè non trovi un n.getNext() null(ultimo nod)
			while (n.next != null) {
				n = n.next;
			}
			// imposto come ultimo nodo, il mio nuovo nodo creato
			n.next = newNode;
		}
	}

	public void addAtStart(int i) {
		Node newNode = new Node();
		newNode.data = i;
		newNode.next = null;

		newNode.next = head;
		head = newNode;

	}

	public void addAt(int index, int i) {
		Node newNode = new Node();
		newNode.data = i;
		newNode.next = null;

		if (index == 0) {
			addAtStart(i);
		} else {
			Node n = head;
			for (int j = 0; j < index - 1; j++) {
				n = n.next;

			}
			newNode.next = n.next;
			n.next = newNode;
		}

	}

	// restituisco ultimo valore della linkedlist
	public int get() {
		Node node = head;
		while (node.next != null) {
//			System.out.println(node.data);
			node = node.next;
		}
		return node.data;
	}

	public int pop() {

		
		return 0;
	}
}
