/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package index;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author hai
 */
public class Main {

	public static void main(String[] args) {
		Indexes index = new Indexes();
		
		/*================= READ INPUT FILE + add token ===============*/
		File file = new File("input.txt");//file tro toi input.txt, tu dong open close file cho minh
		
			try (Scanner sc = new Scanner(file)) {//file dong vai tro nhu con tro file, danh dau nguon vao du lieu cua Scanner
				String str, str1;
				int line = 1;//dong dau tien la 1
				int col = 1;//cot dau tien la 1
				while (sc.hasNext()) {//xem con dong tiep theo khong?

					str = sc.nextLine();//doc 1 dong trong file input
					
					Scanner sc1 = new Scanner(str);//doc cac token trong 1 dong do
					while(sc1.hasNext()){
						str1 = sc1.next();//doc token ngan cach boi dau cach, enter, tab
						
						index.addToken(new Token(str1.toLowerCase(), line, col));
						col++;
					}//doc het 1 dong (nam trong str) trong input file
					line++;
					col = 1;//col ve dau dong
				}//doc het cac token
				
			index.displayIndexes();//hien thi indexes
				PrintWriter pw = new PrintWriter(System.out);
				pw.println("123");	
				
			} catch (Exception e) {
				System.out.println("CO LOI=======================");
				e.getMessage();
				e.printStackTrace();
			}
			
			
		/*================= display index ===============*/
		
		
	}//main
}//Main
