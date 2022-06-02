package com.letscode.produtos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.letscode.produtos.model.Produto;
import com.letscode.produtos.repository.ProdutoRepository;


@RestController
@RequestMapping("/api")
public class ProdutoController {
@Autowired
ProdutoRepository produtoRepository;

@GetMapping("/produtos")
@ResponseStatus(HttpStatus.OK)
public List<Produto>listaProdutos(){
	return produtoRepository.findAll();
	
}

@GetMapping("/produto/{id}")
public Produto listaUmProduto(@PathVariable(value="id")long id){
	return produtoRepository.findById(id);
	
}

@PostMapping("/produto")
public Produto salvaProduto(@RequestBody Produto produto) {
	return produtoRepository.save(produto);
}

@DeleteMapping("/produto")
public void deletaProduto(@RequestBody Produto produto) {
	 produtoRepository.delete(produto);
}

@PutMapping("/produto")
public Produto atualizaProduto(@RequestBody Produto produto) {
	return produtoRepository.save(produto);
}


}
