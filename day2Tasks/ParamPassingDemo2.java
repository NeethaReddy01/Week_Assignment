package day2Tasks;

public class ParamPassingDemo2 {
	
	public void swap(int a,int b) {
		System.out.println("Before swapping: a = " + a + " b = " + b );
		int temp=a;
		a=b;
		b=temp;
		System.out.println("After swapping: a = " + a + " b = " + b);
	}
	public void swap(int a[],int b[]) {
		System.out.println("Before swapping Arrays");
		System.out.println("arr1 = " + java.util.Arrays.toString(a));
		System.out.println("arr2 = " + java.util.Arrays.toString(b));
		
		int temp[]=a;
		a=b;
		b=temp;
		
		System.out.println("After Swapping Arrays");
		System.out.println("arr1 = " + java.util.Arrays.toString(a));
		System.out.println("arr2 = " + java.util.Arrays.toString(b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParamPassingDemo2 demo=new ParamPassingDemo2();
		int x=2;
		int y=4;
		System.out.println("Before Swapping a = " + x + " b = " + y);
		demo.swap(x, y);
		System.out.println("After Swapping a = " + x + " b = " + y);
		
		int[] a= {1,2,3};
		int[] b= {7,8,9};
		
	}

}
