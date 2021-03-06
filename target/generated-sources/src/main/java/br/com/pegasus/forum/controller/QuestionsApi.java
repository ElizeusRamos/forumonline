/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.30).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package br.com.pegasus.forum.controller;

import br.com.pegasus.forum.model.PerguntaCadastroForm;
import br.com.pegasus.forum.model.PerguntaDetalheDto;
import br.com.pegasus.forum.model.PerguntaDto;
import br.com.pegasus.forum.model.QuestionsIdBody;
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
public interface QuestionsApi {

    @Operation(summary = "Altera pergunta", description = "Altera pergunta", tags={ "Perguntas" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "201", description = "sucesso cadastro") })
    @RequestMapping(value = "/questions/{id}",
        consumes = { "application/json" }, 
        method = RequestMethod.PUT)
    ResponseEntity<Void> alterarPergunta(@Size(max=50) @Parameter(in = ParameterIn.PATH, description = "ID da pergunta", required=true, schema=@Schema()) @PathVariable("id") String id, @Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody QuestionsIdBody body);


    @Operation(summary = "Retorna a pergunta do forum.", description = "Retorna a pergunta.", tags={ "Perguntas" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "sucesso listagem", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = PerguntaDetalheDto.class)))) })
    @RequestMapping(value = "/questions/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<PerguntaDetalheDto>> buscarPergunta(@Size(max=50) @Parameter(in = ParameterIn.PATH, description = "ID da pergunta", required=true, schema=@Schema()) @PathVariable("id") String id);


    @Operation(summary = "Cadastra nova pergunta", description = "Cadastra nova pergunta", tags={ "Perguntas" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "201", description = "sucesso cadastro") })
    @RequestMapping(value = "/questions",
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Void> inserirPergunta(@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody PerguntaCadastroForm body);


    @Operation(summary = "Retorna a lista de perguntas do forum.", description = "Retorna a lista de perguntas.", tags={ "Perguntas" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "sucesso listagem", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = PerguntaDto.class)))) })
    @RequestMapping(value = "/questions",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<PerguntaDto>> listarPerguntas(@Size(max=50) @Parameter(in = ParameterIn.QUERY, description = "Filtro de pesquisa" ,schema=@Schema()) @Valid @RequestParam(value = "filter", required = false) String filter);

}

