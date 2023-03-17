package com.cursoceat.model;

import java.net.URL;

public class Producto {

	public static int idProducto;
	private String nombreProducto;
	private double precioProducto;
	private String imagenUrl;
	private String shortDescProducto;
	private String longDescProducto;
	private int stock;
	private int idProductoTemp;

	public Producto(String nombreProducto, double precioProducto, String imagenUrl, String shortDescProducto,
			String longDescProducto, int stockProducto) {

		this.nombreProducto = nombreProducto;
		this.precioProducto = precioProducto;
		this.imagenUrl = imagenUrl;
		this.shortDescProducto = shortDescProducto;
		this.longDescProducto = longDescProducto;
		this.stock = stockProducto;
		this.idProductoTemp = ++idProducto;
	}

	public Producto() {
		this.idProductoTemp = ++idProducto;
	}

	@Override
	public String toString() {
		return "Producto [idProductoTemp=" + idProductoTemp + ", nombreProducto=" + nombreProducto + ", precioProducto="
				+ precioProducto + ", imagenUrl=" + imagenUrl + ", shortDescProducto=" + shortDescProducto
				+ ", longDescProducto=" + longDescProducto + ", stockProducto=" + stock + "]";
	}

	public void aumentarStock(int cantidad) {
		this.stock -= cantidad;

	}

	public void restarStock(int cantidad) {
		this.stock += cantidad;
	}

	// ***************************************************
	public static int getIdProducto() {
		return idProducto;
	}

	public static void setIdProducto(int idProducto) {
		Producto.idProducto = idProducto;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public double getPrecioProducto() {
		return precioProducto;
	}

	public void setPrecioProducto(double precioProducto) {
		this.precioProducto = precioProducto;
	}

	public String getImagenUrl() {
		return imagenUrl;
	}

	public void setImagenUrl(String imagenUrl) {
		this.imagenUrl = imagenUrl;
	}

	public String getShortDescProducto() {
		return shortDescProducto;
	}

	public void setShortDescProducto(String shortDescProducto) {
		this.shortDescProducto = shortDescProducto;
	}

	public String getLongDescProducto() {
		return longDescProducto;
	}

	public void setLongDescProducto(String longDescProducto) {
		this.longDescProducto = longDescProducto;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stockProducto) {
		this.stock = stockProducto;
	}

	public int getIdProductoTemp() {
		return idProductoTemp;
	}

}
