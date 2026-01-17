package Day5;
public class MinAverage{
	public static void main(String[] args) {
		int[] arr = {7, 3, 5, 2, 1, 6};
		int k = 3;
		int sum=0;
		for(int i=0;i<k;i++) {
			sum += arr[i];
		}
		int Minsum = sum;
		for(int i=k;i<arr.length;i++) {
			sum = sum + arr[i]-arr[i-k];
			Minsum = Math.min(Minsum, sum);
		}
		double MinAverage = (double)Minsum/k;
		System.out.println(MinAverage);

	}
}