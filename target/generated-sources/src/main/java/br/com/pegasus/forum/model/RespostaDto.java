package br.com.pegasus.forum.model;

import java.util.Objects;
import br.com.pegasus.forum.model.UserDto;
import br.com.pegasus.forum.model.VotosDto;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RespostaDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-11T20:19:06.528594300-03:00[America/Sao_Paulo]")


public class RespostaDto   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("descricao")
  private String descricao = null;

  @JsonProperty("usuario")
  private UserDto usuario = null;

  @JsonProperty("votos")
  private VotosDto votos = null;

  @JsonProperty("solucao")
  private Boolean solucao = false;

  @JsonProperty("dataCadastro")
  private OffsetDateTime dataCadastro = null;

  public RespostaDto id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @Schema(description = "")
  
    public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public RespostaDto descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }

  /**
   * Get descricao
   * @return descricao
   **/
  @Schema(description = "")
  
    public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public RespostaDto usuario(UserDto usuario) {
    this.usuario = usuario;
    return this;
  }

  /**
   * Get usuario
   * @return usuario
   **/
  @Schema(description = "")
  
    @Valid
    public UserDto getUsuario() {
    return usuario;
  }

  public void setUsuario(UserDto usuario) {
    this.usuario = usuario;
  }

  public RespostaDto votos(VotosDto votos) {
    this.votos = votos;
    return this;
  }

  /**
   * Get votos
   * @return votos
   **/
  @Schema(description = "")
  
    @Valid
    public VotosDto getVotos() {
    return votos;
  }

  public void setVotos(VotosDto votos) {
    this.votos = votos;
  }

  public RespostaDto solucao(Boolean solucao) {
    this.solucao = solucao;
    return this;
  }

  /**
   * Get solucao
   * @return solucao
   **/
  @Schema(description = "")
  
    public Boolean isSolucao() {
    return solucao;
  }

  public void setSolucao(Boolean solucao) {
    this.solucao = solucao;
  }

  public RespostaDto dataCadastro(OffsetDateTime dataCadastro) {
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
    RespostaDto respostaDto = (RespostaDto) o;
    return Objects.equals(this.id, respostaDto.id) &&
        Objects.equals(this.descricao, respostaDto.descricao) &&
        Objects.equals(this.usuario, respostaDto.usuario) &&
        Objects.equals(this.votos, respostaDto.votos) &&
        Objects.equals(this.solucao, respostaDto.solucao) &&
        Objects.equals(this.dataCadastro, respostaDto.dataCadastro);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, descricao, usuario, votos, solucao, dataCadastro);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RespostaDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    descricao: ").append(toIndentedString(descricao)).append("\n");
    sb.append("    usuario: ").append(toIndentedString(usuario)).append("\n");
    sb.append("    votos: ").append(toIndentedString(votos)).append("\n");
    sb.append("    solucao: ").append(toIndentedString(solucao)).append("\n");
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
