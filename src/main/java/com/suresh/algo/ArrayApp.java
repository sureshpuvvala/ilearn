package com.suresh.algo;

public class ArrayApp {
	
	private long arr[];
	long searchKeyPos;
	
	
	public ArrayApp(long arr[]) {
		this.arr = arr;
		
	}
	
	public  void arrayAppExample() {
		
		display();
		insert(45);insert(99);insert(55);
		display();
		System.out.println("Found at: "+search(55));
		insert(66);
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
	
	public static void main(String[] args) {
		long arr[] = new long[4];
	    
		
		
		ArrayApp arryApp = new ArrayApp(arr);
		arryApp.arrayAppExample();
	}

}
