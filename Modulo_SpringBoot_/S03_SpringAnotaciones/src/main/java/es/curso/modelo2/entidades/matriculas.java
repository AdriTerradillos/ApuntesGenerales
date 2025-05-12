package es.curso.modelo2.entidades;

import org.springframework.stereotype.Component;

@Component
public class matriculas {
    private int id;
    private int fechaMatriculacion;
    private boolean estadoMatriculacion;


    // getters y setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFechaMatriculacion() {
        return fechaMatriculacion;
    }

    public void setFechaMatriculacion(int fechaMatriculacion) {
        this.fechaMatriculacion = fechaMatriculacion;
    }

    public boolean isEstadoMatriculacion() {
        return estadoMatriculacion;
    }

    public void setEstadoMatriculacion(boolean estadoMatriculacion) {
        this.estadoMatriculacion = estadoMatriculacion;
    }
    

    // método toString()

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("matriculas{");
        sb.append("id=").append(id);
        sb.append(", fechaMatriculacion=").append(fechaMatriculacion);
        sb.append(", estadoMatriculacion=").append(estadoMatriculacion);
        sb.append('}');
        return sb.toString();
    }
    
}
