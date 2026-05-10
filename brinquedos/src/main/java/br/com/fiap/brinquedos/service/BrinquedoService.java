package br.com.fiap.brinquedos.service;

import br.com.fiap.brinquedos.entity.Brinquedo;
import br.com.fiap.brinquedos.repository.BrinquedoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BrinquedoService {

    @Autowired
    private BrinquedoRepository repository;

    public Brinquedo salvar(Brinquedo brinquedo) {
        return repository.save(brinquedo);
    }

    public List<Brinquedo> listarTodos() {
        return repository.findAll();
    }

    public Optional<Brinquedo> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }

    public Brinquedo atualizar(Long id, Brinquedo brinquedo) {

        Optional<Brinquedo> brinquedoExistente = repository.findById(id);

        if (brinquedoExistente.isPresent()) {

            Brinquedo b = brinquedoExistente.get();

            b.setNome(brinquedo.getNome());
            b.setTipo(brinquedo.getTipo());
            b.setClassificacao(brinquedo.getClassificacao());
            b.setTamanho(brinquedo.getTamanho());
            b.setPreco(brinquedo.getPreco());

            return repository.save(b);
        }

        return null;
    }
}