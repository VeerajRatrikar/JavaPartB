package veeraj;

public class pgm5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] A= {"Car","Bus","Jeep","Auto","Truck","Train","plane"};
		for(int i=0;i<A.length;i++) {
			for(int j=i+1;j<A.length;j++) {
				if(A[i].compareTo(A[j])>0) {
					String temp =A[i];
					A[i]=A[j];
					A[j]=temp;
				}
			}
		}
		System.out.println("Sorted String Array:");
		for(String element :A) {
			System.out.println(element);
		}
	}

}
