package com.mycompany.testes.integracao.carro;

public class Suspensao {

    private String tipo;
    private String material;
    private double altura;
    private int rigidez;
    private String marca;

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public int getRigidez() {
        return rigidez;
    }
    public void setRigidez(int rigidez) {
        this.rigidez = rigidez;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void ajustarAltura(double novaAltura) {
        if (novaAltura >= 0 && novaAltura <= 10) {
            this.altura = novaAltura;
        } else {
            System.out.println("Altura inválida. Deve ser entre 0 e 10.");
        }
    }
    
    public String verificarEstado() {
        if (this.altura >= 5) {
            return "Suspensao está em estado alto.";
        } else if (this.altura >= 3) {
            return "Suspensao está em estado moderado.";
        } else {
            return "Suspensao está em estado baixo.";
        }
    }

    public void substituir() {
        Suspensao novaSuspensao = new Suspensao();
        novaSuspensao.setTipo(this.tipo);
        novaSuspensao.setMaterial(this.material);
        novaSuspensao.setAltura(this.altura);
        novaSuspensao.setRigidez(this.rigidez);
        novaSuspensao.setMarca(this.marca);
        
        
        System.out.println("Suspensão substituída com sucesso!");
    }


}
