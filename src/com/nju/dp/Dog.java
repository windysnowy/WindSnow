package com.nju.dp;

public class Dog implements Comparable {
	private int height;
	
	public Dog(int height) {
		super();
		this.height = height;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public int compareTo(Object o) {
		if(o instanceof Dog){
			Dog tempDog = (Dog)o; 
			if(this.height>tempDog.getHeight()){
				return 1;
			}else if(this.height==tempDog.getHeight()){
				return 0;
			}else{
				return -1;
			}
		}
		return 0;
	}

	@Override
	public String toString() {
		return "狗的身高为："+this.height;
	}
	
}
