package InstanceVariables;

class InstanceVariable {
int data=50;//instance variable

public static void main(String []args) {
      /* In this example if you want to access instance variable'data' then you 
      have to create an instance of InstancVariable class like this*/
      InstanceVariable iv = new InstanceVariable();
      /* here iv is the name of the object or instance of the
	   InstanceVariable class */
      System.out.println(iv.data);
      /* to access the instance variable 'data' you have to write iv.data*/

   }
}