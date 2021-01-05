package br.com.orangeBank.controller;

import br.com.orangeBank.model.Usuario;
import br.com.orangeBank.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;


    @RestController
    @RequestMapping("/")
    public class UsuarioController {

        @Autowired
        private UsuarioService usuarioService;

        @PostMapping("/usuario")
        public Usuario save(@RequestBody Usuario usuarioObj) {
            System.out.println("recording");
            usuarioService.save(usuarioObj);
            return usuarioObj;
        }

        @GetMapping("/usuario")
        public List<Usuario> get(){
            return usuarioService.get();
        }

        @GetMapping("/usuario/{id}")
        public Usuario get(@PathVariable int id) {
            Usuario usuarioObj = usuarioService.get(id);
            if(usuarioObj == null) {
                throw new RuntimeException("Usuario não encontrado através do Id:"+id);
            }
            return usuarioObj;
        }




    }

