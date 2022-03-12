package exemple;

import java.security.DrbgParameters.NextBytes;
import java.security.SecureRandom;
import java.io.*;
import java.util.*;

public class exemple {
	public static void main(String[] args) {
		int [][] a1= {{1,2,3},{1,5,3},{1,6,3}};
		int [][] a2= {{1,6,3},{1,5,3},{1,2,3}};
		

		}

	public static boolean isSorted(int []list) {
	       for (int i = 0; i < list.length-1; i++) {
			
				if(list[i]>list[i+1]) {
					return false;
				}
		}
	     return true;  
		}




}