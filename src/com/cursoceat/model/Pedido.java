package com.cursoceat.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Pedido implements CalculoIva {

	private static int idPedido;
	private int idLocal;
	private LocalDateTime fechaHoraPedido;
	private int idProducto;
	private int idCliente;
	private int ivaPaisCliente;
	private int cantidadProducto;
	private double precioProducto;
	private double totalSinIva;
	private double totalPedido;

	public Pedido() {
		this.fechaHoraPedido = LocalDateTime.now();
		this.idLocal = idPedido++;
	}

	// *****************************************************

	@Override
	public String toString() {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("'Fecha: 'dd-MM-yyyy 'Hora: 'hh:mm:ss");
		return "Pedido [Nº Pedido = " + idLocal + ", Fecha:Hora = (" + fechaHoraPedido.format(formato)
				+ "), idProducto = " + idProducto + ", Nº Cliente = " + idCliente + ", IVA = " + ivaPaisCliente
				+ ", Cantidad = " + cantidadProducto + ", Precio = " + precioProducto + ", totalSinIva = " + totalSinIva
				+ ", totalPedido = " + totalPedido + "]";
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public int getIvaPaisCliente() {
		return ivaPaisCliente;
	}

	public void setIvaPaisCliente(int ivaPaisCliente) {
		this.ivaPaisCliente = ivaPaisCliente;
	}

	public static int getIdPedido() {
		return idPedido;
	}

	public static void setIdPedido(int idPedido) {
		Pedido.idPedido = idPedido;
	}

	public int getIdLocal() {
		return idLocal;
	}

	public void setIdLocal(int idLocal) {
		this.idLocal = idLocal;
	}

	public LocalDateTime getFechaHoraPedido() {
		return fechaHoraPedido;
	}

	public void setFechaHoraPedido(LocalDateTime fechaHoraPedido) {
		this.fechaHoraPedido = fechaHoraPedido;
	}

	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public int getCantidadProducto() {
		return cantidadProducto;
	}

	public void setCantidadProducto(int cantidadProducto) {
		this.cantidadProducto = cantidadProducto;
	}

	public double getPrecioProducto() {
		return precioProducto;
	}

	public void setPrecioProducto(double precioProducto) {

		if (this.cantidadProducto >= 5) {
			this.precioProducto = precioProducto * 0.92;
		} else {
			this.precioProducto = precioProducto;
		}
	}

	public double getTotalSinIva() {
		return totalSinIva;
	}

	public void setTotalSinIva(double precio, int cantidadProducto) {
		this.totalSinIva = precio * cantidadProducto;
	}

	public double getTotalPedido() {
		return totalPedido;
	}

	public void setTotalPedido(double totalsinIva, int porcentaje) {
		this.totalPedido += totalsinIva + (totalsinIva * porcentaje / 100);
	}

	/**
	 * @category Interface
	 * @description Implementamos el calulo del iva según pais
	 */
	@Override
	public double calculo(double importe, int porcentaje) {
		return 0;
	}
}
