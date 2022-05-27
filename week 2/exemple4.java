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

	public static double sumTo(int sayý) {
		if (sayý<0)
			throw new IllegalArgumentException();
		if (sayý== 0) {
			return 0.0;
			}
		return 1.0/sayý+sumTo(sayý-1);
	}



}