package tttai;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.event.MouseInputAdapter;

public class TTTUI extends MouseInputAdapter{

	private JFrame jf;
	private JLabel[][] jlb;
	
	private String s;
	public TTTUI(String s){
		
		try{
			String theLook=UIManager.getSystemLookAndFeelClassName();
			//String theLook="com.sun.java.swing.plaf.motif.MotifLookAndFeel";
			
			UIManager.setLookAndFeel(theLook);
		}catch (Exception e){
			System.err.println("Exception:"+e);
		}
		this.s="X";
		jf=new JFrame();
		jf.setLayout(new GridLayout(3,3));
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setSize(300,300);
		jf.setResizable(false);
		jf.setLocation(500,300);
		jf.setTitle("Tic-Tac-Toe-AI(GUI)");
		jf.setBackground(Color.BLACK);
		jf.setForeground(Color.GREEN);
		jlb=new JLabel[3][3];
		
		
		
		
		for(int i=0;i<=jlb.length-1;i++){
			for (int j=0;j<=jlb[i].length-1;j++){
				jlb[i][j]=new JLabel("");
				jlb[i][j].setSize(100,100);
				jlb[i][j].setBorder(new EtchedBorder(EtchedBorder.LOWERED));
				jlb[i][j].addMouseListener(this);
				jf.add(jlb[i][j]);
			}
		}
		
		
		
		jf.setVisible(true);
		
	}
	
	public void mouseClicked(MouseEvent e){
		
		if(e.getSource()==jlb[0][0]){
			dropPiece(0,0);
		}else if(e.getSource()==jlb[0][1]){
			dropPiece(0,1);
		}else if(e.getSource()==jlb[0][2]){
			dropPiece(0,2);
		}else if( e.getSource()==jlb[1][0]){
			dropPiece(1,0);
			
		}else if(e.getSource()==jlb[1][1]){
			dropPiece(1,1);
			
		}else if(e.getSource()==jlb[1][2]){
			dropPiece(1,2);
		}else if (e.getSource()==jlb[2][0]){
			dropPiece(2,0);
		}else if(e.getSource()==jlb[2][1]){
			dropPiece(2,1);
		}else if(e.getSource()==jlb[2][2]){
			dropPiece(2,2);
		}
		
		
		check();
		
		
	}
	public void check(){
		int tmp=TicTacToeAI.getAI().check();
		if(tmp==1){
			JOptionPane.showMessageDialog(jf, "Player1 Win!");
			disableBoard();
		}else if(tmp==-1){
			JOptionPane.showMessageDialog(jf, "AI Win!");
			disableBoard();
			
		}else if(tmp==3){
			
		}else {
			JOptionPane.showMessageDialog(jf, "It is a draw!");
			disableBoard();
			
		}
	}
	public void disableBoard(){
		for(int i=0;i<=jlb.length-1;i++){
			for (int j=0;j<=jlb[i].length-1;j++){
				jlb[i][j].removeMouseListener(this);
			}
		}
	}
	public int[][] getBoard(){
		int t[][]=new int[3][3];
		for (int i=0;i<=2;i++){
			for (int j=0;j<=2;j++){
				if(jlb[i][j].getText().equals("X")){
					t[i][j]=1;
				}else if(jlb[i][j].getText().equals("O")){
					t[i][j]=-1;
				}else 
					t[i][j]=0;
			}
		}
		return t;
		
	}
	
	public void dropPiece(int x,int y){
		if (jlb[x][y].getText().equals("")){
			jlb[x][y].setText(s);
			jf.repaint();
			TicTacToeAI.getAI().start();
			}else {
				JOptionPane.showMessageDialog(jf, "Wrong Location!");
			}
			
	}
	
	public void dropPiece(String flag,int x,int y){
		
		jlb[x][y].setText(flag);
		jf.repaint();
		
		
	}
	public JFrame getFrame(){
		return jf;
	}
}
