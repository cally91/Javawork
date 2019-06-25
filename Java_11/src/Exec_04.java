import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Exec_04 {

	public static void main(String[] args) {

		Random rnd =new Random();
		List<Integer> intList = new LinkedList<Integer>();
		for(int i =0; i<50;i++) {
			int intR =rnd.nextInt(50)+1;
			intList.add(intR);
		}
		int myint =25;
		int size= intList.size();
		for (int i =0; i<size; i++) {
			if (intList.get(i)== myint||intList.get(i)==myint +3) {
				size--;
				intList.remove(i);
			}
		}
		size =intList.size();
		System.out.println("리스트 개수 : "+size);
		for(int i=0; i<size ;i++){
			System.out.print(intList.get(i));
			if((i+1)%5==0)System.out.println();
			else System.out.print(",");
		}
		
	}

}
