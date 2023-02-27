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
	private int[] elements;
		elements = new int[0];	
	/*
	 * @post | result =! null
	 * @creates | result
	 */
	public int[] getElements() {return elements.clone();}

	/* 
	 * @post | result == getElements().length
	 */
	public intgetLength() {return elements.length;}
	
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
		elements = Arrays.copyOf(elements, elements.lenght + 1);
		elements[elements.length - 1] = int element;
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
