public class ex2 {

	public static void main(String[] args) {
		// Tạo và khởi tạo giá trị cho mảng
		int[] A = {5, 7, 2, 4, 8};
		//sắp xếp mạng theo chiều tăng dần
		for (int i=0;i<A.length-1;i++)
			for (int j=i+1; j<A.length;j++)
				if (A[i]>A[j]) {
					int t= A[i];
					A[i]=A[j];
					A[j]=t;
				
				}
		//in mảng ra màn hình
		for (int i=0; i<A.length; i++)
			System.out.println(A[i]+" ");
	}
}
