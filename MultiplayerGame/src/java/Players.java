
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Himasha
 */
public class Players {
    
    private String[] players = new String[4];
    //private int[] scores = new int[4];
    //private int[][] positions = new int[4][2];
   
    ArrayList<Details> list = new ArrayList<>();
    
    public void initPlayers(){
        
        players[0]="P1";
        players[1]="P2";
        players[2]="P3";
        players[3]="P4";
        
        
        int[] temp_pos = new int[2];
        temp_pos[0]=0;
        temp_pos[1]=0;
           
        Details detail1 = new Details(0,0,temp_pos);
        list.add(detail1);
        
        temp_pos[0]=44;
        temp_pos[1]=0;
           
        Details detail2 = new Details(1,0,temp_pos);
        list.add(detail2);
        
        temp_pos[0]=0;
        temp_pos[1]=44;
           
        Details detail3 = new Details(2,0,temp_pos);
        list.add(detail3);
        
        temp_pos[0]=44;
        temp_pos[1]=44;
           
        Details detail4 = new Details(3,0,temp_pos);
        list.add(detail4);
    
    }
    
    public void move(int player, int movement){
   
        if(movement == 37){
          
          list.get(player-1).pos[0]--;
        }
        if(movement == 38){
        list.get(player-1).pos[1]--;
        }
        if(movement == 39){
        list.get(player-1).pos[0]++;
        }
        if(movement == 40){
        list.get(player-1).pos[1]++;
        }
    
    }
    
    public String printPlayers(){
         StringBuffer sb = new StringBuffer("\"PLAYERS\":   [");
        //sb.append("");

        for(int i=0;i<4;i++){
            sb.append("[\""+players[i]+"\", "+list.get(i).score+", "+list.get(i).pos[0]+", "+list.get(i).pos[1]+"]");
            if(i!=3)
                sb.append(",");


       }
       sb.append("]");
        
        return sb.toString();
    }
    
    
    
}

class Details{
    
    protected int player;
    protected int score;
    protected int[] pos= new int[2];
    
    public Details(int player, int score, int[] pos){
        this.player = player;
        this.score = score;
        this.pos[0] = pos[0];
        this.pos[1] = pos[1];
    } 
    

}