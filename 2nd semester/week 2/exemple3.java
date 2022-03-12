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

	public static int[][] matrixAdd(int [][]dizi1 ,int[][]dizi2) {
		int [][]dizi3= new int[dizi1.length][dizi1.length];
		
		 for (int i = 0; i < dizi1.length; i++) {
			for (int j = 0; j<dizi1.length ; j++) {
	
				dizi3[i][j]=dizi1[i][j]+dizi2[i][j];
			
			}
		}
	  return dizi3;
	}




}