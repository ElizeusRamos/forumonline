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
 * UserDetalhesDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-12-21T15:40:09.821623500-03:00[America/Sao_Paulo]")


public class UserDetalhesDto   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("nome")
  private String nome = null;

  @JsonProperty("login")
  private String login = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("profissao")
  private String profissao = null;

  @JsonProperty("formacao")
  private String formacao = null;

  @JsonProperty("dataCadastro")
  private OffsetDateTime dataCadastro = null;

  public UserDetalhesDto id(Long id) {
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

  public UserDetalhesDto nome(String nome) {
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

  public UserDetalhesDto login(String login) {
    this.login = login;
    return this;
  }

  /**
   * Get login
   * @return login
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public UserDetalhesDto email(String email) {
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

  public UserDetalhesDto profissao(String profissao) {
    this.profissao = profissao;
    return this;
  }

  /**
   * Get profissao
   * @return profissao
   **/
  @Schema(description = "")
  
    public String getProfissao() {
    return profissao;
  }

  public void setProfissao(String profissao) {
    this.profissao = profissao;
  }

  public UserDetalhesDto formacao(String formacao) {
    this.formacao = formacao;
    return this;
  }

  /**
   * Get formacao
   * @return formacao
   **/
  @Schema(description = "")
  
    public String getFormacao() {
    return formacao;
  }

  public void setFormacao(String formacao) {
    this.formacao = formacao;
  }

  public UserDetalhesDto dataCadastro(OffsetDateTime dataCadastro) {
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
    UserDetalhesDto userDetalhesDto = (UserDetalhesDto) o;
    return Objects.equals(this.id, userDetalhesDto.id) &&
        Objects.equals(this.nome, userDetalhesDto.nome) &&
        Objects.equals(this.login, userDetalhesDto.login) &&
        Objects.equals(this.email, userDetalhesDto.email) &&
        Objects.equals(this.profissao, userDetalhesDto.profissao) &&
        Objects.equals(this.formacao, userDetalhesDto.formacao) &&
        Objects.equals(this.dataCadastro, userDetalhesDto.dataCadastro);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nome, login, email, profissao, formacao, dataCadastro);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserDetalhesDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    profissao: ").append(toIndentedString(profissao)).append("\n");
    sb.append("    formacao: ").append(toIndentedString(formacao)).append("\n");
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
