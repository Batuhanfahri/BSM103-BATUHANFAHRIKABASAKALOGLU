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

	public static int binarySystem(int say�) {
		if(say�<0) {
			System.out.println("hatal� say� g�rdn�z");
		}
		
		else if(say�>=2) {
			binarySystem(say�/2);
			}
		System.out.print(say�%2);
	
		return say�;
 	}
}


