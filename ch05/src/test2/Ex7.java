package test2;

public class Ex7 {

	public static void main(String[] args) {
		int max=0,min=9;	//최소값을 구할 때 초기값으로 한자리 수 중 가장 큰 수를 넣는다.
		int[]array={1, 5, 3, 8, 2};
		for(int i=0;i<array.length;i++){
			if(max<array[i]){
				max=array[i];
			}
			if(min>array[i]){
				min=array[i];
			}
		}
		System.out.println("max: "+max);
		System.out.println("min: "+min);
	}

}
