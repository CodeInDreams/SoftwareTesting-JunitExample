package lab1;

public class Lab1 {

	public String check( int a, int b, int c){
		//排序使a<=b<=c
		int temp;
		if( a > b){
			if( a > c){
				temp = c;
				c = a;
				if( b > temp)
					a = temp;
				else{
					a = b;
					b = temp;
				}
			}else{
				temp = a;
				a = b;
				b = temp;
			}
		}else if( b > c){
			temp = c;
			c = b;
			b = temp;
		}
		
		if( a <= 0 || a + b <= c)
			return "输入的边不能构成三角形";
		else if (a == b || b == c)
			return a == c ? "等边三角形" : "等腰三角形";
		else
			return "一般三角形";
	}

}
