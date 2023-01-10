//default accessmodifier
package AccessmodifiersPack2; 

import AccessmodifiersPack1.*;

class B{
	 public static void main(String args[]){  
		   A obj = new A();//Compile Time Error  
		   obj.msg();//Compile Time Error  
}
}

/*In this example, we have created two packages pack and mypack. 
We are accessing the A class from outside its package, 
since A class is not public, so it cannot be accessed from outside the package.
*/
//In the above example, 
//the scope of class A and its method msg() is default so it cannot be accessed from outside the package.
/*
If you don't use any modifier, it is treated as default by default. 
The default modifier is accessible only within package. 
It cannot be accessed from outside the package. 
It provides more accessibility than private. 
But, it is more restrictive than protected, and public.*/

