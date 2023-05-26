package org.prolis.mempleado.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "tbl_empleado")
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "idempleado")
    private Long IdEmpleado;

    @Column(name = "idprofesiones")
    private Long IdProfesiones;

    @Column(name = "idmunicipiores")
    private Long IdMunicipioRes;

    @Column(name = "idmunicipionac")
    private Long IdMunicipioNac;

    @Column(name = "idepartamentonac")
    private Long IdDepartamentoNac;

    @Column(name = "iddepartamentores")
    private Long IdDepartamentoRes;

    @Column(name = "idpaisnac")
    private Long IdPaisNac;

    @Column(name = "idpaisres")
    private Long IdPaisRes;

    @Column(name = "idIdentificacion")
    private Long IdIdentificacion;

    @Column(name = "idestadocivil")
    private Long IdEstadoCivil;

    @Column(name = "idsexo")
    private Long IdSexo;

    @Column(name = "idnacionalidad")
    private Long IdNacionalidad;

    @Column(name = "numidentificacion")
    private String NumIdentificacion;

    @Column(name = "numINSS")
    private String NumINSS;

    @Column(name = "codminsa")
    private String CodMinsa;

    @Column(name = "primernombre")
    private String PrimerNombre;

    @Column(name = "segundonombre")
    private String SegundoNombre;

    @Column(name = "primerapellido")
    private String PrimerApellido;

    @Column(name = "segundoapellido")
    private String SegundoApellido;

    @Column(name = "fechanac")
    private Date FechaNac;

    @Column(name = "edadingreso")
    private String EdadIngreso;

    @Column(name = "email")
    private String Email;

    @Column(name = "direcciondomiciliar")
    private String DireccionDomiciliar;

    @Column(name = "telefonodomiciliar")
    private String TelefonoDomiciliar;

    @Column(name = "telefonomovil")
    private String TelefonoMovil;

    @Column(name = "fechacontrato")
    private Date FechaContrato;

    @Column(name = "urlfoto")
    private String UrlFoto;

    @Column(name = "activo")
    private String Activo;
}
