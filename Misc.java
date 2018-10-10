//Class for any miscellanious functionality outside of actual sorting
//for this elaborate sorting homework assignment

import java.util.Random;

public class Misc{

	public static int[] produceRandArray(int size, int minrange, int maxrange){
		Random rand = new Random();
		int[] randArray = new int[size];

		for(int i = 0; i<randArray.length; i++){
			randArray[i] = rand.nextInt(maxrange-minrange) + minrange;
		}

		return randArray;

	}

}
