package arrayTest;

import java.util.Iterator;

public class ArrTest {
		public static void main(String[] args) {
				int[][] arrData = {
						{3, 4, 5},
						{7, 8, 9}
				};
//				이차원 배열을 사용하여 변수를 선언
				
//				int rowLength = arrData.length;
//				int colLength = arrData[0].length;
//				int length = rowLength * colLength;
//				
//				for (int i = 0; i < length; i++) {
//						System.out.println(arrData[i / 3][i % 3]);
//				}
				
				for(int i = 0; i < arrData.length; i++) {
						for(int j = 0; j < arrData[i].length; j++) {
								System.out.println(arrData[i][j]);
						}
					
				}
				
				
				
				
				
				
				
				
		}

}
