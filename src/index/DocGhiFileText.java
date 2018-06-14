/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package index;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author hai
 */
public class DocGhiFileText {

	public static void main(String[] args) {
//		File file = new File("output.txt");
//		try(PrintWriter pw = new PrintWriter(file)) {
//			pw.println("Le Van Hai");
//			pw.println("Le Van Hai");
//			pw.println("Hoang NgocHan");
//
//		} catch (Exception e) {
//		}

		File file = new File("input.txt");
		try (Scanner sc = new Scanner(file)) {

			String str;
			while (sc.hasNext()) {//xem con dong tiep theo khong?
				str = sc.next();
				
				System.out.print(str + " ");
			}//doc 1 dong + hien thi den khi het file

		} catch (Exception e) {
		}

	}
}
