package org.simit.www.model;

public class CreateInput {
	public int[] createInputBasedOnUISelection(String size,String sortType){
		int [] arr = null;
		int intSize = Integer.parseInt(size);
		int intSortType = Integer.parseInt(sortType);
		System.out.println("Size = "+intSize);
		arr = new int[intSize];
		for(int i =0;i<intSize;i++){
			arr[i] = i;
		}
		switch(intSortType){
		case 1: 
				break;
		case 2: int start=0,end=arr.length-1;
				while(start<end){
					int temp = arr[start];
					arr[start++] = arr[end];
					arr[end--] = temp;
				}
				break;
		case 3: int times = (int)(Math.random()*arr.length);
				for(int i = 0; i<times;i++){
					int pos1 = (int)(Math.random()*arr.length);
					int pos2 = (int)(Math.random()*arr.length);
					
					int temp = arr[pos1];
					arr[pos1] = arr[pos2];
					arr[pos2] = temp;
					
				}
				break;
		}
		return arr;
		}
	}
