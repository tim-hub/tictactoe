/**
 * 
 */
package tttai;

import ttt.PieceLocation;
import ttt.Board;

/**
 * @author Tim
 *
 */
public class AI {
	private Board b;
	private int[][] t;
	public AI(Board b){
		this.b=b;
		t=b.getBoard();
	}
	public void start(){
		if(attrack()){
		}else if(defend()){
		}else if(center()){
		}else{
			planB();
		}
	}
	public boolean attrack(){
		return twoPieces(-1);
			
	}
	public boolean defend(){
		return twoPieces(1);
			
		
	}
	private boolean twoPieces(int f) {
		// TODO Auto-generated method stub
		for(int i=0;i<=t.length-1;i++){
			if(t[i][0]==t[i][1]&&t[i][0]==f&&t[i][2]==0){
				b.dropPiece(new PieceLocation(-1,i,2));return true;
			}else if(t[i][0]==t[i][2]&&t[i][0]==f&&t[i][1]==0){
				b.dropPiece(new PieceLocation(-1,i,1));return true;
			}else if (t[i][1]==t[i][2]&&t[i][1]==f&&t[i][0]==0){
				b.dropPiece(new PieceLocation(-1,i,0));return true;
			}else if(t[0][i]==t[1][i]&&t[0][i]==f&&t[2][i]==0){
				b.dropPiece(new PieceLocation(-1,2,i));return true;
			}else if (t[0][i]==t[2][i]&&t[0][i]==f&&t[1][i]==0){
				b.dropPiece(new PieceLocation(-1,1,i));return true;
			}else if(t[1][i]==t[2][i]&&t[1][i]==f&&t[0][i]==0){
				b.dropPiece(new PieceLocation(-1,0,i));return true;
			}			
		}
		if (t[0][0]==t[1][1]&&t[0][0]==f&&t[2][2]==0){
			b.dropPiece(new PieceLocation(-1,2,2));return true;
		}else if(t[1][1]==t[2][2]&&t[1][1]==f&&t[0][0]==0){
			b.dropPiece(new PieceLocation(-1,0,0));return true;
		}else if(t[0][2]==t[1][1]&&t[0][2]==f&&t[2][0]==0){
			b.dropPiece(new PieceLocation(-1,2,0));return true;
		}else if (t[1][1]==t[2][0]&&t[1][1]==f&&t[0][2]==0){
			b.dropPiece(new PieceLocation(-1,0,2));return true;
		}else{
			return false;
		}
	}
	public boolean center(){
		if(t[1][1]==0){
			b.dropPiece(new PieceLocation(-1,1,1));return true;
		}else{
			return false;
		}
	}
	public void planB(){
		
		if(t[0][0]==t[2][2]&&t[0][0]==1||t[0][2]==t[2][0]&&t[0][2]==1){
			if(t[0][1]==0){
				b.dropPiece(new PieceLocation(-1,0,1));
			}else{
				b.dropPiece(new PieceLocation(-1,1,0));
			}
		
		}else if((t[0][1]==1||t[1][2]==1)&&t[2][0]==0){
			b.dropPiece(new PieceLocation(-1,2,0));
		}else if((t[1][0]==1||t[2][1]==1)&&t[0][2]==0){
			b.dropPiece(new PieceLocation(-1,0,2));
				
		}else if(t[0][0]==0){
			b.dropPiece(new PieceLocation(-1,0,0));
		}else if (t[0][2]==0){
			b.dropPiece(new PieceLocation(-1,0,2));
		}else if(t[2][0]==0){
			b.dropPiece(new PieceLocation(-1,2,0));
		}else if (t[2][2]==0){
			b.dropPiece(new PieceLocation(-1,2,2));
		}else if(t[0][1]==0){
			b.dropPiece(new PieceLocation(-1,0,1));
		}else if(t[1][0]==0){
			b.dropPiece(new PieceLocation(-1,1,0));
		}else if(t[1][2]==0){
			b.dropPiece(new PieceLocation(-1,1,2));
		}else 
			b.dropPiece(new PieceLocation(-1,2,1));
		}
			
		
	
}
