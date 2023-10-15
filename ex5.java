import java.util.Scanner;

public class ex5 {
	//định nghĩa hàm tính ước số chung lớn nhất
	
	public static int comDiv(int a, int b) {

	return (b==0)?a:comDiv(b, a%b);
	}

	public static void main(String[] args) {
		int a;
		int b;
		//nhập dữ liệu từ bàn phím /
		Scanner keyboard = new Scanner(System.in);
		System.out.print("a = ");
	    a = keyboard.nextInt(); 
		System.out.print("b = ");
		b = keyboard.nextInt();
		// Gọi hàm và in kết quả ra màn hình/
		System.out.println("USCLN cua "+a+ " va "+b+"la "+comDiv(a,b));

	}

}
