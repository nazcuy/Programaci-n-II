package ejercicio04;
public class TarjetaDeCredito {
    private String numero;
    private String fechaVencimiento;
    private Cliente cliente;
    private Banco banco;
    
    public TarjetaDeCredito(String numero,String fechaVencimiento) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
    }
    public String getNumero() { 
        return numero; 
    }
    public void setNumero(String numero) {
        this.numero = numero; 
    }
    public String getFechaVencimiento() {
        return fechaVencimiento; 
    }
    public void setFechaVencimiento(String fechaVencimiento) { 
        this.fechaVencimiento = fechaVencimiento; 
    }
    public Banco getBanco() { 
        return banco; 
    }
    public void setBanco(Banco banco) { 
        this.banco = banco; 
    }
    public Cliente getCliente() { 
        return cliente; 
    }
    public void setCliente(Cliente cliente) {
        if (this.cliente == cliente) {
            return;
        }
        this.cliente = cliente;
        if (cliente != null && cliente.getTarjetaDeCredito() != this) {
            cliente.setTarjetaDeCredito(this);
        }
    }
}
