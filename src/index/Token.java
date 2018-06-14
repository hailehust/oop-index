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
public class Token {//class luu du lieu cua 1 token trong indexes
	private String str;//chuoi token
	private int quantity;//so lan xuat hien
	private int position[][];//mang 2 chieu//chua vi tri dong cot ma token xuat hien
	/*========== CONSTRUCTORs ========*/
	public Token(String str, int line, int col) {//khoi tao 1 token o dong line
		this.str = str;
		this.quantity = 1;
		this.position = new int[2][20]; 
		this.position[0][0] = line;//cap nhat hang//lines la hang 0
		this.position[1][0] = col;//cap nhat cot//cols la hang 1

	}
	/*========== GETTER SETTER ========*/

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int[][] getPosition() {
		return position;
	}

	public void setPosition(int[][] position) {
		this.position = position;
	}




}
