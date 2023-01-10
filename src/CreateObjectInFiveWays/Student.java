package CreateObjectInFiveWays;

import java.io.Serializable;

import javax.print.attribute.standard.PagesPerMinute;

import Blocks.GfG2.superclass;

public class Student implements Cloneable,Serializable {

	public int id = 1;

	public Student() {
		System.out.println("Constructor is called");
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
