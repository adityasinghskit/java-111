package com.masai;

public class PresentationLayer {
	private ServiceLayer sl;
	private int a;
	private int b;
	//injection using setter
	public void setSl(ServiceLayer sl) {
		this.sl = sl;
	}
	public void setA(int a) {
		this.a = a;
	}
	public void setB(int b) {
		this.b = b;
	}
	
	public void calSum(int a,int b) {
		System.out.println("The sum is:"+sl.sum(a, b));
	}
	public void calDiff(int a,int b) {
		System.out.println("The difference is:"+sl.diff(a, b));
	}
	public void calMul(int a,int b) {
		System.out.println("The multiplication is:"+sl.mul(a, b));
	}
	public void calDiv(int a,int b) {
		System.out.println("The division is:"+sl.div(a, b));
	}
	
	//destroy method
	public void destroy() {
		System.out.println("Destroy func..");
	}
	
	public void cal() {
		System.out.println("Cal function starts...");
		calSum(a, b);
		calDiff(a, b);
		calMul(a, b);
		calDiv(a, b);
	}
}
