package com.nju.dp;

public class DataSortor {
	public static void sort(Object[] t){
		int len = t.length;
		for(int i=0; i<len; i++){
			for(int j=i+1;j<len;j++){
				Comparable c1 = (Comparable)t[j];
				Comparable c2 = (Comparable)t[j-1];
				if(c1.compareTo(c2)==-1){
					swap(t,j,j-1);
				}
			}
		}
	}
	public static void swap(Object[] o, int x, int y){
		Object temp = o[x];
		o[x] = o[y];
		o[y] = temp;
		System.out.println("交换");
	}
	public static void p(Object[] t){
		for(Object show : t){
			System.out.print(show+" ");
		}
		System.out.println("");
	}
}
