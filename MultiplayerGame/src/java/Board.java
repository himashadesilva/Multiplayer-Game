
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;


public class Board {
    
    private char[] dots = new char[12];
    private int[][] places = new int[12][2];
    
    ArrayList<Integer[]> list = new ArrayList<>();
    
    public void intGameBoard(){
    
        for(int i=0;i<12;i++){
            if(i%3==0)
                dots[i]='B';
            if(i%3==1)
                dots[i]='G';
            if(i%3==2)
                dots[i]='R';
        }
        
        Random rn = new Random();
        
        Integer[] temp_dot; 
        
        for(int i=0;i<12;i++){
            temp_dot = new Integer[2];
            temp_dot[0]= rn.nextInt(42)+1;
            temp_dot[1]= rn.nextInt(42)+1;
            
            while(list.contains(temp_dot)){
                temp_dot[0]= rn.nextInt(42)+1;
                temp_dot[1]= rn.nextInt(42)+1;
            }

            list.add(temp_dot);
           
        }
    
    }
    
    public String printBoard(){
        StringBuffer sb = new StringBuffer("\"DOTS\":   [");
        //sb.append("");

        for(int i=0;i<12;i++){
            sb.append("[\""+dots[i]+"\", "+list.get(i)[0]+", "+list.get(i)[1]+"]");
            if(i!=11)
                sb.append(",");


       }
       sb.append("]");
        
        return sb.toString();
    }
    
    
}
