package Cuenta;

public class Cuenta {
	private String cuenta;
	private String nombre;
	private String numCuenta;
	private double tipoInteres;
	private double saldo;

	public Cuenta() {

	}

	public Cuenta(String cuenta, String numCuenta, double tipoInteres, double saldo) {
		super();
		this.cuenta = cuenta;
		this.nombre = nombre;
		this.numCuenta = numCuenta;
		this.tipoInteres = tipoInteres;
		this.saldo = saldo;
	}

	public Cuenta(Cuenta c) {
		nombre = c.nombre;
		numCuenta = c.numCuenta;
		tipoInteres = tipoInteres;
		saldo = c.saldo;
	}

	public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}

	public double getTipoInteres() {
		return tipoInteres;
	}

	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean ingreso(double n) {
		boolean ingresoCorrecto = true;
		if (n < 0) {
			ingresoCorrecto = false;
		} else {
			saldo += n;

		}
		return ingresoCorrecto;
	}

	public boolean reintegro(double n) {
		boolean reintegroCorrecto = true;
		if (n < 0) {
			reintegroCorrecto = false;
		} else {
			reintegroCorrecto = false;

		}
		return reintegroCorrecto;
	}

	public boolean transferencia(Cuenta c, double n) {
		boolean transferenciaCorrecta = true;
		if (n < 0) {
			transferenciaCorrecta = false;

		} else if (saldo >= n) {
			reintegro(n);
			c.ingreso(n);

		} else {
			transferenciaCorrecta = false;

		}
		return transferenciaCorrecta;
	}
}
