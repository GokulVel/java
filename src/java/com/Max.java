package java.com;

public class Max {
		public static int getMaxvalue(int[] number) {
			int maxValue=number[0];
			for(int i=1;i<number.length;i++) {
				if(number[i]>maxValue) {
					maxValue=number[i];
				}
			}
			return maxValue;
		}
		public static int getMinvalue(int[] number) {
			int minValue=number[0];
			for(int i=0;i<number.length;i++) {
				if(number[i]<minValue) {
					minValue=number[i];
				}
			}
			return minValue;
		}
		public static void main(String[] args) {
			int array[]=new int[] {70,64,97,66,86,88,90,94};
			int max=getMaxvalue(array);
			System.out.println("Maximum value is "+max);
			int min=getMinvalue(array);
			System.out.println("Minimum value is "+min);
		}

	}



