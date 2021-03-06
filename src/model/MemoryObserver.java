package model;

public interface MemoryObserver<T> {
	
	public void onWrite(int index, T value);
	
	public void onMemReset(); // OPCIONAL
}
