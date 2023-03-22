package com.cursoceat.main;

import java.util.ArrayList;

import com.cursoceat.model.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Obejto del producto 1
		Producto miProducto = new Producto("Camiseta", 15.5, "c:\\imagenes\\img1.jpg", "Camiseta de algodón",
				"Camiseta hecha en los confines de la madre tierra, es decir china", 10);

		ArrayList<Producto> p1 = new ArrayList<Producto>();
		p1.add(miProducto);
		
		System.out.println(p1.toString());
		
		//Obejto del producto 2
		Producto miProducto2= new Producto("Camiseta azul", 13.5, "c:\\images\\img2.jpg", "Camiseta algodon", "100% algodon", 10);
		p1.add(miProducto2);
		System.out.println(p1.toString());
		miProducto2.restarStock(3);
		System.out.println(p1.toString());
		
		//Obejto del cliente 1 con pedido 1
		Cliente miCliente1 = new Cliente("María", "Pérez", "Calle Oriente", "Tomelloso", Pais.SPAIN, "659325658", "09584658N");
		System.out.println(miCliente1.toString());
		
		//Objeto del pedido 1 y 2
		Pedido miPedido = new Pedido();
		System.out.println(miPedido.toString());
		Pedido miPedido2 = new Pedido();
		System.out.println(miPedido2.toString());
		
		miPedido.setIdCliente(miCliente1.getIdTemp());//Con el set y get podemos fijar valores al pedido ya puestos en el cliente
		miPedido.setIvaPaisCliente(miCliente1.getPaisCliente().getPorcentaje());//Necesito el porcentaje que sale del pais
		
		System.out.println();
		miPedido.setIdProducto(miProducto.getIdProductoTemp());//se captura el id producto
		miPedido.setCantidadProducto(5);//Cantidad
		miPedido.setPrecioProducto(miProducto.getPrecioProducto());//Se captura el precio del producto
		
		miPedido.setTotalSinIva(miPedido.getPrecioProducto(), miPedido.getCantidadProducto());//Recuperamos los valores de precio y cantidad fijados en pedido anteriormente
		miPedido.setTotalPedido(miPedido.getTotalSinIva(), miPedido.getIvaPaisCliente());//Recuperamos el iva sin pedido y iva del pais
		
		System.out.println(miPedido.toString());
		System.out.println();
		
		//Siguiente ejemplo del objeto cliente 2
		Cliente miCliente2 = new Cliente("Juan", "Portugues", "Calle Lisboa", "Lisboa", Pais.PORTUGAL, "567898544", "04589678E");
		miPedido2.setIdCliente(miCliente2.getIdTemp());//Recuperamos el id del cliente
		miPedido2.setIvaPaisCliente(miCliente2.getPaisCliente().getPorcentaje());//Recuperamos el iva del pais cliente
		
		miPedido2.setIdProducto(miProducto2.getIdProductoTemp());//Recuperamos el id del producto fijado
		miPedido2.setCantidadProducto(3);//Cantidad de producto	
		miPedido2.setPrecioProducto(miProducto2.getPrecioProducto());//recuperamos el precio del producto 2
		
		miPedido2.setTotalSinIva(miPedido2.getPrecioProducto(), miPedido2.getCantidadProducto());//Recuperamos el precio y cantidad producto almacenados en pedido
		miPedido2.setTotalPedido(miPedido2.getTotalSinIva(), miPedido2.getIvaPaisCliente());//Recuperamos el sin iva y pais iva del pedido
		
		System.out.println(miPedido2.toString());
		
	}

}
