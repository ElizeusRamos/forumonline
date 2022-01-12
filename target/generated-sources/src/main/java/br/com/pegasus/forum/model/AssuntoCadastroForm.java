package br.com.pegasus.forum.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AssuntoCadastroForm
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-11T22:57:05.268663400-03:00[America/Sao_Paulo]")


public class AssuntoCadastroForm   {
  @JsonProperty("idAutor")
  private Long idAutor = null;

  @JsonProperty("descricao")
  private String descricao = null;

  public AssuntoCadastroForm idAutor(Long idAutor) {
    this.idAutor = idAutor;
    return this;
  }

  /**
   * Get idAutor
   * @return idAutor
   **/
  @Schema(required = true, description = "")
      @NotNull

    public Long getIdAutor() {
    return idAutor;
  }

  public void setIdAutor(Long idAutor) {
    this.idAutor = idAutor;
  }

  public AssuntoCadastroForm descricao(String descricao) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssuntoCadastroForm assuntoCadastroForm = (AssuntoCadastroForm) o;
    return Objects.equals(this.idAutor, assuntoCadastroForm.idAutor) &&
        Objects.equals(this.descricao, assuntoCadastroForm.descricao);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idAutor, descricao);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssuntoCadastroForm {\n");
    
    sb.append("    idAutor: ").append(toIndentedString(idAutor)).append("\n");
    sb.append("    descricao: ").append(toIndentedString(descricao)).append("\n");
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
