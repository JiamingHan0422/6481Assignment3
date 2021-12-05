package PartII;
//-----------------------------------------------------
//Assignment (1)
// Zitao Wang & Jiaming Han
//Written by: (Zitao Wang 40171434)
//-----------------------------------------------------

/**
 * The signal student node.
 * @author WangZ
 *
 *pre -> left
 *next -> right
 */
public class StudentNode{
	
	long StudentIDentificationCode;
	String studentName;
	public StudentNode() {
		
		this.StudentIDentificationCode = 0;
		this.studentName = null;

	}
	public StudentNode(long key, String value) {
		this.StudentIDentificationCode = key;
		this.studentName = value;

		
	}

	public String getValue() {
		return this.studentName;
	}
	public long getKey() {
		return this.StudentIDentificationCode;
	}
	public void printNode() {
		System.out.println( this.getKey() + " , " + this.getValue());
	}
	
	
	/*
	 *  -1 left
	 *  1 right
	 */
	public int compareTo(long key) {
		
		if (key > this.StudentIDentificationCode){
            return 1;
        }else if( key < this.StudentIDentificationCode ){
            return -1;
        }else {
        	return 0;
        }
	}

}
