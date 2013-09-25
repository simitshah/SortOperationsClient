/**
* This class is the Controller for Sort Operations.
* @author Simit Shah
* @version 1.0
*/
package org.simit.www.controller;

import java.rmi.RemoteException;
import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;

import org.simit.www.SortOperations.SortOperationsProxy;
import org.simit.www.model.CreateInput;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/SortOperation.htm")
public class SortOperationsController {

	/**
	 * @param args
	 */
	@RequestMapping(method=RequestMethod.POST)
	public String sortOperations(HttpServletRequest request, ModelMap model) {
		// TODO Auto-generated method stub
          int arr[] = {6,4,2,1};
          Calendar cal = Calendar.getInstance();
      	  System.out.println("Time Started = "+cal.getTime());
          String sortOperation = (String)request.getParameter("sortOperation");
          String sortType = (String)request.getParameter("sortType");
          String size = (String)request.getParameter("sortSize");
          int intSortOperation = Integer.parseInt(sortOperation);
          System.out.println("Sort Operation = "+sortOperation);
          System.out.println("Sort Type = "+sortType);
          System.out.println("Size = "+size);
          CreateInput genInput = new CreateInput();
          arr = genInput.createInputBasedOnUISelection(size, sortType);
          System.out.println("Before Sorting");
          //for(int i:arr)
  			//System.out.print(i+",");
  		  SortOperationsProxy proxy = new SortOperationsProxy();
          try {
        	  proxy.setEndpoint("http://192.168.1.122:8080/SortOperations/services/SortOperationsSOAP");
        	  //proxy.setEndpoint("http://174.98.222.57:8080/SortOperations/services/SortOperationsSOAP");
        	  switch(intSortOperation)
        	  {
        	    case 1: arr = proxy.bubbleSort(arr);
        	            System.out.println("Bubble Sort");
        	             break;
        	    case 2: arr = proxy.insertionSort(arr);
        	    		System.out.println("Insertion Sort");
	             		 break;
        	    case 3: arr = proxy.selectionSort(arr);
        	    		System.out.println("Selection Sort");
	             		 break;
        	    case 4: arr = proxy.quickSort(arr);
        	    		System.out.println("Quick Sort");
        	    		 break;
        	  }
			
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("After Sorting");
		//for(int i:arr)
			//System.out.print(i+",");
		System.out.println("Time Ended = "+cal.getTime());
		model.addAttribute("message","I m der");
		return "result";
	}
	/*public static void main(String args[]){
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
		
	}*/

}
