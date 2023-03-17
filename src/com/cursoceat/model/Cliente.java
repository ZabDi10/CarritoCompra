package com.cursoceat.model;

public class Cliente {

	public static int idCliente;
	private String nombreCliente;
	private String apellidosCliente;
	private String direccionCliente;
	private String localidadCliente;
	Pais paisCliente;
	private String telefonoCliente;
	private String nifCliente;
	private int idTemp;

	// El constructor
	public Cliente(String nombreCliente, String apellidosCliente, String direccionCliente, String localidadCliente,
			Pais paisCliente, String telefonoCliente, String nifCliente) {

		this.nombreCliente = nombreCliente;
		this.apellidosCliente = apellidosCliente;
		this.direccionCliente = direccionCliente;
		this.localidadCliente = localidadCliente;
		this.paisCliente = paisCliente;
		this.telefonoCliente = telefonoCliente;
		this.nifCliente = nifCliente;
		this.idTemp = ++idCliente;
	}

	public Cliente() {
		this.idTemp = ++idCliente;
	}

	@Override
	public String toString() {
		return "Cliente [idTemp=" + idTemp + ", nombreCliente=" + nombreCliente + ", apellidosCliente="
				+ apellidosCliente + ", direccionCliente=" + direccionCliente + ", localidadCliente=" + localidadCliente
				+ ", paisCliente=" + paisCliente + ", telefonoCliente=" + telefonoCliente + ", nifCliente=" + nifCliente
				+ "]";
	}

	// ***********************************************************************
	//Getter y setter
	public static int getIdCliente() {
		return idCliente;
	}

	public static void setIdCliente(int idCliente) {
		Cliente.idCliente = idCliente;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getApellidosCliente() {
		return apellidosCliente;
	}

	public void setApellidosCliente(String apellidosCliente) {
		this.apellidosCliente = apellidosCliente;
	}

	public String getDireccionCliente() {
		return direccionCliente;
	}

	public void setDireccionCliente(String direccionCliente) {
		this.direccionCliente = direccionCliente;
	}

	public String getLocalidadCliente() {
		return localidadCliente;
	}

	public void setLocalidadCliente(String localidadCliente) {
		this.localidadCliente = localidadCliente;
	}

	public Pais getPaisCliente() {
		return paisCliente;
	}

	public void setPaisCliente(Pais paisCliente) {
		this.paisCliente = paisCliente;
	}

	public String getTelefonoCliente() {
		return telefonoCliente;
	}

	public void setTelefonoCliente(String telefonoCliente) {
		this.telefonoCliente = telefonoCliente;
	}

	public String getNifCliente() {
		return nifCliente;
	}

	public void setNifCliente(String nifCliente) {
		this.nifCliente = nifCliente;
	}

	public int getIdTemp() {
		return idTemp;
	}

}
