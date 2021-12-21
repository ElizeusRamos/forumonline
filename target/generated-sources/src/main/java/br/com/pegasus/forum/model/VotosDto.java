package br.com.pegasus.forum.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * VotosDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-12-21T15:40:09.821623500-03:00[America/Sao_Paulo]")


public class VotosDto   {
  @JsonProperty("positivos")
  private Integer positivos = null;

  @JsonProperty("negativos")
  private Integer negativos = null;

  public VotosDto positivos(Integer positivos) {
    this.positivos = positivos;
    return this;
  }

  /**
   * Get positivos
   * minimum: 0
   * @return positivos
   **/
  @Schema(description = "")
  
  @Min(0)  public Integer getPositivos() {
    return positivos;
  }

  public void setPositivos(Integer positivos) {
    this.positivos = positivos;
  }

  public VotosDto negativos(Integer negativos) {
    this.negativos = negativos;
    return this;
  }

  /**
   * Get negativos
   * minimum: 0
   * @return negativos
   **/
  @Schema(description = "")
  
  @Min(0)  public Integer getNegativos() {
    return negativos;
  }

  public void setNegativos(Integer negativos) {
    this.negativos = negativos;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VotosDto votosDto = (VotosDto) o;
    return Objects.equals(this.positivos, votosDto.positivos) &&
        Objects.equals(this.negativos, votosDto.negativos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(positivos, negativos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VotosDto {\n");
    
    sb.append("    positivos: ").append(toIndentedString(positivos)).append("\n");
    sb.append("    negativos: ").append(toIndentedString(negativos)).append("\n");
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
