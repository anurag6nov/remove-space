import java.util.*;

public class removespace {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = new String();
        s = sc.nextLine();
        String arr[] = s.split(" +");
        Vector<String> vct = new Vector<String>();
        vct.addAll(Arrays.asList(arr));
        Iterator itr = vct.iterator();
        while(itr.hasNext())
        {
            System.out.print(itr.next()+" ");
        }
        
        
    }
    
}