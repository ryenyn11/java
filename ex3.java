public class ex3 {

	public static void main(String[] args) {
		int matrix[][];
		matrix= new int[10][10];
		for (int i=1; i<10;i++) {
			for (int j=0;j<10;j++) {
				matrix[i][j]= (i+1)*(j+1);
			}
		}
		for (int i=0;i<10;i++) {
			for (int j=0;j<10;j++) {
				System.out.println(matrix[i][j]+"\t");
				
		}
			System.out.println();

	}

}
