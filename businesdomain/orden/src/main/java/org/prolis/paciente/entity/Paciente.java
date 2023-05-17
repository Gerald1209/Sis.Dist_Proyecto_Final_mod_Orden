package org.prolis.paciente.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "tbl_paciente")
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdPaciente;


    private Long IdIdentificacion;
    private String NumIdentificacion;
    private Long NumExpediente;
    private String NumINSS;
    private Long IdEstadoCivil;
    private String Email;

    private Long IdSexo;
    private Long IdNacionalidad;
    private Long IdPaisNac;
    private Long IdDepartamentoNac;
    private Long IdMunicipioNac;
    private Long IdPaisRes;
    private Long IdDepartamentoRes;
    private Long IdMunicipioRes;
    private Long IdTipoSangre;
    private Long IdProfesiones;
    private Long idReligion;

    private String PrimerNombre;
    private String SegundoNombre;
    private String PrimerApellido;
    private String SegundoApellido;
    private Date FechaNac;

    private String DireccionDomiciliar;
    private String TelefonoDomiciliar;
    private String TelefonoMovil;
    private String Activo;
    private String Emabrazada;
    private String Fallecido;

    private int Estado;

}
