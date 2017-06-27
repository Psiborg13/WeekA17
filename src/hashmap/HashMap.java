package hashmap;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public class HashMap implements Map{

	private LinkedList<Pair>[] array;
	private int size = 0;
	
	public HashMap(int size) {
		array = new LinkedList[size];
		for (int i = 0; i < array.length; i++) {
			array[i] = new LinkedList<Pair>();
		}
	}
	
	public HashMap(){
		this(128);
	}

	@Override
	public void clear() {
		array = new LinkedList[128];
		size = 0;
	}

	@Override
	public boolean containsKey(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsValue(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Set entrySet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object get(Object arg0) {
		LinkedList<Pair> list = array[hash(arg0)];
		for(Pair p : list){
			if(p.getKey().equals(arg0)){
				return p.getValue();
			}
		}
		return null;
	}

	public int hash(Object key){
		int code = key.hashCode();
		code = (((code<<1)*3)>>>2);
		return (Math.abs(code) % array.length);
	}
	
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Set keySet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object put(Object arg0, Object arg1) {
		Pair pair = new Pair(arg0, arg1);
		array[hash(arg0)].add(pair);
		size++;
		if(size >= array.length*3/4){
			resize();
		}
		return arg0;
	}

	@Override
	public void putAll(Map arg0) {
		// TODO Auto-generated method stub
	}

	@Override
	public Object remove(Object arg0) {
		LinkedList<Pair> list = array[hash(arg0)];
		for(Pair p : list){
			if(p.getKey().equals(arg0)){
				list.remove(p);
				size--;
				return arg0;
			}
		}
		return null;
	}

	private void resize(){
		int temp = size;
		size = 0;
		HashMap newArray = new HashMap(array.length*2);
		for (int i = 0; i < array.length; i++) {
			for(Pair p : array[i]){
				newArray.put(p.getKey(), p.getValue());
			}
		}
		array = newArray.getArray();
		size = temp;
	}
	
	@Override
	public int size() {
		return size;
	}

	@Override
	public Collection values() {
		// TODO Auto-generated method stub
		return null;
	}

	public LinkedList<Pair>[] getArray() {
		return array;
	}

}
