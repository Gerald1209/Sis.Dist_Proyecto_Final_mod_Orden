package org.prolis.mpacientes.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "tbl_paciente")
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "idpaciente")
    private Long IdPaciente;

    @Column(name = "ididentificacion")
    private Long IdIdentificacion;

    @Column(name = "numidentificacion")
    private String NumIdentificacion;

    @Column(name = "numexpediente")
    private Long NumExpediente;

    @Column(name = "NumINSS")
    private String NumINSS;

    @Column(name = "idestadocivil")
    private Long IdEstadoCivil;

    @Column(name = "Email")
    private String Email;

    @Column(name = "idsexo")
    private Long IdSexo;

    @Column(name = "idnacionalidad")
    private Long IdNacionalidad;

    @Column(name = "idpaisnac")
    private Long IdPaisNac;

    @Column(name = "iddepartamentonac")
    private Long IdDepartamentoNac;

    @Column(name = "idmunicipionac")
    private Long IdMunicipioNac;

    @Column(name = "idpaisres")
    private Long IdPaisRes;

    @Column(name = "iddepartamentores")
    private Long IdDepartamentoRes;

    @Column(name = "idmunicipiores")
    private Long IdMunicipioRes;

    @Column(name = "idtiposangre")
    private Long IdTipoSangre;

    @Column(name = "idprofesiones")
    private Long IdProfesiones;

    @Column(name = "idreligion")
    private Long idReligion;

    @Column(name = "primernombre")
    private String PrimerNombre;

    @Column(name = "segundonombre")
    private String SegundoNombre;

    @Column(name = "primerapellido")
    private String PrimerApellido;

    @Column(name = "segundoapellido")
    private String SegundoApellido;

    @Column(name = "fechanac")
    private String FechaNac;

    @Column(name = "direcciondomiciliar")
    private String DireccionDomiciliar;

    @Column(name = "telefonodomiciliar")
    private String TelefonoDomiciliar;

    @Column(name = "telefonomovil")
    private String TelefonoMovil;

    @Column(name = "Activo")
    private String Activo;

    @Column(name = "Emabrazada")
    private String Emabrazada;

    @Column(name = "Fallecido")
    private String Fallecido;
}
