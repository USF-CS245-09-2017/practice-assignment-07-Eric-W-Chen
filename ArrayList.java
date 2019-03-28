import java.util.Arrays;

public class ArrayList<T> implements List<T>{
	int count = 0;
	public Object[] tempArray;
	public T[] arr;

	public ArrayList(){
		tempArray = new Object[10];
		arr = (T[]) tempArray;
	}

	@Override
	public void add(T item){
		if(arr.length - 1 == count){
			growList();
		}
		arr[count++] = item;
	}

	@Override
	public void add(int pos, T item){
		if(arr.length - 1 == count){
		growList();
		}
		if(pos <= count && pos >= 0){
			count++;
		}
		arr[pos] = item;
	}

	@Override
	public T get(int pos){
		if(pos<=count && pos>=0){
			return arr[pos];
		}
		else{
			throw new ArrayIndexOutOfBoundsException();
		}
	}

	@Override
	public T remove(int pos){
		if(pos<count){
			T item = arr[pos];
			int temp = pos;
			while(temp < count){
				arr[temp] = arr[temp+1];
				temp++;
			}
			count--;
			return item;
		}
		else{
			throw new ArrayIndexOutOfBoundsException();
		}
	}

	@Override
	public int size(){
		return count;
	}

	private void growList(){
		Object [] tempArray = new Object[arr.length*2];
		T [] newArr = (T[]) tempArray;
		for(int j = 0; j < arr.length; j++){
			newArr[j] = arr[j];
		}
		arr = newArr;
	}
}