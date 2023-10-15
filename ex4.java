public class ex4 {
	public static long fact(int n) {
//định nghĩa hàm tính giai thừa
		
		int kq =1;
		for (int i=2;i<=n;i++) 
			kq *=i;
		return kq;
	}

	public static void main(String[] args) {
		//gọi hàm fact do hàm fact là static nên khong cần tạo đối tượng đẻ gọi hàm
		long S = fact (7) +fact (10) + fact (12) + fact (14); 
		System.out.println("Sum ="+S);

	}
