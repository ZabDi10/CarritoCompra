package com.cursoceat.main;

import java.util.ArrayList;

import com.cursoceat.model.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto miProducto = new Producto("Camiseta", 15.5, "c:\\imagenes\\img1.jpg", "Camiseta de algodón",
				"Camiseta hecha en los confines de la madre tierra, es decir china", 10);

		ArrayList<Producto> p1 = new ArrayList<Producto>();
		p1.add(miProducto);
		
		System.out.println(p1.toString());

	}

}
