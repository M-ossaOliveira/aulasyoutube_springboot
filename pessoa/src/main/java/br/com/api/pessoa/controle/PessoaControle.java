package br.com.api.pessoa.controle;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class PessoaControle {
    
    @GetMapping("/mensagem")
    public String mensagem(){
        return "Utilizando o dev tools";
    }

    @GetMapping ("/apresentacao/{nome}")
    public String apresentacao(@PathVariable String nome){
        return "Olá "+nome;
    }
    
}
