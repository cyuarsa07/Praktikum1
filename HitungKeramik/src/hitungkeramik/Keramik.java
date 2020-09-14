/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hitungkeramik;

/**
 *
 * @author Chiesa Yuarsa
 */
public class Keramik {
    	//Atribut
	int luaslantai;

	void keramikA(){
		double ukurankeramik = 0.3 * 0.3;
		int box = 10;
		int harga = 54000;
		double total = ((this.luaslantai / ukurankeramik) / box)* harga;
		System.out.println("Keramik A");
		System.out.println("Ukuran : 30 cm x 30 cm");
		System.out.println("Untuk luas lantai " + this.luaslantai + " m². Total Harga yang dibutuhkan Rp. " + total );
		System.out.println(" ");
	}
	
	void keramikB(){
		double ukurankeramik = 0.4 * 0.4;
		int box = 5;
		int harga = 65000;
		double total = ((this.luaslantai / ukurankeramik) / box)* harga;
		System.out.println("Keramik B");
		System.out.println("Ukuran : 40 cm x 40 cm");
		System.out.println("Untuk luas lantai " + this.luaslantai + " m². Total Harga yang dibutuhkan Rp. " + total );
		System.out.println(" ");
	}
	
	void keramikC(){
		double ukurankeramik = 0.3 * 0.4;
		int box = 8;
		int harga = 60000;
		double total = ((this.luaslantai / ukurankeramik) / box)* harga;
		System.out.println("Keramik C");
		System.out.println("Ukuran : 30 cm x 40 cm");
		System.out.println("Untuk luas lantai " + this.luaslantai + " m². Total Harga yang dibutuhkan Rp. " + total );
		System.out.println(" ");
        }
}
