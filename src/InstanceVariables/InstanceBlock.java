package InstanceVariables;

//Java - Example of instance intialization block

class InstanceBlock
{

//First Instance Intialization Block
{	
	System.out.println("An object is created");
}

//Second Instance Initialization Block
{	
	System.out.println("Second notification about the  object creation");
}


public static void main(String... ar)
{
	InstanceBlock ob = new InstanceBlock();
	InstanceBlock ob1 = new InstanceBlock();
	InstanceBlock ob2 = new InstanceBlock();
}

//Third Instance Initialiation Block
{	
	System.out.println("Third notification about the  object creation");
}

}
