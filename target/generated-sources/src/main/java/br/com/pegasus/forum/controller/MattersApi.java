/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.30).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package br.com.pegasus.forum.controller;

import br.com.pegasus.forum.model.AssuntoCadastroForm;
import br.com.pegasus.forum.model.AssuntoDto;
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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-11T22:57:05.268663400-03:00[America/Sao_Paulo]")
@Validated
public interface MattersApi {

    @Operation(summary = "Cadastra novo assunto", description = "Cadastra novo assunto", tags={ "Assuntos" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "201", description = "sucesso cadastro") })
    @RequestMapping(value = "/matters",
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Void> inserirAssunto(@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody AssuntoCadastroForm body);


    @Operation(summary = "Retorna a lista de assuntos do forum.", description = "Retorna a lista de assuntos.", tags={ "Assuntos" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "sucesso listagem", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = AssuntoDto.class)))) })
    @RequestMapping(value = "/matters",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<AssuntoDto>> listarAssuntos(@Size(max=50) @Parameter(in = ParameterIn.QUERY, description = "Filtro de pesquisa" ,schema=@Schema()) @Valid @RequestParam(value = "filter", required = false) String filter);


    @Operation(summary = "Deleta assunto", description = "Deleta assunto", tags={ "Assuntos" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "204", description = "sucesso cadastro") })
    @RequestMapping(value = "/matters/{id}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> removerAssunto(@Size(max=50) @Parameter(in = ParameterIn.PATH, description = "ID do assunto", required=true, schema=@Schema()) @PathVariable("id") String id);

}
