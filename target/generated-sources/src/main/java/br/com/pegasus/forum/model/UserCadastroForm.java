package br.com.pegasus.forum.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UserCadastroForm
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-11T20:19:06.528594300-03:00[America/Sao_Paulo]")


public class UserCadastroForm   {
  @JsonProperty("email")
  private String email = null;

  @JsonProperty("senha")
  private String senha = null;

  public UserCadastroForm email(String email) {
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

  public UserCadastroForm senha(String senha) {
    this.senha = senha;
    return this;
  }

  /**
   * Get senha
   * @return senha
   **/
  @Schema(description = "")
  
  @Size(min=8,max=50)   public String getSenha() {
    return senha;
  }

  public void setSenha(String senha) {
    this.senha = senha;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserCadastroForm userCadastroForm = (UserCadastroForm) o;
    return Objects.equals(this.email, userCadastroForm.email) &&
        Objects.equals(this.senha, userCadastroForm.senha);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, senha);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserCadastroForm {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    senha: ").append(toIndentedString(senha)).append("\n");
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
