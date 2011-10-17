package org.kata.karatechop;

public class KarateChopIterativo {

	public static int chop(int value, int [] array){
		int low = 0;
		int high = array.length;
		int middle = (high - low) / 2;
		
		int position = -1;
		
		while((high - low) > 0){
			if(array[middle] == value){
				position = middle;
				break;
			}
			else if(value < array[middle]){
				high = middle;
				middle = (high - low) / 2;
			}
			else{
				low = middle + 1;
				middle = ((high - low) / 2) + middle + 1;
			}
		}		
		
		return position;
	}
}
