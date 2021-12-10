/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.30).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package br.com.pegasus.forum.controller;

import br.com.pegasus.forum.model.UserCadastroForm;
import br.com.pegasus.forum.model.UserDetalhesDto;
import br.com.pegasus.forum.model.UserDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-12-10T17:57:02.023425-03:00[America/Sao_Paulo]")
@Validated
public interface UsersApi {

    @Operation(summary = "Consulta de usuários por ID.", description = "Retorna um usuários.", tags={ "Usuario" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "sucesso consulta", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UserDetalhesDto.class))) })
    @RequestMapping(value = "/users/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<UserDetalhesDto> buscarUsuario(@Parameter(in = ParameterIn.PATH, description = "ID usuário", required=true, schema=@Schema()) @PathVariable("id") Long id);


    @Operation(summary = "Retorna a lista de usuários.", description = "Retorna a lista de usuários.", tags={ "Usuario" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "201", description = "sucesso cadastro") })
    @RequestMapping(value = "/users",
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Void> inserirUsuario(@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody UserCadastroForm body);


    @Operation(summary = "Retorna a lista de usuários.", description = "Retorna a lista de usuários.", tags={ "Usuario" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "sucesso listagem", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = UserDto.class)))) })
    @RequestMapping(value = "/users",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<UserDto>> listarUsuarios(@NotNull @Size(max=50) @Parameter(in = ParameterIn.QUERY, description = "Filtro de pesquisa" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "filter", required = true) String filter);

}
