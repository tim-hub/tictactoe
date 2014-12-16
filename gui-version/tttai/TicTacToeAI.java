/**
 * 
 */
package tttai;
import ttt.PieceLocation;
import ttt.Board;
import java.util.Scanner;

import javax.swing.JOptionPane;
/**
 * @author Tim
 *
 */
public class TicTacToeAI {
	private static AI a;
	public static void main(String[] args){
			   
			    
			   	String flag="X";
				TTTUI ui=new TTTUI(flag);
				a=new AI(ui);
				
				
				
				//Some code different from ttt no ai.
				
				flag=JOptionPane.showInputDialog(ui.getFrame(),"Who First,X:>>Palyer|Others:>>AI");
				if(flag==null){
					flag="O";
				}
				if(flag.toLowerCase().equals("x")){
					JOptionPane.showMessageDialog(ui.getFrame(), "You mean you first,Please drop your piece");
					
				}else{
					JOptionPane.showMessageDialog(ui.getFrame(), "AI first");
					
					a.start();
				}
				
			
		}
	public static AI getAI(){
		return a;
	}
		
	
}
