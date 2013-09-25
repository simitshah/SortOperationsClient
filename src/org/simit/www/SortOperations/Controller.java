package org.simit.www.SortOperations;

import java.rmi.RemoteException;

public class Controller {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int arr[] = {6,4,2,1};
          SortOperationsProxy proxy = new SortOperationsProxy();
          try {
			arr = proxy.bubbleSort(arr);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i:arr)
			System.out.println(i);
	}

}
