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
		
		Producto miProducto2= new Producto("Camiseta azul", 13.5, "c:\\images\\img2.jpg", "Camiseta algodon", "100% algodon", 10);
		p1.add(miProducto2);
		System.out.println(p1.toString());
		miProducto2.restarStock(3);
		System.out.println(p1.toString());
		
		Cliente miCliente1 = new Cliente("María", "Pérez", "Calle Oriente", "Tomelloso", Pais.SPAIN, "659325658", "09584658N");
		System.out.println(miCliente1.toString());
		
		Pedido miPedido = new Pedido();
		System.out.println(miPedido.toString());
		Pedido miPedido2 = new Pedido();
		System.out.println(miPedido2.toString());
		miPedido.setIdCliente(miCliente1.getIdTemp());//Con el id podemos recuperar todos los datos del cliente
		miPedido.setIvaPaisCliente(miCliente1.getPaisCliente().getPorcentaje());//Necesito el porcentaje que sale del pais
		
		System.out.println();
		miPedido.setIdProducto(miProducto.getIdProductoTemp());
		miPedido.setCantidadProducto(5);
		miPedido.setPrecioProducto(miProducto.getPrecioProducto());
		
		miPedido.setTotalSinIva(miPedido.getPrecioProducto(), miPedido.getCantidadProducto());
		miPedido.setTotalPedido(miPedido.getTotalSinIva(), miPedido.getIvaPaisCliente());
		
		System.out.println(miPedido.toString());
		System.out.println();
		
		
		Cliente miCliente2 = new Cliente("Juan", "Portugues", "Calle Lisboa", "Lisboa", Pais.PORTUGAL, "567898544", "04589678E");
		miPedido2.setIdCliente(miCliente2.getIdTemp());
		miPedido2.setIvaPaisCliente(miCliente2.getPaisCliente().getPorcentaje());
		
		miPedido2.setIdProducto(miProducto2.getIdProductoTemp());
		miPedido2.setCantidadProducto(3);
		miPedido2.setPrecioProducto(miProducto2.getPrecioProducto());
		
		miPedido2.setTotalSinIva(miPedido2.getPrecioProducto(), miPedido2.getCantidadProducto());
		miPedido2.setTotalPedido(miPedido2.getTotalSinIva(), miPedido2.getIvaPaisCliente());
		
		System.out.println(miPedido2.toString());
		
	}

}
