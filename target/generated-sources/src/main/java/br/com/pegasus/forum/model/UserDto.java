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
 * UserDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-11T22:57:05.268663400-03:00[America/Sao_Paulo]")


public class UserDto   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("nome")
  private String nome = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("dataCadastro")
  private OffsetDateTime dataCadastro = null;

  public UserDto id(Long id) {
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

  public UserDto nome(String nome) {
    this.nome = nome;
    return this;
  }

  /**
   * Get nome
   * @return nome
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public UserDto email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
   **/
  @Schema(description = "")
  
    public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public UserDto dataCadastro(OffsetDateTime dataCadastro) {
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
    UserDto userDto = (UserDto) o;
    return Objects.equals(this.id, userDto.id) &&
        Objects.equals(this.nome, userDto.nome) &&
        Objects.equals(this.email, userDto.email) &&
        Objects.equals(this.dataCadastro, userDto.dataCadastro);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nome, email, dataCadastro);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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
