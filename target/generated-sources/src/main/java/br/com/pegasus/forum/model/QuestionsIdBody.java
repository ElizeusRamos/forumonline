package br.com.pegasus.forum.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * QuestionsIdBody
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-11T22:57:05.268663400-03:00[America/Sao_Paulo]")


public class QuestionsIdBody   {
  @JsonProperty("pergunta")
  private String pergunta = null;

  public QuestionsIdBody pergunta(String pergunta) {
    this.pergunta = pergunta;
    return this;
  }

  /**
   * Get pergunta
   * @return pergunta
   **/
  @Schema(example = "O que é o paradigma de Orientação à Objetos?", description = "")
  
  @Size(max=255)   public String getPergunta() {
    return pergunta;
  }

  public void setPergunta(String pergunta) {
    this.pergunta = pergunta;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuestionsIdBody questionsIdBody = (QuestionsIdBody) o;
    return Objects.equals(this.pergunta, questionsIdBody.pergunta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pergunta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuestionsIdBody {\n");
    
    sb.append("    pergunta: ").append(toIndentedString(pergunta)).append("\n");
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
