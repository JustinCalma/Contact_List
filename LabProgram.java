import java.util.Scanner; 

public class LabProgram {
   
   /* Define your method here */
   public static String getPhoneNumber(String[] nameVec, String[] phoneNumberVec, String contactName, int arraySize) {

	   for (int i = 0; i < nameVec.length; i++) {
		   if (nameVec[i].equals(contactName)) {
			   return phoneNumberVec[i];
		   }
	   }
	   return "Not found";
   }
   
   public static void main(String[] args) {
      /* Type your code here. */
	   Scanner scnr = new Scanner(System.in);
	   int arraySize = scnr.nextInt();
	   String[] nameVec = new String[arraySize];
	   String[] phoneNumberVec = new String[arraySize];
	   
      for (int i = 0; i < arraySize; i++) {
    	  String nameElements = scnr.next();
    	  nameVec[i] = nameElements;
    	  String pnVec = scnr.next();
    	  phoneNumberVec[i] = pnVec;
      }
      /*
      for (int i = 0; i < nameVec.length; i++) {
    	  System.out.println(nameVec[i]);
    	  System.out.println(phoneNumberVec[i]);
      }*/
      String contactName = scnr.next();
      String userPhoneNumber = getPhoneNumber(nameVec, phoneNumberVec, contactName, arraySize);
      System.out.println(userPhoneNumber);
      scnr.close();
   }
}
