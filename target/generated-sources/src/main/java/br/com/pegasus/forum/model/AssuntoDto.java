package br.com.pegasus.forum.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AssuntoDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-11T20:19:06.528594300-03:00[America/Sao_Paulo]")


public class AssuntoDto   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("descricao")
  private String descricao = null;

  @JsonProperty("dataCadastro")
  private OffsetDateTime dataCadastro = null;

  public AssuntoDto id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @Schema(required = true, description = "")
      @NotNull

    public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public AssuntoDto descricao(String descricao) {
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

  public AssuntoDto dataCadastro(OffsetDateTime dataCadastro) {
    this.dataCadastro = dataCadastro;
    return this;
  }

  /**
   * Get dataCadastro
   * @return dataCadastro
   **/
  @Schema(description = "")
  
    @Valid
    public OffsetDateTime getDataCadastro() {
    return dataCadastro;
  }

  public void setDataCadastro(OffsetDateTime dataCadastro) {
    this.dataCadastro = dataCadastro;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssuntoDto assuntoDto = (AssuntoDto) o;
    return Objects.equals(this.id, assuntoDto.id) &&
        Objects.equals(this.descricao, assuntoDto.descricao) &&
        Objects.equals(this.dataCadastro, assuntoDto.dataCadastro);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, descricao, dataCadastro);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssuntoDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    descricao: ").append(toIndentedString(descricao)).append("\n");
    sb.append("    dataCadastro: ").append(toIndentedString(dataCadastro)).append("\n");
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
