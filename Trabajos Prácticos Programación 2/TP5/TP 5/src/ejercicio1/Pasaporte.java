package ejercicio1;

public class Pasaporte {
    private String numero;
    private String fechaEmision;
    private Foto foto;
    private Titular titular;

    public Pasaporte(String numero, String fechaEmision, String imagen, String formato) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = new Foto(imagen, formato);
    }
    public String getNumero() { 
        return numero; 
    }
    public void setNumero(String numero) { 
        this.numero = numero; 
    }
    public String getFechaEmision() { 
        return fechaEmision; 
    }
    public void setFechaEmision(String fechaEmision) { 
        this.fechaEmision = fechaEmision; 
    }
    public Foto getFoto() { 
        return foto; 
    }

    public Titular getTitular() { 
        return titular; 
    }
    public void setTitular(Titular titular) {
        if (this.titular != titular && titular != null) {
            this.titular = titular;
            titular.setPasaporte(this);
            }
    }
}