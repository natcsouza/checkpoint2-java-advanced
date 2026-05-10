package br.com.fiap.brinquedos.controller;

import br.com.fiap.brinquedos.entity.Brinquedo;
import br.com.fiap.brinquedos.service.BrinquedoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/brinquedos")
public class BrinquedoController {

    @Autowired
    private BrinquedoService service;

    @PostMapping
    public Brinquedo salvar(@RequestBody Brinquedo brinquedo) {
        return service.salvar(brinquedo);
    }

    @GetMapping
    public List<Brinquedo> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public Optional<Brinquedo> buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }

    @PutMapping("/{id}")
    public Brinquedo atualizar(@PathVariable Long id,
                               @RequestBody Brinquedo brinquedo) {

        return service.atualizar(id, brinquedo);
    }
}