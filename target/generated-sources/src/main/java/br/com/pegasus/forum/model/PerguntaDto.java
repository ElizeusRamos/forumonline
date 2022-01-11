package br.com.pegasus.forum.model;

import java.util.Objects;
import br.com.pegasus.forum.model.AssuntoDto;
import br.com.pegasus.forum.model.UserDto;
import br.com.pegasus.forum.model.VotosDto;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PerguntaDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-11T20:19:06.528594300-03:00[America/Sao_Paulo]")


public class PerguntaDto   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("titulo")
  private String titulo = null;

  @JsonProperty("assuntos")
  @Valid
  private List<AssuntoDto> assuntos = null;

  @JsonProperty("descricao")
  private String descricao = null;

  @JsonProperty("usuario")
  private UserDto usuario = null;

  @JsonProperty("votos")
  private VotosDto votos = null;

  @JsonProperty("questaoResolvida")
  private Boolean questaoResolvida = false;

  @JsonProperty("nroRespostas")
  private Integer nroRespostas = 0;

  @JsonProperty("dataCadastro")
  private OffsetDateTime dataCadastro = null;

  public PerguntaDto id(Long id) {
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

  public PerguntaDto titulo(String titulo) {
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

  public PerguntaDto assuntos(List<AssuntoDto> assuntos) {
    this.assuntos = assuntos;
    return this;
  }

  public PerguntaDto addAssuntosItem(AssuntoDto assuntosItem) {
    if (this.assuntos == null) {
      this.assuntos = new ArrayList<AssuntoDto>();
    }
    this.assuntos.add(assuntosItem);
    return this;
  }

  /**
   * Get assuntos
   * @return assuntos
   **/
  @Schema(description = "")
      @Valid
    public List<AssuntoDto> getAssuntos() {
    return assuntos;
  }

  public void setAssuntos(List<AssuntoDto> assuntos) {
    this.assuntos = assuntos;
  }

  public PerguntaDto descricao(String descricao) {
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

  public PerguntaDto usuario(UserDto usuario) {
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

  public PerguntaDto votos(VotosDto votos) {
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

  public PerguntaDto questaoResolvida(Boolean questaoResolvida) {
    this.questaoResolvida = questaoResolvida;
    return this;
  }

  /**
   * Get questaoResolvida
   * @return questaoResolvida
   **/
  @Schema(description = "")
  
    public Boolean isQuestaoResolvida() {
    return questaoResolvida;
  }

  public void setQuestaoResolvida(Boolean questaoResolvida) {
    this.questaoResolvida = questaoResolvida;
  }

  public PerguntaDto nroRespostas(Integer nroRespostas) {
    this.nroRespostas = nroRespostas;
    return this;
  }

  /**
   * Get nroRespostas
   * minimum: 0
   * @return nroRespostas
   **/
  @Schema(description = "")
  
  @Min(0)  public Integer getNroRespostas() {
    return nroRespostas;
  }

  public void setNroRespostas(Integer nroRespostas) {
    this.nroRespostas = nroRespostas;
  }

  public PerguntaDto dataCadastro(OffsetDateTime dataCadastro) {
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
    PerguntaDto perguntaDto = (PerguntaDto) o;
    return Objects.equals(this.id, perguntaDto.id) &&
        Objects.equals(this.titulo, perguntaDto.titulo) &&
        Objects.equals(this.assuntos, perguntaDto.assuntos) &&
        Objects.equals(this.descricao, perguntaDto.descricao) &&
        Objects.equals(this.usuario, perguntaDto.usuario) &&
        Objects.equals(this.votos, perguntaDto.votos) &&
        Objects.equals(this.questaoResolvida, perguntaDto.questaoResolvida) &&
        Objects.equals(this.nroRespostas, perguntaDto.nroRespostas) &&
        Objects.equals(this.dataCadastro, perguntaDto.dataCadastro);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, titulo, assuntos, descricao, usuario, votos, questaoResolvida, nroRespostas, dataCadastro);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PerguntaDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    titulo: ").append(toIndentedString(titulo)).append("\n");
    sb.append("    assuntos: ").append(toIndentedString(assuntos)).append("\n");
    sb.append("    descricao: ").append(toIndentedString(descricao)).append("\n");
    sb.append("    usuario: ").append(toIndentedString(usuario)).append("\n");
    sb.append("    votos: ").append(toIndentedString(votos)).append("\n");
    sb.append("    questaoResolvida: ").append(toIndentedString(questaoResolvida)).append("\n");
    sb.append("    nroRespostas: ").append(toIndentedString(nroRespostas)).append("\n");
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
