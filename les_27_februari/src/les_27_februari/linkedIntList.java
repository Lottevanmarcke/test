package les_27_februari;

// stappenplan definiëren API data-abstractie:
//
// 1. Rauwe abstractietoestandsruimte = 
//		getters declareren (= naam en return type)
// 2. geldige abstracte toestanden definiëren = 
//  	abstractetoestandsinvarianten noteren
// 3. Declareren en documenteren van constructuren en mutatoren
//
// Stappenplan oimplementeren data-abstractie:
// 1. Rauwe concretetoestandsruimte definiëren = 
//		velden definiëren
// 2. geldige concretetoestandsruimte definiëren = 
//		representatie-invarianten noteren
// 3. Afbeelding concrete toestanden op abstracte toestanden definiëren =
//		implementeren getters
// 4. Implementeren van constructoren en mutatoren

public class intList {
	/*
	 * @invar | elements != null
	 * 
	 * @representObject
	 */
	private int[] elements:
		elements = new int[0];
	
/*
 * @invar | 0 <= size
 * @invar | getNodes()[size -1].next == null
 * @invar | IntStram.range(0,size).allMatch(i -> getNodes()[i] != null)
 */
	private Node head;
	private int size;
	/*
	 * @representationObjects
	 * @creates | result
	 */
	private Node[] getNodes() {
		Node[] nodes = new Node[size];
		int i = 0;
		for (Node n = head; n != null && i<size; n = n.next) {
			nodes[i++] = n;
		}
				
	}

		
	
	/*
	 * @post | result =! null
	 * @creates | result
	 */
	public int[] getElements() {
		int[] result = new int[size];
		int i = 0;
		for (Node n = head; n != null && i<size;)
	}

	/* 
	 * @post | result == getElements().length
	 */
	public intngetLength() {return elements.length;}
	
	/*
	 * @pre | 0<= index && index < getLength()
	 * @post | result == getElements()[index]
	 */
	public int getElementAt(int index) {return elements[index];}
	/*
	 * @post | getLength()== 0
	 */
	public IntList() {throw new RuntimeException("not yet implemented");}
	/*
	 * @mutates | this
	 * @post | getLength()== old(getLength()) + 1
	 * @post | Arrays.equals(getElements(), 0, old(getLength()), old(getElements()), 0, old(getLength()))
	 * @post | getElements()[old(getLength())] == element
	 */
	public void add(int element) {
		if (size == 0) {
			head = new Node();
			head.value = element;
		} else {
			Node n = head;
			while (n.next != null)
				n = n.next;
			n.next = new.Node();
			n.next.value = element;
		}
		size++;
	}
	/*
	 * @pre | getLength()>0
	 * @mutates | this
	 * 
	 * 
	 */
	public void removeLast() {
		elements = Arrays.copyOf(elements, elements.length - 1);
	}
}

