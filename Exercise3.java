package exercise;

public class Exercise3 {

	public static void main(String[] args) {
		int num=1 ,result =0;
		int a[] = new int[3];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		for (int i = 0; i < num; i++) {
			result = result + a[i];
			System.out.println("average of (" +a[0]+","+a[1]+","+a[2]+")  is = "+result/num);
			
		}

	}

}
