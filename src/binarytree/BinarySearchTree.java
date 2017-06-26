package binarytree;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class BinarySearchTree implements Set{

	Node headNode;
	
	public BinarySearchTree(int headNumber) {
		headNode = new Node(headNumber);
	}

	@Override
	public boolean add(Object arg0) {
		int num = (int) arg0;
		boolean placed = false;
		Node curNode = headNode;
		while(!placed) {
			if(curNode==null) {
				curNode.setNum(num);
				return true;
			}
			else if(num>curNode.getNum()){
				if(curNode.getRightChild()==null){
					curNode.setRightChild(new Node(num));
					return true;
				}
				else{
					curNode = curNode.getRightChild();
				}
			}
			else if(num<curNode.getNum()){
				if(curNode.getLeftChild()==null){
					curNode.setLeftChild(new Node(num));
					return true;
				}
				else{
					curNode = curNode.getLeftChild();
				}
			}
			else
			{
				return false;
			}
		}
		return false;
	}

	@Override
	public boolean addAll(Collection arg0) {
		for(Object o : arg0){
			add((int) o);
		}
		return true;
	}

	@Override
	public void clear() {
		headNode = null;
	}

	@Override
	public boolean contains(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEmpty() {
		return headNode == null;
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray(Object[] arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
