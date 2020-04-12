import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Runner {

	public static void main(String[] args) throws NumberFormatException, IOException {
		//int n=3;
		Linklist list = new Linklist();
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Insert value....");
		int i= Integer.parseInt(br.readLine());
		//for(i=0;i<n;i++)
		list.insert(i);
        System.out.println("Insert at begin ..");
        int j =Integer.parseInt(br.readLine());
		list.InsertAtbegin(j);
		System.out.println("insert at point....");
		System.out.println("enter index no ");
		int p=Integer.parseInt(br.readLine());
		System.out.println("Enter value you want");
		int q = Integer.parseInt(br.readLine());
		list.InsertatPoint(p,q);
		list.show();

	}

}
