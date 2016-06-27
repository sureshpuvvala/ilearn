package com.suresh.algo;

public class ArrayApp {
	
	private long arr[];
	int searchKeyPos;
	
	
	public ArrayApp(long arr[]) {
		this.arr = arr;
		
	}
	
	public  void arrayAppExample() {
		
		
		insert(45);insert(99);insert(55);
		System.out.println("Found at: "+search(55));
		insert(66);insert(57);insert(22);insert(48);insert(12);
		display();
		remove(99);
		remove(12);
		display();
		
		
		
		
		
	}
	
	public void insert(long key) {
		
		int insertPos =0 ; boolean insertKeyFlag = false;
		for(int loopCounter=0;loopCounter<arr.length;loopCounter++) {
			if(arr[loopCounter]!=0 ) {
				continue;
			}else{
				insertKeyFlag = true;
				insertPos = loopCounter;
				break;
			}
			
		}
		if(insertKeyFlag)
			arr[insertPos] = key;
		else {
			System.out.println("Boss I am full....free up some ");
		}
	}
	
	public long search(long searchKey) {
		if(find(searchKey))
			return searchKeyPos;
		return -1;
	}
	
	private  void display() {
		int loopCounter = 0;
		for(long l:arr) {
			
			System.out.println("arr["+loopCounter+"]= "+l);
			loopCounter++;
		}
		System.out.println("----------------------------------------");
	}
	
	private boolean find(long searchKey) {
		int loopCounter =0;
		for(loopCounter=0;loopCounter<arr.length;loopCounter++) {
			if(arr[loopCounter] == searchKey) {
				searchKeyPos = loopCounter+1;
				return true;
			}
		}
		return false;
	}
	private void remove(long key) {
		if(find(key)) {
			for(int loopCounter=searchKeyPos-1;loopCounter<arr.length-1;loopCounter++) {
				arr[loopCounter]=arr[loopCounter+1];
				
			}
			arr[arr.length-1]=0;
			
		}else{
			System.out.println("Invalid key ...");
		}
	}
	
	public static void main(String[] args) {
		long arr[] = new long[8];
	    
		
		
		ArrayApp arryApp = new ArrayApp(arr);
		arryApp.arrayAppExample();
	}

}
