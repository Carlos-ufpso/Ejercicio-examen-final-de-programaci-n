package entities;

import java.util.ArrayList;
import java.util.List;

public class Agente extends Entidad {
    private String habilidadEspecial;
    private String misionAsignada;
    private List<String> recompensas;

    public Agente(int id, String nombre, String habilidadEspecial) {
        super(id, nombre);
        this.habilidadEspecial = habilidadEspecial;
        this.recompensas = new ArrayList<>();
    }

    public String getHabilidadEspecial() {
        return habilidadEspecial;
    }

    public void setHabilidadEspecial(String habilidadEspecial) {
        this.habilidadEspecial = habilidadEspecial;
    }

    public String getMisionAsignada() {
        return misionAsignada;
    }

    public void asignarMision(String mision) {
        this.misionAsignada = mision;
    }
    public void registrarRecompensa(String recompensa) {
        recompensas.add(recompensa);
    }

    public void mostrarRecompensas() {
        if (recompensas.isEmpty()) {
            System.out.println("El agente no tiene recompensas");
        } else {
            System.out.println("Recompensas del agente: ");
            for (String recompensa : recompensas) {
                System.out.println("- " + recompensa);
            }
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Habilidad Especial: " + habilidadEspecial +
                (misionAsignada != null ? ", Misión: " + misionAsignada : "");
    }
}
