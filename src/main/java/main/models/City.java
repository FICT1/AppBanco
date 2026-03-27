package main.models;

public class City {
    private String name;
    private String descripcion;
    private String code;

    public City() {
    }

    public City(String name, String descripcion, String code) {
        this.name = name;
        this.descripcion = descripcion;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }


}
