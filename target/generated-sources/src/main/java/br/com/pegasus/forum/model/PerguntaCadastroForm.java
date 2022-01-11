package br.com.pegasus.forum.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PerguntaCadastroForm
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-11T20:19:06.528594300-03:00[America/Sao_Paulo]")


public class PerguntaCadastroForm   {
  @JsonProperty("titulo")
  private String titulo = null;

  @JsonProperty("idAssunto")
  private Long idAssunto = null;

  @JsonProperty("descricao")
  private String descricao = null;

  @JsonProperty("idUsuario")
  private Long idUsuario = null;

  public PerguntaCadastroForm titulo(String titulo) {
    this.titulo = titulo;
    return this;
  }

  /**
   * Get titulo
   * @return titulo
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public PerguntaCadastroForm idAssunto(Long idAssunto) {
    this.idAssunto = idAssunto;
    return this;
  }

  /**
   * Get idAssunto
   * @return idAssunto
   **/
  @Schema(description = "")
  
    public Long getIdAssunto() {
    return idAssunto;
  }

  public void setIdAssunto(Long idAssunto) {
    this.idAssunto = idAssunto;
  }

  public PerguntaCadastroForm descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }

  /**
   * Get descricao
   * @return descricao
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public PerguntaCadastroForm idUsuario(Long idUsuario) {
    this.idUsuario = idUsuario;
    return this;
  }

  /**
   * Get idUsuario
   * @return idUsuario
   **/
  @Schema(description = "")
  
    public Long getIdUsuario() {
    return idUsuario;
  }

  public void setIdUsuario(Long idUsuario) {
    this.idUsuario = idUsuario;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PerguntaCadastroForm perguntaCadastroForm = (PerguntaCadastroForm) o;
    return Objects.equals(this.titulo, perguntaCadastroForm.titulo) &&
        Objects.equals(this.idAssunto, perguntaCadastroForm.idAssunto) &&
        Objects.equals(this.descricao, perguntaCadastroForm.descricao) &&
        Objects.equals(this.idUsuario, perguntaCadastroForm.idUsuario);
  }

  @Override
  public int hashCode() {
    return Objects.hash(titulo, idAssunto, descricao, idUsuario);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PerguntaCadastroForm {\n");
    
    sb.append("    titulo: ").append(toIndentedString(titulo)).append("\n");
    sb.append("    idAssunto: ").append(toIndentedString(idAssunto)).append("\n");
    sb.append("    descricao: ").append(toIndentedString(descricao)).append("\n");
    sb.append("    idUsuario: ").append(toIndentedString(idUsuario)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
