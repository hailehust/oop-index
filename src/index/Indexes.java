/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package index;

/**
 *
 * @author hai
 */
public class Indexes {
	public Token tokenList[];
	private int tokenNumber; //so luong token cua tokenList
	/*========== CONSTRUCTORs ========*/
	public Indexes() {
		tokenList = new Token[100];
		tokenNumber  = 0;
	}
	/*========== METHODs ========*/
	public boolean checkToken(Token token){
		/**
		 * kiem tra token da ton tai trong indexes chua
		 * Chua: return  true de addToken add 1 token moi
		 * Roi: quantity++, update lines[], l, cols[], c, return false
		 */
		for (int i = 0; i < this.tokenNumber; i++) {

			if(token.getStr().equals(this.tokenList[i].getStr())){//neu token da ton tai
				this.tokenList[i].setQuantity(this.tokenList[i].getQuantity() + 1);//quantity++
				this.tokenList[i].getPosition()[0][this.tokenList[i].getQuantity() - 1] =  token.getPosition()[0][0];
				this.tokenList[i].getPosition()[1][this.tokenList[i].getQuantity() - 1] =  token.getPosition()[1][0];

				return false;
			}
		}
		return true;//duoc phep chen vo indexes

	}//checkToken
	
	public void addToken(Token token){//them 1 token moi vo indexes (khi khong trung lap)
		if(this.checkToken(token) == true){//duoc phep chen
			this.tokenList[this.tokenNumber] = token;
			this.tokenNumber++;
		}
	}
		
	public void displayIndexes(){
		System.out.println("TOKEN\tQUANTITY\tLINES");
		System.out.println("-------------------------------------------------");
		for (int i = 0; i < this.tokenNumber; i++) {
			System.out.print(this.tokenList[i].getStr() +"\t" + this.tokenList[i].getQuantity() +"\t");
			
			
			for (int j = 0; j < this.tokenList[i].getQuantity(); j++) {
				System.out.print("(" + this.tokenList[i].getPosition()[0][j] + ", " + this.tokenList[i].getPosition()[1][j] + ")");	
				System.out.print(" ");
			}
			System.out.println("");

		}
	}

	
}//indexes
