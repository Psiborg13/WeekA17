package binarytree;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class BinarySearchTree implements Set{
	Node headNode;
	int size;
	public BinarySearchTree(int headNumber) {
		headNode = new Node(headNumber, null);
		size = 1;
	}

	@Override
	public boolean add(Object arg0) {
		int num = (int) arg0;
		Node curNode = headNode;
		while(true) {
			if(curNode==null) {
				curNode.setNum(num);
				size++;
				return true;
			}
			else if(num>curNode.getNum()){
				if(curNode.getRightChild()==null){
					curNode.setRightChild(new Node(num, curNode));
					size++;
					return true;
				}
				else{
					curNode = curNode.getRightChild();
				}
			}
			else if(num<curNode.getNum()){
				if(curNode.getLeftChild()==null){
					curNode.setLeftChild(new Node(num, curNode));
					size++;
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
	}

	public Node getHeadNode() {
		return headNode;
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
		int num = (int) arg0;
		Node curNode = headNode;
		while(true) {
			if(curNode==null) {
				return false;
			}
			else if(curNode.getNum()==num){
				return true;
			}
			else if(num>curNode.getNum()){
				if(curNode.getRightChild()==null){
					return false;
				}
				else{
					curNode = curNode.getRightChild();
				}
			}
			else if(num<curNode.getNum()){
				if(curNode.getLeftChild()==null){
					return false;
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
	}

	@Override
	public boolean containsAll(Collection arg0) {
		for(Object o : arg0){
			contains((int) o);
		}
		return true;
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

	public boolean reconnect(Node parent, int removeNum) {
		boolean isLeftChild = false;
		if(parent.getLeftChild()!=null&&parent.getLeftChild().getNum()==removeNum){
			isLeftChild = true;
		}
		if(isLeftChild){
			if(parent.getLeftChild().getLeftChild()==null){
				if(parent.getLeftChild().getRightChild()==null){
					parent.setLeftChild(null);
					size--;
					return true;
				}
				else{
					parent.setLeftChild(parent.getLeftChild().getRightChild());
					size--;
					return true;
				}
			}
			else{
				if(parent.getLeftChild().getRightChild()==null){
					parent.setLeftChild(parent.getLeftChild().getLeftChild());
					size--;
					return true;
				}
				else{
					Node left;
					Node right;
					left = parent.getLeftChild().getLeftChild();
					right = parent.getLeftChild().getRightChild();
					parent.setLeftChild(left);
					Node curNode = left;
					while(true) {
						if(removeNum>curNode.getNum()){
							if(curNode.getRightChild()==null){
								curNode.setRightChild(right);
								size--;
								return true;
							}
							else{
								curNode = curNode.getRightChild();
							}
						}
						else if(removeNum<curNode.getNum()){
							if(curNode.getLeftChild()==null){
								curNode.setLeftChild(right);
								size--;
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
				}
			}
		}
		else{
			if(parent.getRightChild().getLeftChild()==null){
				if(parent.getRightChild().getRightChild()==null){
					parent.setLeftChild(null);
					size--;
					return true;
				}
				else{
					parent.setRightChild(parent.getRightChild().getRightChild());
					size--;
					return true;
				}
			}
			else{
				if(parent.getRightChild().getRightChild()==null){
					parent.setRightChild(parent.getRightChild().getLeftChild());
					size--;
					return true;
				}
				else{
					Node left;
					Node right;
					left = parent.getRightChild().getLeftChild();
					right = parent.getRightChild().getRightChild();
					parent.setRightChild(left);
					Node curNode = left;
					while(true) {
						if(removeNum>curNode.getNum()){
							if(curNode.getRightChild()==null){
								curNode.setRightChild(right);
								size--;
								return true;
							}
							else{
								curNode = curNode.getRightChild();
							}
						}
						else if(removeNum<curNode.getNum()){
							if(curNode.getLeftChild()==null){
								curNode.setLeftChild(right);
								size--;
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
				}
			}
		}
	}

	@Override
	public boolean remove(Object arg0) {
		int num = (int) arg0;
		Node curNode = headNode;
		while(true) {
			if(curNode==null) {
				return false;
			}
			else if(curNode.getNum()==num) {
				return reconnect(curNode.getParent(), num);
			}
			else if(num>curNode.getNum()){
				if(curNode.getRightChild()==null){
					return false;
				}
				else{
					curNode = curNode.getRightChild();
				}
			}
			else if(num<curNode.getNum()){
				if(curNode.getLeftChild()==null){
					return false;
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
	}

	@Override
	public boolean removeAll(Collection arg0) {
		for(Object o : arg0){
			remove((int) o);
		}
		return true;
	}

	@Override
	public boolean retainAll(Collection arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		return size;
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
