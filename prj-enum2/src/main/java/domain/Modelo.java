package domain;

// Classe Modelo
public class Modelo {

    private int id;
    private String descricao;
    private Marca marca;
    //private Motor motor = new Motor();
    private Motor motor;

    private ECategoria categoria = ECategoria.PEQUENO;

    public ECategoria getCategoria() {
        return categoria;
    }

    public void setCategoria(ECategoria categoria) {
        this.categoria = categoria;
    }

    public Modelo() {
        this.motor = new Motor();
    }
    
    public Modelo(String descricao, Marca marca) {
        this.motor = new Motor();
        this.descricao = descricao;
        this.marca = marca;
        //this.motor = motor;
    }

// Construtor
    public Modelo(int id, String descricao, Marca marca) {
        //this();
        this.motor = new Motor();
        this.id = id;
        this.descricao = descricao;
        this.marca = marca;
        //this.motor = motor;
    }
    
    public Modelo(
            int id, String descricao, Marca marca, ECategoria categoria) {
        this.motor = new Motor();
        this.id = id;
        this.descricao = descricao;
        this.marca = marca;
        //this.motor = motor;
        this.categoria = categoria;
    }
    
    public Modelo(int id, String descricao, Marca marca, ECategoria categoria, 
            int potencia, ETipoCombustivel tipoCombustivel) {
        this.motor = new Motor(potencia, tipoCombustivel);
        this.id = id;
        this.descricao = descricao;
        this.marca = marca;
        this.categoria = categoria;        
    }
    
    

    public Motor getMotor() {
        return motor;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Modelo{" + "id=" + id + ", descricao='" + descricao + '\'' + ", marca=" + marca + ",motor =" + motor + ",categoria=" + categoria + "}";
    }
}
