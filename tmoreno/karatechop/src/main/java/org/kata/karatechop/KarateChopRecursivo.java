package org.kata.karatechop;

public class KarateChopRecursivo {

	public static int chop(int value, int [] array){
		int position = -1;
		int middle = array.length / 2;
		
		if(array.length != 0){
			if(array[middle] == value){
				position = middle;
			}
			else if(value < array[middle]){
				position = chop(value, subArray(array, 0, middle));
			}
			else{
				position = chop(value, subArray(array, middle + 1, array.length));
				
				// Cuando se encuentra la posición del valor
				// en la mitad superior, hay que añadir la posición de la mitad
				if(position != -1){
					position += middle + 1;
				}
			}
		}		
		
		return position;
	}

	private static int[] subArray(int[] original, int from, int to) {
        int newLength = to - from;
        
        if (newLength < 0){
        	return new int [0];
        }
        else{
        	int[] copy = new int[newLength];
        	System.arraycopy(original, from, copy, 0,
                    Math.min(original.length - from, newLength));
        	return copy;
        }
    }
}
